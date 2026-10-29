.class public final Lv40;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb50;Lc10;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lv40;->a:I

    .line 12
    iput-object p1, p0, Lv40;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Ltj2;-><init>(ILc10;)V

    return-void
.end method

.method public synthetic constructor <init>(Len1;Ljava/lang/String;Lc10;I)V
    .locals 0

    .line 1
    iput p4, p0, Lv40;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lv40;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lv40;->d:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p3}, Ltj2;-><init>(ILc10;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Lc10;)Lc10;
    .locals 3

    .line 1
    iget v0, p0, Lv40;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lv40;->d:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lv40;

    .line 9
    .line 10
    iget-object p0, p0, Lv40;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lv3;

    .line 13
    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    const/4 v2, 0x3

    .line 17
    invoke-direct {v0, p0, v1, p1, v2}, Lv40;-><init>(Len1;Ljava/lang/String;Lc10;I)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_0
    new-instance v0, Lv40;

    .line 22
    .line 23
    iget-object p0, p0, Lv40;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lv3;

    .line 26
    .line 27
    check-cast v1, Ljava/lang/String;

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    invoke-direct {v0, p0, v1, p1, v2}, Lv40;-><init>(Len1;Ljava/lang/String;Lc10;I)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_1
    new-instance v0, Lv40;

    .line 35
    .line 36
    iget-object p0, p0, Lv40;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lk51;

    .line 39
    .line 40
    check-cast v1, Ljava/lang/String;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-direct {v0, p0, v1, p1, v2}, Lv40;-><init>(Len1;Ljava/lang/String;Lc10;I)V

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :pswitch_2
    new-instance p0, Lv40;

    .line 48
    .line 49
    check-cast v1, Lb50;

    .line 50
    .line 51
    invoke-direct {p0, v1, p1}, Lv40;-><init>(Lb50;Lc10;)V

    .line 52
    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lv40;->a:I

    .line 2
    .line 3
    check-cast p1, Lc10;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lv40;->create(Lc10;)Lc10;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lv40;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lv40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, Lv40;->create(Lc10;)Lc10;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lv40;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lv40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, Lv40;->create(Lc10;)Lc10;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Lv40;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Lv40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, Lv40;->create(Lc10;)Lc10;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Lv40;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Lv40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lv40;->a:I

    .line 2
    .line 3
    const-string v1, ".json"

    .line 4
    .line 5
    iget-object v2, p0, Lv40;->d:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, Lz10;->a:Lz10;

    .line 15
    .line 16
    iget v6, p0, Lv40;->b:I

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v5, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v4}, Lf42;->l(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object p1, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lv40;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Lv3;

    .line 37
    .line 38
    iget-object v3, p1, Lv3;->e:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, Lr3;

    .line 41
    .line 42
    check-cast v2, Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {p1}, Lve0;->b()Ljava/util/Map;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput v5, p0, Lv40;->b:I

    .line 49
    .line 50
    iget-object v4, v3, Lr3;->b:Lhb1;

    .line 51
    .line 52
    invoke-virtual {v4}, Lhb1;->a()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    const-string v5, "/translations/translations-"

    .line 57
    .line 58
    invoke-static {v4, v5, v2, v1}, Lpm2;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iget-object v2, v3, Lr3;->a:Lxu0;

    .line 63
    .line 64
    invoke-virtual {v2, v1, p1, p0}, Lxu0;->c(Ljava/lang/String;Ljava/util/Map;Ld10;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-ne p1, v0, :cond_2

    .line 69
    .line 70
    move-object p1, v0

    .line 71
    :cond_2
    :goto_0
    return-object p1

    .line 72
    :pswitch_0
    sget-object v0, Lz10;->a:Lz10;

    .line 73
    .line 74
    iget v6, p0, Lv40;->b:I

    .line 75
    .line 76
    if-eqz v6, :cond_4

    .line 77
    .line 78
    if-ne v6, v5, :cond_3

    .line 79
    .line 80
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    invoke-static {v4}, Lf42;->l(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    move-object p1, v3

    .line 88
    goto :goto_1

    .line 89
    :cond_4
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lv40;->c:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p1, Lv3;

    .line 95
    .line 96
    iget-object v3, p1, Lv3;->e:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v3, Lr3;

    .line 99
    .line 100
    check-cast v2, Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {p1}, Lve0;->b()Ljava/util/Map;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iput v5, p0, Lv40;->b:I

    .line 107
    .line 108
    iget-object v4, v3, Lr3;->b:Lhb1;

    .line 109
    .line 110
    invoke-virtual {v4}, Lhb1;->a()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    const-string v5, "_"

    .line 115
    .line 116
    const-string v6, "-"

    .line 117
    .line 118
    invoke-static {v2, v5, v6}, Lkotlin/text/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 123
    .line 124
    invoke-virtual {v2, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    new-instance v5, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string v4, "/gvl/v3/"

    .line 140
    .line 141
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    iget-object v2, v3, Lr3;->a:Lxu0;

    .line 155
    .line 156
    invoke-virtual {v2, v1, p1, p0}, Lxu0;->c(Ljava/lang/String;Ljava/util/Map;Ld10;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    if-ne p1, v0, :cond_5

    .line 161
    .line 162
    move-object p1, v0

    .line 163
    :cond_5
    :goto_1
    return-object p1

    .line 164
    :pswitch_1
    sget-object v0, Lz10;->a:Lz10;

    .line 165
    .line 166
    iget v1, p0, Lv40;->b:I

    .line 167
    .line 168
    if-eqz v1, :cond_7

    .line 169
    .line 170
    if-ne v1, v5, :cond_6

    .line 171
    .line 172
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_6
    invoke-static {v4}, Lf42;->l(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    move-object p1, v3

    .line 180
    goto :goto_2

    .line 181
    :cond_7
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    iget-object p1, p0, Lv40;->c:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast p1, Lk51;

    .line 187
    .line 188
    iget-object v1, p1, Lk51;->e:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v1, Ld7;

    .line 191
    .line 192
    check-cast v2, Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {p1}, Lve0;->b()Ljava/util/Map;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    iput v5, p0, Lv40;->b:I

    .line 199
    .line 200
    invoke-virtual {v1, v2, p1, p0}, Ld7;->a(Ljava/lang/String;Ljava/util/Map;Ld10;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    if-ne p1, v0, :cond_8

    .line 205
    .line 206
    move-object p1, v0

    .line 207
    :cond_8
    :goto_2
    return-object p1

    .line 208
    :pswitch_2
    check-cast v2, Lb50;

    .line 209
    .line 210
    sget-object v0, Lz10;->a:Lz10;

    .line 211
    .line 212
    iget v1, p0, Lv40;->b:I

    .line 213
    .line 214
    const/4 v6, 0x2

    .line 215
    if-eqz v1, :cond_b

    .line 216
    .line 217
    if-eq v1, v5, :cond_a

    .line 218
    .line 219
    if-ne v1, v6, :cond_9

    .line 220
    .line 221
    iget-object p0, p0, Lv40;->c:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast p0, Ljava/lang/Throwable;

    .line 224
    .line 225
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_9
    invoke-static {v4}, Lf42;->l(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    goto :goto_8

    .line 233
    :cond_a
    :try_start_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 234
    .line 235
    .line 236
    goto :goto_3

    .line 237
    :catchall_0
    move-exception p1

    .line 238
    goto :goto_4

    .line 239
    :cond_b
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    :try_start_1
    iput v5, p0, Lv40;->b:I

    .line 243
    .line 244
    invoke-static {v2, v5, p0}, Lb50;->f(Lb50;ZLd10;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    if-ne p1, v0, :cond_c

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_c
    :goto_3
    check-cast p1, Log2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 252
    .line 253
    goto :goto_7

    .line 254
    :goto_4
    invoke-virtual {v2}, Lb50;->g()Lqe2;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    iput-object p1, p0, Lv40;->c:Ljava/lang/Object;

    .line 259
    .line 260
    iput v6, p0, Lv40;->b:I

    .line 261
    .line 262
    invoke-virtual {v1}, Lqe2;->a()Ljava/lang/Integer;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    if-ne p0, v0, :cond_d

    .line 267
    .line 268
    :goto_5
    move-object v3, v0

    .line 269
    goto :goto_8

    .line 270
    :cond_d
    move-object v7, p1

    .line 271
    move-object p1, p0

    .line 272
    move-object p0, v7

    .line 273
    :goto_6
    check-cast p1, Ljava/lang/Number;

    .line 274
    .line 275
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 276
    .line 277
    .line 278
    move-result p1

    .line 279
    new-instance v0, Lv02;

    .line 280
    .line 281
    invoke-direct {v0, p1, p0}, Lv02;-><init>(ILjava/lang/Throwable;)V

    .line 282
    .line 283
    .line 284
    move-object p1, v0

    .line 285
    :goto_7
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 286
    .line 287
    new-instance v3, Lkotlin/Pair;

    .line 288
    .line 289
    invoke-direct {v3, p1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    :goto_8
    return-object v3

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
