import org.learn.NumberGenerator

beans {
    numberGenerator (org.learn.NumberGeneratorImpl)
    game(org.learn.GameImpl) {
        numberGenerator= ref( numberGenerator)
    }

}



