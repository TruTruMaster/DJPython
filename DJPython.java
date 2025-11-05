import java.util.Scanner;
public class DJPython {
    private static int qsta1int1;
    private static int qsta1int2;
    private static int qsta1int3;
    private static int qsta1int4;
    private static int qsta1int5;
    private static int qsta1int6;
    private static int qsta1int7;
    private static int qsta1int8;
    private static int qsta1int9;
    private static int qsta1int10;
    private static int qsta2int1;
    private static int qsta2int2;
    private static int qsta2int3;
    private static int qsta2int4;
    private static int qsta2int5;
    private static int qsta2int6;
    private static int qsta2int7;
    private static int qsta2int8;
    private static int qsta2int9;
    private static int qsta2int10;
    private static int qsta3int1;
    private static int qsta3int2;
    private static int qsta3int3;
    private static int qsta3int4;
    private static int qsta3int5;
    private static int qsta3int6;
    private static int qsta3int7;
    private static int qsta3int8;
    private static int qsta3int9;
    private static int qsta3int10;
    private static int qstm1int1;
    private static int qstm1int2;
    private static int qstm1int3;
    private static int qstm1int4;
    private static int qstm1int5;
    private static int qstm1int6;
    private static int qstm1int7;
    private static int qstm1int8;
    private static int qstm1int9;
    private static int qstm1int10;
    private static int qstm2int1;
    private static int qstm2int2;
    private static int qstm2int3;
    private static int qstm2int4;
    private static int qstm2int5;
    private static int qstm2int6;
    private static int qstm2int7;
    private static int qstm2int8;
    private static int qstm2int9;
    private static int qstm2int10;
    private static int qstm3int1;
    private static int qstm3int2;
    private static int qstm3int3;
    private static int qstm3int4;
    private static int qstm3int5;
    private static int qstm3int6;
    private static int qstm3int7;
    private static int qstm3int8;
    private static int qstm3int9;
    private static int qstm3int10;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        proceso1();}
    public static void proceso1(){
        menu();
        int userinput = scanner.nextInt();
        if(userinput==1){
            descubrimiento();
        }else{
            if(userinput==2){
                teoria();
            }else{
                if(userinput==3){
                    equipo();
                }else{
                    if(userinput==4){
                        librerias();
                    }else{
                        if(userinput==5){
                            System.out.println("Gracias por usar DJPython");
                        }else{
                            System.out.println("Opción Invalida");
                            proceso1();}}}}}}
    public static void menu(){
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                      Elija la Sección Deseada                      |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                  1. Descubrimiento Musical                         |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                  2. Teoría Musical                                 |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                  3. Equipo de Audio                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                  4. Librerias                                      |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                  5. Salir del programa                             |");
        System.out.println("        |____________________________________________________________________|");}
    public static void descubrimiento(){
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                     Elija el Genero Musical Deseado                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            1. Rock                                 |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            2. Pop                                  |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            3. Folk                                 |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            4. Indie                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            5. Hip-Hop / Rap                        |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            6. R&B                                  |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            7. Volver                               |");
        System.out.println("        |____________________________________________________________________|");
        desint();}
    public static void desint(){
        int userdesinput = scanner.nextInt();
        if(userdesinput==1){
            desrock();
        }else{
            if(userdesinput==2){
                despop();
            }else{
                if(userdesinput==3){
                    desfolk();
                }else{
                    if(userdesinput==4){
                        desind();
                    }else{
                        if(userdesinput==5){
                            deship();
                        }else{
                            if(userdesinput==6){
                                desrb();
                            }else{
                                if(userdesinput==7){
                                    proceso1();
                                }else{
                                    descubrimiento();}}}}}}}}
    public static void desrock(){
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                     Elija la Subsección Deseada                    |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            1. Generos Similares                    |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            2. Artistas                             |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            3. Albumes                              |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            4. Volver                               |");
        System.out.println("        |____________________________________________________________________|");
        rockdesint();}
    public static void rockdesint(){
        int rockdesint = scanner.nextInt();
        if(rockdesint==1){
            rocksim();
        }else{
            if(rockdesint==2){
                rockart();
            }else{
                if(rockdesint==3){
                    rockalb();
                }else{
                    if(rockdesint==4){
                        librerias();
                    }else{
                        rockdesint();}}}}}
    public static void rocksim(){
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                      Generos Similares al Rock                     |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Gen1                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Gen2                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Gen3                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Gen4                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Gen5                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Gen6                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Gen7                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Gen8                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Gen9                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Gen10                               |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                             1. Volver                              |");
        System.out.println("        |____________________________________________________________________|");
        int rocksimint = scanner.nextInt();
        if(rocksimint==1){
            desrock();
        }else{
            rocksim();
        }
    }
    public static void rockart(){
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                           Artistas de Rock                         |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Art1                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Art2                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Art3                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Art4                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Art5                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Art6                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Art7                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Art8                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Art9                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Art10                               |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                             1. Volver                              |");
        System.out.println("        |____________________________________________________________________|");
        int rockartint = scanner.nextInt();
        if(rockartint==1){
            desrock();
        }else{
            rockart();
        }
    }
    public static void rockalb(){
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                     Albumes Destacados del Rock                    |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Alb1                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Alb2                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Alb3                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Alb4                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Alb5                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Alb6                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Alb7                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Alb8                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Alb9                                |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                                Alb10                               |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                             1. Volver                              |");
        System.out.println("        |____________________________________________________________________|");
        int rockalbint = scanner.nextInt();
        if(rockalbint==1){
            desrock();
        }else{
            rockalb();
        }
    }
    public static void despop(){
        screen();
        System.out.println("        |                                                                    |");
        System.out.println("        |                     Elija la Subsección Deseada                    |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            1. Generos Similares                    |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            2. Artistas                             |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            3. Albumes                              |");
        System.out.println("        |                                                                    |");
        System.out.println("        |                            4. Volver                               |");
        System.out.println("        |____________________________________________________________________|");
        popdesint();}
    public static void popdesint(){
        int popdesint = scanner.nextInt();
        if(popdesint==1){
            popsim();
        }else{
            if(popdesint==2){
                popart();
            }else{
                if(popdesint==3){
                    popalb();
                }else{
                    if(popdesint==4){
                        descubrimiento();
                    }else{
                        popdesint();}}}}}
public static void popsim(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                      Generos Similares al Pop                      |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen1                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen2                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen3                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen4                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen5                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen6                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen7                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen8                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen9                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen10                               |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             1. Volver                              |");
    System.out.println("        |____________________________________________________________________|");
    int popsimint = scanner.nextInt();
    if(popsimint==1){
        despop();
    }else{
        popsim();
    }
}
public static void popart(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                           Artistas de Pop                          |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art1                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art2                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art3                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art4                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art5                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art6                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art7                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art8                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art9                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art10                               |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             1. Volver                              |");
    System.out.println("        |____________________________________________________________________|");
    int popartint = scanner.nextInt();
    if(popartint==1){
        despop();
    }else{
        popart();
    }
}
public static void popalb(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                     Albumes Destacados del Pop                     |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb1                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb2                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb3                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb4                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb5                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb6                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb7                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb8                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb9                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb10                               |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             1. Volver                              |");
    System.out.println("        |____________________________________________________________________|");
    int popalbint = scanner.nextInt();
    if(popalbint==1){
        despop();
    }else{
        popalb();
    }
}
public static void desfolk(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                     Elija la Subsección Deseada                    |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Generos Similares                    |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Artistas                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Albumes                              |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Volver                               |");
    System.out.println("        |____________________________________________________________________|");
    folkdesint();}
public static void folkdesint(){
    int folkdesint = scanner.nextInt();
    if(folkdesint==1){
        folksim();
    }else{
        if(folkdesint==2){
            folkart();
        }else{
            if(folkdesint==3){
                folkalb();
            }else{
                if(folkdesint==4){
                    descubrimiento();
                }else{
                    folkdesint();}}}}}
