.class public final Lnr;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Luf0;
.implements Lyy2;


# instance fields
.field public final synthetic a:I

.field public final b:Luk1;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Lnr;->a:I

    packed-switch p1, :pswitch_data_0

    .line 305
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 306
    invoke-static {}, Luk1;->j()Luk1;

    move-result-object p1

    iput-object p1, p0, Lnr;->b:Luk1;

    return-void

    .line 307
    :pswitch_0
    invoke-static {}, Luk1;->j()Luk1;

    move-result-object p1

    const/4 v0, 0x3

    invoke-direct {p0, p1, v0}, Lnr;-><init>(Luk1;I)V

    return-void

    .line 308
    :pswitch_1
    invoke-static {}, Luk1;->j()Luk1;

    move-result-object p1

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, Lnr;-><init>(Luk1;I)V

    return-void

    .line 309
    :pswitch_2
    invoke-static {}, Luk1;->j()Luk1;

    move-result-object p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lnr;-><init>(Luk1;I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Luk1;I)V
    .locals 6

    .line 1
    iput p2, p0, Lnr;->a:I

    .line 2
    .line 3
    const-string v0, "-"

    .line 4
    .line 5
    const-string v1, ": "

    .line 6
    .line 7
    const-string v2, "Invalid target class configuration for "

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    packed-switch p2, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lnr;->b:Luk1;

    .line 17
    .line 18
    sget-object p2, Lrm2;->E:Llf;

    .line 19
    .line 20
    :try_start_0
    invoke-virtual {p1, p2}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-object p1, v3

    .line 26
    :goto_0
    check-cast p1, Ljava/lang/Class;

    .line 27
    .line 28
    const-class p2, Lpv0;

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-static {v2, p0, v1, p1}, Lds0;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    throw v3

    .line 43
    :cond_1
    :goto_1
    iget-object p1, p0, Lnr;->b:Luk1;

    .line 44
    .line 45
    sget-object v1, Lzy2;->O:Llf;

    .line 46
    .line 47
    sget-object v2, Lbz2;->c:Lbz2;

    .line 48
    .line 49
    invoke-virtual {p1, v1, v2}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, Lnr;->b:Luk1;

    .line 53
    .line 54
    sget-object p1, Lrm2;->E:Llf;

    .line 55
    .line 56
    invoke-virtual {p0, p1, p2}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sget-object p1, Lrm2;->D:Llf;

    .line 60
    .line 61
    :try_start_1
    invoke-virtual {p0, p1}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 65
    :catch_1
    if-nez v3, :cond_2

    .line 66
    .line 67
    new-instance p1, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    sget-object p2, Lrm2;->D:Llf;

    .line 94
    .line 95
    invoke-virtual {p0, p2, p1}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_2
    return-void

    .line 99
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object p1, p0, Lnr;->b:Luk1;

    .line 103
    .line 104
    sget-object p2, Lrm2;->E:Llf;

    .line 105
    .line 106
    :try_start_2
    invoke-virtual {p1, p2}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p2
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    .line 110
    goto :goto_2

    .line 111
    :catch_2
    move-object p2, v3

    .line 112
    :goto_2
    check-cast p2, Ljava/lang/Class;

    .line 113
    .line 114
    const-class v4, Lvw1;

    .line 115
    .line 116
    if-eqz p2, :cond_4

    .line 117
    .line 118
    invoke-virtual {p2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-eqz v5, :cond_3

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_3
    invoke-static {v2, p0, v1, p2}, Lds0;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    throw v3

    .line 129
    :cond_4
    :goto_3
    iget-object p2, p0, Lnr;->b:Luk1;

    .line 130
    .line 131
    sget-object v1, Lzy2;->O:Llf;

    .line 132
    .line 133
    sget-object v2, Lbz2;->b:Lbz2;

    .line 134
    .line 135
    invoke-virtual {p2, v1, v2}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    iget-object p2, p0, Lnr;->b:Luk1;

    .line 139
    .line 140
    sget-object v1, Lrm2;->E:Llf;

    .line 141
    .line 142
    invoke-virtual {p2, v1, v4}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    sget-object v1, Lrm2;->D:Llf;

    .line 146
    .line 147
    :try_start_3
    invoke-virtual {p2, v1}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v3
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    .line 151
    :catch_3
    if-nez v3, :cond_5

    .line 152
    .line 153
    new-instance p2, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    iget-object p0, p0, Lnr;->b:Luk1;

    .line 180
    .line 181
    sget-object v0, Lrm2;->D:Llf;

    .line 182
    .line 183
    invoke-virtual {p0, v0, p2}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    :cond_5
    sget-object p0, Ljw0;->t:Llf;

    .line 187
    .line 188
    const/4 p2, -0x1

    .line 189
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    :try_start_4
    invoke-virtual {p1, p0}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_4

    .line 197
    :catch_4
    check-cast v0, Ljava/lang/Integer;

    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    if-ne p0, p2, :cond_6

    .line 204
    .line 205
    sget-object p0, Ljw0;->t:Llf;

    .line 206
    .line 207
    const/4 p2, 0x2

    .line 208
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    invoke-virtual {p1, p0, p2}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :cond_6
    return-void

    .line 216
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 217
    .line 218
    .line 219
    iput-object p1, p0, Lnr;->b:Luk1;

    .line 220
    .line 221
    sget-object p2, Lrm2;->E:Llf;

    .line 222
    .line 223
    :try_start_5
    invoke-virtual {p1, p2}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p1
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_5

    .line 227
    goto :goto_4

    .line 228
    :catch_5
    move-object p1, v3

    .line 229
    :goto_4
    check-cast p1, Ljava/lang/Class;

    .line 230
    .line 231
    const-class p2, Lzv0;

    .line 232
    .line 233
    if-eqz p1, :cond_8

    .line 234
    .line 235
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    if-eqz v4, :cond_7

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_7
    invoke-static {v2, p0, v1, p1}, Lds0;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    throw v3

    .line 246
    :cond_8
    :goto_5
    iget-object p1, p0, Lnr;->b:Luk1;

    .line 247
    .line 248
    sget-object v1, Lzy2;->O:Llf;

    .line 249
    .line 250
    sget-object v2, Lbz2;->a:Lbz2;

    .line 251
    .line 252
    invoke-virtual {p1, v1, v2}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    iget-object p1, p0, Lnr;->b:Luk1;

    .line 256
    .line 257
    sget-object v1, Lrm2;->E:Llf;

    .line 258
    .line 259
    invoke-virtual {p1, v1, p2}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    sget-object v1, Lrm2;->D:Llf;

    .line 263
    .line 264
    :try_start_6
    invoke-virtual {p1, v1}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v3
    :try_end_6
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_6} :catch_6

    .line 268
    :catch_6
    if-nez v3, :cond_9

    .line 269
    .line 270
    new-instance p1, Ljava/lang/StringBuilder;

    .line 271
    .line 272
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p2

    .line 279
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 286
    .line 287
    .line 288
    move-result-object p2

    .line 289
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    iget-object p0, p0, Lnr;->b:Luk1;

    .line 297
    .line 298
    sget-object p2, Lrm2;->D:Llf;

    .line 299
    .line 300
    invoke-virtual {p0, p2, p1}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    :cond_9
    return-void

    .line 304
    nop

    .line 305
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b(Lty;)Lnr;
    .locals 3

    .line 1
    new-instance v0, Lnr;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lnr;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lpn;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v1, v2, v0, p0}, Lpn;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0, v1}, Lty;->a(Lpn;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method


# virtual methods
.method public a()Lvw1;
    .locals 1

    .line 1
    new-instance v0, Lww1;

    .line 2
    .line 3
    iget-object p0, p0, Lnr;->b:Luk1;

    .line 4
    .line 5
    invoke-static {p0}, Lnq1;->d(Lty;)Lnq1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, Lww1;-><init>(Lnq1;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Ljw0;->y(Ljw0;)V

    .line 13
    .line 14
    .line 15
    new-instance p0, Lvw1;

    .line 16
    .line 17
    invoke-direct {p0, v0}, Lwy2;-><init>(Lzy2;)V

    .line 18
    .line 19
    .line 20
    sget-object v0, Lvw1;->w:Lnt0;

    .line 21
    .line 22
    iput-object v0, p0, Lvw1;->p:Ljava/util/concurrent/Executor;

    .line 23
    .line 24
    return-object p0
.end method

.method public final m()Luk1;
    .locals 1

    .line 1
    iget v0, p0, Lnr;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lnr;->b:Luk1;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, Lnr;->b:Luk1;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    iget-object p0, p0, Lnr;->b:Luk1;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    const/4 p0, 0x0

    .line 16
    throw p0

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public o()Lzy2;
    .locals 1

    .line 1
    iget v0, p0, Lnr;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lnr;->b:Luk1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lww1;

    .line 9
    .line 10
    invoke-static {p0}, Lnq1;->d(Lty;)Lnq1;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-direct {v0, p0}, Lww1;-><init>(Lnq1;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    new-instance v0, Law0;

    .line 19
    .line 20
    invoke-static {p0}, Lnq1;->d(Lty;)Lnq1;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {v0, p0}, Law0;-><init>(Lnq1;)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_1
    new-instance v0, Ltv0;

    .line 29
    .line 30
    invoke-static {p0}, Lnq1;->d(Lty;)Lnq1;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {v0, p0}, Ltv0;-><init>(Lnq1;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
