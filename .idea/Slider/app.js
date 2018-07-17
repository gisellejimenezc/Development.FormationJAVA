var Slider = {
    id : '',
    nbSlides: 0,
    widthTotal: 0,
    actualPos: 0,
    init : function(id, nbSlides){
        var self = this;
        self.id = id;
        self.nbSlides = nbSlides;
        self.widthTotal = 100*nbSlides;
        var rollover = setInterval(function(){
            self.nextSlide();
        }, 2500)

        $('#monSliderArrows').on('mouseover',function(){
            clearInterval(rollover);
        })

        $('#monSliderArrows').on('mouseout', function(){
            rollover = setInterval(function(){
                self.nextSlide();
            }, 2500)
        })

        $('#monSliderArrows div:first-child').on('click', function(){
            self.prevSlide();
        })

        $('#monSliderArrows div:last-child').on('click', function(){
            self.nextSlide();
        })

    },
    nextSlide : function(){
        var self = this;
        self.actualPos =  (self.actualPos + 1) % self.nbSlides;
        var nextPos = '-' + self.actualPos * 100 + '%';
        $('#monSliderContent').css('left', nextPos); 
    },

    prevSlide : function(){
        var self=this;
        self.actualPos = (self.nbSlides + self.actualPos - 1) % self.nbSlides;
        var prevPos = '-' + self.actualPos * 100 + '%';
        $('#monSliderContent').css('left', prevPos); 
    }

    
}

Slider.init('monSlider', 4);
console.log(Slider);