public static void folksim(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                      Generos Similares al Folk                     |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen1                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen2                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen3                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen4                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen5                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen6                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen7                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen8                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen9                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen10                               |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             1. Volver                              |");
    System.out.println("        |____________________________________________________________________|");
    int folksimint = scanner.nextInt();
    if(folksimint==1){
        desfolk();
    }else{
        folksim();
    }
}
public static void folkart(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                           Artistas de Folk                         |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art1                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art2                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art3                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art4                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art5                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art6                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art7                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art8                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art9                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art10                               |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             1. Volver                              |");
    System.out.println("        |____________________________________________________________________|");
    int folkartint = scanner.nextInt();
    if(folkartint==1){
        desfolk();
    }else{
        folkart();
    }
}
public static void folkalb(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                     Albumes Destacados del Folk                    |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb1                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb2                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb3                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb4                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb5                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb6                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb7                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb8                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb9                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb10                               |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             1. Volver                              |");
    System.out.println("        |____________________________________________________________________|");
    int folkalbint = scanner.nextInt();
    if(folkalbint==1){
        desfolk();
    }else{
        folkalb();
    }
}
public static void desind(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                     Elija la Subsección Deseada                    |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Generos Similares                    |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Artistas                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Albumes                              |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Volver                               |");
    System.out.println("        |____________________________________________________________________|");
    inddesint();}
public static void inddesint(){
    int inddesint = scanner.nextInt();
    if(inddesint==1){
        indsim();
    }else{
        if(inddesint==2){
            indart();
        }else{
            if(inddesint==3){
                indalb();
            }else{
                if(inddesint==4){
                    descubrimiento();
                }else{
                    inddesint();}}}}}
public static void indsim() {
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                      Generos Similares al Ind                      |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen1                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen2                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen3                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen4                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen5                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen6                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen7                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen8                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen9                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen10                               |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             1. Volver                              |");
    System.out.println("        |____________________________________________________________________|");
    int indsimint = scanner.nextInt();
    if (indsimint == 1) {
        desind();
    } else {
        indsim();
    }
}
public static void indart(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                           Artistas de Ind                          |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art1                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art2                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art3                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art4                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art5                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art6                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art7                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art8                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art9                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art10                               |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             1. Volver                              |");
    System.out.println("        |____________________________________________________________________|");
    int indartint = scanner.nextInt();
    if(indartint==1){
        desind();
    }else{
        indart();
    }
}
public static void indalb(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                     Albumes Destacados del Ind                     |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb1                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb2                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb3                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb4                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb5                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb6                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb7                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb8                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb9                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb10                               |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             1. Volver                              |");
    System.out.println("        |____________________________________________________________________|");
    int indalbint = scanner.nextInt();
    if(indalbint==1){
        desind();
    }else{
        indalb();
    }
}
public static void deship(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                     Elija la Subsección Deseada                    |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Generos Similares                    |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Artistas                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Albumes                              |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Volver                               |");
    System.out.println("        |____________________________________________________________________|");
    hipdesint();}
public static void hipdesint(){
    int hipdesint = scanner.nextInt();
    if(hipdesint==1){
        hipsim();
    }else{
        if(hipdesint==2){
            hipart();
        }else{
            if(hipdesint==3){
                hipalb();
            }else{
                if(hipdesint==4){
                    descubrimiento();
                }else{
                    hipdesint();}}}}}
public static void hipsim(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                      Generos Similares al Hip                      |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen1                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen2                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen3                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen4                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen5                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen6                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen7                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen8                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen9                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen10                               |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             1. Volver                              |");
    System.out.println("        |____________________________________________________________________|");
    int hipsimint = scanner.nextInt();
    if(hipsimint==1){
        deship();
    }else{
        hipsim();
    }
}
public static void hipart(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                           Artistas de Hip                          |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art1                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art2                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art3                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art4                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art5                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art6                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art7                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art8                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art9                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art10                               |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             1. Volver                              |");
    System.out.println("        |____________________________________________________________________|");
    int hipartint = scanner.nextInt();
    if(hipartint==1){
        deship();
    }else{
        hipart();
    }
}
public static void hipalb(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                     Albumes Destacados del Hip                     |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb1                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb2                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb3                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb4                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb5                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb6                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb7                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb8                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb9                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb10                               |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             1. Volver                              |");
    System.out.println("        |____________________________________________________________________|");
    int hipalbint = scanner.nextInt();
    if(hipalbint==1){
        deship();
    }else{
        hipalb();
    }
}
public static void desrb(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                     Elija la Subsección Deseada                    |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Generos Similares                    |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Artistas                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Albumes                              |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Volver                               |");
    System.out.println("        |____________________________________________________________________|");
    rbdesint();}
public static void rbdesint(){
    int rbdesint = scanner.nextInt();
    if(rbdesint==1){
        rbsim();
    }else{
        if(rbdesint==2){
            rbart();
        }else{
            if(rbdesint==3){
                rbalb();
            }else{
                if(rbdesint==4){
                    descubrimiento();
                }else{
                    rbdesint();}}}}}
public static void rbsim(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                      Generos Similares al Rb                      |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen1                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen2                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen3                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen4                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen5                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen6                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen7                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen8                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen9                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Gen10                               |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             1. Volver                              |");
    System.out.println("        |____________________________________________________________________|");
    int rbsimint = scanner.nextInt();
    if(rbsimint==1){
        desrb();
    }else{
        rbsim();
    }
}
public static void rbart(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                           Artistas de Rb                          |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art1                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art2                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art3                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art4                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art5                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art6                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art7                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art8                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art9                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Art10                               |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             1. Volver                              |");
    System.out.println("        |____________________________________________________________________|");
    int rbartint = scanner.nextInt();
    if(rbartint==1){
        desrb();
    }else{
        rbart();
    }
}
public static void rbalb(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                     Albumes Destacados del Rb                     |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb1                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb2                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb3                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb4                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb5                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb6                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb7                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb8                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb9                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                                Alb10                               |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             1. Volver                              |");
    System.out.println("        |____________________________________________________________________|");
    int rbalbint = scanner.nextInt();
    if(rbalbint==1){
        desrb();
    }else{
        rbalb();
    }
}
public static void teoria(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                     Elija la Subsección Deseada                    |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Armonía                              |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Melodía                              |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Cuestionarios                        |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Volver                               |");
    System.out.println("        |____________________________________________________________________|");
    teoint();}
public static void teoint(){
    int userteoinput = scanner.nextInt();
    if(userteoinput==1){
        descubrimiento();
    }else{
        if(userteoinput==2){
            teoria();
        }else{
            if(userteoinput==3){
                cuestionarios();
            }else{
                if(userteoinput==4){
                    proceso1();
                }else{
                    teoria();}}}}}
public static void cuestionarios(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                    Elija El Cuestionario Deseado                   |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Armonia 1                            |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Armonia 2                            |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Armonia 3                            |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Teoria  1                            |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            5. Teoria  2                            |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            6. Teoria  3                            |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            7. Salir                                |");
    System.out.println("        |____________________________________________________________________|");
    qstint();}
public static void qstint(){
    int userqstint = scanner.nextInt();
    if(userqstint==1){
        qsta1();
    }else{
        if(userqstint==2){
            qsta2();
        }else{
            if(userqstint==3){
            qsta3();
            }else{
                if(userqstint==4){
            qstm1();
                }else{
                    if(userqstint==5){
            qstm2();
                    }else{
                        if(userqstint==6){
            qstm3();
                        }else{
                            if(userqstint==7){
                                teoria();
                            }else{
                                cuestionarios();}}}}}}}}
