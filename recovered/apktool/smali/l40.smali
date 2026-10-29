.class public final Ll40;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/io/Serializable;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/util/Iterator;

.field public f:I

.field public i:I

.field public final synthetic v:Lb50;

.field public final synthetic w:Lra2;


# direct methods
.method public constructor <init>(Lb50;Lra2;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll40;->v:Lb50;

    .line 2
    .line 3
    iput-object p2, p0, Ll40;->w:Lra2;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, Ltj2;-><init>(ILc10;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Lc10;)Lc10;
    .locals 2

    .line 1
    new-instance v0, Ll40;

    .line 2
    .line 3
    iget-object v1, p0, Ll40;->v:Lb50;

    .line 4
    .line 5
    iget-object p0, p0, Ll40;->w:Lra2;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, Ll40;-><init>(Lb50;Lra2;Lc10;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lc10;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ll40;->create(Lc10;)Lc10;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ll40;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ll40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    iget v1, p0, Ll40;->i:I

    .line 4
    .line 5
    iget-object v2, p0, Ll40;->w:Lra2;

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x2

    .line 10
    iget-object v6, p0, Ll40;->v:Lb50;

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    const/4 v8, 0x0

    .line 14
    if-eqz v1, :cond_4

    .line 15
    .line 16
    if-eq v1, v7, :cond_3

    .line 17
    .line 18
    if-eq v1, v5, :cond_2

    .line 19
    .line 20
    if-eq v1, v4, :cond_1

    .line 21
    .line 22
    if-ne v1, v3, :cond_0

    .line 23
    .line 24
    iget v0, p0, Ll40;->f:I

    .line 25
    .line 26
    iget-object p0, p0, Ll40;->a:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_5

    .line 32
    .line 33
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v8

    .line 39
    :cond_1
    iget-object v1, p0, Ll40;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Ldl1;

    .line 42
    .line 43
    iget-object v2, p0, Ll40;->b:Ljava/io/Serializable;

    .line 44
    .line 45
    check-cast v2, Lh22;

    .line 46
    .line 47
    iget-object v4, p0, Ll40;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v4, Le22;

    .line 50
    .line 51
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_2

    .line 55
    .line 56
    :cond_2
    iget-object v1, p0, Ll40;->e:Ljava/util/Iterator;

    .line 57
    .line 58
    iget-object v9, p0, Ll40;->d:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v9, Lk40;

    .line 61
    .line 62
    iget-object v10, p0, Ll40;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v10, Lh22;

    .line 65
    .line 66
    iget-object v11, p0, Ll40;->b:Ljava/io/Serializable;

    .line 67
    .line 68
    check-cast v11, Le22;

    .line 69
    .line 70
    iget-object v12, p0, Ll40;->a:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v12, Ldl1;

    .line 73
    .line 74
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    iget-object v1, p0, Ll40;->d:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, Lh22;

    .line 81
    .line 82
    iget-object v9, p0, Ll40;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v9, Lh22;

    .line 85
    .line 86
    iget-object v10, p0, Ll40;->b:Ljava/io/Serializable;

    .line 87
    .line 88
    check-cast v10, Le22;

    .line 89
    .line 90
    iget-object v11, p0, Ll40;->a:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v11, Ldl1;

    .line 93
    .line 94
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_4
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    new-instance v11, Lgl1;

    .line 102
    .line 103
    invoke-direct {v11}, Lgl1;-><init>()V

    .line 104
    .line 105
    .line 106
    new-instance v10, Le22;

    .line 107
    .line 108
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 109
    .line 110
    .line 111
    new-instance v1, Lh22;

    .line 112
    .line 113
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 114
    .line 115
    .line 116
    iput-object v11, p0, Ll40;->a:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v10, p0, Ll40;->b:Ljava/io/Serializable;

    .line 119
    .line 120
    iput-object v1, p0, Ll40;->c:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v1, p0, Ll40;->d:Ljava/lang/Object;

    .line 123
    .line 124
    iput v7, p0, Ll40;->i:I

    .line 125
    .line 126
    invoke-static {v6, v7, p0}, Lb50;->f(Lb50;ZLd10;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-ne p1, v0, :cond_5

    .line 131
    .line 132
    goto/16 :goto_4

    .line 133
    .line 134
    :cond_5
    move-object v9, v1

    .line 135
    :goto_0
    check-cast p1, Lx30;

    .line 136
    .line 137
    iget-object p1, p1, Lx30;->b:Ljava/lang/Object;

    .line 138
    .line 139
    iput-object p1, v1, Lh22;->a:Ljava/lang/Object;

    .line 140
    .line 141
    new-instance p1, Lk40;

    .line 142
    .line 143
    invoke-direct {p1, v11, v10, v9, v6}, Lk40;-><init>(Ldl1;Le22;Lh22;Lb50;)V

    .line 144
    .line 145
    .line 146
    iget-object v1, v2, Lra2;->c:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v1, Ljava/util/List;

    .line 149
    .line 150
    if-eqz v1, :cond_8

    .line 151
    .line 152
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    move-object v12, v11

    .line 157
    move-object v11, v10

    .line 158
    move-object v10, v9

    .line 159
    move-object v9, p1

    .line 160
    :cond_6
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-eqz p1, :cond_7

    .line 165
    .line 166
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    check-cast p1, Lkotlin/jvm/functions/Function2;

    .line 171
    .line 172
    iput-object v12, p0, Ll40;->a:Ljava/lang/Object;

    .line 173
    .line 174
    iput-object v11, p0, Ll40;->b:Ljava/io/Serializable;

    .line 175
    .line 176
    iput-object v10, p0, Ll40;->c:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v9, p0, Ll40;->d:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v1, p0, Ll40;->e:Ljava/util/Iterator;

    .line 181
    .line 182
    iput v5, p0, Ll40;->i:I

    .line 183
    .line 184
    invoke-interface {p1, v9, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    if-ne p1, v0, :cond_6

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_7
    move-object v9, v10

    .line 192
    move-object v10, v11

    .line 193
    move-object v11, v12

    .line 194
    :cond_8
    iput-object v8, v2, Lra2;->c:Ljava/lang/Object;

    .line 195
    .line 196
    iput-object v10, p0, Ll40;->a:Ljava/lang/Object;

    .line 197
    .line 198
    iput-object v9, p0, Ll40;->b:Ljava/io/Serializable;

    .line 199
    .line 200
    iput-object v11, p0, Ll40;->c:Ljava/lang/Object;

    .line 201
    .line 202
    iput-object v8, p0, Ll40;->d:Ljava/lang/Object;

    .line 203
    .line 204
    iput-object v8, p0, Ll40;->e:Ljava/util/Iterator;

    .line 205
    .line 206
    iput v4, p0, Ll40;->i:I

    .line 207
    .line 208
    move-object v1, v11

    .line 209
    check-cast v1, Lgl1;

    .line 210
    .line 211
    invoke-virtual {v1, p0}, Lgl1;->d(Ld10;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    if-ne p1, v0, :cond_9

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_9
    move-object v2, v9

    .line 219
    move-object v4, v10

    .line 220
    :goto_2
    :try_start_0
    iput-boolean v7, v4, Le22;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 221
    .line 222
    check-cast v1, Lgl1;

    .line 223
    .line 224
    invoke-virtual {v1, v8}, Lgl1;->g(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    iget-object p1, v2, Lh22;->a:Ljava/lang/Object;

    .line 228
    .line 229
    if-eqz p1, :cond_a

    .line 230
    .line 231
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    goto :goto_3

    .line 236
    :cond_a
    const/4 v1, 0x0

    .line 237
    :goto_3
    invoke-virtual {v6}, Lb50;->g()Lqe2;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    iput-object p1, p0, Ll40;->a:Ljava/lang/Object;

    .line 242
    .line 243
    iput-object v8, p0, Ll40;->b:Ljava/io/Serializable;

    .line 244
    .line 245
    iput-object v8, p0, Ll40;->c:Ljava/lang/Object;

    .line 246
    .line 247
    iput v1, p0, Ll40;->f:I

    .line 248
    .line 249
    iput v3, p0, Ll40;->i:I

    .line 250
    .line 251
    invoke-virtual {v2}, Lqe2;->a()Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    if-ne p0, v0, :cond_b

    .line 256
    .line 257
    :goto_4
    return-object v0

    .line 258
    :cond_b
    move-object v0, p1

    .line 259
    move-object p1, p0

    .line 260
    move-object p0, v0

    .line 261
    move v0, v1

    .line 262
    :goto_5
    check-cast p1, Ljava/lang/Number;

    .line 263
    .line 264
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 265
    .line 266
    .line 267
    move-result p1

    .line 268
    new-instance v1, Lx30;

    .line 269
    .line 270
    invoke-direct {v1, p0, v0, p1}, Lx30;-><init>(Ljava/lang/Object;II)V

    .line 271
    .line 272
    .line 273
    return-object v1

    .line 274
    :catchall_0
    move-exception p0

    .line 275
    check-cast v1, Lgl1;

    .line 276
    .line 277
    invoke-virtual {v1, v8}, Lgl1;->g(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    throw p0
.end method
