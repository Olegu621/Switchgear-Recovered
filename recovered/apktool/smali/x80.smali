.class public final Lx80;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ls10;

.field public final b:Ls10;


# direct methods
.method public constructor <init>(Ls10;Ls10;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-virtual {p1, v0}, Ls10;->k(I)Ls10;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lx80;->a:Ls10;

    .line 16
    .line 17
    invoke-virtual {p2, v0}, Ls10;->k(I)Ls10;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lx80;->b:Ls10;

    .line 22
    .line 23
    return-void
.end method

.method public static final a(Lx80;Lkotlin/jvm/functions/Function2;Lec;Ld10;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lw80;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lw80;

    .line 7
    .line 8
    iget v1, v0, Lw80;->e:I

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
    iput v1, v0, Lw80;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lw80;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lw80;-><init>(Lx80;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lw80;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lw80;->e:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object p2, v0, Lw80;->b:Lec;

    .line 38
    .line 39
    iget-object p0, v0, Lw80;->a:Lx80;

    .line 40
    .line 41
    :try_start_0
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_2
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance p3, Ly80;

    .line 57
    .line 58
    iget-object v2, p0, Lx80;->b:Ls10;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    :try_start_1
    sget-object v2, Lo42;->b:Lm42;

    .line 67
    .line 68
    iput-object p0, v0, Lw80;->a:Lx80;

    .line 69
    .line 70
    iput-object p2, v0, Lw80;->b:Lec;

    .line 71
    .line 72
    iput v4, v0, Lw80;->e:I

    .line 73
    .line 74
    invoke-interface {p1, p3, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    if-ne p3, v1, :cond_3

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_3
    :goto_1
    sget-object p1, Lo42;->b:Lm42;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :goto_2
    sget-object p3, Lo42;->b:Lm42;

    .line 85
    .line 86
    new-instance p3, Ln42;

    .line 87
    .line 88
    invoke-direct {p3, p1}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    :goto_3
    invoke-static {p3}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    instance-of p0, p1, Ljava/lang/AssertionError;

    .line 99
    .line 100
    if-nez p0, :cond_6

    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    new-instance p0, Lo42;

    .line 106
    .line 107
    invoke-direct {p0, p3}, Lo42;-><init>(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iput-object p0, p2, Lec;->b:Ljava/lang/Object;

    .line 111
    .line 112
    iget-object p0, p2, Lec;->c:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 115
    .line 116
    if-eqz p0, :cond_4

    .line 117
    .line 118
    iput-object v3, p2, Lec;->c:Ljava/lang/Object;

    .line 119
    .line 120
    invoke-static {p3}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-eqz p1, :cond_4

    .line 125
    .line 126
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    :cond_4
    iget-object p0, p2, Lec;->d:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 132
    .line 133
    if-eqz p0, :cond_5

    .line 134
    .line 135
    iput-object v3, p2, Lec;->d:Ljava/lang/Object;

    .line 136
    .line 137
    instance-of p1, p3, Ln42;

    .line 138
    .line 139
    if-nez p1, :cond_5

    .line 140
    .line 141
    invoke-interface {p0, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    return-object p0

    .line 147
    :cond_6
    throw p1
.end method


# virtual methods
.method public final b(Lkotlin/jvm/functions/Function2;)Lec;
    .locals 7

    .line 1
    new-instance v3, Lec;

    .line 2
    .line 3
    const/16 v0, 0x15

    .line 4
    .line 5
    invoke-direct {v3, v0}, Lec;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lx80;->b:Ls10;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v1, Lpi2;

    .line 14
    .line 15
    invoke-direct {v1}, Lk01;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v0}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Lk50;->a(Lkotlin/coroutines/CoroutineContext;)Ly00;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    new-instance v0, Lzs;

    .line 27
    .line 28
    const/4 v5, 0x3

    .line 29
    const/4 v4, 0x0

    .line 30
    move-object v1, p0

    .line 31
    move-object v2, p1

    .line 32
    invoke-direct/range {v0 .. v5}, Lzs;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x3

    .line 36
    invoke-static {v6, v4, v0, p0}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 37
    .line 38
    .line 39
    return-object v3
.end method

.method public final c(Lkotlin/jvm/functions/Function0;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lx80;->a:Ls10;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lpi2;

    .line 7
    .line 8
    invoke-direct {v0}, Lk01;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, p0}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Lk50;->a(Lkotlin/coroutines/CoroutineContext;)Ly00;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v0, Lt80;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v0, p1, v2, v1}, Lt80;-><init>(Lkotlin/jvm/functions/Function0;Lc10;I)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x3

    .line 27
    invoke-static {p0, v2, v0, p1}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 28
    .line 29
    .line 30
    return-void
.end method
