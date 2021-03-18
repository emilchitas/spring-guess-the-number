import groovy.xml.StreamingMarkupBuilder

beans {
    xmlns context:'http://www.springframework.org/schema/context'
    context.'annotation-config'()

    numberGenerator (org.learn.NumberGeneratorImpl)
    game(org.learn.GameImpl)

    commonAnnotation(org.springframework.context.annotation.CommonAnnotationBeanPostProcessor)




}