public static void qsta1(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                        Cuestionario Armonia 1                      |");
    System.out.println("        |                                                                    |");
    System.out.println("        |          Este cuestionario es sobre TEMA sección SUBTEMA           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                        Consta de 10 preguntas                      |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             1. Iniciar                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             2. Volver                              |");
    System.out.println("        |____________________________________________________________________|");
    userqst1int();
}
public static void userqst1int(){
    int userqst1int = scanner.nextInt();
    if(userqst1int==1){
        qsta1men();
    }else{
        if(userqst1int==2){
            cuestionarios();
        }else{
            System.out.println("Opción invalida");
            qsta1();
        }
    }
}
public static void qsta1men(){
    qsta1int1();
}
public static void qsta1int1(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 1           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta1int1 = scanner.nextInt();
    if(qsta1int1 == 1 || qsta1int1 == 2 || qsta1int1 == 3 || qsta1int1 ==4){
        qsta1int2();
    }else{
        System.out.println("Opción Invalda");
        qsta1int1();
    }
}
public static void qsta1int2(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 2           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta1int2 = scanner.nextInt();
    if(qsta1int2 == 1 || qsta1int2 == 2 || qsta1int2 == 3 ||qsta1int2 ==4){
        qsta1int3();
    }else{
        System.out.println("Opción Invalda");
        qsta1int2();
    }
}
public static void qsta1int3(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 3           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta1int3 = scanner.nextInt();
    if(qsta1int3 == 1 || qsta1int3 == 2 || qsta1int3 == 3 ||qsta1int3 ==4){
        qsta1int4();
    }else{
        System.out.println("Opción Invalda");
        qsta1int3();
    }
}
public static void qsta1int4(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 4                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 4           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta1int4 = scanner.nextInt();
    if(qsta1int4 == 1 || qsta1int4 == 2 || qsta1int4 == 3 ||qsta1int4 ==4){
        qsta1int5();
    }else{
        System.out.println("Opción Invalda");
        qsta1int4();
    }
}
public static void qsta1int5(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 5                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 5           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta1int5 = scanner.nextInt();
    if(qsta1int5 == 1 || qsta1int5 == 2 || qsta1int5 == 3 ||qsta1int5 ==4){
        qsta1int6();
    }else{
        System.out.println("Opción Invalda");
        qsta1int5();
    }
}
public static void qsta1int6(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 6                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 6           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta1int6 = scanner.nextInt();
    if(qsta1int6 == 1 || qsta1int6 == 2 || qsta1int6 == 3 ||qsta1int6 ==4){
        qsta1int7();
    }else{
        System.out.println("Opción Invalda");
        qsta1int6();
    }
}
public static void qsta1int7(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 7                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 7           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta1int7 = scanner.nextInt();
    if(qsta1int7 == 1 || qsta1int7 == 2 || qsta1int7 == 3 ||qsta1int7 ==4){
        qsta1int8();
    }else{
        System.out.println("Opción Invalda");
        qsta1int7();
    }
}
public static void qsta1int8(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 8                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 8           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta1int8 = scanner.nextInt();
    if(qsta1int8 == 1 || qsta1int8 == 2 || qsta1int8 == 3 ||qsta1int8 ==4){
        qsta1int9();
    }else{
        System.out.println("Opción Invalda");
        qsta1int8();
    }
}
public static void qsta1int9(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 9                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 9           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta1int9 = scanner.nextInt();
    if(qsta1int9 == 1 || qsta1int9 == 2 || qsta1int9 == 3 ||qsta1int9 ==4){
        qsta1int10();
    }else{
        System.out.println("Opción Invalda");
        qsta1int9();
    }
}
public static void qsta1int10(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                            Pregunta 10                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |           Introduzca el texto para la pregunta numero 10           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta1int10 = scanner.nextInt();
    if(qsta1int10 == 1 || qsta1int10 == 2 || qsta1int10 == 3 ||qsta1int10 ==4){
        rqsta1reslt();
    }else{
        System.out.println("Opción Invalda");
        qsta1int10();
    }
}
public static void rqsta1reslt(){
    int a1 = 0;
    int e1 = 0;
    if(qsta1int1 == 1){
        a1++;
    }else{
        e1++;
    }
    if(qsta1int2 == 2){
        a1++;
    }else{
        e1++;
    }
    if(qsta1int3 == 3){
        a1++;
    }else{
        e1++;
    }
    if(qsta1int4 == 4){
        a1++;
    }else{
        e1++;
    }
    if(qsta1int5 == 1){
        a1++;
    }else{
        e1++;
    }
    if(qsta1int6 == 1){
        a1++;
    }else{
        e1++;
    }
    if(qsta1int7 == 2){
        a1++;
    }else{
        e1++;
    }
    if(qsta1int8 == 3){
        a1++;
    }else{
        e1++;
    }
    if(qsta1int9 == 4){
        a1++;
    }else{
        e1++;
    }
    if(qsta1int10 == 1){
        a1++;
    }else{
        e1++;
    }
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Resultados                             |");
    System.out.println("        |                                                                    |");
    if(a1 == 10){
        System.out.println("        | "+"Aciertos="+a1+"                                                        |");
    }else{
        System.out.println("        | "+"Aciertos="+a1+"                                                         |");
    }
    System.out.println("        |                                                                    |");
    if(e1 == 10){
        System.out.println("        | "+"Errores="+e1+"                                                         |");
    }else{
        System.out.println("        | "+"Errores="+e1+"                                                          |");
    }
    System.out.println("        |                                                                    |");
    System.out.println("        |                          Retroalimentación                         |");
    System.out.println("        |                                                                    |");
    if(a1 == 10){
        System.out.println("        |                        Sin Retroalimentación                       |");
        System.out.println("        |                                                                    |");
    }
    if(qsta1int1 == 1){
    }else{
        System.out.println("        |                             Pregunta 1                             |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta1int2 == 2){
    }else{
        System.out.println("        |                             Pregunta 2                             |");
        System.out.println("        |          La opción correcta era Opcion2 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta1int3 == 3){
    }else{
        System.out.println("        |                             Pregunta 3                             |");
        System.out.println("        |          La opción correcta era Opcion3 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta1int4 == 4){
    }else{
        System.out.println("        |                             Pregunta 4                             |");
        System.out.println("        |          La opción correcta era Opcion4 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta1int5 == 1){
    }else{
        System.out.println("        |                             Pregunta 5                             |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta1int6 == 1){
    }else{
        System.out.println("        |                             Pregunta 6                             |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta1int7 == 2){
    }else{
        System.out.println("        |                             Pregunta 7                             |");
        System.out.println("        |          La opción correcta era Opcion2 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta1int8 == 3){
    }else{
        System.out.println("        |                             Pregunta 8                             |");
        System.out.println("        |          La opción correcta era Opcion3 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta1int9 == 4){
    }else{
        System.out.println("        |                             Pregunta 9                             |");
        System.out.println("        |          La opción correcta era Opcion4 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta1int10 == 1){
    }else{
        System.out.println("        |                             Pregunta 10                            |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    System.out.println("        |____________________________________________________________________|");
    int rstint6 = scanner.nextInt();
    if(rstint6==1){
cuestionarios();
    }else{
rqsta1reslt();
}
}
public static void qsta2(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                        Cuestionario Armonia 2                      |");
    System.out.println("        |                                                                    |");
    System.out.println("        |          Este cuestionario es sobre TEMA sección SUBTEMA           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                        Consta de 10 preguntas                      |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             1. Iniciar                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             2. Volver                              |");
    System.out.println("        |____________________________________________________________________|");
    userqst1int();
}
public static void userqst2int(){
    int userqst1int = scanner.nextInt();
    if(userqst1int==1){
        qsta1men();
    }else{
        if(userqst1int==2){
            cuestionarios();
        }else{
            System.out.println("Opción invalida");
            qsta1();
        }
    }
}
public static void qsta2men(){
    qsta2int1();
}
public static void qsta2int1(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 1           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta2int1 = scanner.nextInt();
    if(qsta2int1 == 1 || qsta2int1 == 2 || qsta2int1 == 3 || qsta2int1 ==4){
        qsta2int2();
    }else{
        System.out.println("Opción Invalda");
        qsta2int1();
    }
}
public static void qsta2int2(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 2           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta2int2 = scanner.nextInt();
    if(qsta2int2 == 1 || qsta2int2 == 2 || qsta2int2 == 3 ||qsta2int2 ==4){
        qsta2int3();
    }else{
        System.out.println("Opción Invalda");
        qsta2int2();
    }
}
public static void qsta2int3(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 3           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta2int3 = scanner.nextInt();
    if(qsta2int3 == 1 || qsta2int3 == 2 || qsta2int3 == 3 ||qsta2int3 ==4){
        qsta2int4();
    }else{
        System.out.println("Opción Invalda");
        qsta2int3();
    }
}
public static void qsta2int4(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 4                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 4           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta2int4 = scanner.nextInt();
    if(qsta2int4 == 1 || qsta2int4 == 2 || qsta2int4 == 3 ||qsta2int4 ==4){
        qsta2int5();
    }else{
        System.out.println("Opción Invalda");
        qsta2int4();
    }
}
public static void qsta2int5(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 5                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 5           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta2int5 = scanner.nextInt();
    if(qsta2int5 == 1 || qsta2int5 == 2 || qsta2int5 == 3 ||qsta2int5 ==4){
        qsta2int6();
    }else{
        System.out.println("Opción Invalda");
        qsta2int5();
    }
}
public static void qsta2int6(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 6                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 6           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta2int6 = scanner.nextInt();
    if(qsta2int6 == 1 || qsta2int6 == 2 || qsta2int6 == 3 ||qsta2int6 ==4){
        qsta2int7();
    }else{
        System.out.println("Opción Invalda");
        qsta2int6();
    }
}
public static void qsta2int7(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 7                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 7           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta2int7 = scanner.nextInt();
    if(qsta2int7 == 1 || qsta2int7 == 2 || qsta2int7 == 3 ||qsta2int7 ==4){
        qsta2int8();
    }else{
        System.out.println("Opción Invalda");
        qsta2int7();
    }
}
public static void qsta2int8(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 8                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 8           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta2int8 = scanner.nextInt();
    if(qsta2int8 == 1 || qsta2int8 == 2 || qsta2int8 == 3 ||qsta2int8 ==4){
        qsta2int9();
    }else{
        System.out.println("Opción Invalda");
        qsta2int8();
    }
}
public static void qsta2int9(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 9                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 9           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta2int9 = scanner.nextInt();
    if(qsta2int9 == 1 || qsta2int9 == 2 || qsta2int9 == 3 ||qsta2int9 ==4){
        qsta2int10();
    }else{
        System.out.println("Opción Invalda");
        qsta2int9();
    }
}
public static void qsta2int10(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                            Pregunta 10                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |           Introduzca el texto para la pregunta numero 10           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta2int10 = scanner.nextInt();
    if(qsta2int10 == 1 || qsta2int10 == 2 || qsta2int10 == 3 ||qsta2int10 ==4){
        rqsta2reslt();
    }else{
        System.out.println("Opción Invalda");
        qsta2int10();
    }
}
public static void rqsta2reslt(){
    int a2 = 0;
    int e2 = 0;
    if(qsta2int1 == 1){
        a2++;
    }else{
        e2++;
    }
    if(qsta2int2 == 2){
        a2++;
    }else{
        e2++;
    }
    if(qsta2int3 == 3){
        a2++;
    }else{
        e2++;
    }
    if(qsta2int4 == 4){
        a2++;
    }else{
        e2++;
    }
    if(qsta2int5 == 1){
        a2++;
    }else{
        e2++;
    }
    if(qsta2int6 == 1){
        a2++;
    }else{
        e2++;
    }
    if(qsta2int7 == 2){
        a2++;
    }else{
        e2++;
    }
    if(qsta2int8 == 3){
        a2++;
    }else{
        e2++;
    }
    if(qsta2int9 == 4){
        a2++;
    }else{
        e2++;
    }
    if(qsta2int10 == 1){
        a2++;
    }else{
        e2++;
    }
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Resultados                             |");
    System.out.println("        |                                                                    |");
    if(a2 == 10){
        System.out.println("        | "+"Aciertos="+a2+"                                                        |");
    }else{
        System.out.println("        | "+"Aciertos="+a2+"                                                         |");
    }
    System.out.println("        |                                                                    |");
    if(e2 == 10){
        System.out.println("        | "+"Errores="+e2+"                                                         |");
    }else{
        System.out.println("        | "+"Errores="+e2+"                                                          |");
    }
    System.out.println("        |                                                                    |");
    System.out.println("        |                          Retroalimentación                         |");
    System.out.println("        |                                                                    |");
    if(a2 == 10){
        System.out.println("        |                        Sin Retroalimentación                       |");
        System.out.println("        |                                                                    |");
    }
    if(qsta2int1 == 1){
    }else{
        System.out.println("        |                             Pregunta 1                             |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta2int2 == 2){
    }else{
        System.out.println("        |                             Pregunta 2                             |");
        System.out.println("        |          La opción correcta era Opcion2 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta2int3 == 3){
    }else{
        System.out.println("        |                             Pregunta 3                             |");
        System.out.println("        |          La opción correcta era Opcion3 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta2int4 == 4){
    }else{
        System.out.println("        |                             Pregunta 4                             |");
        System.out.println("        |          La opción correcta era Opcion4 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta2int5 == 1){
    }else{
        System.out.println("        |                             Pregunta 5                             |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta2int6 == 1){
    }else{
        System.out.println("        |                             Pregunta 6                             |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta2int7 == 2){
    }else{
        System.out.println("        |                             Pregunta 7                             |");
        System.out.println("        |          La opción correcta era Opcion2 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta2int8 == 3){
    }else{
        System.out.println("        |                             Pregunta 8                             |");
        System.out.println("        |          La opción correcta era Opcion3 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta2int9 == 4){
    }else{
        System.out.println("        |                             Pregunta 9                             |");
        System.out.println("        |          La opción correcta era Opcion4 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta2int10 == 1){
    }else{
        System.out.println("        |                             Pregunta 10                            |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    System.out.println("        |____________________________________________________________________|");
}
public static void qsta3(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                        Cuestionario Armonia 3                      |");
    System.out.println("        |                                                                    |");
    System.out.println("        |          Este cuestionario es sobre TEMA sección SUBTEMA           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                        Consta de 10 preguntas                      |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             1. Iniciar                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             2. Volver                              |");
    System.out.println("        |____________________________________________________________________|");
    userqst3int();
}
public static void userqst3int(){
    int userqst3int = scanner.nextInt();
    if(userqst3int==1){
        qsta3men();
    }else{
        if(userqst3int==2){
            cuestionarios();
        }else{
            System.out.println("Opción invalida");
            qsta3();
        }
    }
}
public static void qsta3men(){
    qsta3int1();
}
public static void qsta3int1(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 1           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta3int1 = scanner.nextInt();
    if(qsta3int1 == 1 || qsta3int1 == 2 || qsta3int1 == 3 || qsta3int1 ==4){
        qsta3int2();
    }else{
        System.out.println("Opción Invalda");
        qsta3int1();
    }
}
public static void qsta3int2(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 2           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta3int2 = scanner.nextInt();
    if(qsta3int2 == 1 || qsta3int2 == 2 || qsta3int2 == 3 ||qsta3int2 ==4){
        qsta3int3();
    }else{
        System.out.println("Opción Invalda");
        qsta3int2();
    }
}
public static void qsta3int3(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 3           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta3int3 = scanner.nextInt();
    if(qsta3int3 == 1 || qsta3int3 == 2 || qsta3int3 == 3 ||qsta3int3 ==4){
        qsta3int4();
    }else{
        System.out.println("Opción Invalda");
        qsta3int3();
    }
}
public static void qsta3int4(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 4                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 4           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta3int4 = scanner.nextInt();
    if(qsta3int4 == 1 || qsta3int4 == 2 || qsta3int4 == 3 ||qsta3int4 ==4){
        qsta3int5();
    }else{
        System.out.println("Opción Invalda");
        qsta3int4();
    }
}
public static void qsta3int5(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 5                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 5           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta3int5 = scanner.nextInt();
    if(qsta3int5 == 1 || qsta3int5 == 2 || qsta3int5 == 3 ||qsta3int5 ==4){
        qsta3int6();
    }else{
        System.out.println("Opción Invalda");
        qsta3int5();
    }
}
public static void qsta3int6(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 6                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 6           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta3int6 = scanner.nextInt();
    if(qsta3int6 == 1 || qsta3int6 == 2 || qsta3int6 == 3 ||qsta3int6 ==4){
        qsta3int7();
    }else{
        System.out.println("Opción Invalda");
        qsta3int6();
    }
}
public static void qsta3int7(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 7                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 7           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta3int7 = scanner.nextInt();
    if(qsta3int7 == 1 || qsta3int7 == 2 || qsta3int7 == 3 ||qsta3int7 ==4){
        qsta3int8();
    }else{
        System.out.println("Opción Invalda");
        qsta3int7();
    }
}
public static void qsta3int8(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 8                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 8           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta3int8 = scanner.nextInt();
    if(qsta3int8 == 1 || qsta3int8 == 2 || qsta3int8 == 3 ||qsta3int8 ==4){
        qsta3int9();
    }else{
        System.out.println("Opción Invalda");
        qsta3int8();
    }
}
public static void qsta3int9(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 9                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 9           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta3int9 = scanner.nextInt();
    if(qsta3int9 == 1 || qsta3int9 == 2 || qsta3int9 == 3 ||qsta3int9 ==4){
        qsta3int10();
    }else{
        System.out.println("Opción Invalda");
        qsta3int9();
    }
}
public static void qsta3int10(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                            Pregunta 10                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |           Introduzca el texto para la pregunta numero 10           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qsta3int10 = scanner.nextInt();
    if(qsta3int10 == 1 || qsta3int10 == 2 || qsta3int10 == 3 ||qsta3int10 ==4){
        rqsta3reslt();
    }else{
        System.out.println("Opción Invalda");
        qsta3int10();
    }
}
public static void rqsta3reslt(){
    int a3 = 0;
    int e3 = 0;
    if(qsta3int1 == 1){
        a3++;
    }else{
        e3++;
    }
    if(qsta3int2 == 2){
        a3++;
    }else{
        e3++;
    }
    if(qsta3int3 == 3){
        a3++;
    }else{
        e3++;
    }
    if(qsta3int4 == 4){
        a3++;
    }else{
        e3++;
    }
    if(qsta3int5 == 1){
        a3++;
    }else{
        e3++;
    }
    if(qsta3int6 == 1){
        a3++;
    }else{
        e3++;
    }
    if(qsta3int7 == 2){
        a3++;
    }else{
        e3++;
    }
    if(qsta3int8 == 3){
        a3++;
    }else{
        e3++;
    }
    if(qsta3int9 == 4){
        a3++;
    }else{
        e3++;
    }
    if(qsta3int10 == 1){
        a3++;
    }else{
        e3++;
    }
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Resultados                             |");
    System.out.println("        |                                                                    |");
    if(a3 == 10){
        System.out.println("        | "+"Aciertos="+a3+"                                                        |");
    }else{
        System.out.println("        | "+"Aciertos="+a3+"                                                         |");
    }
    System.out.println("        |                                                                    |");
    if(e3 == 10){
        System.out.println("        | "+"Errores="+e3+"                                                         |");
    }else{
        System.out.println("        | "+"Errores="+e3+"                                                          |");
    }
    System.out.println("        |                                                                    |");
    System.out.println("        |                          Retroalimentación                         |");
    System.out.println("        |                                                                    |");
    if(a3 == 10){
        System.out.println("        |                        Sin Retroalimentación                       |");
        System.out.println("        |                                                                    |");
    }
    if(qsta3int1 == 1){
    }else{
        System.out.println("        |                             Pregunta 1                             |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta3int2 == 2){
    }else{
        System.out.println("        |                             Pregunta 2                             |");
        System.out.println("        |          La opción correcta era Opcion2 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta3int3 == 3){
    }else{
        System.out.println("        |                             Pregunta 3                             |");
        System.out.println("        |          La opción correcta era Opcion3 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta3int4 == 4){
    }else{
        System.out.println("        |                             Pregunta 4                             |");
        System.out.println("        |          La opción correcta era Opcion4 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta3int5 == 1){
    }else{
        System.out.println("        |                             Pregunta 5                             |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta3int6 == 1){
    }else{
        System.out.println("        |                             Pregunta 6                             |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta3int7 == 2){
    }else{
        System.out.println("        |                             Pregunta 7                             |");
        System.out.println("        |          La opción correcta era Opcion2 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta3int8 == 3){
    }else{
        System.out.println("        |                             Pregunta 8                             |");
        System.out.println("        |          La opción correcta era Opcion3 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta3int9 == 4){
    }else{
        System.out.println("        |                             Pregunta 9                             |");
        System.out.println("        |          La opción correcta era Opcion4 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qsta3int10 == 1){
    }else{
        System.out.println("        |                             Pregunta 10                            |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    System.out.println("        |____________________________________________________________________|");
}
public static void qstm1(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                        Cuestionario Melodía 1                      |");
    System.out.println("        |                                                                    |");
    System.out.println("        |          Este cuestionario es sobre TEMA sección SUBTEMA           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                        Consta de 10 preguntas                      |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             1. Iniciar                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             2. Volver                              |");
    System.out.println("        |____________________________________________________________________|");
    userqst4int();
}
public static void userqst4int(){
    int userqst4int = scanner.nextInt();
    if(userqst4int==1){
        qstm1men();
    }else{
        if(userqst4int==2){
            cuestionarios();
        }else{
            System.out.println("Opción invalida");
            qstm1();
        }
    }
}
public static void qstm1men(){
    qstm1int1();
}
public static void qstm1int1(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 1           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm1int1 = scanner.nextInt();
    if(qstm1int1 == 1 || qstm1int1 == 2 || qstm1int1 == 3 || qstm1int1 ==4){
        qstm1int2();
    }else{
        System.out.println("Opción Invalda");
        qstm1int1();
    }
}
public static void qstm1int2(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 2           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm1int2 = scanner.nextInt();
    if(qstm1int2 == 1 || qstm1int2 == 2 || qstm1int2 == 3 ||qstm1int2 ==4){
        qstm1int3();
    }else{
        System.out.println("Opción Invalda");
        qstm1int2();
    }
}
public static void qstm1int3(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 3           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm1int3 = scanner.nextInt();
    if(qstm1int3 == 1 || qstm1int3 == 2 || qstm1int3 == 3 ||qstm1int3 ==4){
        qstm1int4();
    }else{
        System.out.println("Opción Invalda");
        qstm1int3();
    }
}
public static void qstm1int4(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 4                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 4           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm1int4 = scanner.nextInt();
    if(qstm1int4 == 1 || qstm1int4 == 2 || qstm1int4 == 3 ||qstm1int4 ==4){
        qstm1int5();
    }else{
        System.out.println("Opción Invalda");
        qstm1int4();
    }
}
public static void qstm1int5(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 5                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 5           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm1int5 = scanner.nextInt();
    if(qstm1int5 == 1 || qstm1int5 == 2 || qstm1int5 == 3 ||qstm1int5 ==4){
        qstm1int6();
    }else{
        System.out.println("Opción Invalda");
        qstm1int5();
    }
}
public static void qstm1int6(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 6                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 6           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm1int6 = scanner.nextInt();
    if(qstm1int6 == 1 || qstm1int6 == 2 || qstm1int6 == 3 ||qstm1int6 ==4){
        qstm1int7();
    }else{
        System.out.println("Opción Invalda");
        qstm1int6();
    }
}
public static void qstm1int7(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 7                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 7           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm1int7 = scanner.nextInt();
    if(qstm1int7 == 1 || qstm1int7 == 2 || qstm1int7 == 3 ||qstm1int7 ==4){
        qstm1int8();
    }else{
        System.out.println("Opción Invalda");
        qstm1int7();
    }
}
public static void qstm1int8(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 8                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 8           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm1int8 = scanner.nextInt();
    if(qstm1int8 == 1 || qstm1int8 == 2 || qstm1int8 == 3 ||qstm1int8 ==4){
        qstm1int9();
    }else{
        System.out.println("Opción Invalda");
        qstm1int8();
    }
}
public static void qstm1int9(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 9                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 9           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm1int9 = scanner.nextInt();
    if(qstm1int9 == 1 || qstm1int9 == 2 || qstm1int9 == 3 ||qstm1int9 ==4){
        qstm1int10();
    }else{
        System.out.println("Opción Invalda");
        qstm1int9();
    }
}
public static void qstm1int10(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                            Pregunta 10                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |           Introduzca el texto para la pregunta numero 10           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm1int10 = scanner.nextInt();
    if(qstm1int10 == 1 || qstm1int10 == 2 || qstm1int10 == 3 ||qstm1int10 ==4){
        rqstm1reslt();
    }else{
        System.out.println("Opción Invalda");
        qstm1int10();
    }
}
public static void rqstm1reslt(){
    int a4 = 0;
    int e4 = 0;
    if(qstm1int1 == 1){
        a4++;
    }else{
        e4++;
    }
    if(qstm1int2 == 2){
        a4++;
    }else{
        e4++;
    }
    if(qstm1int3 == 3){
        a4++;
    }else{
        e4++;
    }
    if(qstm1int4 == 4){
        a4++;
    }else{
        e4++;
    }
    if(qstm1int5 == 1){
        a4++;
    }else{
        e4++;
    }
    if(qstm1int6 == 1){
        a4++;
    }else{
        e4++;
    }
    if(qstm1int7 == 2){
        a4++;
    }else{
        e4++;
    }
    if(qstm1int8 == 3){
        a4++;
    }else{
        e4++;
    }
    if(qstm1int9 == 4){
        a4++;
    }else{
        e4++;
    }
    if(qstm1int10 == 1){
        a4++;
    }else{
        e4++;
    }
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Resultados                             |");
    System.out.println("        |                                                                    |");
    if(a4 == 10){
        System.out.println("        | "+"Aciertos="+a4+"                                                        |");
    }else{
        System.out.println("        | "+"Aciertos="+a4+"                                                         |");
    }
    System.out.println("        |                                                                    |");
    if(e4 == 10){
        System.out.println("        | "+"Errores="+e4+"                                                         |");
    }else{
        System.out.println("        | "+"Errores="+e4+"                                                          |");
    }
    System.out.println("        |                                                                    |");
    System.out.println("        |                          Retroalimentación                         |");
    System.out.println("        |                                                                    |");
    if(a4 == 10){
        System.out.println("        |                        Sin Retroalimentación                       |");
        System.out.println("        |                                                                    |");
    }
    if(qstm1int1 == 1){
    }else{
        System.out.println("        |                             Pregunta 1                             |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm1int2 == 2){
    }else{
        System.out.println("        |                             Pregunta 2                             |");
        System.out.println("        |          La opción correcta era Opcion2 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm1int3 == 3){
    }else{
        System.out.println("        |                             Pregunta 3                             |");
        System.out.println("        |          La opción correcta era Opcion3 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm1int4 == 4){
    }else{
        System.out.println("        |                             Pregunta 4                             |");
        System.out.println("        |          La opción correcta era Opcion4 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm1int5 == 1){
    }else{
        System.out.println("        |                             Pregunta 5                             |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm1int6 == 1){
    }else{
        System.out.println("        |                             Pregunta 6                             |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm1int7 == 2){
    }else{
        System.out.println("        |                             Pregunta 7                             |");
        System.out.println("        |          La opción correcta era Opcion2 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm1int8 == 3){
    }else{
        System.out.println("        |                             Pregunta 8                             |");
        System.out.println("        |          La opción correcta era Opcion3 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm1int9 == 4){
    }else{
        System.out.println("        |                             Pregunta 9                             |");
        System.out.println("        |          La opción correcta era Opcion4 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm1int10 == 1){
    }else{
        System.out.println("        |                             Pregunta 10                            |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    System.out.println("        |____________________________________________________________________|");
}
public static void qstm2(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                        Cuestionario Melodía 2                      |");
    System.out.println("        |                                                                    |");
    System.out.println("        |          Este cuestionario es sobre TEMA sección SUBTEMA           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                        Consta de 10 preguntas                      |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             1. Iniciar                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             2. Volver                              |");
    System.out.println("        |____________________________________________________________________|");
    userqst5int();
}
public static void userqst5int(){
    int userqst5int = scanner.nextInt();
    if(userqst5int==1){
        qstm2men();
    }else{
        if(userqst5int==2){
            cuestionarios();
        }else{
            System.out.println("Opción invalida");
            qstm2();
        }
    }
}
public static void qstm2men(){
    qstm2int1();
}
public static void qstm2int1(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 1           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm2int1 = scanner.nextInt();
    if(qstm2int1 == 1 || qstm2int1 == 2 || qstm2int1 == 3 || qstm2int1 ==4){
        qstm2int2();
    }else{
        System.out.println("Opción Invalda");
        qstm2int1();
    }
}
public static void qstm2int2(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 2           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm2int2 = scanner.nextInt();
    if(qstm2int2 == 1 || qstm2int2 == 2 || qstm2int2 == 3 ||qstm2int2 ==4){
        qstm2int3();
    }else{
        System.out.println("Opción Invalda");
        qstm2int2();
    }
}
public static void qstm2int3(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 3           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm2int3 = scanner.nextInt();
    if(qstm2int3 == 1 || qstm2int3 == 2 || qstm2int3 == 3 ||qstm2int3 ==4){
        qstm2int4();
    }else{
        System.out.println("Opción Invalda");
        qstm2int3();
    }
}
public static void qstm2int4(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 4                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 4           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm2int4 = scanner.nextInt();
    if(qstm2int4 == 1 || qstm2int4 == 2 || qstm2int4 == 3 ||qstm2int4 ==4){
        qstm2int5();
    }else{
        System.out.println("Opción Invalda");
        qstm2int4();
    }
}
public static void qstm2int5(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 5                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 5           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm2int5 = scanner.nextInt();
    if(qstm2int5 == 1 || qstm2int5 == 2 || qstm2int5 == 3 ||qstm2int5 ==4){
        qstm2int6();
    }else{
        System.out.println("Opción Invalda");
        qstm2int5();
    }
}
public static void qstm2int6(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 6                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 6           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm2int6 = scanner.nextInt();
    if(qstm2int6 == 1 || qstm2int6 == 2 || qstm2int6 == 3 ||qstm2int6 ==4){
        qstm2int7();
    }else{
        System.out.println("Opción Invalda");
        qstm2int6();
    }
}
public static void qstm2int7(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 7                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 7           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm2int7 = scanner.nextInt();
    if(qstm2int7 == 1 || qstm2int7 == 2 || qstm2int7 == 3 ||qstm2int7 ==4){
        qstm2int8();
    }else{
        System.out.println("Opción Invalda");
        qstm2int7();
    }
}
public static void qstm2int8(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 8                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 8           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm2int8 = scanner.nextInt();
    if(qstm2int8 == 1 || qstm2int8 == 2 || qstm2int8 == 3 ||qstm2int8 ==4){
        qstm2int9();
    }else{
        System.out.println("Opción Invalda");
        qstm2int8();
    }
}
public static void qstm2int9(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 9                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 9           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm2int9 = scanner.nextInt();
    if(qstm2int9 == 1 || qstm2int9 == 2 || qstm2int9 == 3 ||qstm2int9 ==4){
        qstm2int10();
    }else{
        System.out.println("Opción Invalda");
        qstm2int9();
    }
}
public static void qstm2int10(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                            Pregunta 10                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |           Introduzca el texto para la pregunta numero 10           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm2int10 = scanner.nextInt();
    if(qstm2int10 == 1 || qstm2int10 == 2 || qstm2int10 == 3 ||qstm2int10 ==4){
        rqstm2reslt();
    }else{
        System.out.println("Opción Invalda");
        qstm2int10();
    }
}
public static void rqstm2reslt(){
    int a5 = 0;
    int e5 = 0;
    if(qstm2int1 == 1){
        a5++;
    }else{
        e5++;
    }
    if(qstm2int2 == 2){
        a5++;
    }else{
        e5++;
    }
    if(qstm2int3 == 3){
        a5++;
    }else{
        e5++;
    }
    if(qstm2int4 == 4){
        a5++;
    }else{
        e5++;
    }
    if(qstm2int5 == 1){
        a5++;
    }else{
        e5++;
    }
    if(qstm2int6 == 1){
        a5++;
    }else{
        e5++;
    }
    if(qstm2int7 == 2){
        a5++;
    }else{
        e5++;
    }
    if(qstm2int8 == 3){
        a5++;
    }else{
        e5++;
    }
    if(qstm2int9 == 4){
        a5++;
    }else{
        e5++;
    }
    if(qstm2int10 == 1){
        a5++;
    }else{
        e5++;
    }
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Resultados                             |");
    System.out.println("        |                                                                    |");
    if(a5 == 10){
        System.out.println("        | "+"Aciertos="+a5+"                                                        |");
    }else{
        System.out.println("        | "+"Aciertos="+a5+"                                                         |");
    }
    System.out.println("        |                                                                    |");
    if(e5 == 10){
        System.out.println("        | "+"Errores="+e5+"                                                         |");
    }else{
        System.out.println("        | "+"Errores="+e5+"                                                          |");
    }
    System.out.println("        |                                                                    |");
    System.out.println("        |                          Retroalimentación                         |");
    System.out.println("        |                                                                    |");
    if(a5 == 10){
        System.out.println("        |                        Sin Retroalimentación                       |");
        System.out.println("        |                                                                    |");
    }
    if(qstm2int1 == 1){
    }else{
        System.out.println("        |                             Pregunta 1                             |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm2int2 == 2){
    }else{
        System.out.println("        |                             Pregunta 2                             |");
        System.out.println("        |          La opción correcta era Opcion2 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm2int3 == 3){
    }else{
        System.out.println("        |                             Pregunta 3                             |");
        System.out.println("        |          La opción correcta era Opcion3 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm2int4 == 4){
    }else{
        System.out.println("        |                             Pregunta 4                             |");
        System.out.println("        |          La opción correcta era Opcion4 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm2int5 == 1){
    }else{
        System.out.println("        |                             Pregunta 5                             |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm2int6 == 1){
    }else{
        System.out.println("        |                             Pregunta 6                             |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm2int7 == 2){
    }else{
        System.out.println("        |                             Pregunta 7                             |");
        System.out.println("        |          La opción correcta era Opcion2 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm2int8 == 3){
    }else{
        System.out.println("        |                             Pregunta 8                             |");
        System.out.println("        |          La opción correcta era Opcion3 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm2int9 == 4){
    }else{
        System.out.println("        |                             Pregunta 9                             |");
        System.out.println("        |          La opción correcta era Opcion4 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm2int10 == 1){
    }else{
        System.out.println("        |                             Pregunta 10                            |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    System.out.println("        |____________________________________________________________________|");
}
public static void qstm3(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                        Cuestionario Melodía 3                      |");
    System.out.println("        |                                                                    |");
    System.out.println("        |          Este cuestionario es sobre TEMA sección SUBTEMA           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                        Consta de 10 preguntas                      |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             1. Iniciar                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                             2. Volver                              |");
    System.out.println("        |____________________________________________________________________|");
    userqst6int();
}
public static void userqst6int(){
    int userqst6int = scanner.nextInt();
    if(userqst6int==1){
        qstm3men();
    }else{
        if(userqst6int==2){
            cuestionarios();
        }else{
            System.out.println("Opción invalida");
            qstm3();
        }
    }
}
public static void qstm3men(){
    qstm3int1();
}
public static void qstm3int1(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 1           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm3int1 = scanner.nextInt();
    if(qstm3int1 == 1 || qstm3int1 == 2 || qstm3int1 == 3 || qstm3int1 ==4){
        qstm3int2();
    }else{
        System.out.println("Opción Invalda");
        qstm3int1();
    }
}
public static void qstm3int2(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 2           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm3int2 = scanner.nextInt();
    if(qstm3int2 == 1 || qstm3int2 == 2 || qstm3int2 == 3 ||qstm3int2 ==4){
        qstm3int3();
    }else{
        System.out.println("Opción Invalda");
        qstm3int2();
    }
}
public static void qstm3int3(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 3           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm3int3 = scanner.nextInt();
    if(qstm3int3 == 1 || qstm3int3 == 2 || qstm3int3 == 3 ||qstm3int3 ==4){
        qstm3int4();
    }else{
        System.out.println("Opción Invalda");
        qstm3int3();
    }
}
public static void qstm3int4(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 4                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 4           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm3int4 = scanner.nextInt();
    if(qstm3int4 == 1 || qstm3int4 == 2 || qstm3int4 == 3 ||qstm3int4 ==4){
        qstm3int5();
    }else{
        System.out.println("Opción Invalda");
        qstm3int4();
    }
}
public static void qstm3int5(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 5                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 5           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm3int5 = scanner.nextInt();
    if(qstm3int5 == 1 || qstm3int5 == 2 || qstm3int5 == 3 ||qstm3int5 ==4){
        qstm3int6();
    }else{
        System.out.println("Opción Invalda");
        qstm3int5();
    }
}
public static void qstm3int6(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 6                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 6           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm3int6 = scanner.nextInt();
    if(qstm3int6 == 1 || qstm3int6 == 2 || qstm3int6 == 3 ||qstm3int6 ==4){
        qstm3int7();
    }else{
        System.out.println("Opción Invalda");
        qstm3int6();
    }
}
public static void qstm3int7(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 7                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 7           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm3int7 = scanner.nextInt();
    if(qstm3int7 == 1 || qstm3int7 == 2 || qstm3int7 == 3 ||qstm3int7 ==4){
        qstm3int8();
    }else{
        System.out.println("Opción Invalda");
        qstm3int7();
    }
}
public static void qstm3int8(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 8                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 8           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm3int8 = scanner.nextInt();
    if(qstm3int8 == 1 || qstm3int8 == 2 || qstm3int8 == 3 ||qstm3int8 ==4){
        qstm3int9();
    }else{
        System.out.println("Opción Invalda");
        qstm3int8();
    }
}
public static void qstm3int9(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Pregunta 9                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |            Introduzca el texto para la pregunta numero 9           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm3int9 = scanner.nextInt();
    if(qstm3int9 == 1 || qstm3int9 == 2 || qstm3int9 == 3 ||qstm3int9 ==4){
        qstm3int10();
    }else{
        System.out.println("Opción Invalda");
        qstm3int9();
    }
}
public static void qstm3int10(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                            Pregunta 10                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |           Introduzca el texto para la pregunta numero 10           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Opción 1                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Opción 2                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Opción 3                             |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Opción 4                             |");
    System.out.println("        |____________________________________________________________________|");
    qstm3int10 = scanner.nextInt();
    if(qstm3int10 == 1 || qstm3int10 == 2 || qstm3int10 == 3 ||qstm3int10 ==4){
        rqstm3reslt();
    }else{
        System.out.println("Opción Invalda");
        qstm3int10();
    }
}
public static void rqstm3reslt(){
    int a6 = 0;
    int e6 = 0;
    if(qstm3int1 == 1){
        a6++;
    }else{
        e6++;
    }
    if(qstm3int2 == 2){
        a6++;
    }else{
        e6++;
    }
    if(qstm3int3 == 3){
        a6++;
    }else{
        e6++;
    }
    if(qstm3int4 == 4){
        a6++;
    }else{
        e6++;
    }
    if(qstm3int5 == 1){
        a6++;
    }else{
        e6++;
    }
    if(qstm3int6 == 1){
        a6++;
    }else{
        e6++;
    }
    if(qstm3int7 == 2){
        a6++;
    }else{
        e6++;
    }
    if(qstm3int8 == 3){
        a6++;
    }else{
        e6++;
    }
    if(qstm3int9 == 4){
        a6++;
    }else{
        e6++;
    }
    if(qstm3int10 == 1){
        a6++;
    }else{
        e6++;
    }
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                             Resultados                             |");
    System.out.println("        |                                                                    |");
    if(a6 == 10){
        System.out.println("        | "+"Aciertos="+a6+"                                                        |");
    }else{
        System.out.println("        | "+"Aciertos="+a6+"                                                         |");
    }
    System.out.println("        |                                                                    |");
    if(e6 == 10){
        System.out.println("        | "+"Errores="+e6+"                                                         |");
    }else{
        System.out.println("        | "+"Errores="+e6+"                                                          |");
    }
    System.out.println("        |                                                                    |");
    System.out.println("        |                          Retroalimentación                         |");
    System.out.println("        |                                                                    |");
    if(a6 == 10){
        System.out.println("        |                        Sin Retroalimentación                       |");
        System.out.println("        |                                                                    |");
    }
    if(qstm3int1 == 1){
    }else{
        System.out.println("        |                             Pregunta 1                             |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm3int2 == 2){
    }else{
        System.out.println("        |                             Pregunta 2                             |");
        System.out.println("        |          La opción correcta era Opcion2 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm3int3 == 3){
    }else{
        System.out.println("        |                             Pregunta 3                             |");
        System.out.println("        |          La opción correcta era Opcion3 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm3int4 == 4){
    }else{
        System.out.println("        |                             Pregunta 4                             |");
        System.out.println("        |          La opción correcta era Opcion4 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm3int5 == 1){
    }else{
        System.out.println("        |                             Pregunta 5                             |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm3int6 == 1){
    }else{
        System.out.println("        |                             Pregunta 6                             |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm3int7 == 2){
    }else{
        System.out.println("        |                             Pregunta 7                             |");
        System.out.println("        |          La opción correcta era Opcion2 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm3int8 == 3){
    }else{
        System.out.println("        |                             Pregunta 8                             |");
        System.out.println("        |          La opción correcta era Opcion3 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm3int9 == 4){
    }else{
        System.out.println("        |                             Pregunta 9                             |");
        System.out.println("        |          La opción correcta era Opcion4 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    if(qstm3int10 == 1){
    }else{
        System.out.println("        |                             Pregunta 10                            |");
        System.out.println("        |          La opción correcta era Opcion1 debido a argumento         |");
        System.out.println("        |                                                                    |");
    }
    System.out.println("        |____________________________________________________________________|");
}
public static void equipo(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                     Elija la Subsección Deseada                    |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Instrumentos                         |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. IEMs                                 |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. DAC                                  |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Accesorios                           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            5. Volver                               |");
    System.out.println("        |____________________________________________________________________|");
    equint();
}
public static void equint(){
    int userequinput = scanner.nextInt();
    if(userequinput==1){
        descubrimiento();
    }else{
        if(userequinput==2){
            teoria();
        }else{
            if(userequinput==3){
                equipo();
            }else{
                if(userequinput==4){
                    librerias();
                }else{
                    if(userequinput==5){
                        proceso1();
                    }else{
                        equipo();}}}}}}
public static void librerias(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                     Elija el Genero Musical Deseado                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Rock                                 |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Pop                                  |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Folk                                 |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Indie                                |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            5. Hip-Hop / Rap                        |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            6. R&B                                  |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            7. Volver                               |");
    System.out.println("        |____________________________________________________________________|");
    lint();}
public static void lint(){
    int userlinput = scanner.nextInt();
    if(userlinput==1){
        librock();
    }else{
        if(userlinput==2){
            libpop();
        }else{
            if(userlinput==3){
                libfolk();
            }else{
                if(userlinput==4){
                    libind();
                }else{
                    if(userlinput==5){
                        libhip();
                    }else{
                        if(userlinput==6){
                            librb();
                        }else{
                            if(userlinput==7){
                                proceso1();
                            }else{
                                librerias();}}}}}}}}
public static void librock(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                     Elija la Subsección Deseada                    |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Playlist 1                           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Playlist 2                           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Playlist 3                           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Volver                               |");
    System.out.println("        |____________________________________________________________________|");
    rocklibint();}
public static void rocklibint(){
    int rocklibint = scanner.nextInt();
    if(rocklibint==1){
        descubrimiento();
    }else{
        if(rocklibint==2){
            teoria();
        }else{
            if(rocklibint==3){
                teoria();
            }else{
                if(rocklibint==4){
                    librerias();
                }else{
                    rocklibint();}}}}}
public static void libpop(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                     Elija la Subsección Deseada                    |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Playlist 1                           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Playlist 2                           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Playlist 3                           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Volver                               |");
    System.out.println("        |____________________________________________________________________|");
    poplibint();}
public static void poplibint(){
    int poplibint = scanner.nextInt();
    if(poplibint==1){
        descubrimiento();
    }else{
        if(poplibint==2){
            teoria();
        }else{
            if(poplibint==3){
                teoria();
            }else{
                if(poplibint==4){
                    librerias();
                }else{
                    poplibint();}}}}}
public static void libfolk(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                     Elija la Subsección Deseada                    |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Playlist 1                           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Playlist 2                           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Playlist 3                           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Volver                               |");
    System.out.println("        |____________________________________________________________________|");
    folklibint();}
public static void folklibint(){
    int folklibint = scanner.nextInt();
    if(folklibint==1){
        descubrimiento();
    }else{
        if(folklibint==2){
            teoria();
        }else{
            if(folklibint==3){
                teoria();
            }else{
                if(folklibint==4){
                    librerias();
                }else{
                    folklibint();}}}}}
public static void libind(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                     Elija la Subsección Deseada                    |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Playlist 1                           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Playlist 2                           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Playlist 3                           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Volver                               |");
    System.out.println("        |____________________________________________________________________|");
    indlibint();}
public static void indlibint(){
    int indlibint = scanner.nextInt();
    if(indlibint==1){
        descubrimiento();
    }else{
        if(indlibint==2){
            teoria();
        }else{
            if(indlibint==3){
                teoria();
            }else{
                if(indlibint==4){
                    librerias();
                }else{
                    indlibint();}}}}}
public static void libhip(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                     Elija la Subsección Deseada                    |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Playlist 1                           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Playlist 2                           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Playlist 3                           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Volver                               |");
    System.out.println("        |____________________________________________________________________|");
    hiplibint();}
public static void hiplibint(){
    int hiplibint = scanner.nextInt();
    if(hiplibint==1){
        descubrimiento();
    }else{
        if(hiplibint==2){
            teoria();
        }else{
            if(hiplibint==3){
                teoria();
            }else{
                if(hiplibint==4){
                    librerias();
                }else{
                    hiplibint();
                }}}}}
public static void librb(){
    screen();
    System.out.println("        |                                                                    |");
    System.out.println("        |                     Elija la Subsección Deseada                    |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            1. Playlist 1                           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            2. Playlist 2                           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            3. Playlist 3                           |");
    System.out.println("        |                                                                    |");
    System.out.println("        |                            4. Volver                               |");
    System.out.println("        |____________________________________________________________________|");
    rblibint();}
public static void rblibint(){
    int rblibint = scanner.nextInt();
    if(rblibint==1){
        descubrimiento();
    }else{
        if(rblibint==2){
            teoria();
        }else{
            if(rblibint==3){
                teoria();
            }else{
                if(rblibint==4){
                    librerias();
                }else{
                    rblibint();}}}}}
public static void screen(){
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("         ____________________________________________________________________");
    System.out.println("        |                                                                    |");
    System.out.println("        |          _____       _   _____       _   _                         |");
    System.out.println("        |         |  __ \\     | | |  __ \\     | | | |                        |");
    System.out.println("        |         | |  | |    | | | |__) |   _| |_| |__   ___  _ __          |");
    System.out.println("        |         | |  | |_   | | |  ___/ | | | __| '_ \\ / _ \\| '_ \\         |");
    System.out.println("        |         | |__| | |__| | | |   | |_| | |_| | | | (_) | | | |        |");
    System.out.println("        |         |_____/ \\____/  |_|    \\__, |\\__|_| |_|\\___/|_| |_|        |");
    System.out.println("        |                                 __/ |                              |");
    System.out.println("        |                                |___/                               |");
    System.out.println("        |____________________________________________________________________|");
}}