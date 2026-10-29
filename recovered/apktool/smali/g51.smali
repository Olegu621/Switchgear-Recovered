.class public final Lg51;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ln51;


# direct methods
.method public constructor <init>(Ln51;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lg51;->a:Ln51;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLd10;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p5, Lf51;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lf51;

    .line 7
    .line 8
    iget v1, v0, Lf51;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lf51;->d:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lf51;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, Lf51;-><init>(Lg51;Ld10;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p5, v6, Lf51;->b:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, Lz10;->a:Lz10;

    .line 30
    .line 31
    iget v1, v6, Lf51;->d:I

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    if-ne v1, v2, :cond_1

    .line 37
    .line 38
    iget-object p0, v6, Lf51;->a:Lg51;

    .line 39
    .line 40
    :try_start_0
    invoke-static {p5}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p5}, Lpg3;->A(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :try_start_1
    iget-object v1, p0, Lg51;->a:Ln51;

    .line 55
    .line 56
    iput-object p0, v6, Lf51;->a:Lg51;

    .line 57
    .line 58
    iput v2, v6, Lf51;->d:I

    .line 59
    .line 60
    move-object v2, p1

    .line 61
    move-object v3, p2

    .line 62
    move-object v4, p3

    .line 63
    move v5, p4

    .line 64
    invoke-virtual/range {v1 .. v6}, Ln51;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLd10;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-ne p1, v0, :cond_3

    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_3
    :goto_2
    sget-object p1, Lo42;->b:Lm42;

    .line 72
    .line 73
    new-instance p1, Lk91;

    .line 74
    .line 75
    iget-object p0, p0, Lg51;->a:Ln51;

    .line 76
    .line 77
    iget-object p2, p0, Ln51;->d:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object p3, p0, Ln51;->e:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 83
    .line 84
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-boolean p0, p0, Ln51;->f:Z

    .line 88
    .line 89
    invoke-direct {p1, p2, p3, p0}, Lk91;-><init>(Ljava/lang/Object;Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 90
    .line 91
    .line 92
    return-object p1

    .line 93
    :catch_0
    move-exception v0

    .line 94
    move-object p0, v0

    .line 95
    sget-object p1, Lo42;->b:Lm42;

    .line 96
    .line 97
    new-instance p1, Ln42;

    .line 98
    .line 99
    invoke-direct {p1, p0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    return-object p1
.end method
