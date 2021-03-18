beans {
    numberGenerator (org.learn.NumberGeneratorImpl)
    game(org.learn.GameImpl,numberGenerator) 

}



