import org.learn.NumberGenerator

beans {
    numberGenerator (org.learn.NumberGeneratorImpl)
    game(org.learn.GameImpl) { bean ->
        numberGenerator=  numberGenerator
    }
    commonAnnotation(org.springframework.context.annotation.CommonAnnotationBeanPostProcessor)

}



