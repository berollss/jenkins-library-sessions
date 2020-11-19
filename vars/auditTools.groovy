def call() { // necesario que sea así para que jenkins pueda llamar a auditTools 
    node { // scripted pipelines, para poder ponerlo como un step en una pipeline
        sh '''
            git version
            docker version
            dotnet --list-sdks
            dotnet --list-runtimes
        '''
    }
}