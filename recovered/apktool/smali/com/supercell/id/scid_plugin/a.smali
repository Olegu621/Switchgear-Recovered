.class public final Lcom/supercell/id/scid_plugin/a;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lcom/supercell/id/scid_plugin/MobileScanner;

.field public final synthetic c:Lmw0;


# direct methods
.method public constructor <init>(Lcom/supercell/id/scid_plugin/MobileScanner;Lmw0;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/supercell/id/scid_plugin/a;->b:Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/supercell/id/scid_plugin/a;->c:Lmw0;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Ltj2;-><init>(ILc10;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 2

    .line 1
    new-instance v0, Lcom/supercell/id/scid_plugin/a;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/supercell/id/scid_plugin/a;->b:Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/a;->c:Lmw0;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p2}, Lcom/supercell/id/scid_plugin/a;-><init>(Lcom/supercell/id/scid_plugin/MobileScanner;Lmw0;Lc10;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/supercell/id/scid_plugin/a;->a:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ly10;

    .line 2
    .line 3
    check-cast p2, Lc10;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/supercell/id/scid_plugin/a;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/supercell/id/scid_plugin/a;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/supercell/id/scid_plugin/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/supercell/id/scid_plugin/a;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ly10;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/supercell/id/scid_plugin/a;->b:Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 11
    .line 12
    invoke-static {v1}, Lcom/supercell/id/scid_plugin/MobileScanner;->access$getCamera$p(Lcom/supercell/id/scid_plugin/MobileScanner;)Lko;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Lko;->a()Lxp;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, Lxp;->a()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v0, v2

    .line 31
    :goto_0
    rem-int/lit16 v0, v0, 0xb4

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v0, v2

    .line 38
    :goto_1
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/a;->c:Lmw0;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-interface {p0}, Lmw0;->getWidth()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    invoke-interface {p0}, Lmw0;->getHeight()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    :goto_2
    if-eqz v0, :cond_3

    .line 52
    .line 53
    invoke-interface {p0}, Lmw0;->getHeight()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    goto :goto_3

    .line 58
    :cond_3
    invoke-interface {p0}, Lmw0;->getWidth()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    :goto_3
    new-instance v4, Landroid/util/Size;

    .line 63
    .line 64
    invoke-direct {v4, v3, v0}, Landroid/util/Size;-><init>(II)V

    .line 65
    .line 66
    .line 67
    invoke-static {v1}, Lcom/supercell/id/scid_plugin/MobileScanner;->access$getViewFinderSize$p(Lcom/supercell/id/scid_plugin/MobileScanner;)Landroid/util/Size;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v1}, Lcom/supercell/id/scid_plugin/MobileScanner;->access$getScanWindowSize$p(Lcom/supercell/id/scid_plugin/MobileScanner;)Landroid/util/Size;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v1, v4, v0, v3}, Lcom/supercell/id/scid_plugin/MobileScanner;->calculateAdjustedScanSize(Landroid/util/Size;Landroid/util/Size;Landroid/util/Size;)Lkotlin/Pair;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v3, Ljava/lang/Number;

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Ljava/lang/Number;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-interface {p0}, Lmw0;->getWidth()I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    invoke-interface {p0}, Lmw0;->getHeight()I

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    invoke-static {v0, v7}, Ljava/lang/Math;->min(II)I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    sub-int v4, v6, v3

    .line 112
    .line 113
    const/4 v12, 0x2

    .line 114
    div-int/2addr v4, v12

    .line 115
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    sub-int v4, v7, v0

    .line 120
    .line 121
    div-int/2addr v4, v12

    .line 122
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    add-int/2addr v3, v8

    .line 127
    invoke-static {v6, v3}, Ljava/lang/Math;->min(II)I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    add-int/2addr v0, v9

    .line 132
    invoke-static {v7, v0}, Ljava/lang/Math;->min(II)I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    sub-int v10, v3, v8

    .line 137
    .line 138
    sub-int v11, v0, v9

    .line 139
    .line 140
    sget-object v0, Lcom/supercell/id/scid_plugin/ConversionUtils;->Companion:Lcom/supercell/id/scid_plugin/ConversionUtils$Companion;

    .line 141
    .line 142
    invoke-interface {p0}, Lmw0;->j()[Llw0;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v3, v6, v7}, Lcom/supercell/id/scid_plugin/ConversionUtils$Companion;->YUV_420_888toNV21([Llw0;II)[B

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    new-instance v4, Lcs1;

    .line 154
    .line 155
    invoke-direct/range {v4 .. v11}, Lcs1;-><init>([BIIIIII)V

    .line 156
    .line 157
    .line 158
    const/4 v3, 0x5

    .line 159
    const/4 v5, 0x0

    .line 160
    :try_start_0
    invoke-static {v1}, Lcom/supercell/id/scid_plugin/MobileScanner;->access$getReader$p(Lcom/supercell/id/scid_plugin/MobileScanner;)La02;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    .line 166
    .line 167
    const/16 v0, 0xa

    .line 168
    .line 169
    :try_start_1
    invoke-static {v1}, Lcom/supercell/id/scid_plugin/MobileScanner;->access$getReader$p(Lcom/supercell/id/scid_plugin/MobileScanner;)La02;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    new-instance v7, Lcb;

    .line 174
    .line 175
    new-instance v8, Lra2;

    .line 176
    .line 177
    invoke-direct {v8, v4}, Lra2;-><init>(Lva1;)V

    .line 178
    .line 179
    .line 180
    invoke-direct {v7, v8, v0}, Lcb;-><init>(Ljava/lang/Object;I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v6, v7}, La02;->a(Lcb;)Lwc0;

    .line 184
    .line 185
    .line 186
    move-result-object v0
    :try_end_1
    .catch Lun1; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 187
    goto :goto_4

    .line 188
    :catchall_0
    move-exception v0

    .line 189
    goto :goto_8

    .line 190
    :catch_0
    move-exception v0

    .line 191
    goto :goto_6

    .line 192
    :catch_1
    :try_start_2
    invoke-static {v1}, Lcom/supercell/id/scid_plugin/MobileScanner;->access$getReader$p(Lcom/supercell/id/scid_plugin/MobileScanner;)La02;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    new-instance v7, Lcb;

    .line 197
    .line 198
    new-instance v8, Lra2;

    .line 199
    .line 200
    new-instance v9, Lsz0;

    .line 201
    .line 202
    invoke-direct {v9, v4}, Lsz0;-><init>(Lcs1;)V

    .line 203
    .line 204
    .line 205
    invoke-direct {v8, v9}, Lra2;-><init>(Lva1;)V

    .line 206
    .line 207
    .line 208
    invoke-direct {v7, v8, v0}, Lcb;-><init>(Ljava/lang/Object;I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v6, v7}, La02;->a(Lcb;)Lwc0;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    :goto_4
    iget-object v0, v0, Lwc0;->b:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v0, Ljava/lang/String;

    .line 218
    .line 219
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    if-lez v4, :cond_4

    .line 227
    .line 228
    invoke-virtual {v1, v2}, Lcom/supercell/id/scid_plugin/MobileScanner;->setScanCode(Z)V

    .line 229
    .line 230
    .line 231
    sget-object v2, Lz80;->a:Lm60;

    .line 232
    .line 233
    sget-object v2, Lgb1;->a:Lkt0;

    .line 234
    .line 235
    new-instance v4, Lqh;

    .line 236
    .line 237
    const/4 v6, 0x7

    .line 238
    invoke-direct {v4, v1, v0, v5, v6}, Lqh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 239
    .line 240
    .line 241
    invoke-static {p1, v2, v4, v12}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 242
    .line 243
    .line 244
    :cond_4
    sget-object v0, Lz80;->a:Lm60;

    .line 245
    .line 246
    sget-object v0, Lgb1;->a:Lkt0;

    .line 247
    .line 248
    new-instance v1, Lmj;

    .line 249
    .line 250
    invoke-direct {v1, p0, v5, v3}, Lmj;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 251
    .line 252
    .line 253
    :goto_5
    invoke-static {p1, v0, v1, v12}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 254
    .line 255
    .line 256
    goto :goto_7

    .line 257
    :goto_6
    :try_start_3
    instance-of v2, v0, Lun1;

    .line 258
    .line 259
    if-nez v2, :cond_5

    .line 260
    .line 261
    instance-of v2, v0, Lxt;

    .line 262
    .line 263
    if-nez v2, :cond_5

    .line 264
    .line 265
    instance-of v2, v0, Lyl0;

    .line 266
    .line 267
    if-nez v2, :cond_5

    .line 268
    .line 269
    sget-object v2, Lz80;->a:Lm60;

    .line 270
    .line 271
    sget-object v2, Lgb1;->a:Lkt0;

    .line 272
    .line 273
    new-instance v4, Lqh;

    .line 274
    .line 275
    const/16 v6, 0x9

    .line 276
    .line 277
    invoke-direct {v4, v1, v0, v5, v6}, Lqh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 278
    .line 279
    .line 280
    invoke-static {p1, v2, v4, v12}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 281
    .line 282
    .line 283
    :cond_5
    sget-object v0, Lz80;->a:Lm60;

    .line 284
    .line 285
    sget-object v0, Lgb1;->a:Lkt0;

    .line 286
    .line 287
    new-instance v1, Lmj;

    .line 288
    .line 289
    invoke-direct {v1, p0, v5, v3}, Lmj;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 290
    .line 291
    .line 292
    goto :goto_5

    .line 293
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 294
    .line 295
    return-object p0

    .line 296
    :goto_8
    sget-object v1, Lz80;->a:Lm60;

    .line 297
    .line 298
    sget-object v1, Lgb1;->a:Lkt0;

    .line 299
    .line 300
    new-instance v2, Lmj;

    .line 301
    .line 302
    invoke-direct {v2, p0, v5, v3}, Lmj;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 303
    .line 304
    .line 305
    invoke-static {p1, v1, v2, v12}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 306
    .line 307
    .line 308
    throw v0
.end method
