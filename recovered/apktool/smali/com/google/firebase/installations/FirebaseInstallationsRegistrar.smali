.class public Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-installations"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Lb5;)Lcom/google/firebase/installations/FirebaseInstallationsApi;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;->lambda$getComponents$0(Lcy;)Lcom/google/firebase/installations/FirebaseInstallationsApi;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static lambda$getComponents$0(Lcy;)Lcom/google/firebase/installations/FirebaseInstallationsApi;
    .locals 7

    .line 1
    new-instance v0, Lcom/google/firebase/installations/FirebaseInstallations;

    .line 2
    .line 3
    const-class v1, Lvi0;

    .line 4
    .line 5
    invoke-interface {p0, v1}, Lcy;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lvi0;

    .line 10
    .line 11
    const-class v2, Lyt0;

    .line 12
    .line 13
    invoke-interface {p0, v2}, Lcy;->b(Ljava/lang/Class;)Liz1;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Lf02;

    .line 18
    .line 19
    const-class v4, Lih;

    .line 20
    .line 21
    const-class v5, Ljava/util/concurrent/ExecutorService;

    .line 22
    .line 23
    invoke-direct {v3, v4, v5}, Lf02;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, v3}, Lcy;->e(Lf02;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/util/concurrent/ExecutorService;

    .line 31
    .line 32
    new-instance v4, Lf02;

    .line 33
    .line 34
    const-class v5, Lvj;

    .line 35
    .line 36
    const-class v6, Ljava/util/concurrent/Executor;

    .line 37
    .line 38
    invoke-direct {v4, v5, v6}, Lf02;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p0, v4}, Lcy;->e(Lf02;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, Ljava/util/concurrent/Executor;

    .line 46
    .line 47
    new-instance v4, Lx92;

    .line 48
    .line 49
    invoke-direct {v4, p0}, Lx92;-><init>(Ljava/util/concurrent/Executor;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/firebase/installations/FirebaseInstallations;-><init>(Lvi0;Liz1;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Executor;)V

    .line 53
    .line 54
    .line 55
    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lsx;",
            ">;"
        }
    .end annotation

    .line 1
    const-class p0, Lcom/google/firebase/installations/FirebaseInstallationsApi;

    .line 2
    .line 3
    invoke-static {p0}, Lsx;->b(Ljava/lang/Class;)Lrx;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "fire-installations"

    .line 8
    .line 9
    iput-object v0, p0, Lrx;->a:Ljava/lang/String;

    .line 10
    .line 11
    const-class v1, Lvi0;

    .line 12
    .line 13
    invoke-static {v1}, Lr70;->a(Ljava/lang/Class;)Lr70;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0, v1}, Lrx;->a(Lr70;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lr70;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x1

    .line 24
    const-class v4, Lyt0;

    .line 25
    .line 26
    invoke-direct {v1, v2, v3, v4}, Lr70;-><init>(IILjava/lang/Class;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lrx;->a(Lr70;)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Lf02;

    .line 33
    .line 34
    const-class v4, Lih;

    .line 35
    .line 36
    const-class v5, Ljava/util/concurrent/ExecutorService;

    .line 37
    .line 38
    invoke-direct {v1, v4, v5}, Lf02;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 39
    .line 40
    .line 41
    new-instance v4, Lr70;

    .line 42
    .line 43
    invoke-direct {v4, v1, v3, v2}, Lr70;-><init>(Lf02;II)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v4}, Lrx;->a(Lr70;)V

    .line 47
    .line 48
    .line 49
    new-instance v1, Lf02;

    .line 50
    .line 51
    const-class v4, Lvj;

    .line 52
    .line 53
    const-class v5, Ljava/util/concurrent/Executor;

    .line 54
    .line 55
    invoke-direct {v1, v4, v5}, Lf02;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 56
    .line 57
    .line 58
    new-instance v4, Lr70;

    .line 59
    .line 60
    invoke-direct {v4, v1, v3, v2}, Lr70;-><init>(Lf02;II)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v4}, Lrx;->a(Lr70;)V

    .line 64
    .line 65
    .line 66
    new-instance v1, Ls80;

    .line 67
    .line 68
    const/16 v4, 0xe

    .line 69
    .line 70
    invoke-direct {v1, v4}, Ls80;-><init>(I)V

    .line 71
    .line 72
    .line 73
    iput-object v1, p0, Lrx;->f:Lfy;

    .line 74
    .line 75
    invoke-virtual {p0}, Lrx;->b()Lsx;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    new-instance v1, Lxt0;

    .line 80
    .line 81
    invoke-direct {v1, v2}, Lxt0;-><init>(I)V

    .line 82
    .line 83
    .line 84
    const-class v4, Lxt0;

    .line 85
    .line 86
    invoke-static {v4}, Lsx;->b(Ljava/lang/Class;)Lrx;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    iput v3, v4, Lrx;->e:I

    .line 91
    .line 92
    new-instance v3, Lqx;

    .line 93
    .line 94
    invoke-direct {v3, v1, v2}, Lqx;-><init>(Ljava/lang/Object;I)V

    .line 95
    .line 96
    .line 97
    iput-object v3, v4, Lrx;->f:Lfy;

    .line 98
    .line 99
    invoke-virtual {v4}, Lrx;->b()Lsx;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    const-string v2, "18.0.0"

    .line 104
    .line 105
    invoke-static {v0, v2}, Li13;->i(Ljava/lang/String;Ljava/lang/String;)Lsx;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    filled-new-array {p0, v1, v0}, [Lsx;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0
.end method
