.class public final Lh90;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lhk0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lhk0;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lhk0;Lil0;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lh90;->a:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lh90;->b:Lhk0;

    iput-object p2, p0, Lh90;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Li90;Lh22;Lhk0;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lh90;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lh90;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Lh90;->b:Lhk0;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lmj;Lhk0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh90;->a:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lh90;->c:Ljava/lang/Object;

    iput-object p2, p0, Lh90;->b:Lhk0;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lc10;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lh90;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lh90;->b:Lhk0;

    .line 4
    .line 5
    iget-object v2, p0, Lh90;->c:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/high16 v4, -0x80000000

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    instance-of v0, p2, Lhl0;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, p2

    .line 21
    check-cast v0, Lhl0;

    .line 22
    .line 23
    iget v7, v0, Lhl0;->b:I

    .line 24
    .line 25
    and-int v8, v7, v4

    .line 26
    .line 27
    if-eqz v8, :cond_0

    .line 28
    .line 29
    sub-int/2addr v7, v4

    .line 30
    iput v7, v0, Lhl0;->b:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, Lhl0;

    .line 34
    .line 35
    invoke-direct {v0, p0, p2}, Lhl0;-><init>(Lh90;Lc10;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object p0, v0, Lhl0;->a:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p2, Lz10;->a:Lz10;

    .line 41
    .line 42
    iget v4, v0, Lhl0;->b:I

    .line 43
    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    if-ne v4, v5, :cond_1

    .line 47
    .line 48
    invoke-static {p0}, Lpg3;->A(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_1
    invoke-static {v3}, Lf42;->l(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_2
    invoke-static {p0}, Lpg3;->A(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    check-cast p1, Lq83;

    .line 60
    .line 61
    check-cast v2, Lil0;

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget-object p0, p1, Lq83;->a:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    move-object v2, p1

    .line 83
    check-cast v2, Lot0;

    .line 84
    .line 85
    instance-of v2, v2, Lot0;

    .line 86
    .line 87
    if-eqz v2, :cond_3

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    move-object p1, v6

    .line 91
    :goto_1
    instance-of p0, p1, Lot0;

    .line 92
    .line 93
    if-eqz p0, :cond_5

    .line 94
    .line 95
    move-object v6, p1

    .line 96
    check-cast v6, Lot0;

    .line 97
    .line 98
    :cond_5
    if-nez v6, :cond_6

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_6
    iput v5, v0, Lhl0;->b:I

    .line 102
    .line 103
    invoke-interface {v1, v6, v0}, Lhk0;->emit(Ljava/lang/Object;Lc10;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    if-ne p0, p2, :cond_7

    .line 108
    .line 109
    move-object v6, p2

    .line 110
    goto :goto_3

    .line 111
    :cond_7
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    :goto_3
    return-object v6

    .line 114
    :pswitch_0
    instance-of v0, p2, Lqk0;

    .line 115
    .line 116
    if-eqz v0, :cond_8

    .line 117
    .line 118
    move-object v0, p2

    .line 119
    check-cast v0, Lqk0;

    .line 120
    .line 121
    iget v1, v0, Lqk0;->c:I

    .line 122
    .line 123
    and-int v7, v1, v4

    .line 124
    .line 125
    if-eqz v7, :cond_8

    .line 126
    .line 127
    sub-int/2addr v1, v4

    .line 128
    iput v1, v0, Lqk0;->c:I

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_8
    new-instance v0, Lqk0;

    .line 132
    .line 133
    invoke-direct {v0, p0, p2}, Lqk0;-><init>(Lh90;Lc10;)V

    .line 134
    .line 135
    .line 136
    :goto_4
    iget-object p2, v0, Lqk0;->b:Ljava/lang/Object;

    .line 137
    .line 138
    sget-object v1, Lz10;->a:Lz10;

    .line 139
    .line 140
    iget v4, v0, Lqk0;->c:I

    .line 141
    .line 142
    const/4 v7, 0x2

    .line 143
    if-eqz v4, :cond_b

    .line 144
    .line 145
    if-eq v4, v5, :cond_a

    .line 146
    .line 147
    if-ne v4, v7, :cond_9

    .line 148
    .line 149
    iget-object p0, v0, Lqk0;->a:Lh90;

    .line 150
    .line 151
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    goto :goto_7

    .line 155
    :cond_9
    invoke-static {v3}, Lf42;->l(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    goto :goto_8

    .line 159
    :cond_a
    iget-object p1, v0, Lqk0;->e:Ljava/lang/Object;

    .line 160
    .line 161
    iget-object p0, v0, Lqk0;->a:Lh90;

    .line 162
    .line 163
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_b
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    check-cast v2, Lmj;

    .line 171
    .line 172
    iput-object p0, v0, Lqk0;->a:Lh90;

    .line 173
    .line 174
    iput-object p1, v0, Lqk0;->e:Ljava/lang/Object;

    .line 175
    .line 176
    iput v5, v0, Lqk0;->c:I

    .line 177
    .line 178
    invoke-virtual {v2, p1, v0}, Lmj;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    if-ne p2, v1, :cond_c

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_c
    :goto_5
    check-cast p2, Ljava/lang/Boolean;

    .line 186
    .line 187
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 188
    .line 189
    .line 190
    move-result p2

    .line 191
    if-eqz p2, :cond_d

    .line 192
    .line 193
    iget-object p2, p0, Lh90;->b:Lhk0;

    .line 194
    .line 195
    iput-object p0, v0, Lqk0;->a:Lh90;

    .line 196
    .line 197
    iput-object v6, v0, Lqk0;->e:Ljava/lang/Object;

    .line 198
    .line 199
    iput v7, v0, Lqk0;->c:I

    .line 200
    .line 201
    invoke-interface {p2, p1, v0}, Lhk0;->emit(Ljava/lang/Object;Lc10;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    if-ne p1, v1, :cond_e

    .line 206
    .line 207
    :goto_6
    move-object v6, v1

    .line 208
    goto :goto_8

    .line 209
    :cond_d
    const/4 v5, 0x0

    .line 210
    :cond_e
    :goto_7
    if-eqz v5, :cond_f

    .line 211
    .line 212
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    :goto_8
    return-object v6

    .line 215
    :cond_f
    new-instance p1, La;

    .line 216
    .line 217
    invoke-direct {p1, p0}, La;-><init>(Lhk0;)V

    .line 218
    .line 219
    .line 220
    throw p1

    .line 221
    :pswitch_1
    check-cast v2, Lh22;

    .line 222
    .line 223
    instance-of v0, p2, Lg90;

    .line 224
    .line 225
    if-eqz v0, :cond_10

    .line 226
    .line 227
    move-object v0, p2

    .line 228
    check-cast v0, Lg90;

    .line 229
    .line 230
    iget v7, v0, Lg90;->c:I

    .line 231
    .line 232
    and-int v8, v7, v4

    .line 233
    .line 234
    if-eqz v8, :cond_10

    .line 235
    .line 236
    sub-int/2addr v7, v4

    .line 237
    iput v7, v0, Lg90;->c:I

    .line 238
    .line 239
    goto :goto_9

    .line 240
    :cond_10
    new-instance v0, Lg90;

    .line 241
    .line 242
    invoke-direct {v0, p0, p2}, Lg90;-><init>(Lh90;Lc10;)V

    .line 243
    .line 244
    .line 245
    :goto_9
    iget-object p0, v0, Lg90;->a:Ljava/lang/Object;

    .line 246
    .line 247
    sget-object p2, Lz10;->a:Lz10;

    .line 248
    .line 249
    iget v4, v0, Lg90;->c:I

    .line 250
    .line 251
    if-eqz v4, :cond_12

    .line 252
    .line 253
    if-ne v4, v5, :cond_11

    .line 254
    .line 255
    invoke-static {p0}, Lpg3;->A(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    goto :goto_a

    .line 259
    :cond_11
    invoke-static {v3}, Lf42;->l(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    goto :goto_c

    .line 263
    :cond_12
    invoke-static {p0}, Lpg3;->A(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    iget-object p0, v2, Lh22;->a:Ljava/lang/Object;

    .line 267
    .line 268
    sget-object v3, Ljb1;->c:Lr4;

    .line 269
    .line 270
    if-eq p0, v3, :cond_14

    .line 271
    .line 272
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result p0

    .line 276
    if-nez p0, :cond_13

    .line 277
    .line 278
    goto :goto_b

    .line 279
    :cond_13
    :goto_a
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 280
    .line 281
    goto :goto_c

    .line 282
    :cond_14
    :goto_b
    iput-object p1, v2, Lh22;->a:Ljava/lang/Object;

    .line 283
    .line 284
    iput v5, v0, Lg90;->c:I

    .line 285
    .line 286
    invoke-interface {v1, p1, v0}, Lhk0;->emit(Ljava/lang/Object;Lc10;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    if-ne p0, p2, :cond_13

    .line 291
    .line 292
    move-object v6, p2

    .line 293
    :goto_c
    return-object v6

    .line 294
    nop

    .line 295
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
