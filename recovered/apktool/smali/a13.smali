.class public final La13;
.super Lu03;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final Companion:Lv03;


# instance fields
.field public final a:Lfb1;

.field public final b:Lcom/usercentrics/sdk/UsercentricsOptions;

.field public c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lv03;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La13;->Companion:Lv03;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lfb1;Lcom/usercentrics/sdk/UsercentricsOptions;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La13;->a:Lfb1;

    .line 5
    .line 6
    iput-object p2, p0, La13;->b:Lcom/usercentrics/sdk/UsercentricsOptions;

    .line 7
    .line 8
    const-string p1, ""

    .line 9
    .line 10
    iput-object p1, p0, La13;->c:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public static final e(La13;Ljava/lang/String;Ld10;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, La13;->a:Lfb1;

    .line 2
    .line 3
    instance-of v1, p2, Lx03;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p2

    .line 8
    check-cast v1, Lx03;

    .line 9
    .line 10
    iget v2, v1, Lx03;->c:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lx03;->c:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lx03;

    .line 23
    .line 24
    invoke-direct {v1, p0, p2}, Lx03;-><init>(La13;Ld10;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v1, Lx03;->a:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lz10;->a:Lz10;

    .line 30
    .line 31
    iget v3, v1, Lx03;->c:I

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    if-ne v3, v5, :cond_1

    .line 38
    .line 39
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    check-cast p2, Lo42;

    .line 43
    .line 44
    iget-object p0, p2, Lo42;->a:Ljava/lang/Object;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v4

    .line 53
    :cond_2
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lfb1;->a()Ld40;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    iget-object v3, v0, Lfb1;->F:Lhk2;

    .line 61
    .line 62
    invoke-virtual {p2}, Ld40;->c()Ljh1;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    iget-object v6, p2, Ljh1;->b:Lk61;

    .line 67
    .line 68
    iget-object p2, p2, Ljh1;->a:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {v3}, Lhk2;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    check-cast v7, Lac2;

    .line 75
    .line 76
    invoke-virtual {v3}, Lhk2;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, Lac2;

    .line 81
    .line 82
    iget-object v3, v3, Lac2;->c:Lk61;

    .line 83
    .line 84
    iget-object v3, v3, Lk61;->b:Ljava/util/List;

    .line 85
    .line 86
    invoke-static {v3, p2}, Lqj3;->O(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    const/16 v8, 0x3ffd

    .line 91
    .line 92
    invoke-static {v6, v3, v4, v8}, Lk61;->a(Lk61;Ljava/util/List;Ljava/lang/String;I)Lk61;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iput-object v3, v7, Lac2;->c:Lk61;

    .line 100
    .line 101
    iget-object v0, v0, Lfb1;->z:Lhk2;

    .line 102
    .line 103
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Lg80;

    .line 108
    .line 109
    check-cast v0, Lpz2;

    .line 110
    .line 111
    invoke-virtual {v0, v6, p2}, Lpz2;->g(Lk61;Ljava/util/List;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, La13;->o()Z

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    if-nez p2, :cond_3

    .line 119
    .line 120
    sget-object p0, Lo42;->b:Lm42;

    .line 121
    .line 122
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object p0

    .line 125
    :cond_3
    invoke-virtual {p0}, La13;->m()Lil2;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    iput v5, v1, Lx03;->c:I

    .line 130
    .line 131
    check-cast p0, Lqk2;

    .line 132
    .line 133
    invoke-virtual {p0, p1, v1}, Lqk2;->a(Ljava/lang/String;Ld10;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    if-ne p0, v2, :cond_4

    .line 138
    .line 139
    return-object v2

    .line 140
    :cond_4
    :goto_1
    invoke-static {p0}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    if-eqz p0, :cond_5

    .line 145
    .line 146
    new-instance p1, Ln42;

    .line 147
    .line 148
    invoke-direct {p1, p0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 149
    .line 150
    .line 151
    return-object p1

    .line 152
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    return-object p0
.end method


# virtual methods
.method public final a(Lkotlin/jvm/functions/Function1;)V
    .locals 4

    .line 1
    iget-object v0, p0, La13;->a:Lfb1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lfb1;->b()Lx80;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lw03;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    invoke-direct {v1, p0, v2, v3}, Lw03;-><init>(La13;Lc10;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lx80;->b(Lkotlin/jvm/functions/Function2;)Lec;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Loc;

    .line 19
    .line 20
    const/16 v2, 0xf

    .line 21
    .line 22
    invoke-direct {v1, v2, p0, p1}, Loc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lec;->H(Lkotlin/jvm/functions/Function1;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final b()Lcom/usercentrics/sdk/UsercentricsReadyStatus;
    .locals 8

    .line 1
    iget-object v0, p0, La13;->a:Lfb1;

    .line 2
    .line 3
    iget-object v1, v0, Lfb1;->U:Lhk2;

    .line 4
    .line 5
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljc2;

    .line 10
    .line 11
    iget-object v2, p0, La13;->b:Lcom/usercentrics/sdk/UsercentricsOptions;

    .line 12
    .line 13
    iget-object v2, v2, Lcom/usercentrics/sdk/UsercentricsOptions;->f:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v2}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x1

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    new-instance v2, Lcom/usercentrics/sdk/GeolocationRuleset;

    .line 24
    .line 25
    iget-object v5, v1, Ljc2;->d:Ljava/lang/String;

    .line 26
    .line 27
    iget-boolean v1, v1, Ljc2;->f:Z

    .line 28
    .line 29
    xor-int/2addr v1, v4

    .line 30
    invoke-direct {v2, v5, v1}, Lcom/usercentrics/sdk/GeolocationRuleset;-><init>(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v2, v3

    .line 35
    :goto_0
    new-instance v1, Lcom/usercentrics/sdk/UsercentricsReadyStatus;

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    :try_start_0
    sget-object v6, Lo42;->b:Lm42;

    .line 39
    .line 40
    iget-object v6, v0, Lfb1;->t:Lhk2;

    .line 41
    .line 42
    invoke-virtual {v6}, Lhk2;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    check-cast v6, Lsx0;

    .line 47
    .line 48
    invoke-virtual {v6}, Lsx0;->d()Ltx0;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    sget-object v7, Ltx0;->b:Ltx0;

    .line 53
    .line 54
    if-eq v6, v7, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    move v4, v5

    .line 58
    :goto_1
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    goto :goto_2

    .line 63
    :catchall_0
    move-exception v4

    .line 64
    sget-object v6, Lo42;->b:Lm42;

    .line 65
    .line 66
    new-instance v6, Ln42;

    .line 67
    .line 68
    invoke-direct {v6, v4}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    move-object v4, v6

    .line 72
    :goto_2
    nop

    .line 73
    instance-of v6, v4, Ln42;

    .line 74
    .line 75
    if-eqz v6, :cond_2

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_2
    move-object v3, v4

    .line 79
    :goto_3
    check-cast v3, Ljava/lang/Boolean;

    .line 80
    .line 81
    if-eqz v3, :cond_3

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    :cond_3
    invoke-virtual {p0}, La13;->k()Ljava/util/ArrayList;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    iget-object v0, v0, Lfb1;->C:Lhk2;

    .line 92
    .line 93
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Lp91;

    .line 98
    .line 99
    iget-object v0, v0, Lp91;->b:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 100
    .line 101
    invoke-direct {v1, v5, p0, v2, v0}, Lcom/usercentrics/sdk/UsercentricsReadyStatus;-><init>(ZLjava/util/ArrayList;Lcom/usercentrics/sdk/GeolocationRuleset;Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;)V

    .line 102
    .line 103
    .line 104
    return-object v1
.end method

.method public final c(Lez2;)V
    .locals 8

    .line 1
    iget-object v0, p0, La13;->a:Lfb1;

    .line 2
    .line 3
    iget-object v1, v0, Lfb1;->U:Lhk2;

    .line 4
    .line 5
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljc2;

    .line 10
    .line 11
    iget-object v5, v1, Ljc2;->d:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v0, v0, Lfb1;->Q:Lhk2;

    .line 14
    .line 15
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v3, v0

    .line 20
    check-cast v3, Lw7;

    .line 21
    .line 22
    invoke-virtual {p0}, La13;->j()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object p0, v3, Lw7;->c:Lx80;

    .line 33
    .line 34
    new-instance v2, Lv7;

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    move-object v4, p1

    .line 38
    invoke-direct/range {v2 .. v7}, Lv7;-><init>(Lw7;Lez2;Ljava/lang/String;Ljava/lang/String;Lc10;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v2}, Lx80;->b(Lkotlin/jvm/functions/Function2;)Lec;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance p1, Lo;

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    invoke-direct {p1, v3, v0}, Lo;-><init>(Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1}, Lec;->G(Lkotlin/jvm/functions/Function1;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final d()Ljava/util/ArrayList;
    .locals 8

    .line 1
    sget-object v0, Lmz2;->a:Lmz2;

    .line 2
    .line 3
    iget-object v1, p0, La13;->a:Lfb1;

    .line 4
    .line 5
    iget-object v2, v1, Lfb1;->F:Lhk2;

    .line 6
    .line 7
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Lac2;

    .line 12
    .line 13
    iget-object v2, v2, Lac2;->c:Lk61;

    .line 14
    .line 15
    iget-object v2, v2, Lk61;->b:Ljava/util/List;

    .line 16
    .line 17
    new-instance v3, Ljava/util/ArrayList;

    .line 18
    .line 19
    const/16 v4, 0xa

    .line 20
    .line 21
    invoke-static {v2, v4}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, Lm61;

    .line 43
    .line 44
    iget-object v5, v4, Lm61;->p:Li61;

    .line 45
    .line 46
    iget-object v5, v5, Li61;->a:Ljava/util/List;

    .line 47
    .line 48
    new-instance v6, Li61;

    .line 49
    .line 50
    const/4 v7, 0x1

    .line 51
    invoke-direct {v6, v5, v7}, Li61;-><init>(Ljava/util/List;Z)V

    .line 52
    .line 53
    .line 54
    invoke-static {v4, v6}, Lm61;->a(Lm61;Li61;)Lm61;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {v1}, Lfb1;->a()Ld40;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget-object v2, p0, La13;->c:Ljava/lang/String;

    .line 67
    .line 68
    sget-object v4, Lkz2;->b:Lkz2;

    .line 69
    .line 70
    invoke-virtual {v1, v2, v3, v4, v0}, Ld40;->b(Ljava/lang/String;Ljava/util/List;Lkz2;Lmz2;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, La13;->l()Ljava/util/ArrayList;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0
.end method

.method public final f(Ljava/util/ArrayList;Ltk2;)V
    .locals 7

    .line 1
    iget-object v0, p0, La13;->b:Lcom/usercentrics/sdk/UsercentricsOptions;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->g:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, La13;->a:Lfb1;

    .line 9
    .line 10
    invoke-virtual {v0}, Lfb1;->b()Lx80;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Le8;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x2

    .line 18
    move-object v2, p0

    .line 19
    move-object v3, p1

    .line 20
    move-object v4, p2

    .line 21
    invoke-direct/range {v1 .. v6}, Le8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lx80;->b(Lkotlin/jvm/functions/Function2;)Lec;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance p1, Lo;

    .line 29
    .line 30
    const/16 p2, 0x1a

    .line 31
    .line 32
    invoke-direct {p1, v2, p2}, Lo;-><init>(Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lec;->H(Lkotlin/jvm/functions/Function1;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final g()Ljava/util/ArrayList;
    .locals 8

    .line 1
    sget-object v0, Lmz2;->a:Lmz2;

    .line 2
    .line 3
    iget-object v1, p0, La13;->a:Lfb1;

    .line 4
    .line 5
    iget-object v2, v1, Lfb1;->F:Lhk2;

    .line 6
    .line 7
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Lac2;

    .line 12
    .line 13
    iget-object v2, v2, Lac2;->c:Lk61;

    .line 14
    .line 15
    iget-object v2, v2, Lk61;->b:Ljava/util/List;

    .line 16
    .line 17
    new-instance v3, Ljava/util/ArrayList;

    .line 18
    .line 19
    const/16 v4, 0xa

    .line 20
    .line 21
    invoke-static {v2, v4}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, Lm61;

    .line 43
    .line 44
    iget-boolean v5, v4, Lm61;->q:Z

    .line 45
    .line 46
    iget-object v6, v4, Lm61;->p:Li61;

    .line 47
    .line 48
    iget-object v6, v6, Li61;->a:Ljava/util/List;

    .line 49
    .line 50
    new-instance v7, Li61;

    .line 51
    .line 52
    invoke-direct {v7, v6, v5}, Li61;-><init>(Ljava/util/List;Z)V

    .line 53
    .line 54
    .line 55
    invoke-static {v4, v7}, Lm61;->a(Lm61;Li61;)Lm61;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {v1}, Lfb1;->a()Ld40;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v2, p0, La13;->c:Ljava/lang/String;

    .line 68
    .line 69
    sget-object v4, Lkz2;->c:Lkz2;

    .line 70
    .line 71
    invoke-virtual {v1, v2, v3, v4, v0}, Ld40;->b(Ljava/lang/String;Ljava/util/List;Lkz2;Lmz2;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, La13;->l()Ljava/util/ArrayList;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public final h(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 6

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/UpdatedConsentPayload;

    .line 2
    .line 3
    iget-object v1, p0, La13;->c:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object p0, p0, La13;->a:Lfb1;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lfb1;->F:Lhk2;

    .line 14
    .line 15
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lac2;

    .line 20
    .line 21
    iget-object v1, v1, Lac2;->c:Lk61;

    .line 22
    .line 23
    iget-object v1, v1, Lk61;->e:Ljava/lang/String;

    .line 24
    .line 25
    :cond_0
    move-object v2, v1

    .line 26
    iget-object v1, p0, Lfb1;->F:Lhk2;

    .line 27
    .line 28
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lac2;

    .line 33
    .line 34
    iget-object v1, v1, Lac2;->c:Lk61;

    .line 35
    .line 36
    iget-object v1, v1, Lk61;->d:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget-boolean v1, v1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->h:Z

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v1, 0x0

    .line 44
    :goto_0
    if-eqz v1, :cond_2

    .line 45
    .line 46
    iget-object v1, p0, Lfb1;->I:Lhk2;

    .line 47
    .line 48
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Lyr;

    .line 53
    .line 54
    invoke-virtual {v1}, Lyr;->a()Lcom/usercentrics/ccpa/CCPAData;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Lcom/usercentrics/ccpa/CCPAData;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :goto_1
    move-object v3, p1

    .line 63
    move-object v5, p2

    .line 64
    move-object v4, v1

    .line 65
    move-object v1, p3

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    const-string v1, ""

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :goto_2
    invoke-direct/range {v0 .. v5}, Lcom/usercentrics/sdk/UpdatedConsentPayload;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lfb1;->b()Lx80;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    new-instance p1, Lyh;

    .line 78
    .line 79
    const/16 p2, 0x1c

    .line 80
    .line 81
    invoke-direct {p1, v0, p2}, Lyh;-><init>(Ljava/lang/Object;I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p1}, Lx80;->c(Lkotlin/jvm/functions/Function0;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final i(Lo42;)Ljava/lang/Object;
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v1, p1, Lo42;->a:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-static {v1}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v1, v0

    .line 12
    :goto_0
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-object p0, p1, Lo42;->a:Ljava/lang/Object;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    invoke-virtual {p0}, La13;->o()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0}, La13;->m()Lil2;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lqk2;

    .line 28
    .line 29
    invoke-virtual {p1}, Lqk2;->i()Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

    .line 30
    .line 31
    .line 32
    :cond_2
    iget-object p1, p0, La13;->b:Lcom/usercentrics/sdk/UsercentricsOptions;

    .line 33
    .line 34
    iget-boolean v1, p1, Lcom/usercentrics/sdk/UsercentricsOptions;->g:Z

    .line 35
    .line 36
    const-string v2, ""

    .line 37
    .line 38
    iget-object v3, p0, La13;->a:Lfb1;

    .line 39
    .line 40
    if-eqz v1, :cond_8

    .line 41
    .line 42
    iget-object v1, v3, Lfb1;->W:Lhk2;

    .line 43
    .line 44
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lbg1;

    .line 49
    .line 50
    invoke-virtual {v3}, Lfb1;->f()Lpc2;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    iget-object v4, v4, Lpc2;->d:Lkn1;

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-object v4, v4, Lkn1;->b:Ljava/util/List;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v5, v1, Lbg1;->b:Li03;

    .line 68
    .line 69
    const-string v6, "Consent Mediation is Enabled"

    .line 70
    .line 71
    invoke-interface {v5, v6, v0}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 72
    .line 73
    .line 74
    new-instance v7, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    :cond_3
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    if-eqz v8, :cond_7

    .line 88
    .line 89
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    check-cast v8, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;

    .line 94
    .line 95
    iget-object v9, v8, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->a:Ljava/lang/String;

    .line 96
    .line 97
    if-nez v9, :cond_4

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    iget-object v10, v1, Lbg1;->a:Lac1;

    .line 101
    .line 102
    iget-object v11, v10, Lac1;->b:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v11, Ljava/util/Map;

    .line 105
    .line 106
    invoke-interface {v11, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v11

    .line 110
    if-nez v11, :cond_5

    .line 111
    .line 112
    iget-object v10, v10, Lac1;->d:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v10, Lec;

    .line 115
    .line 116
    iget-object v10, v10, Lec;->d:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v10, Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v10, v9}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    if-eqz v9, :cond_3

    .line 125
    .line 126
    :cond_5
    iget-object v8, v8, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->e:Ljava/lang/String;

    .line 127
    .line 128
    if-nez v8, :cond_6

    .line 129
    .line 130
    move-object v8, v2

    .line 131
    :cond_6
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_7
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    const/4 v11, 0x0

    .line 144
    const/16 v12, 0x3e

    .line 145
    .line 146
    const-string v8, " | "

    .line 147
    .line 148
    const/4 v9, 0x0

    .line 149
    const/4 v10, 0x0

    .line 150
    invoke-static/range {v7 .. v12}, Lkotlin/collections/CollectionsKt;->x(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    new-instance v7, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    const-string v8, "[Mediation] "

    .line 157
    .line 158
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string v1, "/"

    .line 165
    .line 166
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v1, " Services are supported: "

    .line 173
    .line 174
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-interface {v5, v1, v0}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 185
    .line 186
    .line 187
    :cond_8
    iget-boolean p1, p1, Lcom/usercentrics/sdk/UsercentricsOptions;->g:Z

    .line 188
    .line 189
    const/4 v1, 0x1

    .line 190
    if-nez p1, :cond_9

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_9
    invoke-virtual {p0}, La13;->k()Ljava/util/ArrayList;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-virtual {p0}, La13;->o()Z

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    if-eqz v4, :cond_a

    .line 202
    .line 203
    new-instance v4, Ly03;

    .line 204
    .line 205
    invoke-direct {v4, p0, p1, v1}, Ly03;-><init>(La13;Ljava/util/ArrayList;I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0, v4}, La13;->a(Lkotlin/jvm/functions/Function1;)V

    .line 209
    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_a
    invoke-virtual {p0, p1, v0}, La13;->f(Ljava/util/ArrayList;Ltk2;)V

    .line 213
    .line 214
    .line 215
    :goto_2
    invoke-virtual {p0}, La13;->j()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    if-eqz p1, :cond_c

    .line 220
    .line 221
    invoke-static {p1}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    if-eqz v4, :cond_b

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_b
    invoke-virtual {v3}, Lfb1;->e()Li03;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    new-instance v1, Ljava/lang/StringBuilder;

    .line 233
    .line 234
    const-string v2, "AB Testing Variant was already selected \'"

    .line 235
    .line 236
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    const-string p1, "\'."

    .line 243
    .line 244
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-interface {p0, p1, v0}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 252
    .line 253
    .line 254
    goto/16 :goto_9

    .line 255
    .line 256
    :cond_c
    :goto_3
    invoke-virtual {v3}, Lfb1;->f()Lpc2;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    iget-object p1, p1, Lpc2;->d:Lkn1;

    .line 261
    .line 262
    if-eqz p1, :cond_d

    .line 263
    .line 264
    iget-object p1, p1, Lkn1;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 265
    .line 266
    if-eqz p1, :cond_d

    .line 267
    .line 268
    iget-object p1, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->A:Lcom/usercentrics/sdk/v2/settings/data/VariantsSettings;

    .line 269
    .line 270
    goto :goto_4

    .line 271
    :cond_d
    move-object p1, v0

    .line 272
    :goto_4
    const/4 v4, 0x0

    .line 273
    if-eqz p1, :cond_e

    .line 274
    .line 275
    iget-boolean v5, p1, Lcom/usercentrics/sdk/v2/settings/data/VariantsSettings;->a:Z

    .line 276
    .line 277
    if-ne v5, v1, :cond_e

    .line 278
    .line 279
    goto :goto_5

    .line 280
    :cond_e
    move v1, v4

    .line 281
    :goto_5
    if-eqz p1, :cond_f

    .line 282
    .line 283
    iget-object v4, p1, Lcom/usercentrics/sdk/v2/settings/data/VariantsSettings;->c:Ljava/lang/String;

    .line 284
    .line 285
    goto :goto_6

    .line 286
    :cond_f
    move-object v4, v0

    .line 287
    :goto_6
    const-string v5, "UC"

    .line 288
    .line 289
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    if-eqz v1, :cond_17

    .line 294
    .line 295
    if-eqz v4, :cond_17

    .line 296
    .line 297
    invoke-virtual {v3}, Lfb1;->e()Li03;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    const-string v4, "AB Testing \'Activate with Usercentrics\' option triggered the variant selection."

    .line 302
    .line 303
    invoke-interface {v1, v4, v0}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 304
    .line 305
    .line 306
    if-eqz p1, :cond_10

    .line 307
    .line 308
    invoke-virtual {v3}, Lfb1;->d()La21;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-virtual {p1, v1}, Lcom/usercentrics/sdk/v2/settings/data/VariantsSettings;->a(La21;)Ljava/util/List;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    if-nez p1, :cond_11

    .line 317
    .line 318
    :cond_10
    sget-object p1, Lnd0;->a:Lnd0;

    .line 319
    .line 320
    :cond_11
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/util/List;)Ljava/util/List;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    check-cast p1, Ljava/lang/String;

    .line 329
    .line 330
    if-nez p1, :cond_12

    .line 331
    .line 332
    goto :goto_7

    .line 333
    :cond_12
    move-object v2, p1

    .line 334
    :goto_7
    invoke-static {v2}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 335
    .line 336
    .line 337
    move-result p1

    .line 338
    if-nez p1, :cond_17

    .line 339
    .line 340
    invoke-virtual {p0}, La13;->j()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object p0

    .line 344
    invoke-virtual {v2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result p0

    .line 348
    if-eqz p0, :cond_13

    .line 349
    .line 350
    goto :goto_9

    .line 351
    :cond_13
    invoke-virtual {v3}, Lfb1;->f()Lpc2;

    .line 352
    .line 353
    .line 354
    move-result-object p0

    .line 355
    iget-object p0, p0, Lpc2;->d:Lkn1;

    .line 356
    .line 357
    if-eqz p0, :cond_14

    .line 358
    .line 359
    iget-object p0, p0, Lkn1;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 360
    .line 361
    if-eqz p0, :cond_14

    .line 362
    .line 363
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->A:Lcom/usercentrics/sdk/v2/settings/data/VariantsSettings;

    .line 364
    .line 365
    goto :goto_8

    .line 366
    :cond_14
    move-object p0, v0

    .line 367
    :goto_8
    if-eqz p0, :cond_15

    .line 368
    .line 369
    invoke-virtual {v3}, Lfb1;->d()La21;

    .line 370
    .line 371
    .line 372
    move-result-object p1

    .line 373
    invoke-virtual {p0, p1}, Lcom/usercentrics/sdk/v2/settings/data/VariantsSettings;->a(La21;)Ljava/util/List;

    .line 374
    .line 375
    .line 376
    move-result-object p0

    .line 377
    if-nez p0, :cond_16

    .line 378
    .line 379
    :cond_15
    sget-object p0, Lnd0;->a:Lnd0;

    .line 380
    .line 381
    :cond_16
    invoke-virtual {v3}, Lfb1;->e()Li03;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    new-instance v1, Ljava/lang/StringBuilder;

    .line 386
    .line 387
    const-string v4, "Select AB Testing Variant \'"

    .line 388
    .line 389
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    const-string v4, "\'. Admin Interface list: "

    .line 396
    .line 397
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    const-string v4, "."

    .line 404
    .line 405
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    invoke-interface {p1, v1, v0}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 413
    .line 414
    .line 415
    invoke-interface {p0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    iget-object p0, v3, Lfb1;->z:Lhk2;

    .line 419
    .line 420
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object p0

    .line 424
    check-cast p0, Lg80;

    .line 425
    .line 426
    check-cast p0, Lpz2;

    .line 427
    .line 428
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    iget-object p0, p0, Lpz2;->e:Lod2;

    .line 432
    .line 433
    sget-object p1, Lfh2;->a:[Lfh2;

    .line 434
    .line 435
    const-string p1, "ab_testing_variant"

    .line 436
    .line 437
    invoke-virtual {p0, p1, v2}, Lod2;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    :cond_17
    :goto_9
    sget-object p0, Lo42;->b:Lm42;

    .line 441
    .line 442
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 443
    .line 444
    return-object p0
.end method

.method public final j()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, La13;->a:Lfb1;

    .line 2
    .line 3
    iget-object p0, p0, Lfb1;->z:Lhk2;

    .line 4
    .line 5
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lg80;

    .line 10
    .line 11
    check-cast p0, Lpz2;

    .line 12
    .line 13
    iget-object p0, p0, Lpz2;->e:Lod2;

    .line 14
    .line 15
    sget-object v0, Lfh2;->a:[Lfh2;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lod2;->a:Landroid/content/SharedPreferences;

    .line 21
    .line 22
    const-string v0, "ab_testing_variant"

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public final k()Ljava/util/ArrayList;
    .locals 13

    .line 1
    iget-object p0, p0, La13;->a:Lfb1;

    .line 2
    .line 3
    iget-object p0, p0, Lfb1;->F:Lhk2;

    .line 4
    .line 5
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lac2;

    .line 10
    .line 11
    iget-object p0, p0, Lac2;->c:Lk61;

    .line 12
    .line 13
    iget-object p0, p0, Lk61;->b:Ljava/util/List;

    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    const/16 v1, 0xa

    .line 18
    .line 19
    invoke-static {p0, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lm61;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object v4, v2, Lm61;->f:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v3, v2, Lm61;->p:Li61;

    .line 48
    .line 49
    iget-boolean v5, v3, Li61;->b:Z

    .line 50
    .line 51
    iget-object v3, v3, Li61;->a:Ljava/util/List;

    .line 52
    .line 53
    new-instance v6, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-static {v3, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-eqz v7, :cond_0

    .line 71
    .line 72
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    check-cast v7, Lj61;

    .line 77
    .line 78
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    new-instance v8, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;

    .line 82
    .line 83
    iget-boolean v9, v7, Lj61;->b:Z

    .line 84
    .line 85
    iget-object v10, v7, Lj61;->c:Lmz2;

    .line 86
    .line 87
    iget-wide v11, v7, Lj61;->e:J

    .line 88
    .line 89
    invoke-direct {v8, v9, v10, v11, v12}, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;-><init>(ZLmz2;J)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_0
    iget-object v3, v2, Lm61;->p:Li61;

    .line 97
    .line 98
    iget-object v3, v3, Li61;->a:Ljava/util/List;

    .line 99
    .line 100
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->z(Ljava/util/List;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    check-cast v3, Lj61;

    .line 105
    .line 106
    if-eqz v3, :cond_1

    .line 107
    .line 108
    iget-object v3, v3, Lj61;->c:Lmz2;

    .line 109
    .line 110
    :goto_2
    move-object v7, v3

    .line 111
    goto :goto_3

    .line 112
    :cond_1
    const/4 v3, 0x0

    .line 113
    goto :goto_2

    .line 114
    :goto_3
    iget-object v8, v2, Lm61;->h:Ljava/lang/String;

    .line 115
    .line 116
    iget-object v9, v2, Lm61;->m:Ljava/lang/String;

    .line 117
    .line 118
    iget-boolean v10, v2, Lm61;->q:Z

    .line 119
    .line 120
    iget-object v11, v2, Lm61;->n:Ljava/lang/String;

    .line 121
    .line 122
    new-instance v3, Lcom/usercentrics/sdk/UsercentricsServiceConsent;

    .line 123
    .line 124
    invoke-direct/range {v3 .. v11}, Lcom/usercentrics/sdk/UsercentricsServiceConsent;-><init>(Ljava/lang/String;ZLjava/util/ArrayList;Lmz2;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_2
    return-object v0
.end method

.method public final l()Ljava/util/ArrayList;
    .locals 3

    .line 1
    invoke-virtual {p0}, La13;->k()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, La13;->o()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p0, v0, v1}, La13;->f(Ljava/util/ArrayList;Ltk2;)V

    .line 13
    .line 14
    .line 15
    const-string v1, ""

    .line 16
    .line 17
    invoke-virtual {p0, v1, v1, v0}, La13;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    new-instance v1, Ly03;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v1, p0, v0, v2}, Ly03;-><init>(La13;Ljava/util/ArrayList;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1}, La13;->a(Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public final m()Lil2;
    .locals 0

    .line 1
    iget-object p0, p0, La13;->a:Lfb1;

    .line 2
    .line 3
    iget-object p0, p0, Lfb1;->K:Lhk2;

    .line 4
    .line 5
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lil2;

    .line 10
    .line 11
    return-object p0
.end method

.method public final n(ZLd10;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lz03;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lz03;

    .line 7
    .line 8
    iget v1, v0, Lz03;->e:I

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
    iput v1, v0, Lz03;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lz03;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lz03;-><init>(La13;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lz03;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lz03;->e:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, Lz03;->a:La13;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    check-cast p2, Lo42;

    .line 46
    .line 47
    iget-object p1, p2, Lo42;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v5

    .line 56
    :cond_2
    iget-object p0, v0, Lz03;->b:Ljc2;

    .line 57
    .line 58
    iget-object p1, v0, Lz03;->a:La13;

    .line 59
    .line 60
    :try_start_1
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_1
    .catch Lvz2; {:try_start_1 .. :try_end_1} :catch_0

    .line 61
    .line 62
    .line 63
    move-object v6, p1

    .line 64
    move-object p1, p0

    .line 65
    move-object p0, v6

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object p2, p0, La13;->a:Lfb1;

    .line 71
    .line 72
    iget-object v2, p2, Lfb1;->d:Lhk2;

    .line 73
    .line 74
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Lfn1;

    .line 79
    .line 80
    iput-boolean p1, v2, Lfn1;->a:Z

    .line 81
    .line 82
    iget-object p1, p2, Lfb1;->U:Lhk2;

    .line 83
    .line 84
    invoke-virtual {p1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Ljc2;

    .line 89
    .line 90
    :try_start_2
    iget-object p2, p0, La13;->b:Lcom/usercentrics/sdk/UsercentricsOptions;

    .line 91
    .line 92
    iput-object p0, v0, Lz03;->a:La13;

    .line 93
    .line 94
    iput-object p1, v0, Lz03;->b:Ljc2;

    .line 95
    .line 96
    iput v4, v0, Lz03;->e:I

    .line 97
    .line 98
    invoke-virtual {p1, p2, v0}, Ljc2;->a(Lcom/usercentrics/sdk/UsercentricsOptions;Ld10;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p2
    :try_end_2
    .catch Lvz2; {:try_start_2 .. :try_end_2} :catch_0

    .line 102
    if-ne p2, v1, :cond_4

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    :goto_1
    iget-object p2, p0, La13;->a:Lfb1;

    .line 106
    .line 107
    iget-object p2, p2, Lfb1;->z:Lhk2;

    .line 108
    .line 109
    invoke-virtual {p2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    check-cast p2, Lg80;

    .line 114
    .line 115
    check-cast p2, Lpz2;

    .line 116
    .line 117
    iget-object p2, p2, Lpz2;->f:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;

    .line 118
    .line 119
    iget-object p2, p2, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;->a:Ljava/lang/String;

    .line 120
    .line 121
    invoke-static {p2}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-nez v2, :cond_5

    .line 126
    .line 127
    iput-object p2, p0, La13;->c:Ljava/lang/String;

    .line 128
    .line 129
    :cond_5
    :try_start_3
    iget-object p2, p0, La13;->c:Ljava/lang/String;

    .line 130
    .line 131
    iput-object p0, v0, Lz03;->a:La13;

    .line 132
    .line 133
    iput-object v5, v0, Lz03;->b:Ljc2;

    .line 134
    .line 135
    iput v3, v0, Lz03;->e:I

    .line 136
    .line 137
    invoke-virtual {p1, p2, v0}, Ljc2;->c(Ljava/lang/String;Ld10;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-ne p1, v1, :cond_6

    .line 142
    .line 143
    :goto_2
    return-object v1

    .line 144
    :cond_6
    :goto_3
    new-instance p2, Lo42;

    .line 145
    .line 146
    invoke-direct {p2, p1}, Lo42;-><init>(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, p2}, La13;->i(Lo42;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    return-object p0

    .line 154
    :catchall_0
    invoke-virtual {p0, v5}, La13;->i(Lo42;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0

    .line 159
    :catch_0
    move-exception p0

    .line 160
    sget-object p1, Lo42;->b:Lm42;

    .line 161
    .line 162
    new-instance p1, Ln42;

    .line 163
    .line 164
    invoke-direct {p1, p0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    return-object p1
.end method

.method public final o()Z
    .locals 0

    .line 1
    iget-object p0, p0, La13;->a:Lfb1;

    .line 2
    .line 3
    iget-object p0, p0, Lfb1;->F:Lhk2;

    .line 4
    .line 5
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lac2;

    .line 10
    .line 11
    iget-object p0, p0, Lac2;->c:Lk61;

    .line 12
    .line 13
    iget-boolean p0, p0, Lk61;->g:Z

    .line 14
    .line 15
    return p0
.end method

.method public final p(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 10

    .line 1
    sget-object v0, Lmz2;->a:Lmz2;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La13;->a:Lfb1;

    .line 7
    .line 8
    iget-object v2, v1, Lfb1;->F:Lhk2;

    .line 9
    .line 10
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lac2;

    .line 15
    .line 16
    iget-object v2, v2, Lac2;->c:Lk61;

    .line 17
    .line 18
    iget-object v2, v2, Lk61;->b:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {p0}, La13;->m()Lil2;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lqk2;

    .line 25
    .line 26
    invoke-virtual {v3}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const/4 v4, 0x0

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iget-boolean v3, v3, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->W:Z

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v3, v4

    .line 37
    :goto_0
    invoke-virtual {p0}, La13;->o()Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    const/4 v6, 0x1

    .line 42
    const/16 v7, 0xa

    .line 43
    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_2

    .line 51
    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0}, La13;->m()Lil2;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lqk2;

    .line 59
    .line 60
    invoke-virtual {p1}, Lqk2;->d()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    xor-int/2addr p1, v6

    .line 65
    new-instance v3, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-static {v2, v7}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    if-eqz v8, :cond_1

    .line 83
    .line 84
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    check-cast v8, Lm61;

    .line 89
    .line 90
    new-instance v9, Lcom/usercentrics/sdk/UserDecision;

    .line 91
    .line 92
    iget-object v8, v8, Lm61;->f:Ljava/lang/String;

    .line 93
    .line 94
    invoke-direct {v9, v8, p1}, Lcom/usercentrics/sdk/UserDecision;-><init>(Ljava/lang/String;Z)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    move-object p1, v3

    .line 102
    :cond_2
    invoke-static {p1, v7}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    invoke-static {v3}, Lnc1;->c(I)I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    const/16 v5, 0x10

    .line 111
    .line 112
    if-ge v3, v5, :cond_3

    .line 113
    .line 114
    move v3, v5

    .line 115
    :cond_3
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 116
    .line 117
    invoke-direct {v5, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-eqz v3, :cond_4

    .line 129
    .line 130
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    check-cast v3, Lcom/usercentrics/sdk/UserDecision;

    .line 135
    .line 136
    iget-object v8, v3, Lcom/usercentrics/sdk/UserDecision;->a:Ljava/lang/String;

    .line 137
    .line 138
    iget-boolean v3, v3, Lcom/usercentrics/sdk/UserDecision;->b:Z

    .line 139
    .line 140
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-interface {v5, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    :cond_5
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_6

    .line 162
    .line 163
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    move-object v8, v3

    .line 168
    check-cast v8, Lm61;

    .line 169
    .line 170
    iget-object v8, v8, Lm61;->f:Ljava/lang/String;

    .line 171
    .line 172
    invoke-interface {v5, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    if-eqz v8, :cond_5

    .line 177
    .line 178
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_6
    new-instance v2, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-static {p1, v7}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    if-eqz v3, :cond_a

    .line 200
    .line 201
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    check-cast v3, Lm61;

    .line 206
    .line 207
    iget-boolean v7, v3, Lm61;->q:Z

    .line 208
    .line 209
    if-nez v7, :cond_9

    .line 210
    .line 211
    iget-object v7, v3, Lm61;->f:Ljava/lang/String;

    .line 212
    .line 213
    invoke-virtual {v5, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    check-cast v7, Ljava/lang/Boolean;

    .line 218
    .line 219
    if-eqz v7, :cond_7

    .line 220
    .line 221
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 222
    .line 223
    .line 224
    move-result v7

    .line 225
    goto :goto_5

    .line 226
    :cond_7
    iget-object v7, v3, Lm61;->p:Li61;

    .line 227
    .line 228
    iget-boolean v7, v7, Li61;->b:Z

    .line 229
    .line 230
    :goto_5
    if-eqz v7, :cond_8

    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_8
    move v7, v4

    .line 234
    goto :goto_7

    .line 235
    :cond_9
    :goto_6
    move v7, v6

    .line 236
    :goto_7
    new-instance v8, Li61;

    .line 237
    .line 238
    iget-object v9, v3, Lm61;->p:Li61;

    .line 239
    .line 240
    iget-object v9, v9, Li61;->a:Ljava/util/List;

    .line 241
    .line 242
    invoke-direct {v8, v9, v7}, Li61;-><init>(Ljava/util/List;Z)V

    .line 243
    .line 244
    .line 245
    invoke-static {v3, v8}, Lm61;->a(Lm61;Li61;)Lm61;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    if-nez p1, :cond_b

    .line 258
    .line 259
    invoke-virtual {v1}, Lfb1;->a()Ld40;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    iget-object v1, p0, La13;->c:Ljava/lang/String;

    .line 264
    .line 265
    sget-object v3, Lkz2;->w:Lkz2;

    .line 266
    .line 267
    invoke-virtual {p1, v1, v2, v3, v0}, Ld40;->b(Ljava/lang/String;Ljava/util/List;Lkz2;Lmz2;)V

    .line 268
    .line 269
    .line 270
    :cond_b
    invoke-virtual {p0}, La13;->l()Ljava/util/ArrayList;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    return-object p0
.end method

.method public final q(Z)Ljava/util/ArrayList;
    .locals 11

    .line 1
    sget-object v0, Lmz2;->a:Lmz2;

    .line 2
    .line 3
    iget-object v1, p0, La13;->a:Lfb1;

    .line 4
    .line 5
    iget-object v2, v1, Lfb1;->F:Lhk2;

    .line 6
    .line 7
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Lac2;

    .line 12
    .line 13
    iget-object v2, v2, Lac2;->c:Lk61;

    .line 14
    .line 15
    iget-object v2, v2, Lk61;->d:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    iget-boolean v2, v2, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->h:Z

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v2, v3

    .line 24
    :goto_0
    if-nez v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {v1}, Lfb1;->e()Li03;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "CCPA was not configured"

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-interface {v0, v1, v2}, Li03;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, La13;->g()Ljava/util/ArrayList;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_1
    invoke-virtual {p0}, La13;->d()Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_2
    iget-object v2, v1, Lfb1;->I:Lhk2;

    .line 49
    .line 50
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Lyr;

    .line 55
    .line 56
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 57
    .line 58
    iget-object v5, v2, Lyr;->a:Lg80;

    .line 59
    .line 60
    new-instance v6, Lh50;

    .line 61
    .line 62
    invoke-direct {v6}, Lh50;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v6}, Lh50;->c()J

    .line 66
    .line 67
    .line 68
    move-result-wide v6

    .line 69
    check-cast v5, Lpz2;

    .line 70
    .line 71
    iget-object v5, v5, Lpz2;->e:Lod2;

    .line 72
    .line 73
    sget-object v8, Lfh2;->a:[Lfh2;

    .line 74
    .line 75
    const-string v8, "ccpa_timestamp_millis"

    .line 76
    .line 77
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v5, v8, v6}, Lod2;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    new-instance v5, Lcom/usercentrics/ccpa/CCPAData;

    .line 85
    .line 86
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    iget-object v7, v2, Lyr;->c:Ljava/lang/Boolean;

    .line 91
    .line 92
    const/4 v8, 0x1

    .line 93
    invoke-direct {v5, v8, v4, v6, v7}, Lcom/usercentrics/ccpa/CCPAData;-><init>(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 94
    .line 95
    .line 96
    iget-object v2, v2, Lyr;->d:Lcom/usercentrics/ccpa/a;

    .line 97
    .line 98
    invoke-virtual {v2, v5}, Lcom/usercentrics/ccpa/a;->a(Lcom/usercentrics/ccpa/CCPAData;)V

    .line 99
    .line 100
    .line 101
    if-eqz p1, :cond_3

    .line 102
    .line 103
    sget-object v2, Lkz2;->c:Lkz2;

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    sget-object v2, Lkz2;->b:Lkz2;

    .line 107
    .line 108
    :goto_1
    iget-object v4, v1, Lfb1;->F:Lhk2;

    .line 109
    .line 110
    invoke-virtual {v4}, Lhk2;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    check-cast v4, Lac2;

    .line 115
    .line 116
    iget-object v4, v4, Lac2;->c:Lk61;

    .line 117
    .line 118
    iget-object v4, v4, Lk61;->b:Ljava/util/List;

    .line 119
    .line 120
    new-instance v5, Ljava/util/ArrayList;

    .line 121
    .line 122
    const/16 v6, 0xa

    .line 123
    .line 124
    invoke-static {v4, v6}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 129
    .line 130
    .line 131
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    if-eqz v6, :cond_6

    .line 140
    .line 141
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    check-cast v6, Lm61;

    .line 146
    .line 147
    iget-boolean v7, v6, Lm61;->q:Z

    .line 148
    .line 149
    if-eqz v7, :cond_4

    .line 150
    .line 151
    :goto_3
    move v7, v8

    .line 152
    goto :goto_4

    .line 153
    :cond_4
    if-nez p1, :cond_5

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_5
    move v7, v3

    .line 157
    :goto_4
    iget-object v9, v6, Lm61;->p:Li61;

    .line 158
    .line 159
    iget-object v9, v9, Li61;->a:Ljava/util/List;

    .line 160
    .line 161
    new-instance v10, Li61;

    .line 162
    .line 163
    invoke-direct {v10, v9, v7}, Li61;-><init>(Ljava/util/List;Z)V

    .line 164
    .line 165
    .line 166
    invoke-static {v6, v10}, Lm61;->a(Lm61;Li61;)Lm61;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_6
    invoke-virtual {v1}, Lfb1;->a()Ld40;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    iget-object v1, p0, La13;->c:Ljava/lang/String;

    .line 179
    .line 180
    invoke-virtual {p1, v1, v5, v2, v0}, Ld40;->b(Ljava/lang/String;Ljava/util/List;Lkz2;Lmz2;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0}, La13;->l()Ljava/util/ArrayList;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    return-object p0
.end method
