.class public final Lsx0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final Companion:Lqx0;

.field public static final m:Lbm;


# instance fields
.field public final a:Ld40;

.field public final b:Lg80;

.field public final c:Lac2;

.field public final d:Lp91;

.field public final e:Lil2;

.field public final f:Lec;

.field public final g:Lkp0;

.field public final h:Lkp0;

.field public final i:Ljc2;

.field public final j:Ly3;

.field public final k:Li03;

.field public l:Lg13;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lqx0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsx0;->Companion:Lqx0;

    .line 7
    .line 8
    sget-object v0, Lbm;->a:Lbm;

    .line 9
    .line 10
    sput-object v0, Lsx0;->m:Lbm;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Ld40;Lg80;Lac2;Lp91;Lil2;Lec;Lkp0;Lkp0;Ljc2;Ly3;Li03;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lsx0;->a:Ld40;

    .line 29
    .line 30
    iput-object p2, p0, Lsx0;->b:Lg80;

    .line 31
    .line 32
    iput-object p3, p0, Lsx0;->c:Lac2;

    .line 33
    .line 34
    iput-object p4, p0, Lsx0;->d:Lp91;

    .line 35
    .line 36
    iput-object p5, p0, Lsx0;->e:Lil2;

    .line 37
    .line 38
    iput-object p6, p0, Lsx0;->f:Lec;

    .line 39
    .line 40
    iput-object p7, p0, Lsx0;->g:Lkp0;

    .line 41
    .line 42
    iput-object p8, p0, Lsx0;->h:Lkp0;

    .line 43
    .line 44
    iput-object p9, p0, Lsx0;->i:Ljc2;

    .line 45
    .line 46
    iput-object p10, p0, Lsx0;->j:Ly3;

    .line 47
    .line 48
    iput-object p11, p0, Lsx0;->k:Li03;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/util/List;)V
    .locals 5

    .line 1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lm61;

    .line 17
    .line 18
    iget-object v3, v1, Lm61;->p:Li61;

    .line 19
    .line 20
    iget-object v3, v3, Li61;->a:Ljava/util/List;

    .line 21
    .line 22
    new-instance v4, Li61;

    .line 23
    .line 24
    invoke-direct {v4, v3, v2}, Li61;-><init>(Ljava/util/List;Z)V

    .line 25
    .line 26
    .line 27
    iput-object v4, v1, Lm61;->p:Li61;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object v0, Lkz2;->f:Lkz2;

    .line 31
    .line 32
    sget-object v1, Lmz2;->b:Lmz2;

    .line 33
    .line 34
    iget-object v3, p0, Lsx0;->a:Ld40;

    .line 35
    .line 36
    invoke-virtual {v3, p1, p2, v0, v1}, Ld40;->b(Ljava/lang/String;Ljava/util/List;Lkz2;Lmz2;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lsx0;->c:Lac2;

    .line 40
    .line 41
    iget-object p2, p1, Lac2;->c:Lk61;

    .line 42
    .line 43
    iget-boolean p2, p2, Lk61;->g:Z

    .line 44
    .line 45
    const-string v0, ""

    .line 46
    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    iget-object p2, p0, Lsx0;->e:Lil2;

    .line 50
    .line 51
    check-cast p2, Lqk2;

    .line 52
    .line 53
    invoke-virtual {p2, v0}, Lqk2;->x(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lac2;->b()Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-eqz p2, :cond_1

    .line 61
    .line 62
    iget-object p2, p0, Lsx0;->j:Ly3;

    .line 63
    .line 64
    invoke-virtual {p2}, Ly3;->a()V

    .line 65
    .line 66
    .line 67
    :cond_1
    iget-object p1, p1, Lac2;->c:Lk61;

    .line 68
    .line 69
    iget-object p1, p1, Lk61;->l:Ljava/lang/String;

    .line 70
    .line 71
    iget-object p2, p0, Lsx0;->l:Lg13;

    .line 72
    .line 73
    if-nez p2, :cond_2

    .line 74
    .line 75
    const/4 p2, -0x1

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    sget-object v1, Lrx0;->a:[I

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    aget p2, v1, p2

    .line 84
    .line 85
    :goto_1
    if-eq p2, v2, :cond_5

    .line 86
    .line 87
    const/4 p1, 0x2

    .line 88
    if-eq p2, p1, :cond_4

    .line 89
    .line 90
    const/4 p1, 0x3

    .line 91
    if-eq p2, p1, :cond_3

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    const-string v0, "GDPR | Accept all implicitly cause: It is the first initialization, the \'Display CMP only to EU users\' option is enabled and the user is not in EU"

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    const-string v0, "TCF | Accept all non-IAB services implicitly cause: The \'Apply GDPR only to EU users\' option is enabled and it is the first initialization"

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    const-string p2, "##us_framework## | Accept all implicitly cause: It is the first initialization"

    .line 101
    .line 102
    invoke-static {p2, p1}, Lqj3;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    :goto_2
    iget-object p0, p0, Lsx0;->k:Li03;

    .line 107
    .line 108
    const/4 p1, 0x0

    .line 109
    invoke-interface {p0, v0, p1}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final b(Ljava/lang/String;Z)Lkotlin/Unit;
    .locals 6

    .line 1
    iget-object v0, p0, Lsx0;->c:Lac2;

    .line 2
    .line 3
    iget-object v0, v0, Lac2;->c:Lk61;

    .line 4
    .line 5
    iget-object v1, p0, Lsx0;->d:Lp91;

    .line 6
    .line 7
    iget-object v1, v1, Lp91;->b:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 8
    .line 9
    iget-object v2, v0, Lk61;->d:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x1

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    iget-boolean v5, v2, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->h:Z

    .line 16
    .line 17
    if-ne v5, v4, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v5, v0, Lk61;->l:Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v5, :cond_1

    .line 23
    .line 24
    :goto_0
    move v5, v4

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v5, v3

    .line 27
    :goto_1
    iget-boolean v0, v0, Lk61;->g:Z

    .line 28
    .line 29
    if-eqz v5, :cond_a

    .line 30
    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->i:Lbm;

    .line 34
    .line 35
    if-nez v0, :cond_3

    .line 36
    .line 37
    :cond_2
    sget-object v0, Lsx0;->m:Lbm;

    .line 38
    .line 39
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const-string v2, "US"

    .line 44
    .line 45
    if-eqz v0, :cond_7

    .line 46
    .line 47
    if-eq v0, v4, :cond_5

    .line 48
    .line 49
    const/4 v1, 0x2

    .line 50
    if-ne v0, v1, :cond_4

    .line 51
    .line 52
    sget-object v0, Lg13;->b:Lg13;

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_4
    invoke-static {}, Lds0;->b()V

    .line 56
    .line 57
    .line 58
    const/4 p0, 0x0

    .line 59
    return-object p0

    .line 60
    :cond_5
    iget-object v0, v1, Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;->a:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_6

    .line 67
    .line 68
    sget-object v0, Lg13;->b:Lg13;

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_6
    sget-object v0, Lg13;->a:Lg13;

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_7
    iget-object v0, v1, Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;->b:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v1, v1, Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;->a:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_9

    .line 83
    .line 84
    const-string v1, "CA"

    .line 85
    .line 86
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-nez v2, :cond_8

    .line 91
    .line 92
    invoke-static {v0, v1, v3}, Lkotlin/text/e;->g(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_9

    .line 97
    .line 98
    :cond_8
    sget-object v0, Lg13;->b:Lg13;

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_9
    sget-object v0, Lg13;->a:Lg13;

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_a
    if-eqz v0, :cond_b

    .line 105
    .line 106
    sget-object v0, Lg13;->c:Lg13;

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_b
    sget-object v0, Lg13;->a:Lg13;

    .line 110
    .line 111
    :goto_2
    iput-object v0, p0, Lsx0;->l:Lg13;

    .line 112
    .line 113
    invoke-virtual {p0, p1, p2}, Lsx0;->c(Ljava/lang/String;Z)V

    .line 114
    .line 115
    .line 116
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object p0
.end method

.method public final c(Ljava/lang/String;Z)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lsx0;->c:Lac2;

    .line 9
    .line 10
    iget-object v3, v2, Lac2;->c:Lk61;

    .line 11
    .line 12
    iget-object v4, v0, Lsx0;->d:Lp91;

    .line 13
    .line 14
    iget-object v4, v4, Lp91;->b:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 15
    .line 16
    iget-object v5, v0, Lsx0;->l:Lg13;

    .line 17
    .line 18
    iget-object v6, v0, Lsx0;->a:Ld40;

    .line 19
    .line 20
    const/4 v7, 0x1

    .line 21
    const/4 v8, 0x0

    .line 22
    if-eqz p2, :cond_6

    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4}, Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;->b()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-virtual {v0, v5, v3, v4}, Lsx0;->e(Lg13;Lk61;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    iget-object v5, v2, Lac2;->c:Lk61;

    .line 36
    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    iget-object v2, v5, Lk61;->b:Ljava/util/List;

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Lsx0;->a(Ljava/lang/String;Ljava/util/List;)V

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_0
    iget-object v4, v5, Lk61;->b:Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    if-eqz v9, :cond_4

    .line 56
    .line 57
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    check-cast v9, Lm61;

    .line 62
    .line 63
    iget-boolean v10, v9, Lm61;->q:Z

    .line 64
    .line 65
    if-nez v10, :cond_2

    .line 66
    .line 67
    iget-object v10, v9, Lm61;->z:Ljava/lang/Boolean;

    .line 68
    .line 69
    const/4 v11, 0x0

    .line 70
    if-eqz v10, :cond_1

    .line 71
    .line 72
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    goto :goto_1

    .line 77
    :cond_1
    move v10, v11

    .line 78
    :goto_1
    if-eqz v10, :cond_3

    .line 79
    .line 80
    :cond_2
    move v11, v7

    .line 81
    :cond_3
    iget-object v10, v9, Lm61;->p:Li61;

    .line 82
    .line 83
    iget-object v10, v10, Li61;->a:Ljava/util/List;

    .line 84
    .line 85
    new-instance v12, Li61;

    .line 86
    .line 87
    invoke-direct {v12, v10, v11}, Li61;-><init>(Ljava/util/List;Z)V

    .line 88
    .line 89
    .line 90
    iput-object v12, v9, Lm61;->p:Li61;

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    sget-object v5, Lkz2;->e:Lkz2;

    .line 94
    .line 95
    sget-object v9, Lmz2;->b:Lmz2;

    .line 96
    .line 97
    invoke-virtual {v6, v1, v4, v5, v9}, Ld40;->b(Ljava/lang/String;Ljava/util/List;Lkz2;Lmz2;)V

    .line 98
    .line 99
    .line 100
    iget-object v1, v2, Lac2;->c:Lk61;

    .line 101
    .line 102
    iget-boolean v1, v1, Lk61;->g:Z

    .line 103
    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    const-string v1, ""

    .line 107
    .line 108
    iget-object v4, v0, Lsx0;->e:Lil2;

    .line 109
    .line 110
    check-cast v4, Lqk2;

    .line 111
    .line 112
    invoke-virtual {v4, v1}, Lqk2;->x(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, Lac2;->b()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_5

    .line 120
    .line 121
    iget-object v1, v0, Lsx0;->j:Ly3;

    .line 122
    .line 123
    invoke-virtual {v1}, Ly3;->b()Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_5

    .line 128
    .line 129
    sget-object v2, Lnd0;->a:Lnd0;

    .line 130
    .line 131
    invoke-virtual {v1, v2}, Ly3;->f(Ljava/util/List;)V

    .line 132
    .line 133
    .line 134
    :cond_5
    :goto_2
    iget-object v1, v3, Lk61;->d:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    .line 135
    .line 136
    if-eqz v1, :cond_e

    .line 137
    .line 138
    iget-boolean v1, v1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->h:Z

    .line 139
    .line 140
    if-ne v1, v7, :cond_e

    .line 141
    .line 142
    iget-object v1, v0, Lsx0;->l:Lg13;

    .line 143
    .line 144
    sget-object v2, Lg13;->b:Lg13;

    .line 145
    .line 146
    if-eq v1, v2, :cond_e

    .line 147
    .line 148
    iget-object v0, v0, Lsx0;->f:Lec;

    .line 149
    .line 150
    iget-object v0, v0, Lec;->d:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v0, Lyr;

    .line 153
    .line 154
    iget-object v1, v0, Lyr;->a:Lg80;

    .line 155
    .line 156
    check-cast v1, Lpz2;

    .line 157
    .line 158
    iget-object v1, v1, Lpz2;->e:Lod2;

    .line 159
    .line 160
    sget-object v2, Lfh2;->a:[Lfh2;

    .line 161
    .line 162
    const-string v2, "ccpa_timestamp_millis"

    .line 163
    .line 164
    const-wide/16 v3, 0x0

    .line 165
    .line 166
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-virtual {v1, v2, v3}, Lod2;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    new-instance v1, Lcom/usercentrics/ccpa/CCPAData;

    .line 174
    .line 175
    invoke-direct {v1, v7, v8, v8, v8}, Lcom/usercentrics/ccpa/CCPAData;-><init>(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 176
    .line 177
    .line 178
    iget-object v0, v0, Lyr;->d:Lcom/usercentrics/ccpa/a;

    .line 179
    .line 180
    invoke-virtual {v0, v1}, Lcom/usercentrics/ccpa/a;->a(Lcom/usercentrics/ccpa/CCPAData;)V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :cond_6
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4}, Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;->b()Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    invoke-virtual {v0, v5, v3, v2}, Lsx0;->e(Lg13;Lk61;Z)Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    iget-object v3, v6, Ld40;->b:Lac2;

    .line 196
    .line 197
    iget-object v4, v6, Ld40;->c:Lpc2;

    .line 198
    .line 199
    iget-object v4, v4, Lpc2;->d:Lkn1;

    .line 200
    .line 201
    if-eqz v4, :cond_7

    .line 202
    .line 203
    iget-object v4, v4, Lkn1;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 204
    .line 205
    move-object v10, v4

    .line 206
    goto :goto_3

    .line 207
    :cond_7
    move-object v10, v8

    .line 208
    :goto_3
    if-nez v10, :cond_8

    .line 209
    .line 210
    move-object v4, v8

    .line 211
    goto/16 :goto_5

    .line 212
    .line 213
    :cond_8
    invoke-virtual {v6}, Ld40;->c()Ljh1;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    iget-object v5, v4, Ljh1;->a:Ljava/util/ArrayList;

    .line 218
    .line 219
    iget-object v15, v4, Ljh1;->b:Lk61;

    .line 220
    .line 221
    iget-object v12, v4, Ljh1;->c:Ljava/util/ArrayList;

    .line 222
    .line 223
    iget-object v9, v4, Ljh1;->d:Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 226
    .line 227
    .line 228
    move-result v16

    .line 229
    if-nez v16, :cond_9

    .line 230
    .line 231
    move-object v11, v9

    .line 232
    sget-object v9, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;->Companion:Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject$Companion;

    .line 233
    .line 234
    move-object v13, v11

    .line 235
    iget-object v11, v15, Lk61;->e:Ljava/lang/String;

    .line 236
    .line 237
    move-object v14, v13

    .line 238
    sget-object v13, Lkz2;->d:Lkz2;

    .line 239
    .line 240
    move-object/from16 v17, v14

    .line 241
    .line 242
    sget-object v14, Lmz2;->b:Lmz2;

    .line 243
    .line 244
    invoke-static/range {v9 .. v14}, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject$Companion;->a(Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject$Companion;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Ljava/lang/String;Ljava/util/List;Lkz2;Lmz2;)Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;

    .line 245
    .line 246
    .line 247
    move-result-object v9

    .line 248
    invoke-virtual {v6, v1, v5, v9}, Ld40;->a(Ljava/lang/String;Ljava/util/List;Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;)Ljava/util/ArrayList;

    .line 249
    .line 250
    .line 251
    move-result-object v9

    .line 252
    goto :goto_4

    .line 253
    :cond_9
    move-object/from16 v17, v9

    .line 254
    .line 255
    move-object v9, v5

    .line 256
    :goto_4
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->isEmpty()Z

    .line 257
    .line 258
    .line 259
    move-result v11

    .line 260
    if-nez v11, :cond_a

    .line 261
    .line 262
    if-nez v2, :cond_a

    .line 263
    .line 264
    sget-object v9, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;->Companion:Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject$Companion;

    .line 265
    .line 266
    iget-object v11, v15, Lk61;->e:Ljava/lang/String;

    .line 267
    .line 268
    sget-object v13, Lkz2;->e:Lkz2;

    .line 269
    .line 270
    sget-object v14, Lmz2;->b:Lmz2;

    .line 271
    .line 272
    move-object/from16 v12, v17

    .line 273
    .line 274
    invoke-static/range {v9 .. v14}, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject$Companion;->a(Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject$Companion;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Ljava/lang/String;Ljava/util/List;Lkz2;Lmz2;)Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    invoke-virtual {v6, v1, v5, v9}, Ld40;->a(Ljava/lang/String;Ljava/util/List;Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;)Ljava/util/ArrayList;

    .line 279
    .line 280
    .line 281
    move-result-object v9

    .line 282
    :cond_a
    iget-object v5, v3, Lac2;->c:Lk61;

    .line 283
    .line 284
    iget-object v5, v5, Lk61;->b:Ljava/util/List;

    .line 285
    .line 286
    invoke-static {v5, v9}, Lqj3;->O(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    const/16 v10, 0x3ffd

    .line 291
    .line 292
    invoke-static {v15, v5, v8, v10}, Lk61;->a(Lk61;Ljava/util/List;Ljava/lang/String;I)Lk61;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    iput-object v5, v3, Lac2;->c:Lk61;

    .line 297
    .line 298
    iget-object v3, v6, Ld40;->d:Lg80;

    .line 299
    .line 300
    check-cast v3, Lpz2;

    .line 301
    .line 302
    invoke-virtual {v3, v5, v9}, Lpz2;->g(Lk61;Ljava/util/List;)V

    .line 303
    .line 304
    .line 305
    if-nez v16, :cond_b

    .line 306
    .line 307
    iget-object v3, v6, Ld40;->a:Ljz;

    .line 308
    .line 309
    sget-object v5, Lkz2;->d:Lkz2;

    .line 310
    .line 311
    check-cast v3, Lmz;

    .line 312
    .line 313
    iget-object v6, v3, Lmz;->a:Lx80;

    .line 314
    .line 315
    new-instance v9, Lqh;

    .line 316
    .line 317
    invoke-direct {v9, v3, v5, v8, v7}, Lqh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v6, v9}, Lx80;->b(Lkotlin/jvm/functions/Function2;)Lec;

    .line 321
    .line 322
    .line 323
    :cond_b
    :goto_5
    if-eqz v4, :cond_c

    .line 324
    .line 325
    iget-object v8, v4, Ljh1;->d:Ljava/util/ArrayList;

    .line 326
    .line 327
    :cond_c
    if-eqz v8, :cond_e

    .line 328
    .line 329
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    if-eqz v3, :cond_d

    .line 334
    .line 335
    goto :goto_6

    .line 336
    :cond_d
    if-eqz v2, :cond_e

    .line 337
    .line 338
    invoke-virtual {v0, v1, v8}, Lsx0;->a(Ljava/lang/String;Ljava/util/List;)V

    .line 339
    .line 340
    .line 341
    :cond_e
    :goto_6
    return-void
.end method

.method public final d()Ltx0;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lsx0;->h:Lkp0;

    .line 4
    .line 5
    iget-object v2, v1, Lkp0;->b:Lg80;

    .line 6
    .line 7
    iget-object v3, v0, Lsx0;->i:Ljc2;

    .line 8
    .line 9
    iget-boolean v3, v3, Ljc2;->f:Z

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    sget-object v0, Ltx0;->b:Ltx0;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    iget-object v3, v0, Lsx0;->l:Lg13;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    if-eqz v3, :cond_3b

    .line 20
    .line 21
    new-instance v5, Lf8;

    .line 22
    .line 23
    const/4 v6, 0x2

    .line 24
    invoke-direct {v5, v0, v6}, Lf8;-><init>(Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    invoke-static {v5}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    iget-object v7, v0, Lsx0;->c:Lac2;

    .line 32
    .line 33
    iget-object v7, v7, Lac2;->c:Lk61;

    .line 34
    .line 35
    iget-object v8, v7, Lk61;->m:Ljava/lang/Long;

    .line 36
    .line 37
    if-eqz v8, :cond_1

    .line 38
    .line 39
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 40
    .line 41
    .line 42
    move-result-wide v8

    .line 43
    const-wide/16 v10, 0x3e8

    .line 44
    .line 45
    mul-long/2addr v8, v10

    .line 46
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object v8, v4

    .line 52
    :goto_0
    iget-object v9, v0, Lsx0;->b:Lg80;

    .line 53
    .line 54
    check-cast v9, Lpz2;

    .line 55
    .line 56
    invoke-virtual {v9}, Lpz2;->d()Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    iget-object v11, v9, Lpz2;->e:Lod2;

    .line 61
    .line 62
    sget-object v12, Lfh2;->a:[Lfh2;

    .line 63
    .line 64
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v11, v11, Lod2;->a:Landroid/content/SharedPreferences;

    .line 68
    .line 69
    const-string v12, "user_action_required"

    .line 70
    .line 71
    invoke-interface {v11, v12, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v11

    .line 75
    const/4 v12, 0x1

    .line 76
    const/4 v13, 0x0

    .line 77
    if-eqz v11, :cond_2

    .line 78
    .line 79
    invoke-static {v11}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v11

    .line 83
    if-ne v11, v12, :cond_2

    .line 84
    .line 85
    move v11, v12

    .line 86
    goto :goto_1

    .line 87
    :cond_2
    move v11, v13

    .line 88
    :goto_1
    if-nez v10, :cond_4

    .line 89
    .line 90
    :cond_3
    move v10, v13

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    if-eqz v11, :cond_3

    .line 93
    .line 94
    move v10, v12

    .line 95
    :goto_2
    if-nez v8, :cond_6

    .line 96
    .line 97
    :cond_5
    move v8, v13

    .line 98
    goto :goto_6

    .line 99
    :cond_6
    invoke-virtual {v9}, Lpz2;->d()Ljava/lang/Long;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    if-eqz v9, :cond_7

    .line 104
    .line 105
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 106
    .line 107
    .line 108
    move-result-wide v14

    .line 109
    goto :goto_3

    .line 110
    :cond_7
    const-wide/16 v14, 0x0

    .line 111
    .line 112
    :goto_3
    new-instance v9, Lh50;

    .line 113
    .line 114
    invoke-direct {v9}, Lh50;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v9}, Lh50;->c()J

    .line 118
    .line 119
    .line 120
    move-result-wide v16

    .line 121
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 122
    .line 123
    .line 124
    move-result-wide v18

    .line 125
    cmp-long v9, v16, v18

    .line 126
    .line 127
    if-lez v9, :cond_8

    .line 128
    .line 129
    move v9, v12

    .line 130
    goto :goto_4

    .line 131
    :cond_8
    move v9, v13

    .line 132
    :goto_4
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 133
    .line 134
    .line 135
    move-result-wide v16

    .line 136
    cmp-long v8, v14, v16

    .line 137
    .line 138
    if-gez v8, :cond_9

    .line 139
    .line 140
    move v8, v12

    .line 141
    goto :goto_5

    .line 142
    :cond_9
    move v8, v13

    .line 143
    :goto_5
    if-eqz v9, :cond_5

    .line 144
    .line 145
    if-eqz v8, :cond_5

    .line 146
    .line 147
    move v8, v12

    .line 148
    :goto_6
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    const-string v9, "SHOW_CMP cause: Settings version has changed"

    .line 153
    .line 154
    const-string v11, "SHOW_CMP cause: The \'Manual Resurface option\' on Admin Interface was triggered"

    .line 155
    .line 156
    if-eqz v3, :cond_2f

    .line 157
    .line 158
    if-eq v3, v12, :cond_24

    .line 159
    .line 160
    if-ne v3, v6, :cond_23

    .line 161
    .line 162
    iget-object v1, v0, Lsx0;->e:Lil2;

    .line 163
    .line 164
    move-object v3, v1

    .line 165
    check-cast v3, Lqk2;

    .line 166
    .line 167
    invoke-virtual {v3}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    iget-boolean v5, v5, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Y:Z

    .line 175
    .line 176
    if-eqz v5, :cond_d

    .line 177
    .line 178
    invoke-virtual {v3}, Lqk2;->f()Ljava/util/ArrayList;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    if-eqz v6, :cond_a

    .line 187
    .line 188
    goto :goto_9

    .line 189
    :cond_a
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    if-eqz v6, :cond_d

    .line 198
    .line 199
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    check-cast v6, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 204
    .line 205
    iget-object v7, v3, Lqk2;->o:Ljava/util/LinkedHashMap;

    .line 206
    .line 207
    iget v14, v6, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->d:I

    .line 208
    .line 209
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v14

    .line 213
    invoke-virtual {v7, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    check-cast v7, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageVendor;

    .line 218
    .line 219
    if-nez v7, :cond_b

    .line 220
    .line 221
    goto :goto_8

    .line 222
    :cond_b
    invoke-static {v6}, Lmn0;->F(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;)Lcom/usercentrics/sdk/services/deviceStorage/models/StorageVendor;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    iget-object v14, v7, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageVendor;->a:Ljava/util/List;

    .line 227
    .line 228
    iget-object v15, v6, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageVendor;->a:Ljava/util/List;

    .line 229
    .line 230
    invoke-interface {v14, v15}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 231
    .line 232
    .line 233
    move-result v14

    .line 234
    if-eqz v14, :cond_c

    .line 235
    .line 236
    iget-object v14, v7, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageVendor;->b:Ljava/util/List;

    .line 237
    .line 238
    iget-object v15, v6, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageVendor;->b:Ljava/util/List;

    .line 239
    .line 240
    invoke-interface {v14, v15}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 241
    .line 242
    .line 243
    move-result v14

    .line 244
    if-eqz v14, :cond_c

    .line 245
    .line 246
    iget-object v7, v7, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageVendor;->c:Ljava/util/List;

    .line 247
    .line 248
    iget-object v6, v6, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageVendor;->c:Ljava/util/List;

    .line 249
    .line 250
    invoke-interface {v7, v6}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    if-eqz v6, :cond_c

    .line 255
    .line 256
    goto :goto_7

    .line 257
    :cond_c
    :goto_8
    move v5, v12

    .line 258
    goto :goto_a

    .line 259
    :cond_d
    :goto_9
    move v5, v13

    .line 260
    :goto_a
    invoke-virtual {v3}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    iget-boolean v6, v6, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Z:Z

    .line 268
    .line 269
    if-eqz v6, :cond_11

    .line 270
    .line 271
    invoke-virtual {v3}, Lqk2;->f()Ljava/util/ArrayList;

    .line 272
    .line 273
    .line 274
    move-result-object v6

    .line 275
    new-instance v7, Ljava/util/ArrayList;

    .line 276
    .line 277
    const/16 v14, 0xa

    .line 278
    .line 279
    invoke-static {v6, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 280
    .line 281
    .line 282
    move-result v14

    .line 283
    invoke-direct {v7, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 287
    .line 288
    .line 289
    move-result-object v6

    .line 290
    :goto_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 291
    .line 292
    .line 293
    move-result v14

    .line 294
    if-eqz v14, :cond_e

    .line 295
    .line 296
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v14

    .line 300
    check-cast v14, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 301
    .line 302
    iget v14, v14, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->d:I

    .line 303
    .line 304
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 305
    .line 306
    .line 307
    move-result-object v14

    .line 308
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    goto :goto_b

    .line 312
    :cond_e
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 313
    .line 314
    .line 315
    move-result v6

    .line 316
    if-eqz v6, :cond_f

    .line 317
    .line 318
    goto :goto_c

    .line 319
    :cond_f
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 320
    .line 321
    .line 322
    move-result-object v6

    .line 323
    :cond_10
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 324
    .line 325
    .line 326
    move-result v7

    .line 327
    if-eqz v7, :cond_11

    .line 328
    .line 329
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v7

    .line 333
    check-cast v7, Ljava/lang/Number;

    .line 334
    .line 335
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 336
    .line 337
    .line 338
    move-result v7

    .line 339
    iget-object v14, v3, Lqk2;->o:Ljava/util/LinkedHashMap;

    .line 340
    .line 341
    invoke-virtual {v14}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 342
    .line 343
    .line 344
    move-result-object v14

    .line 345
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 346
    .line 347
    .line 348
    move-result-object v7

    .line 349
    invoke-interface {v14, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v7

    .line 353
    if-nez v7, :cond_10

    .line 354
    .line 355
    move v6, v12

    .line 356
    goto :goto_d

    .line 357
    :cond_11
    :goto_c
    move v6, v13

    .line 358
    :goto_d
    check-cast v2, Lpz2;

    .line 359
    .line 360
    invoke-virtual {v2}, Lpz2;->d()Ljava/lang/Long;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    if-nez v2, :cond_12

    .line 365
    .line 366
    move v2, v12

    .line 367
    goto :goto_e

    .line 368
    :cond_12
    move v2, v13

    .line 369
    :goto_e
    invoke-virtual {v3}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 370
    .line 371
    .line 372
    move-result-object v7

    .line 373
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    iget-boolean v7, v7, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->X:Z

    .line 377
    .line 378
    if-eqz v7, :cond_13

    .line 379
    .line 380
    iget-object v7, v3, Lqk2;->c:Lg80;

    .line 381
    .line 382
    check-cast v7, Lpz2;

    .line 383
    .line 384
    invoke-virtual {v7}, Lpz2;->d()Ljava/lang/Long;

    .line 385
    .line 386
    .line 387
    :cond_13
    invoke-virtual {v3}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    iget-boolean v3, v3, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->X:Z

    .line 395
    .line 396
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    check-cast v1, Lqk2;

    .line 400
    .line 401
    iget-object v7, v1, Lqk2;->m:Lql2;

    .line 402
    .line 403
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v1}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 407
    .line 408
    .line 409
    move-result-object v7

    .line 410
    if-eqz v7, :cond_14

    .line 411
    .line 412
    iget-boolean v7, v7, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->i0:Z

    .line 413
    .line 414
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 415
    .line 416
    .line 417
    move-result-object v7

    .line 418
    goto :goto_f

    .line 419
    :cond_14
    move-object v7, v4

    .line 420
    :goto_f
    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 421
    .line 422
    invoke-static {v7, v14}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v7

    .line 426
    if-eqz v7, :cond_15

    .line 427
    .line 428
    goto :goto_11

    .line 429
    :cond_15
    iget-object v7, v1, Lqk2;->f:Ly3;

    .line 430
    .line 431
    invoke-virtual {v1}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    if-eqz v1, :cond_16

    .line 436
    .line 437
    iget-object v1, v1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->h0:Ljava/util/List;

    .line 438
    .line 439
    if-eqz v1, :cond_16

    .line 440
    .line 441
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->D(Ljava/util/List;)Ljava/util/List;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    if-nez v1, :cond_17

    .line 446
    .line 447
    :cond_16
    sget-object v1, Lnd0;->a:Lnd0;

    .line 448
    .line 449
    :cond_17
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    iget-object v7, v7, Ly3;->e:Ljava/lang/String;

    .line 456
    .line 457
    if-nez v7, :cond_18

    .line 458
    .line 459
    const-string v7, ""

    .line 460
    .line 461
    :cond_18
    const-string v14, "."

    .line 462
    .line 463
    const-string v15, "~"

    .line 464
    .line 465
    move/from16 v16, v12

    .line 466
    .line 467
    const-string v12, "2~"

    .line 468
    .line 469
    const-string v4, "dv."

    .line 470
    .line 471
    filled-new-array {v12, v4, v14, v15}, [Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v4

    .line 475
    const/4 v12, 0x6

    .line 476
    invoke-static {v7, v4, v13, v12}, Lkotlin/text/StringsKt;->L(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 477
    .line 478
    .line 479
    move-result-object v4

    .line 480
    new-instance v7, Ljava/util/ArrayList;

    .line 481
    .line 482
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 483
    .line 484
    .line 485
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 486
    .line 487
    .line 488
    move-result-object v4

    .line 489
    :cond_19
    :goto_10
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 490
    .line 491
    .line 492
    move-result v12

    .line 493
    if-eqz v12, :cond_1a

    .line 494
    .line 495
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v12

    .line 499
    check-cast v12, Ljava/lang/String;

    .line 500
    .line 501
    invoke-static {v12}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 502
    .line 503
    .line 504
    move-result-object v12

    .line 505
    if-eqz v12, :cond_19

    .line 506
    .line 507
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    goto :goto_10

    .line 511
    :cond_1a
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->D(Ljava/util/List;)Ljava/util/List;

    .line 512
    .line 513
    .line 514
    move-result-object v4

    .line 515
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    move-result v1

    .line 519
    xor-int/lit8 v13, v1, 0x1

    .line 520
    .line 521
    :goto_11
    iget-object v0, v0, Lsx0;->g:Lkp0;

    .line 522
    .line 523
    iget-object v1, v0, Lkp0;->a:Li03;

    .line 524
    .line 525
    if-eqz v8, :cond_1b

    .line 526
    .line 527
    const/4 v4, 0x0

    .line 528
    invoke-interface {v1, v11, v4}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 529
    .line 530
    .line 531
    sget-object v0, Ltx0;->a:Ltx0;

    .line 532
    .line 533
    return-object v0

    .line 534
    :cond_1b
    const/4 v4, 0x0

    .line 535
    if-eqz v10, :cond_1c

    .line 536
    .line 537
    invoke-interface {v1, v9, v4}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 538
    .line 539
    .line 540
    sget-object v0, Ltx0;->a:Ltx0;

    .line 541
    .line 542
    return-object v0

    .line 543
    :cond_1c
    if-eqz v2, :cond_1d

    .line 544
    .line 545
    const-string v0, "SHOW_CMP cause: [TCF] This user has not yet provided consent (not even on GDPR services)"

    .line 546
    .line 547
    invoke-interface {v1, v0, v4}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 548
    .line 549
    .line 550
    sget-object v0, Ltx0;->a:Ltx0;

    .line 551
    .line 552
    return-object v0

    .line 553
    :cond_1d
    if-eqz v5, :cond_1e

    .line 554
    .line 555
    const-string v0, "SHOW_CMP cause: [TCF] The \'Resurface UI\' option is enabled and selected vendors include undisclosed or changes in their declared Legal Basis"

    .line 556
    .line 557
    invoke-interface {v1, v0, v4}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 558
    .line 559
    .line 560
    sget-object v0, Ltx0;->a:Ltx0;

    .line 561
    .line 562
    return-object v0

    .line 563
    :cond_1e
    if-eqz v6, :cond_1f

    .line 564
    .line 565
    const-string v0, "SHOW_CMP cause: [TCF] The \'Resurface UI\' option is enabled and a new vendor was added from the GVL"

    .line 566
    .line 567
    invoke-interface {v1, v0, v4}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 568
    .line 569
    .line 570
    sget-object v0, Ltx0;->a:Ltx0;

    .line 571
    .line 572
    return-object v0

    .line 573
    :cond_1f
    iget-object v0, v0, Lkp0;->b:Lg80;

    .line 574
    .line 575
    check-cast v0, Lpz2;

    .line 576
    .line 577
    invoke-virtual {v0}, Lpz2;->d()Ljava/lang/Long;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    if-eqz v3, :cond_21

    .line 582
    .line 583
    if-nez v0, :cond_20

    .line 584
    .line 585
    goto :goto_12

    .line 586
    :cond_20
    new-instance v2, Lh50;

    .line 587
    .line 588
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 589
    .line 590
    .line 591
    move-result-wide v3

    .line 592
    invoke-direct {v2, v3, v4}, Lh50;-><init>(J)V

    .line 593
    .line 594
    .line 595
    new-instance v0, Lh50;

    .line 596
    .line 597
    invoke-direct {v0}, Lh50;-><init>()V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v0}, Lh50;->c()J

    .line 601
    .line 602
    .line 603
    move-result-wide v3

    .line 604
    invoke-virtual {v2}, Lh50;->c()J

    .line 605
    .line 606
    .line 607
    move-result-wide v5

    .line 608
    sub-long/2addr v3, v5

    .line 609
    const-wide/32 v5, 0x5265c00

    .line 610
    .line 611
    .line 612
    div-long/2addr v3, v5

    .line 613
    long-to-int v0, v3

    .line 614
    const/16 v2, 0x186

    .line 615
    .line 616
    if-lt v0, v2, :cond_21

    .line 617
    .line 618
    const-string v0, "SHOW_CMP cause: [TCF] The \'Resurface UI\' option is enabled configured time has passed"

    .line 619
    .line 620
    const/4 v4, 0x0

    .line 621
    invoke-interface {v1, v0, v4}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 622
    .line 623
    .line 624
    sget-object v0, Ltx0;->a:Ltx0;

    .line 625
    .line 626
    return-object v0

    .line 627
    :cond_21
    :goto_12
    const/4 v4, 0x0

    .line 628
    if-eqz v13, :cond_22

    .line 629
    .line 630
    const-string v0, "SHOW_CMP cause: [TCF] The \'Resurface ATP list\' option is enabled and Ad Technology Providers changed"

    .line 631
    .line 632
    invoke-interface {v1, v0, v4}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 633
    .line 634
    .line 635
    sget-object v0, Ltx0;->a:Ltx0;

    .line 636
    .line 637
    return-object v0

    .line 638
    :cond_22
    sget-object v0, Ltx0;->b:Ltx0;

    .line 639
    .line 640
    return-object v0

    .line 641
    :cond_23
    invoke-static {}, Lds0;->b()V

    .line 642
    .line 643
    .line 644
    return-object v4

    .line 645
    :cond_24
    move/from16 v16, v12

    .line 646
    .line 647
    iget-object v1, v7, Lk61;->d:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    .line 648
    .line 649
    iget-object v2, v7, Lk61;->l:Ljava/lang/String;

    .line 650
    .line 651
    iget-object v0, v0, Lsx0;->f:Lec;

    .line 652
    .line 653
    iget-object v3, v0, Lec;->b:Ljava/lang/Object;

    .line 654
    .line 655
    check-cast v3, Li03;

    .line 656
    .line 657
    iget-object v4, v0, Lec;->d:Ljava/lang/Object;

    .line 658
    .line 659
    check-cast v4, Lyr;

    .line 660
    .line 661
    invoke-virtual {v4}, Lyr;->a()Lcom/usercentrics/ccpa/CCPAData;

    .line 662
    .line 663
    .line 664
    move-result-object v4

    .line 665
    iget-object v4, v4, Lcom/usercentrics/ccpa/CCPAData;->c:Ljava/lang/Boolean;

    .line 666
    .line 667
    iget-object v0, v0, Lec;->c:Ljava/lang/Object;

    .line 668
    .line 669
    check-cast v0, Lg80;

    .line 670
    .line 671
    check-cast v0, Lpz2;

    .line 672
    .line 673
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 674
    .line 675
    .line 676
    :try_start_0
    iget-object v0, v0, Lpz2;->e:Lod2;

    .line 677
    .line 678
    const-string v5, "ccpa_timestamp_millis"

    .line 679
    .line 680
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 681
    .line 682
    .line 683
    iget-object v0, v0, Lod2;->a:Landroid/content/SharedPreferences;

    .line 684
    .line 685
    const/4 v6, 0x0

    .line 686
    invoke-interface {v0, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    if-eqz v0, :cond_25

    .line 691
    .line 692
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 693
    .line 694
    .line 695
    move-result-wide v5

    .line 696
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 697
    .line 698
    .line 699
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 700
    goto :goto_13

    .line 701
    :catchall_0
    :cond_25
    const/4 v0, 0x0

    .line 702
    :goto_13
    if-nez v0, :cond_26

    .line 703
    .line 704
    move/from16 v12, v16

    .line 705
    .line 706
    goto :goto_14

    .line 707
    :cond_26
    move v12, v13

    .line 708
    :goto_14
    if-eqz v1, :cond_27

    .line 709
    .line 710
    iget-boolean v13, v1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->j:Z

    .line 711
    .line 712
    :cond_27
    if-eqz v8, :cond_28

    .line 713
    .line 714
    const/4 v6, 0x0

    .line 715
    invoke-interface {v3, v11, v6}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 716
    .line 717
    .line 718
    sget-object v0, Ltx0;->a:Ltx0;

    .line 719
    .line 720
    goto/16 :goto_17

    .line 721
    .line 722
    :cond_28
    const/4 v6, 0x0

    .line 723
    if-eqz v10, :cond_29

    .line 724
    .line 725
    invoke-interface {v3, v9, v6}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 726
    .line 727
    .line 728
    sget-object v0, Ltx0;->a:Ltx0;

    .line 729
    .line 730
    goto :goto_17

    .line 731
    :cond_29
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 732
    .line 733
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 734
    .line 735
    .line 736
    move-result v4

    .line 737
    if-eqz v4, :cond_2a

    .line 738
    .line 739
    sget-object v0, Ltx0;->b:Ltx0;

    .line 740
    .line 741
    goto :goto_17

    .line 742
    :cond_2a
    if-eqz v12, :cond_2b

    .line 743
    .line 744
    if-eqz v13, :cond_2b

    .line 745
    .line 746
    const-string v0, "SHOW_CMP cause: [##us_framework##] The \'Show CMP on first time visit\' option is enabled and it is the first initialization"

    .line 747
    .line 748
    invoke-static {v0, v2}, Lqj3;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    const/4 v4, 0x0

    .line 753
    invoke-interface {v3, v0, v4}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 754
    .line 755
    .line 756
    sget-object v0, Ltx0;->a:Ltx0;

    .line 757
    .line 758
    goto :goto_17

    .line 759
    :cond_2b
    if-eqz v1, :cond_2c

    .line 760
    .line 761
    iget v1, v1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->k:I

    .line 762
    .line 763
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 764
    .line 765
    .line 766
    move-result-object v1

    .line 767
    goto :goto_15

    .line 768
    :cond_2c
    const/4 v1, 0x0

    .line 769
    :goto_15
    if-eqz v1, :cond_2e

    .line 770
    .line 771
    if-nez v0, :cond_2d

    .line 772
    .line 773
    goto :goto_16

    .line 774
    :cond_2d
    new-instance v4, Lh50;

    .line 775
    .line 776
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 777
    .line 778
    .line 779
    move-result-wide v5

    .line 780
    invoke-direct {v4, v5, v6}, Lh50;-><init>(J)V

    .line 781
    .line 782
    .line 783
    new-instance v0, Lh50;

    .line 784
    .line 785
    invoke-direct {v0}, Lh50;-><init>()V

    .line 786
    .line 787
    .line 788
    iget-object v0, v0, Lh50;->a:Lhk2;

    .line 789
    .line 790
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    check-cast v0, Ljava/lang/Number;

    .line 795
    .line 796
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 797
    .line 798
    .line 799
    move-result v0

    .line 800
    iget-object v4, v4, Lh50;->a:Lhk2;

    .line 801
    .line 802
    invoke-virtual {v4}, Lhk2;->getValue()Ljava/lang/Object;

    .line 803
    .line 804
    .line 805
    move-result-object v4

    .line 806
    check-cast v4, Ljava/lang/Number;

    .line 807
    .line 808
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 809
    .line 810
    .line 811
    move-result v4

    .line 812
    sub-int/2addr v0, v4

    .line 813
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 814
    .line 815
    .line 816
    move-result v1

    .line 817
    if-le v0, v1, :cond_2e

    .line 818
    .line 819
    const-string v0, "SHOW_CMP cause: [##us_framework##] The \'Reshow ##us_framework## CMP\' configured time has passed"

    .line 820
    .line 821
    invoke-static {v0, v2}, Lqj3;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    const/4 v4, 0x0

    .line 826
    invoke-interface {v3, v0, v4}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 827
    .line 828
    .line 829
    sget-object v0, Ltx0;->a:Ltx0;

    .line 830
    .line 831
    goto :goto_17

    .line 832
    :cond_2e
    :goto_16
    sget-object v0, Ltx0;->b:Ltx0;

    .line 833
    .line 834
    :goto_17
    return-object v0

    .line 835
    :cond_2f
    move/from16 v16, v12

    .line 836
    .line 837
    iget-object v0, v7, Lk61;->c:Lgp0;

    .line 838
    .line 839
    invoke-virtual {v5}, Lhk2;->getValue()Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v3

    .line 843
    check-cast v3, Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 844
    .line 845
    invoke-virtual {v3}, Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;->b()Z

    .line 846
    .line 847
    .line 848
    move-result v3

    .line 849
    iget-object v1, v1, Lkp0;->a:Li03;

    .line 850
    .line 851
    if-eqz v0, :cond_30

    .line 852
    .line 853
    iget-boolean v4, v0, Lgp0;->a:Z

    .line 854
    .line 855
    goto :goto_18

    .line 856
    :cond_30
    move v4, v13

    .line 857
    :goto_18
    if-eqz v0, :cond_31

    .line 858
    .line 859
    iget-object v0, v0, Lgp0;->b:Ljava/lang/Integer;

    .line 860
    .line 861
    if-eqz v0, :cond_31

    .line 862
    .line 863
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 864
    .line 865
    .line 866
    move-result v0

    .line 867
    goto :goto_19

    .line 868
    :cond_31
    move v0, v13

    .line 869
    :goto_19
    move-object v5, v2

    .line 870
    check-cast v5, Lpz2;

    .line 871
    .line 872
    invoke-virtual {v5}, Lpz2;->d()Ljava/lang/Long;

    .line 873
    .line 874
    .line 875
    move-result-object v5

    .line 876
    if-nez v5, :cond_32

    .line 877
    .line 878
    move/from16 v12, v16

    .line 879
    .line 880
    goto :goto_1a

    .line 881
    :cond_32
    move v12, v13

    .line 882
    :goto_1a
    if-eqz v8, :cond_33

    .line 883
    .line 884
    const/4 v5, 0x0

    .line 885
    invoke-interface {v1, v11, v5}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 886
    .line 887
    .line 888
    sget-object v0, Ltx0;->a:Ltx0;

    .line 889
    .line 890
    return-object v0

    .line 891
    :cond_33
    const/4 v5, 0x0

    .line 892
    if-eqz v4, :cond_34

    .line 893
    .line 894
    if-nez v3, :cond_34

    .line 895
    .line 896
    sget-object v0, Ltx0;->b:Ltx0;

    .line 897
    .line 898
    return-object v0

    .line 899
    :cond_34
    if-eqz v12, :cond_35

    .line 900
    .line 901
    const-string v0, "SHOW_CMP cause: [GDPR] This user has not yet provided consent"

    .line 902
    .line 903
    invoke-interface {v1, v0, v5}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 904
    .line 905
    .line 906
    sget-object v0, Ltx0;->a:Ltx0;

    .line 907
    .line 908
    return-object v0

    .line 909
    :cond_35
    check-cast v2, Lpz2;

    .line 910
    .line 911
    invoke-virtual {v2}, Lpz2;->d()Ljava/lang/Long;

    .line 912
    .line 913
    .line 914
    move-result-object v2

    .line 915
    if-eqz v0, :cond_38

    .line 916
    .line 917
    if-nez v2, :cond_36

    .line 918
    .line 919
    goto :goto_1b

    .line 920
    :cond_36
    new-instance v3, Lh50;

    .line 921
    .line 922
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 923
    .line 924
    .line 925
    move-result-wide v4

    .line 926
    invoke-direct {v3, v4, v5}, Lh50;-><init>(J)V

    .line 927
    .line 928
    .line 929
    invoke-virtual {v3, v6, v0}, Lh50;->a(II)Lh50;

    .line 930
    .line 931
    .line 932
    move-result-object v0

    .line 933
    new-instance v2, Lh50;

    .line 934
    .line 935
    invoke-direct {v2}, Lh50;-><init>()V

    .line 936
    .line 937
    .line 938
    invoke-virtual {v2}, Lh50;->c()J

    .line 939
    .line 940
    .line 941
    move-result-wide v2

    .line 942
    invoke-virtual {v0}, Lh50;->c()J

    .line 943
    .line 944
    .line 945
    move-result-wide v4

    .line 946
    cmp-long v0, v2, v4

    .line 947
    .line 948
    if-gez v0, :cond_37

    .line 949
    .line 950
    goto :goto_1b

    .line 951
    :cond_37
    if-nez v0, :cond_39

    .line 952
    .line 953
    :cond_38
    :goto_1b
    const/4 v4, 0x0

    .line 954
    goto :goto_1c

    .line 955
    :cond_39
    const-string v0, "SHOW_CMP cause: [GDPR] The \'Reshow GDPR CMP\' option is enabled and the configured time has passed"

    .line 956
    .line 957
    const/4 v4, 0x0

    .line 958
    invoke-interface {v1, v0, v4}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 959
    .line 960
    .line 961
    sget-object v0, Ltx0;->a:Ltx0;

    .line 962
    .line 963
    return-object v0

    .line 964
    :goto_1c
    if-eqz v10, :cond_3a

    .line 965
    .line 966
    invoke-interface {v1, v9, v4}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 967
    .line 968
    .line 969
    sget-object v0, Ltx0;->a:Ltx0;

    .line 970
    .line 971
    return-object v0

    .line 972
    :cond_3a
    sget-object v0, Ltx0;->b:Ltx0;

    .line 973
    .line 974
    return-object v0

    .line 975
    :cond_3b
    const-string v0, "No variant value"

    .line 976
    .line 977
    invoke-static {v0}, Lf42;->l(Ljava/lang/String;)V

    .line 978
    .line 979
    .line 980
    return-object v4
.end method

.method public final e(Lg13;Lk61;Z)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lsx0;->i:Ljc2;

    .line 2
    .line 3
    iget-boolean v0, v0, Ljc2;->f:Z

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v0, 0x0

    .line 14
    if-eqz p1, :cond_3

    .line 15
    .line 16
    if-eq p1, v1, :cond_2

    .line 17
    .line 18
    const/4 p2, 0x2

    .line 19
    if-ne p1, p2, :cond_1

    .line 20
    .line 21
    iget-object p0, p0, Lsx0;->e:Lil2;

    .line 22
    .line 23
    check-cast p0, Lqk2;

    .line 24
    .line 25
    invoke-virtual {p0}, Lqk2;->d()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    xor-int/2addr p0, v1

    .line 30
    return p0

    .line 31
    :cond_1
    invoke-static {}, Lds0;->b()V

    .line 32
    .line 33
    .line 34
    return v0

    .line 35
    :cond_2
    return v1

    .line 36
    :cond_3
    iget-object p0, p2, Lk61;->c:Lgp0;

    .line 37
    .line 38
    if-eqz p0, :cond_4

    .line 39
    .line 40
    iget-boolean p0, p0, Lgp0;->a:Z

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    move p0, v0

    .line 44
    :goto_0
    if-eqz p0, :cond_5

    .line 45
    .line 46
    if-nez p3, :cond_5

    .line 47
    .line 48
    :goto_1
    return v1

    .line 49
    :cond_5
    return v0
.end method
