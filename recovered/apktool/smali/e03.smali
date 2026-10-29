.class public final Le03;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Le03;

.field public static final b:Las0;

.field public static c:Z

.field public static d:Llz;

.field public static volatile e:La13;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le03;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Le03;->a:Le03;

    .line 7
    .line 8
    new-instance v0, Las0;

    .line 9
    .line 10
    invoke-direct {v0}, Las0;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Le03;->b:Las0;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(Lvz2;Ld10;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Le03;->a:Le03;

    .line 2
    .line 3
    instance-of v1, p1, Ld03;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Ld03;

    .line 9
    .line 10
    iget v2, v1, Ld03;->e:I

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
    iput v2, v1, Ld03;->e:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Ld03;

    .line 23
    .line 24
    invoke-direct {v1, p1}, Ld10;-><init>(Lc10;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v1, Ld03;->d:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lz10;->a:Lz10;

    .line 30
    .line 31
    iget v3, v1, Ld03;->e:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    if-ne v3, v4, :cond_1

    .line 37
    .line 38
    iget-object p0, v1, Ld03;->c:La13;

    .line 39
    .line 40
    iget-object v0, v1, Ld03;->b:Lvz2;

    .line 41
    .line 42
    iget-object v1, v1, Ld03;->a:Le03;

    .line 43
    .line 44
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    check-cast p1, Lo42;

    .line 48
    .line 49
    iget-object p1, p1, Lo42;->a:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v5, p1

    .line 52
    move-object p1, p0

    .line 53
    move-object p0, v0

    .line 54
    move-object v0, v1

    .line 55
    move-object v1, v5

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    return-object p0

    .line 64
    :cond_2
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    sget-object p1, Le03;->e:La13;

    .line 68
    .line 69
    if-nez p1, :cond_3

    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_3
    iput-object v0, v1, Ld03;->a:Le03;

    .line 75
    .line 76
    iput-object p0, v1, Ld03;->b:Lvz2;

    .line 77
    .line 78
    iput-object p1, v1, Ld03;->c:La13;

    .line 79
    .line 80
    iput v4, v1, Ld03;->e:I

    .line 81
    .line 82
    invoke-virtual {p1, v4, v1}, La13;->n(ZLd10;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    if-ne v1, v2, :cond_4

    .line 87
    .line 88
    return-object v2

    .line 89
    :cond_4
    :goto_1
    sget-object v2, Lo42;->b:Lm42;

    .line 90
    .line 91
    instance-of v2, v1, Ln42;

    .line 92
    .line 93
    if-nez v2, :cond_5

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-static {p1}, Le03;->d(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_5
    new-instance p1, Lvz2;

    .line 105
    .line 106
    const-string v2, ""

    .line 107
    .line 108
    invoke-static {v1}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-direct {p1, v2, v1}, Lvz2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-static {}, Le03;->e()Lfb1;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-eqz v0, :cond_6

    .line 123
    .line 124
    invoke-virtual {v0}, Lfb1;->e()Li03;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-eqz v0, :cond_6

    .line 129
    .line 130
    const-string v1, "Usercentrics SDK was not able to initialize offline, cannot initialize, please make sure the internet connection is fine and retry"

    .line 131
    .line 132
    invoke-interface {v0, v1, p1}, Li03;->c(Ljava/lang/String;Lvz2;)V

    .line 133
    .line 134
    .line 135
    :cond_6
    new-instance p1, Lkm;

    .line 136
    .line 137
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    iget-object v0, p0, Lvz2;->a:Ljava/lang/String;

    .line 141
    .line 142
    if-nez v0, :cond_7

    .line 143
    .line 144
    const-string v0, "Unknown error"

    .line 145
    .line 146
    :cond_7
    const-string v1, "Usercentrics initialization failed: "

    .line 147
    .line 148
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-direct {p1, v0, p0}, Lvz2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    new-instance p0, Ln42;

    .line 156
    .line 157
    invoke-direct {p0, p1}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    invoke-static {p0}, Le03;->d(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    return-object p0
.end method

.method public static final b(Ljava/lang/Throwable;)Lvz2;
    .locals 2

    .line 1
    instance-of v0, p0, Lvz2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lvz2;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    if-eqz p0, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    :goto_0
    if-nez v0, :cond_4

    .line 25
    .line 26
    :cond_2
    if-eqz p0, :cond_3

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    goto :goto_1

    .line 33
    :cond_3
    const-string v0, "Unknown error"

    .line 34
    .line 35
    :cond_4
    :goto_1
    new-instance v1, Lvz2;

    .line 36
    .line 37
    invoke-direct {v1, v0, p0}, Lvz2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    return-object v1
.end method

.method public static c(Landroid/content/Context;Lcom/usercentrics/sdk/UsercentricsOptions;)V
    .locals 22

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    sget-object v1, Le03;->e:La13;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_3

    .line 7
    .line 8
    sget-object v1, Lhz2;->Companion:Lgz2;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v1, Lhz2;->f:Lhz2;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    :try_start_0
    sget-object v3, Lo42;->b:Lm42;

    .line 18
    .line 19
    iget-object v3, v1, Lhz2;->a:Lfb1;

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    iget-object v3, v3, Lfb1;->v:Lhk2;

    .line 24
    .line 25
    invoke-virtual {v3}, Lhk2;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ln8;

    .line 30
    .line 31
    iget-object v4, v3, Ln8;->b:Ljava/util/Timer;

    .line 32
    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/util/Timer;->cancel()V

    .line 36
    .line 37
    .line 38
    :cond_0
    iput-object v2, v3, Ln8;->b:Ljava/util/Timer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    sget-object v3, Lo42;->b:Lm42;

    .line 42
    .line 43
    :cond_1
    :goto_0
    iput-object v2, v1, Lhz2;->a:Lfb1;

    .line 44
    .line 45
    :cond_2
    sput-object v2, Lhz2;->f:Lhz2;

    .line 46
    .line 47
    sget-object v1, Luz2;->a:Lzf1;

    .line 48
    .line 49
    iget-object v1, v1, Lsq3;->a:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 54
    .line 55
    .line 56
    sget-object v1, Luz2;->b:Lzf1;

    .line 57
    .line 58
    iget-object v1, v1, Lsq3;->a:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 63
    .line 64
    .line 65
    sget-object v1, Le03;->b:Las0;

    .line 66
    .line 67
    iput-object v2, v1, Las0;->b:Ljava/lang/Object;

    .line 68
    .line 69
    sput-object v2, Le03;->e:La13;

    .line 70
    .line 71
    :cond_3
    const/4 v1, 0x1

    .line 72
    sput-boolean v1, Le03;->c:Z

    .line 73
    .line 74
    iget-object v4, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->a:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v5, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->b:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v6, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->c:Ljava/lang/String;

    .line 79
    .line 80
    iget-wide v7, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->d:J

    .line 81
    .line 82
    iget-object v9, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->e:Ll03;

    .line 83
    .line 84
    iget-object v10, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->f:Ljava/lang/String;

    .line 85
    .line 86
    iget-object v15, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->j:Lbn1;

    .line 87
    .line 88
    iget-boolean v11, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->g:Z

    .line 89
    .line 90
    iget-object v3, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->h:Lcom/usercentrics/sdk/UsercentricsDomains;

    .line 91
    .line 92
    iget-wide v13, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->i:J

    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    new-instance v12, Lcom/usercentrics/sdk/UsercentricsOptions;

    .line 113
    .line 114
    if-eqz v3, :cond_4

    .line 115
    .line 116
    iget-object v1, v3, Lcom/usercentrics/sdk/UsercentricsDomains;->a:Ljava/lang/String;

    .line 117
    .line 118
    iget-object v2, v3, Lcom/usercentrics/sdk/UsercentricsDomains;->b:Ljava/lang/String;

    .line 119
    .line 120
    move-object/from16 v17, v1

    .line 121
    .line 122
    iget-object v1, v3, Lcom/usercentrics/sdk/UsercentricsDomains;->c:Ljava/lang/String;

    .line 123
    .line 124
    move-object/from16 v19, v1

    .line 125
    .line 126
    iget-object v1, v3, Lcom/usercentrics/sdk/UsercentricsDomains;->d:Ljava/lang/String;

    .line 127
    .line 128
    iget-object v3, v3, Lcom/usercentrics/sdk/UsercentricsDomains;->e:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    new-instance v16, Lcom/usercentrics/sdk/UsercentricsDomains;

    .line 146
    .line 147
    move-object/from16 v20, v1

    .line 148
    .line 149
    move-object/from16 v18, v2

    .line 150
    .line 151
    move-object/from16 v21, v3

    .line 152
    .line 153
    invoke-direct/range {v16 .. v21}, Lcom/usercentrics/sdk/UsercentricsDomains;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    move-object v3, v12

    .line 157
    move-object/from16 v12, v16

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_4
    move-object v3, v12

    .line 161
    const/4 v12, 0x0

    .line 162
    :goto_1
    invoke-direct/range {v3 .. v14}, Lcom/usercentrics/sdk/UsercentricsOptions;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLl03;Ljava/lang/String;ZLcom/usercentrics/sdk/UsercentricsDomains;J)V

    .line 163
    .line 164
    .line 165
    iput-object v15, v3, Lcom/usercentrics/sdk/UsercentricsOptions;->j:Lbn1;

    .line 166
    .line 167
    :try_start_1
    invoke-static {v3}, Le03;->f(Lcom/usercentrics/sdk/UsercentricsOptions;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 168
    .line 169
    .line 170
    sget-object v1, Lhz2;->Companion:Lgz2;

    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    sget-object v1, Lhz2;->f:Lhz2;

    .line 176
    .line 177
    if-nez v1, :cond_5

    .line 178
    .line 179
    new-instance v1, Lhz2;

    .line 180
    .line 181
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 182
    .line 183
    .line 184
    sput-object v1, Lhz2;->f:Lhz2;

    .line 185
    .line 186
    :cond_5
    move-object/from16 v2, p0

    .line 187
    .line 188
    iput-object v2, v1, Lhz2;->d:Landroid/content/Context;

    .line 189
    .line 190
    iget-object v2, v1, Lhz2;->b:Lcom/usercentrics/sdk/UsercentricsOptions;

    .line 191
    .line 192
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    const/4 v4, 0x0

    .line 197
    if-eqz v2, :cond_6

    .line 198
    .line 199
    move v2, v4

    .line 200
    goto :goto_3

    .line 201
    :cond_6
    iget-object v2, v1, Lhz2;->b:Lcom/usercentrics/sdk/UsercentricsOptions;

    .line 202
    .line 203
    if-eqz v2, :cond_7

    .line 204
    .line 205
    const/4 v2, 0x1

    .line 206
    goto :goto_2

    .line 207
    :cond_7
    move v2, v4

    .line 208
    :goto_2
    iput-object v3, v1, Lhz2;->b:Lcom/usercentrics/sdk/UsercentricsOptions;

    .line 209
    .line 210
    :goto_3
    if-eqz v2, :cond_a

    .line 211
    .line 212
    :try_start_2
    sget-object v2, Lo42;->b:Lm42;

    .line 213
    .line 214
    iget-object v2, v1, Lhz2;->a:Lfb1;

    .line 215
    .line 216
    if-eqz v2, :cond_9

    .line 217
    .line 218
    iget-object v2, v2, Lfb1;->v:Lhk2;

    .line 219
    .line 220
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    check-cast v2, Ln8;

    .line 225
    .line 226
    iget-object v5, v2, Ln8;->b:Ljava/util/Timer;

    .line 227
    .line 228
    if-eqz v5, :cond_8

    .line 229
    .line 230
    invoke-virtual {v5}, Ljava/util/Timer;->cancel()V

    .line 231
    .line 232
    .line 233
    :cond_8
    const/4 v5, 0x0

    .line 234
    iput-object v5, v2, Ln8;->b:Ljava/util/Timer;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 235
    .line 236
    :cond_9
    :goto_4
    const/4 v5, 0x0

    .line 237
    goto :goto_5

    .line 238
    :catchall_1
    sget-object v2, Lo42;->b:Lm42;

    .line 239
    .line 240
    goto :goto_4

    .line 241
    :goto_5
    iput-object v5, v1, Lhz2;->a:Lfb1;

    .line 242
    .line 243
    :cond_a
    sget-object v1, Lhz2;->f:Lhz2;

    .line 244
    .line 245
    if-nez v1, :cond_b

    .line 246
    .line 247
    new-instance v1, Lhz2;

    .line 248
    .line 249
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 250
    .line 251
    .line 252
    sput-object v1, Lhz2;->f:Lhz2;

    .line 253
    .line 254
    :cond_b
    iget-object v2, v1, Lhz2;->a:Lfb1;

    .line 255
    .line 256
    if-nez v2, :cond_d

    .line 257
    .line 258
    sget-object v2, Lhz2;->e:Lzb0;

    .line 259
    .line 260
    if-nez v2, :cond_c

    .line 261
    .line 262
    new-instance v2, Lzb0;

    .line 263
    .line 264
    const/16 v5, 0x13

    .line 265
    .line 266
    invoke-direct {v2, v5}, Lzb0;-><init>(I)V

    .line 267
    .line 268
    .line 269
    sput-object v2, Lhz2;->e:Lzb0;

    .line 270
    .line 271
    :cond_c
    iget-object v2, v1, Lhz2;->b:Lcom/usercentrics/sdk/UsercentricsOptions;

    .line 272
    .line 273
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    iget-object v5, v1, Lhz2;->d:Landroid/content/Context;

    .line 277
    .line 278
    new-instance v6, Lfb1;

    .line 279
    .line 280
    invoke-direct {v6, v5, v2}, Lfb1;-><init>(Landroid/content/Context;Lcom/usercentrics/sdk/UsercentricsOptions;)V

    .line 281
    .line 282
    .line 283
    iput-object v6, v1, Lhz2;->a:Lfb1;

    .line 284
    .line 285
    move-object v2, v6

    .line 286
    :cond_d
    iget-object v1, v2, Lfb1;->T:Lhk2;

    .line 287
    .line 288
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    check-cast v1, Lse0;

    .line 293
    .line 294
    iget-object v5, v2, Lfb1;->b:Ljava/lang/String;

    .line 295
    .line 296
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    iput-object v5, v1, Lse0;->c:Ljava/lang/String;

    .line 303
    .line 304
    iget-object v5, v1, Lse0;->b:Lx80;

    .line 305
    .line 306
    new-instance v6, Lmj;

    .line 307
    .line 308
    const/4 v7, 0x3

    .line 309
    const/4 v8, 0x0

    .line 310
    invoke-direct {v6, v1, v8, v7}, Lmj;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v5, v6}, Lx80;->b(Lkotlin/jvm/functions/Function2;)Lec;

    .line 314
    .line 315
    .line 316
    iget-object v1, v2, Lfb1;->a:Lcom/usercentrics/sdk/UsercentricsOptions;

    .line 317
    .line 318
    iget-object v1, v1, Lcom/usercentrics/sdk/UsercentricsOptions;->h:Lcom/usercentrics/sdk/UsercentricsDomains;

    .line 319
    .line 320
    if-eqz v1, :cond_e

    .line 321
    .line 322
    invoke-virtual {v1}, Lcom/usercentrics/sdk/UsercentricsDomains;->a()Z

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    const/4 v5, 0x1

    .line 327
    if-ne v1, v5, :cond_f

    .line 328
    .line 329
    const/4 v8, 0x0

    .line 330
    goto :goto_6

    .line 331
    :cond_e
    const/4 v5, 0x1

    .line 332
    :cond_f
    iget-object v1, v2, Lfb1;->v:Lhk2;

    .line 333
    .line 334
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    check-cast v1, Ln8;

    .line 339
    .line 340
    iget-object v6, v1, Ln8;->a:Lpj;

    .line 341
    .line 342
    invoke-virtual {v6}, Lpj;->invoke()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    new-instance v8, Ljava/util/Timer;

    .line 346
    .line 347
    invoke-direct {v8, v5}, Ljava/util/Timer;-><init>(Z)V

    .line 348
    .line 349
    .line 350
    new-instance v9, Lm8;

    .line 351
    .line 352
    invoke-direct {v9, v1, v4}, Lm8;-><init>(Ljava/lang/Object;I)V

    .line 353
    .line 354
    .line 355
    const-wide/32 v10, 0x2bf20

    .line 356
    .line 357
    .line 358
    const-wide/32 v12, 0x2bf20

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v8 .. v13}, Ljava/util/Timer;->scheduleAtFixedRate(Ljava/util/TimerTask;JJ)V

    .line 362
    .line 363
    .line 364
    iput-object v8, v1, Ln8;->b:Ljava/util/Timer;

    .line 365
    .line 366
    iget-object v1, v2, Lfb1;->A:Lhk2;

    .line 367
    .line 368
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    check-cast v1, Loj;

    .line 373
    .line 374
    iget-object v5, v1, Loj;->a:Lx80;

    .line 375
    .line 376
    new-instance v6, Lmj;

    .line 377
    .line 378
    const/4 v8, 0x0

    .line 379
    invoke-direct {v6, v1, v8, v4}, Lmj;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v5, v6}, Lx80;->b(Lkotlin/jvm/functions/Function2;)Lec;

    .line 383
    .line 384
    .line 385
    :goto_6
    iget-object v1, v2, Lfb1;->s:Lhk2;

    .line 386
    .line 387
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    check-cast v1, Ljz;

    .line 392
    .line 393
    check-cast v1, Lmz;

    .line 394
    .line 395
    iget-object v4, v1, Lmz;->a:Lx80;

    .line 396
    .line 397
    new-instance v5, Lmj;

    .line 398
    .line 399
    const/4 v6, 0x1

    .line 400
    invoke-direct {v5, v1, v8, v6}, Lmj;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v4, v5}, Lx80;->b(Lkotlin/jvm/functions/Function2;)Lec;

    .line 404
    .line 405
    .line 406
    new-instance v1, La13;

    .line 407
    .line 408
    invoke-direct {v1, v2, v3}, La13;-><init>(Lfb1;Lcom/usercentrics/sdk/UsercentricsOptions;)V

    .line 409
    .line 410
    .line 411
    sput-object v1, Le03;->e:La13;

    .line 412
    .line 413
    iget-wide v9, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->i:J

    .line 414
    .line 415
    iget-object v0, v2, Lfb1;->T:Lhk2;

    .line 416
    .line 417
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    check-cast v0, Lse0;

    .line 422
    .line 423
    invoke-virtual {v2}, Lfb1;->b()Lx80;

    .line 424
    .line 425
    .line 426
    move-result-object v11

    .line 427
    new-instance v12, Ltm;

    .line 428
    .line 429
    const/16 v2, 0xb

    .line 430
    .line 431
    const/4 v5, 0x0

    .line 432
    invoke-direct {v12, v0, v1, v5, v2}, Ltm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    new-instance v13, Lec;

    .line 439
    .line 440
    const/16 v0, 0x15

    .line 441
    .line 442
    invoke-direct {v13, v0}, Lec;-><init>(I)V

    .line 443
    .line 444
    .line 445
    iget-object v0, v11, Lx80;->b:Ls10;

    .line 446
    .line 447
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    new-instance v1, Lpi2;

    .line 451
    .line 452
    invoke-direct {v1}, Lk01;-><init>()V

    .line 453
    .line 454
    .line 455
    invoke-static {v1, v0}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-static {v0}, Lk50;->a(Lkotlin/coroutines/CoroutineContext;)Ly00;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    new-instance v8, Lv80;

    .line 464
    .line 465
    const/4 v14, 0x0

    .line 466
    invoke-direct/range {v8 .. v14}, Lv80;-><init>(JLx80;Ltm;Lec;Lc10;)V

    .line 467
    .line 468
    .line 469
    const/4 v5, 0x0

    .line 470
    invoke-static {v0, v5, v8, v7}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 471
    .line 472
    .line 473
    sget-object v0, Lnk2;->U:Lnk2;

    .line 474
    .line 475
    invoke-virtual {v13, v0}, Lec;->G(Lkotlin/jvm/functions/Function1;)V

    .line 476
    .line 477
    .line 478
    return-void

    .line 479
    :catch_0
    move-exception v0

    .line 480
    sget-object v1, Lo42;->b:Lm42;

    .line 481
    .line 482
    new-instance v1, Ln42;

    .line 483
    .line 484
    invoke-direct {v1, v0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 485
    .line 486
    .line 487
    invoke-static {v1}, Le03;->d(Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    return-void
.end method

.method public static d(Ljava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lo42;->b:Lm42;

    .line 2
    .line 3
    instance-of v0, p0, Ln42;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {}, Le03;->e()Lfb1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lfb1;->e()Li03;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const-string v2, "Usercentrics SDK is fully initialized"

    .line 21
    .line 22
    invoke-interface {v0, v2, v1}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    sget-object v0, Le03;->d:Llz;

    .line 26
    .line 27
    sput-object v1, Le03;->d:Llz;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    sput-boolean v1, Le03;->c:Z

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, Llz;->invoke()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    sget-object v0, Le03;->b:Las0;

    .line 39
    .line 40
    new-instance v1, Lo42;

    .line 41
    .line 42
    invoke-direct {v1, p0}, Lo42;-><init>(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iput-object v1, v0, Las0;->b:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-static {}, Le03;->e()Lfb1;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    invoke-virtual {v0}, Lfb1;->b()Lx80;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    new-instance v1, Lf8;

    .line 60
    .line 61
    const/16 v2, 0x12

    .line 62
    .line 63
    invoke-direct {v1, p0, v2}, Lf8;-><init>(Ljava/lang/Object;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Lx80;->c(Lkotlin/jvm/functions/Function0;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    return-void
.end method

.method public static e()Lfb1;
    .locals 1

    .line 1
    sget-object v0, Lhz2;->Companion:Lgz2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lhz2;->f:Lhz2;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, Lhz2;->a:Lfb1;

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return-object v0
.end method

.method public static f(Lcom/usercentrics/sdk/UsercentricsOptions;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->h:Lcom/usercentrics/sdk/UsercentricsDomains;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/usercentrics/sdk/UsercentricsDomains;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    move v0, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    iget-object v2, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v2}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    xor-int/2addr v2, v1

    .line 22
    iget-object v3, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->f:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v3}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    xor-int/2addr v1, v3

    .line 29
    xor-int/2addr v1, v2

    .line 30
    if-eqz v1, :cond_4

    .line 31
    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    iget-wide v0, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->d:J

    .line 35
    .line 36
    const-wide/16 v2, 0x0

    .line 37
    .line 38
    cmp-long v0, v0, v2

    .line 39
    .line 40
    if-gtz v0, :cond_1

    .line 41
    .line 42
    const-wide/16 v0, 0x2710

    .line 43
    .line 44
    iput-wide v0, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->d:J

    .line 45
    .line 46
    :cond_1
    iget-wide v0, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->i:J

    .line 47
    .line 48
    const-wide/16 v2, 0x1388

    .line 49
    .line 50
    cmp-long v0, v0, v2

    .line 51
    .line 52
    if-gez v0, :cond_2

    .line 53
    .line 54
    iput-wide v2, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->i:J

    .line 55
    .line 56
    :cond_2
    return-void

    .line 57
    :cond_3
    new-instance p0, Lvz2;

    .line 58
    .line 59
    const-string v0, "Defined self hosting domains are not valid. Please validate them!"

    .line 60
    .line 61
    invoke-direct {p0, v0}, Lvz2;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p0

    .line 65
    :cond_4
    new-instance p0, Lkm;

    .line 66
    .line 67
    const-string v0, "Please use a valid settingsId or ruleSetId."

    .line 68
    .line 69
    invoke-direct {p0, v0}, Lvz2;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p0
.end method
