.class public final Ljc2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lfb1;

.field public b:Ljava/lang/String;

.field public final c:Las0;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Z

.field public g:Ljava/util/Set;

.field public h:Z


# direct methods
.method public constructor <init>(Lfb1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljc2;->a:Lfb1;

    .line 5
    .line 6
    const-string p1, ""

    .line 7
    .line 8
    iput-object p1, p0, Ljc2;->b:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v0, Las0;

    .line 11
    .line 12
    invoke-direct {v0}, Las0;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Ljc2;->c:Las0;

    .line 16
    .line 17
    iput-object p1, p0, Ljc2;->d:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p1, p0, Ljc2;->e:Ljava/lang/String;

    .line 20
    .line 21
    sget-object p1, Lqd0;->a:Lqd0;

    .line 22
    .line 23
    iput-object p1, p0, Ljc2;->g:Ljava/util/Set;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(Lcom/usercentrics/sdk/UsercentricsOptions;Ld10;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lbc2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lbc2;

    .line 7
    .line 8
    iget v1, v0, Lbc2;->d:I

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
    iput v1, v0, Lbc2;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lbc2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lbc2;-><init>(Ljc2;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lbc2;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lbc2;->d:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lbc2;->a:Ljc2;

    .line 37
    .line 38
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p2, p1, Lcom/usercentrics/sdk/UsercentricsOptions;->b:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iput-object p2, p0, Ljc2;->e:Ljava/lang/String;

    .line 58
    .line 59
    iget-object p2, p1, Lcom/usercentrics/sdk/UsercentricsOptions;->c:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {p2}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    const-string p2, "latest"

    .line 68
    .line 69
    :cond_3
    iput-object p2, p0, Ljc2;->b:Ljava/lang/String;

    .line 70
    .line 71
    iget-object p2, p1, Lcom/usercentrics/sdk/UsercentricsOptions;->a:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {p2}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-nez v2, :cond_4

    .line 78
    .line 79
    invoke-static {p2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p2, p1}, Ljc2;->j(Ljava/lang/String;Ljava/util/Set;)V

    .line 87
    .line 88
    .line 89
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_4
    iget-object p2, p0, Ljc2;->a:Lfb1;

    .line 93
    .line 94
    iget-object p2, p2, Lfb1;->V:Lhk2;

    .line 95
    .line 96
    invoke-virtual {p2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    check-cast p2, Lm52;

    .line 101
    .line 102
    iget-object p1, p1, Lcom/usercentrics/sdk/UsercentricsOptions;->f:Ljava/lang/String;

    .line 103
    .line 104
    iput-object p0, v0, Lbc2;->a:Ljc2;

    .line 105
    .line 106
    iput v3, v0, Lbc2;->d:I

    .line 107
    .line 108
    invoke-virtual {p2, p1, v0}, Lm52;->a(Ljava/lang/String;Ld10;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    if-ne p2, v1, :cond_5

    .line 113
    .line 114
    return-object v1

    .line 115
    :cond_5
    :goto_1
    check-cast p2, Lcom/usercentrics/sdk/v2/ruleset/data/SessionGeoRule;

    .line 116
    .line 117
    iget-object p1, p2, Lcom/usercentrics/sdk/v2/ruleset/data/SessionGeoRule;->a:Ljava/lang/String;

    .line 118
    .line 119
    iget-object v0, p2, Lcom/usercentrics/sdk/v2/ruleset/data/SessionGeoRule;->d:Ljava/util/HashSet;

    .line 120
    .line 121
    invoke-virtual {p0, p1, v0}, Ljc2;->j(Ljava/lang/String;Ljava/util/Set;)V

    .line 122
    .line 123
    .line 124
    iget-boolean p1, p2, Lcom/usercentrics/sdk/v2/ruleset/data/SessionGeoRule;->b:Z

    .line 125
    .line 126
    iput-boolean p1, p0, Ljc2;->f:Z

    .line 127
    .line 128
    iget-object p0, p0, Ljc2;->a:Lfb1;

    .line 129
    .line 130
    iget-object p0, p0, Lfb1;->C:Lhk2;

    .line 131
    .line 132
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    check-cast p0, Lp91;

    .line 137
    .line 138
    iget-object p1, p2, Lcom/usercentrics/sdk/v2/ruleset/data/SessionGeoRule;->c:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 139
    .line 140
    invoke-virtual {p0, p1}, Lp91;->b(Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;)V

    .line 141
    .line 142
    .line 143
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    return-object p0
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object p0, p0, Ljc2;->a:Lfb1;

    .line 2
    .line 3
    iget-object v0, p0, Lfb1;->C:Lhk2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lp91;

    .line 10
    .line 11
    iget-object v0, v0, Lp91;->b:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;->a()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Lfb1;->t:Lhk2;

    .line 20
    .line 21
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lsx0;

    .line 26
    .line 27
    iget-object p0, p0, Lsx0;->l:Lg13;

    .line 28
    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    const-string p0, "No variant value"

    .line 33
    .line 34
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    const-string p0, "Location cannot be empty"

    .line 39
    .line 40
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final c(Ljava/lang/String;Ld10;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lcc2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcc2;

    .line 7
    .line 8
    iget v1, v0, Lcc2;->e:I

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
    iput v1, v0, Lcc2;->e:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcc2;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, Lcc2;-><init>(Ljc2;Ld10;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v6, Lcc2;->c:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, Lz10;->a:Lz10;

    .line 30
    .line 31
    iget v1, v6, Lcc2;->e:I

    .line 32
    .line 33
    const/4 v7, 0x2

    .line 34
    const/4 v2, 0x1

    .line 35
    const/4 v8, 0x0

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v2, :cond_2

    .line 39
    .line 40
    if-ne v1, v7, :cond_1

    .line 41
    .line 42
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    check-cast p2, Lo42;

    .line 46
    .line 47
    iget-object p0, p2, Lo42;->a:Ljava/lang/Object;

    .line 48
    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v8

    .line 57
    :cond_2
    iget-object p1, v6, Lcc2;->b:Ljava/lang/String;

    .line 58
    .line 59
    iget-object p0, v6, Lcc2;->a:Ljc2;

    .line 60
    .line 61
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    check-cast p2, Lo42;

    .line 65
    .line 66
    iget-object p2, p2, Lo42;->a:Ljava/lang/Object;

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object p2, p0, Ljc2;->a:Lfb1;

    .line 73
    .line 74
    iget-object v1, p2, Lfb1;->z:Lhk2;

    .line 75
    .line 76
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Lg80;

    .line 81
    .line 82
    iget-object v3, p0, Ljc2;->g:Ljava/util/Set;

    .line 83
    .line 84
    check-cast v1, Lpz2;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    iget-object v1, v1, Lpz2;->e:Lod2;

    .line 93
    .line 94
    sget-object v4, Lfh2;->a:[Lfh2;

    .line 95
    .line 96
    const-string v4, "tcf-"

    .line 97
    .line 98
    invoke-virtual {v1, v4, v3}, Lod2;->b(Ljava/lang/String;Ljava/util/Set;)V

    .line 99
    .line 100
    .line 101
    const-string v4, "settings-"

    .line 102
    .line 103
    invoke-virtual {v1, v4, v3}, Lod2;->b(Ljava/lang/String;Ljava/util/Set;)V

    .line 104
    .line 105
    .line 106
    iget-object v1, p2, Lfb1;->C:Lhk2;

    .line 107
    .line 108
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, Lp91;

    .line 113
    .line 114
    invoke-virtual {v1}, Lp91;->a()Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    iget-object p2, p2, Lfb1;->B:Lhk2;

    .line 119
    .line 120
    invoke-virtual {p2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    check-cast p2, Lg51;

    .line 125
    .line 126
    move v3, v2

    .line 127
    iget-object v2, p0, Ljc2;->d:Ljava/lang/String;

    .line 128
    .line 129
    move v4, v3

    .line 130
    iget-object v3, p0, Ljc2;->b:Ljava/lang/String;

    .line 131
    .line 132
    move v5, v4

    .line 133
    iget-object v4, p0, Ljc2;->e:Ljava/lang/String;

    .line 134
    .line 135
    xor-int/2addr v1, v5

    .line 136
    iput-object p0, v6, Lcc2;->a:Ljc2;

    .line 137
    .line 138
    iput-object p1, v6, Lcc2;->b:Ljava/lang/String;

    .line 139
    .line 140
    iput v5, v6, Lcc2;->e:I

    .line 141
    .line 142
    move v5, v1

    .line 143
    move-object v1, p2

    .line 144
    invoke-virtual/range {v1 .. v6}, Lg51;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLd10;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    if-ne p2, v0, :cond_4

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_4
    :goto_2
    sget-object v1, Lo42;->b:Lm42;

    .line 152
    .line 153
    instance-of v1, p2, Ln42;

    .line 154
    .line 155
    if-eqz v1, :cond_5

    .line 156
    .line 157
    move-object v1, v8

    .line 158
    goto :goto_3

    .line 159
    :cond_5
    move-object v1, p2

    .line 160
    :goto_3
    check-cast v1, Lk91;

    .line 161
    .line 162
    if-nez v1, :cond_7

    .line 163
    .line 164
    invoke-static {p2}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    if-nez p0, :cond_6

    .line 169
    .line 170
    new-instance p0, Lvz2;

    .line 171
    .line 172
    const-string p1, "Unable to initialise due to poor or no network connection while fetching the available languages."

    .line 173
    .line 174
    invoke-direct {p0, p1}, Lvz2;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    :cond_6
    new-instance p1, Ln42;

    .line 178
    .line 179
    invoke-direct {p1, p0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    return-object p1

    .line 183
    :cond_7
    iget-boolean p2, v1, Lk91;->c:Z

    .line 184
    .line 185
    iput-boolean p2, p0, Ljc2;->h:Z

    .line 186
    .line 187
    iput-object v8, v6, Lcc2;->a:Ljc2;

    .line 188
    .line 189
    iput-object v8, v6, Lcc2;->b:Ljava/lang/String;

    .line 190
    .line 191
    iput v7, v6, Lcc2;->e:I

    .line 192
    .line 193
    invoke-virtual {p0, p1, v1, v6}, Ljc2;->i(Ljava/lang/String;Lk91;Ld10;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    if-ne p0, v0, :cond_8

    .line 198
    .line 199
    :goto_4
    return-object v0

    .line 200
    :cond_8
    :goto_5
    invoke-static {p0}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    if-eqz p0, :cond_9

    .line 205
    .line 206
    new-instance p1, Ln42;

    .line 207
    .line 208
    invoke-direct {p1, p0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 209
    .line 210
    .line 211
    return-object p1

    .line 212
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    return-object p0
.end method

.method public final d(Ljava/lang/String;Ld10;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Ldc2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ldc2;

    .line 7
    .line 8
    iget v1, v0, Ldc2;->e:I

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
    iput v1, v0, Ldc2;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ldc2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Ldc2;-><init>(Ljc2;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Ldc2;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Ldc2;->e:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-boolean p0, v0, Ldc2;->b:Z

    .line 37
    .line 38
    iget-object p1, v0, Ldc2;->a:Ljc2;

    .line 39
    .line 40
    :try_start_0
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    move p2, p0

    .line 44
    move-object p0, p1

    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception p2

    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :catch_0
    move-exception p2

    .line 50
    move-object v4, p2

    .line 51
    move p2, p0

    .line 52
    move-object p0, p1

    .line 53
    move-object p1, v4

    .line 54
    goto :goto_2

    .line 55
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 p0, 0x0

    .line 61
    return-object p0

    .line 62
    :cond_2
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    :try_start_1
    iget-object v2, p0, Ljc2;->a:Lfb1;

    .line 70
    .line 71
    iget-object v2, v2, Lfb1;->t:Lhk2;

    .line 72
    .line 73
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Lsx0;

    .line 78
    .line 79
    iput-object p0, v0, Ldc2;->a:Ljc2;

    .line 80
    .line 81
    iput-boolean p2, v0, Ldc2;->b:Z

    .line 82
    .line 83
    iput v3, v0, Ldc2;->e:I

    .line 84
    .line 85
    invoke-virtual {v2, p1, p2}, Lsx0;->b(Ljava/lang/String;Z)Lkotlin/Unit;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    if-ne p1, v1, :cond_3

    .line 90
    .line 91
    return-object v1

    .line 92
    :cond_3
    :goto_1
    invoke-virtual {p0}, Ljc2;->b()V

    .line 93
    .line 94
    .line 95
    sget-object p1, Lo42;->b:Lm42;

    .line 96
    .line 97
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 98
    .line 99
    invoke-interface {v0}, Lc10;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0}, Lhu0;->d0(Lkotlin/coroutines/CoroutineContext;)Lh01;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-interface {v0}, Lh01;->isCancelled()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_4

    .line 112
    .line 113
    if-eqz p2, :cond_4

    .line 114
    .line 115
    invoke-virtual {p0}, Ljc2;->l()V

    .line 116
    .line 117
    .line 118
    :cond_4
    return-object p1

    .line 119
    :catchall_1
    move-exception p1

    .line 120
    move-object v4, p1

    .line 121
    move-object p1, p0

    .line 122
    move p0, p2

    .line 123
    move-object p2, v4

    .line 124
    goto :goto_3

    .line 125
    :catch_1
    move-exception p1

    .line 126
    :goto_2
    :try_start_2
    sget-object v1, Lo42;->b:Lm42;

    .line 127
    .line 128
    new-instance v1, Lvz2;

    .line 129
    .line 130
    const-string v2, "There was a failure during the initialization"

    .line 131
    .line 132
    invoke-direct {v1, v2, p1}, Lvz2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    new-instance p1, Ln42;

    .line 136
    .line 137
    invoke-direct {p1, v1}, Ln42;-><init>(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 138
    .line 139
    .line 140
    invoke-interface {v0}, Lc10;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-static {v0}, Lhu0;->d0(Lkotlin/coroutines/CoroutineContext;)Lh01;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-interface {v0}, Lh01;->isCancelled()Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_5

    .line 153
    .line 154
    if-eqz p2, :cond_5

    .line 155
    .line 156
    invoke-virtual {p0}, Ljc2;->l()V

    .line 157
    .line 158
    .line 159
    :cond_5
    return-object p1

    .line 160
    :goto_3
    invoke-interface {v0}, Lc10;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-static {v0}, Lhu0;->d0(Lkotlin/coroutines/CoroutineContext;)Lh01;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-interface {v0}, Lh01;->isCancelled()Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-eqz v0, :cond_6

    .line 173
    .line 174
    if-eqz p0, :cond_6

    .line 175
    .line 176
    invoke-virtual {p1}, Ljc2;->l()V

    .line 177
    .line 178
    .line 179
    :cond_6
    throw p2
.end method

.method public final e(Ld10;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Ljc2;->a:Lfb1;

    .line 2
    .line 3
    instance-of v1, p1, Lec2;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Lec2;

    .line 9
    .line 10
    iget v2, v1, Lec2;->c:I

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
    iput v2, v1, Lec2;->c:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lec2;

    .line 23
    .line 24
    invoke-direct {v1, p0, p1}, Lec2;-><init>(Ljc2;Ld10;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p0, v1, Lec2;->a:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object p1, Lz10;->a:Lz10;

    .line 30
    .line 31
    iget v2, v1, Lec2;->c:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    :try_start_0
    invoke-static {p0}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p0}, Lpg3;->A(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :try_start_1
    iget-object p0, v0, Lfb1;->F:Lhk2;

    .line 53
    .line 54
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Lac2;

    .line 59
    .line 60
    iget-object p0, p0, Lac2;->c:Lk61;

    .line 61
    .line 62
    iget-object p0, p0, Lk61;->i:Lij;

    .line 63
    .line 64
    if-eqz p0, :cond_3

    .line 65
    .line 66
    iget-object p0, p0, Lij;->b:Ljava/util/List;

    .line 67
    .line 68
    if-nez p0, :cond_4

    .line 69
    .line 70
    :cond_3
    sget-object p0, Lnd0;->a:Lnd0;

    .line 71
    .line 72
    :cond_4
    iget-object v0, v0, Lfb1;->X:Lhk2;

    .line 73
    .line 74
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Ly3;

    .line 79
    .line 80
    iput v3, v1, Lec2;->c:I

    .line 81
    .line 82
    invoke-virtual {v0, p0, v1}, Ly3;->e(Ljava/util/List;Ld10;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-ne p0, p1, :cond_5

    .line 87
    .line 88
    return-object p1

    .line 89
    :cond_5
    :goto_1
    sget-object p0, Lo42;->b:Lm42;

    .line 90
    .line 91
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 92
    .line 93
    return-object p0

    .line 94
    :catch_0
    move-exception p0

    .line 95
    sget-object p1, Lo42;->b:Lm42;

    .line 96
    .line 97
    new-instance p1, Lvz2;

    .line 98
    .line 99
    const-string v0, "Unable to initialise due to poor or no network connection while fetching the TCF data."

    .line 100
    .line 101
    invoke-direct {p1, v0, p0}, Lvz2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    new-instance p0, Ln42;

    .line 105
    .line 106
    invoke-direct {p0, p1}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    return-object p0
.end method

.method public final f(Ljava/lang/String;Ld10;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lfc2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lfc2;

    .line 7
    .line 8
    iget v1, v0, Lfc2;->e:I

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
    iput v1, v0, Lfc2;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lfc2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lfc2;-><init>(Ljc2;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lfc2;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lfc2;->e:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v5, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    check-cast p2, Lo42;

    .line 44
    .line 45
    iget-object p0, p2, Lo42;->a:Ljava/lang/Object;

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v3

    .line 54
    :cond_2
    iget-boolean p0, v0, Lfc2;->b:Z

    .line 55
    .line 56
    iget-object p1, v0, Lfc2;->a:Ljc2;

    .line 57
    .line 58
    :try_start_0
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    check-cast p2, Lo42;

    .line 62
    .line 63
    iget-object p2, p2, Lo42;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :catchall_0
    move-exception p2

    .line 67
    goto/16 :goto_4

    .line 68
    .line 69
    :cond_3
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object p2, p0, Ljc2;->a:Lfb1;

    .line 73
    .line 74
    iget-object v2, p2, Lfb1;->F:Lhk2;

    .line 75
    .line 76
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, Lac2;

    .line 81
    .line 82
    iget-object v6, v2, Lac2;->c:Lk61;

    .line 83
    .line 84
    iget-boolean v6, v6, Lk61;->g:Z

    .line 85
    .line 86
    if-eqz v6, :cond_6

    .line 87
    .line 88
    :try_start_1
    iput-object p0, v0, Lfc2;->a:Ljc2;

    .line 89
    .line 90
    iput-boolean v6, v0, Lfc2;->b:Z

    .line 91
    .line 92
    iput v5, v0, Lfc2;->e:I

    .line 93
    .line 94
    invoke-virtual {p0, v2, p1, v0}, Ljc2;->g(Lac2;Ljava/lang/String;Ld10;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 98
    if-ne p2, v1, :cond_4

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_4
    move-object p1, p0

    .line 102
    move p0, v6

    .line 103
    :goto_1
    invoke-interface {v0}, Lc10;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-static {v0}, Lhu0;->d0(Lkotlin/coroutines/CoroutineContext;)Lh01;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-interface {v0}, Lh01;->isCancelled()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_5

    .line 116
    .line 117
    if-nez p0, :cond_5

    .line 118
    .line 119
    invoke-virtual {p1}, Ljc2;->k()V

    .line 120
    .line 121
    .line 122
    :cond_5
    return-object p2

    .line 123
    :catchall_1
    move-exception p2

    .line 124
    move-object p1, p0

    .line 125
    move p0, v6

    .line 126
    goto :goto_4

    .line 127
    :cond_6
    :try_start_2
    invoke-virtual {p0}, Ljc2;->k()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 128
    .line 129
    .line 130
    invoke-interface {v0}, Lc10;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    invoke-static {v5}, Lhu0;->d0(Lkotlin/coroutines/CoroutineContext;)Lh01;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    invoke-interface {v5}, Lh01;->isCancelled()Z

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-eqz v5, :cond_7

    .line 143
    .line 144
    if-nez v6, :cond_7

    .line 145
    .line 146
    invoke-virtual {p0}, Ljc2;->k()V

    .line 147
    .line 148
    .line 149
    :cond_7
    iget-object v5, v2, Lac2;->c:Lk61;

    .line 150
    .line 151
    iget-object v5, v5, Lk61;->d:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    .line 152
    .line 153
    if-eqz v5, :cond_8

    .line 154
    .line 155
    iget-boolean v5, v5, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->h:Z

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_8
    const/4 v5, 0x0

    .line 159
    :goto_2
    if-eqz v5, :cond_a

    .line 160
    .line 161
    iget-object p2, p2, Lfb1;->I:Lhk2;

    .line 162
    .line 163
    invoke-virtual {p2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    check-cast p2, Lyr;

    .line 168
    .line 169
    iget-object v2, v2, Lac2;->c:Lk61;

    .line 170
    .line 171
    iget-object v2, v2, Lk61;->d:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    .line 172
    .line 173
    if-eqz v2, :cond_9

    .line 174
    .line 175
    iget-boolean v2, v2, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->l:Z

    .line 176
    .line 177
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    :cond_9
    iput-object v3, p2, Lyr;->c:Ljava/lang/Boolean;

    .line 182
    .line 183
    invoke-virtual {p2}, Lyr;->a()Lcom/usercentrics/ccpa/CCPAData;

    .line 184
    .line 185
    .line 186
    :cond_a
    iput v4, v0, Lfc2;->e:I

    .line 187
    .line 188
    invoke-virtual {p0, p1, v0}, Ljc2;->d(Ljava/lang/String;Ld10;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    if-ne p0, v1, :cond_b

    .line 193
    .line 194
    :goto_3
    return-object v1

    .line 195
    :cond_b
    return-object p0

    .line 196
    :goto_4
    invoke-interface {v0}, Lc10;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-static {v0}, Lhu0;->d0(Lkotlin/coroutines/CoroutineContext;)Lh01;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-interface {v0}, Lh01;->isCancelled()Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-eqz v0, :cond_c

    .line 209
    .line 210
    if-nez p0, :cond_c

    .line 211
    .line 212
    invoke-virtual {p1}, Ljc2;->k()V

    .line 213
    .line 214
    .line 215
    :cond_c
    throw p2
.end method

.method public final g(Lac2;Ljava/lang/String;Ld10;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, Lgc2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lgc2;

    .line 7
    .line 8
    iget v1, v0, Lgc2;->f:I

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
    iput v1, v0, Lgc2;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lgc2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lgc2;-><init>(Ljc2;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lgc2;->d:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lgc2;->f:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x0

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v5, :cond_3

    .line 38
    .line 39
    if-eq v2, v4, :cond_2

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    check-cast p3, Lo42;

    .line 47
    .line 48
    iget-object p0, p3, Lo42;->a:Ljava/lang/Object;

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v6

    .line 57
    :cond_2
    iget-object p0, v0, Lgc2;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, Ljava/lang/String;

    .line 60
    .line 61
    iget-object p1, v0, Lgc2;->a:Ljc2;

    .line 62
    .line 63
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    check-cast p3, Lo42;

    .line 67
    .line 68
    iget-object p2, p3, Lo42;->a:Ljava/lang/Object;

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    iget-object p2, v0, Lgc2;->c:Ljava/lang/String;

    .line 72
    .line 73
    iget-object p0, v0, Lgc2;->b:Ljava/lang/Object;

    .line 74
    .line 75
    move-object p1, p0

    .line 76
    check-cast p1, Lac2;

    .line 77
    .line 78
    iget-object p0, v0, Lgc2;->a:Ljc2;

    .line 79
    .line 80
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    check-cast p3, Lo42;

    .line 84
    .line 85
    iget-object p3, p3, Lo42;->a:Ljava/lang/Object;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    iget-object p3, p0, Ljc2;->a:Lfb1;

    .line 92
    .line 93
    iget-object p3, p3, Lfb1;->K:Lhk2;

    .line 94
    .line 95
    invoke-virtual {p3}, Lhk2;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    check-cast p3, Lil2;

    .line 100
    .line 101
    iget-object v2, p0, Ljc2;->d:Ljava/lang/String;

    .line 102
    .line 103
    iput-object p0, v0, Lgc2;->a:Ljc2;

    .line 104
    .line 105
    iput-object p1, v0, Lgc2;->b:Ljava/lang/Object;

    .line 106
    .line 107
    iput-object p2, v0, Lgc2;->c:Ljava/lang/String;

    .line 108
    .line 109
    iput v5, v0, Lgc2;->f:I

    .line 110
    .line 111
    check-cast p3, Lqk2;

    .line 112
    .line 113
    invoke-virtual {p3, v2, v0}, Lqk2;->o(Ljava/lang/String;Ld10;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p3

    .line 117
    if-ne p3, v1, :cond_5

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_5
    :goto_1
    invoke-static {p3}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 121
    .line 122
    .line 123
    move-result-object p3

    .line 124
    if-eqz p3, :cond_6

    .line 125
    .line 126
    new-instance p0, Ln42;

    .line 127
    .line 128
    invoke-direct {p0, p3}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    return-object p0

    .line 132
    :cond_6
    invoke-virtual {p1}, Lac2;->b()Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_9

    .line 137
    .line 138
    iput-object p0, v0, Lgc2;->a:Ljc2;

    .line 139
    .line 140
    iput-object p2, v0, Lgc2;->b:Ljava/lang/Object;

    .line 141
    .line 142
    iput-object v6, v0, Lgc2;->c:Ljava/lang/String;

    .line 143
    .line 144
    iput v4, v0, Lgc2;->f:I

    .line 145
    .line 146
    invoke-virtual {p0, v0}, Ljc2;->e(Ld10;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-ne p1, v1, :cond_7

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_7
    move-object v7, p1

    .line 154
    move-object p1, p0

    .line 155
    move-object p0, p2

    .line 156
    move-object p2, v7

    .line 157
    :goto_2
    invoke-static {p2}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    if-eqz p2, :cond_8

    .line 162
    .line 163
    new-instance p0, Ln42;

    .line 164
    .line 165
    invoke-direct {p0, p2}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    return-object p0

    .line 169
    :cond_8
    move-object p2, p0

    .line 170
    move-object p0, p1

    .line 171
    :cond_9
    iput-object v6, v0, Lgc2;->a:Ljc2;

    .line 172
    .line 173
    iput-object v6, v0, Lgc2;->b:Ljava/lang/Object;

    .line 174
    .line 175
    iput-object v6, v0, Lgc2;->c:Ljava/lang/String;

    .line 176
    .line 177
    iput v3, v0, Lgc2;->f:I

    .line 178
    .line 179
    invoke-virtual {p0, p2, v0}, Ljc2;->d(Ljava/lang/String;Ld10;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    if-ne p0, v1, :cond_a

    .line 184
    .line 185
    :goto_3
    return-object v1

    .line 186
    :cond_a
    return-object p0
.end method

.method public final h(Ljava/lang/String;Ljava/lang/String;Ld10;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Lhc2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lhc2;

    .line 7
    .line 8
    iget v1, v0, Lhc2;->e:I

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
    iput v1, v0, Lhc2;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lhc2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lhc2;-><init>(Ljc2;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lhc2;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lhc2;->e:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p2, v0, Lhc2;->b:Ljava/lang/String;

    .line 37
    .line 38
    iget-object p0, v0, Lhc2;->a:Ljc2;

    .line 39
    .line 40
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    check-cast p3, Lo42;

    .line 44
    .line 45
    iget-object p1, p3, Lo42;->a:Ljava/lang/Object;

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    return-object p0

    .line 55
    :cond_2
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v6, p0, Ljc2;->d:Ljava/lang/String;

    .line 59
    .line 60
    new-instance v4, Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;

    .line 61
    .line 62
    iget-object v7, p0, Ljc2;->b:Ljava/lang/String;

    .line 63
    .line 64
    if-nez p2, :cond_3

    .line 65
    .line 66
    iget-object p3, p0, Ljc2;->e:Ljava/lang/String;

    .line 67
    .line 68
    move-object v8, p3

    .line 69
    goto :goto_1

    .line 70
    :cond_3
    move-object v8, p2

    .line 71
    :goto_1
    iget-boolean v5, p0, Ljc2;->h:Z

    .line 72
    .line 73
    move-object v9, p1

    .line 74
    invoke-direct/range {v4 .. v9}, Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Ljc2;->a:Lfb1;

    .line 78
    .line 79
    iget-object p1, p1, Lfb1;->F:Lhk2;

    .line 80
    .line 81
    invoke-virtual {p1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, Lac2;

    .line 86
    .line 87
    iput-object p0, v0, Lhc2;->a:Ljc2;

    .line 88
    .line 89
    iput-object p2, v0, Lhc2;->b:Ljava/lang/String;

    .line 90
    .line 91
    iput v3, v0, Lhc2;->e:I

    .line 92
    .line 93
    invoke-virtual {p1, v4, v0}, Lac2;->a(Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;Ld10;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    if-ne p1, v1, :cond_4

    .line 98
    .line 99
    return-object v1

    .line 100
    :cond_4
    :goto_2
    invoke-static {p1}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    if-eqz p3, :cond_5

    .line 105
    .line 106
    new-instance p0, Ln42;

    .line 107
    .line 108
    invoke-direct {p0, p3}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    return-object p0

    .line 112
    :cond_5
    if-eqz p2, :cond_6

    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iput-object p2, p0, Ljc2;->e:Ljava/lang/String;

    .line 118
    .line 119
    :cond_6
    return-object p1
.end method

.method public final i(Ljava/lang/String;Lk91;Ld10;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, Lic2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lic2;

    .line 7
    .line 8
    iget v1, v0, Lic2;->e:I

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
    iput v1, v0, Lic2;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lic2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lic2;-><init>(Ljc2;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lic2;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lic2;->e:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v3, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    check-cast p3, Lo42;

    .line 44
    .line 45
    iget-object p0, p3, Lo42;->a:Ljava/lang/Object;

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v5

    .line 54
    :cond_2
    iget-object p1, v0, Lic2;->b:Ljava/lang/String;

    .line 55
    .line 56
    iget-object p0, v0, Lic2;->a:Ljc2;

    .line 57
    .line 58
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    check-cast p3, Lo42;

    .line 62
    .line 63
    iget-object p2, p3, Lo42;->a:Ljava/lang/Object;

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p3, p0, Ljc2;->a:Lfb1;

    .line 70
    .line 71
    iget-object v2, p3, Lfb1;->C:Lhk2;

    .line 72
    .line 73
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Lp91;

    .line 78
    .line 79
    invoke-virtual {v2}, Lp91;->a()Z

    .line 80
    .line 81
    .line 82
    iget-object v6, p2, Lk91;->b:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 83
    .line 84
    invoke-virtual {v6}, Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;->a()Z

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-nez v6, :cond_4

    .line 89
    .line 90
    iget-object v6, p2, Lk91;->b:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 91
    .line 92
    invoke-virtual {v2, v6}, Lp91;->b(Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;)V

    .line 93
    .line 94
    .line 95
    :cond_4
    iget-object p2, p2, Lk91;->a:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p2, Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iput-object p2, p0, Ljc2;->e:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {p3}, Lfb1;->e()Li03;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    const-string v2, "Language: "

    .line 109
    .line 110
    invoke-virtual {v2, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-interface {p3, p2, v5}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 115
    .line 116
    .line 117
    iput-object p0, v0, Lic2;->a:Ljc2;

    .line 118
    .line 119
    iput-object p1, v0, Lic2;->b:Ljava/lang/String;

    .line 120
    .line 121
    iput v3, v0, Lic2;->e:I

    .line 122
    .line 123
    invoke-virtual {p0, p1, v5, v0}, Ljc2;->h(Ljava/lang/String;Ljava/lang/String;Ld10;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    if-ne p2, v1, :cond_5

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_5
    :goto_1
    invoke-static {p2}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    if-eqz p2, :cond_6

    .line 135
    .line 136
    new-instance p0, Ln42;

    .line 137
    .line 138
    invoke-direct {p0, p2}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    return-object p0

    .line 142
    :cond_6
    iput-object v5, v0, Lic2;->a:Ljc2;

    .line 143
    .line 144
    iput-object v5, v0, Lic2;->b:Ljava/lang/String;

    .line 145
    .line 146
    iput v4, v0, Lic2;->e:I

    .line 147
    .line 148
    invoke-virtual {p0, p1, v0}, Ljc2;->f(Ljava/lang/String;Ld10;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    if-ne p0, v1, :cond_7

    .line 153
    .line 154
    :goto_2
    return-object v1

    .line 155
    :cond_7
    :goto_3
    invoke-static {p0}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    if-eqz p0, :cond_8

    .line 160
    .line 161
    new-instance p1, Ln42;

    .line 162
    .line 163
    invoke-direct {p1, p0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    return-object p1

    .line 167
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object p0
.end method

.method public final j(Ljava/lang/String;Ljava/util/Set;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljc2;->d:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ljc2;->g:Ljava/util/Set;

    .line 7
    .line 8
    iget-object p2, p0, Ljc2;->a:Lfb1;

    .line 9
    .line 10
    iget-object p2, p2, Lfb1;->z:Lhk2;

    .line 11
    .line 12
    invoke-virtual {p2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    check-cast p2, Lg80;

    .line 17
    .line 18
    iget-object v0, p0, Ljc2;->d:Ljava/lang/String;

    .line 19
    .line 20
    check-cast p2, Lpz2;

    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v1, p2, Lpz2;->e:Lod2;

    .line 29
    .line 30
    sget-object v2, Lfh2;->a:[Lfh2;

    .line 31
    .line 32
    const-string v2, "settings-"

    .line 33
    .line 34
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v1, v1, Lod2;->a:Landroid/content/SharedPreferences;

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-static {v0}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    sget-object v1, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;->Companion:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings$Companion;

    .line 58
    .line 59
    invoke-virtual {v1}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iget-object v2, p2, Lpz2;->b:Li03;

    .line 64
    .line 65
    sget-object v3, Lb21;->a:Lr11;

    .line 66
    .line 67
    invoke-static {v3, v1, v0, v2}, Lb21;->a(Lb11;Lkotlinx/serialization/KSerializer;Ljava/lang/String;Li03;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    move-object v2, v0

    .line 72
    check-cast v2, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;

    .line 73
    .line 74
    :cond_1
    :goto_0
    if-nez v2, :cond_2

    .line 75
    .line 76
    new-instance v2, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;

    .line 77
    .line 78
    invoke-direct {v2}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;-><init>()V

    .line 79
    .line 80
    .line 81
    :cond_2
    iput-object v2, p2, Lpz2;->f:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;

    .line 82
    .line 83
    iget-object p0, p0, Ljc2;->c:Las0;

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Las0;->a(Ljava/io/Serializable;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final k()V
    .locals 3

    .line 1
    iget-object p0, p0, Ljc2;->a:Lfb1;

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
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lpz2;->e:Lod2;

    .line 17
    .line 18
    sget-object v1, Lfh2;->a:[Lfh2;

    .line 19
    .line 20
    const-string v1, "actual_tcf"

    .line 21
    .line 22
    const-string v2, ""

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lod2;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lpz2;->b()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final l()V
    .locals 3

    .line 1
    iget-object p0, p0, Ljc2;->a:Lfb1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lfb1;->e()Li03;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "Storage wiped out, given failed initialization and 1st interaction with SDK"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-interface {v0, v1, v2}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lfb1;->z:Lhk2;

    .line 14
    .line 15
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lg80;

    .line 20
    .line 21
    check-cast p0, Lpz2;

    .line 22
    .line 23
    invoke-virtual {p0}, Lpz2;->a()V

    .line 24
    .line 25
    .line 26
    return-void
.end method
