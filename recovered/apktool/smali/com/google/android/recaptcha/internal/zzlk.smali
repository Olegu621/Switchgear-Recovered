.class final Lcom/google/android/recaptcha/internal/zzlk;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field zza:I

.field final synthetic zzb:Lcom/google/android/recaptcha/internal/zzly;

.field final synthetic zzc:Ljava/lang/String;

.field private synthetic zzd:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzly;Ljava/lang/String;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzlk;->zzb:Lcom/google/android/recaptcha/internal/zzly;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzlk;->zzc:Ljava/lang/String;

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
    new-instance v0, Lcom/google/android/recaptcha/internal/zzlk;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzlk;->zzb:Lcom/google/android/recaptcha/internal/zzly;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzlk;->zzc:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p2}, Lcom/google/android/recaptcha/internal/zzlk;-><init>(Lcom/google/android/recaptcha/internal/zzly;Ljava/lang/String;Lc10;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/google/android/recaptcha/internal/zzlk;->zzd:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 2
    .line 3
    check-cast p2, Lc10;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzlk;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/google/android/recaptcha/internal/zzlk;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/google/android/recaptcha/internal/zzlk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Lz10;->a:Lz10;

    .line 4
    .line 5
    iget v2, v1, Lcom/google/android/recaptcha/internal/zzlk;->zza:I

    .line 6
    .line 7
    const/4 v3, 0x5

    .line 8
    const/4 v4, 0x4

    .line 9
    const/4 v5, 0x3

    .line 10
    const/4 v6, 0x2

    .line 11
    const/4 v7, 0x1

    .line 12
    const/4 v8, 0x0

    .line 13
    if-eqz v2, :cond_5

    .line 14
    .line 15
    if-eq v2, v7, :cond_4

    .line 16
    .line 17
    if-eq v2, v6, :cond_3

    .line 18
    .line 19
    if-eq v2, v5, :cond_2

    .line 20
    .line 21
    if-eq v2, v4, :cond_1

    .line 22
    .line 23
    if-eq v2, v3, :cond_0

    .line 24
    .line 25
    :try_start_0
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    move-object/from16 v2, p1

    .line 29
    .line 30
    goto/16 :goto_5

    .line 31
    .line 32
    :catch_0
    move-exception v0

    .line 33
    goto/16 :goto_6

    .line 34
    .line 35
    :cond_0
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_1
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto/16 :goto_3

    .line 44
    .line 45
    :cond_2
    iget-object v2, v1, Lcom/google/android/recaptcha/internal/zzlk;->zzd:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, Lcom/google/android/recaptcha/internal/zzhk;

    .line 48
    .line 49
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object/from16 v6, p1

    .line 53
    .line 54
    goto/16 :goto_2

    .line 55
    .line 56
    :cond_3
    iget-object v2, v1, Lcom/google/android/recaptcha/internal/zzlk;->zzd:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, Lcom/google/android/recaptcha/internal/zzhk;

    .line 59
    .line 60
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object/from16 v6, p1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    iget-object v2, v1, Lcom/google/android/recaptcha/internal/zzlk;->zzd:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Lcom/google/android/recaptcha/internal/zzhk;

    .line 69
    .line 70
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move-object/from16 v7, p1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_5
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object v2, v1, Lcom/google/android/recaptcha/internal/zzlk;->zzd:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, Lcom/google/android/recaptcha/internal/zzhk;

    .line 82
    .line 83
    iget-object v9, v1, Lcom/google/android/recaptcha/internal/zzlk;->zzb:Lcom/google/android/recaptcha/internal/zzly;

    .line 84
    .line 85
    invoke-virtual {v9}, Lcom/google/android/recaptcha/internal/zzly;->zzn()Lcom/google/android/recaptcha/internal/zzdj;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    sget-object v10, Lcom/google/android/recaptcha/internal/zzmc;->zzd:Lcom/google/android/recaptcha/internal/zzmc;

    .line 90
    .line 91
    iput-object v2, v1, Lcom/google/android/recaptcha/internal/zzlk;->zzd:Ljava/lang/Object;

    .line 92
    .line 93
    iput v7, v1, Lcom/google/android/recaptcha/internal/zzlk;->zza:I

    .line 94
    .line 95
    invoke-virtual {v9, v10, v1}, Lcom/google/android/recaptcha/internal/zzdj;->zza(Ljava/lang/Object;Lc10;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    if-eq v7, v0, :cond_a

    .line 100
    .line 101
    :goto_0
    check-cast v7, Ljava/lang/Boolean;

    .line 102
    .line 103
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    if-eqz v7, :cond_6

    .line 108
    .line 109
    new-instance v9, Lcom/google/android/recaptcha/internal/zzcg;

    .line 110
    .line 111
    sget-object v10, Lcom/google/android/recaptcha/internal/zzce;->zzb:Lcom/google/android/recaptcha/internal/zzce;

    .line 112
    .line 113
    sget-object v11, Lcom/google/android/recaptcha/internal/zzcd;->zzay:Lcom/google/android/recaptcha/internal/zzcd;

    .line 114
    .line 115
    const/16 v14, 0xc

    .line 116
    .line 117
    const/4 v15, 0x0

    .line 118
    const/4 v12, 0x0

    .line 119
    const/4 v13, 0x0

    .line 120
    invoke-direct/range {v9 .. v15}, Lcom/google/android/recaptcha/internal/zzcg;-><init>(Lcom/google/android/recaptcha/internal/zzce;Lcom/google/android/recaptcha/internal/zzcd;Ljava/lang/String;Ljava/lang/Exception;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 121
    .line 122
    .line 123
    sget-object v0, Lo42;->b:Lm42;

    .line 124
    .line 125
    new-instance v0, Ln42;

    .line 126
    .line 127
    invoke-direct {v0, v9}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    new-instance v1, Lo42;

    .line 131
    .line 132
    invoke-direct {v1, v0}, Lo42;-><init>(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    return-object v1

    .line 136
    :cond_6
    iget-object v7, v1, Lcom/google/android/recaptcha/internal/zzlk;->zzb:Lcom/google/android/recaptcha/internal/zzly;

    .line 137
    .line 138
    invoke-virtual {v7}, Lcom/google/android/recaptcha/internal/zzly;->zzn()Lcom/google/android/recaptcha/internal/zzdj;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    sget-object v9, Lcom/google/android/recaptcha/internal/zzmc;->zzc:Lcom/google/android/recaptcha/internal/zzmc;

    .line 143
    .line 144
    iput-object v2, v1, Lcom/google/android/recaptcha/internal/zzlk;->zzd:Ljava/lang/Object;

    .line 145
    .line 146
    iput v6, v1, Lcom/google/android/recaptcha/internal/zzlk;->zza:I

    .line 147
    .line 148
    invoke-virtual {v7, v9, v1}, Lcom/google/android/recaptcha/internal/zzdj;->zza(Ljava/lang/Object;Lc10;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    if-eq v6, v0, :cond_a

    .line 153
    .line 154
    :goto_1
    check-cast v6, Ljava/lang/Boolean;

    .line 155
    .line 156
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    if-nez v6, :cond_7

    .line 161
    .line 162
    iget-object v6, v1, Lcom/google/android/recaptcha/internal/zzlk;->zzb:Lcom/google/android/recaptcha/internal/zzly;

    .line 163
    .line 164
    iput-object v2, v1, Lcom/google/android/recaptcha/internal/zzlk;->zzd:Ljava/lang/Object;

    .line 165
    .line 166
    iput v5, v1, Lcom/google/android/recaptcha/internal/zzlk;->zza:I

    .line 167
    .line 168
    invoke-static {v6, v1}, Lcom/google/android/recaptcha/internal/zzly;->zzu(Lcom/google/android/recaptcha/internal/zzly;Lc10;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    if-eq v6, v0, :cond_a

    .line 173
    .line 174
    :goto_2
    check-cast v6, Lcom/google/android/recaptcha/internal/zzhg;

    .line 175
    .line 176
    iput-object v8, v1, Lcom/google/android/recaptcha/internal/zzlk;->zzd:Ljava/lang/Object;

    .line 177
    .line 178
    iput v4, v1, Lcom/google/android/recaptcha/internal/zzlk;->zza:I

    .line 179
    .line 180
    invoke-virtual {v6, v2, v1}, Lcom/google/android/recaptcha/internal/zzhg;->zza(Lcom/google/android/recaptcha/internal/zzhk;Lc10;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    if-eq v2, v0, :cond_a

    .line 185
    .line 186
    :cond_7
    :goto_3
    :try_start_1
    iget-object v2, v1, Lcom/google/android/recaptcha/internal/zzlk;->zzb:Lcom/google/android/recaptcha/internal/zzly;

    .line 187
    .line 188
    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzly;->zzz()Ljx;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    iput-object v8, v1, Lcom/google/android/recaptcha/internal/zzlk;->zzd:Ljava/lang/Object;

    .line 193
    .line 194
    iput v3, v1, Lcom/google/android/recaptcha/internal/zzlk;->zza:I

    .line 195
    .line 196
    check-cast v2, Lkx;

    .line 197
    .line 198
    invoke-virtual {v2, v1}, Lz01;->i(Lc10;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    if-eq v2, v0, :cond_a

    .line 203
    .line 204
    :goto_4
    new-instance v2, Lkx;

    .line 205
    .line 206
    invoke-direct {v2}, Lkx;-><init>()V

    .line 207
    .line 208
    .line 209
    iget-object v3, v1, Lcom/google/android/recaptcha/internal/zzlk;->zzb:Lcom/google/android/recaptcha/internal/zzly;

    .line 210
    .line 211
    invoke-static {v3}, Lcom/google/android/recaptcha/internal/zzly;->zzy(Lcom/google/android/recaptcha/internal/zzly;)Ljava/util/Map;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    iget-object v6, v1, Lcom/google/android/recaptcha/internal/zzlk;->zzc:Ljava/lang/String;

    .line 216
    .line 217
    invoke-interface {v4, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzzf;->zzf()Lcom/google/android/recaptcha/internal/zzze;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    invoke-virtual {v4, v6}, Lcom/google/android/recaptcha/internal/zzze;->zze(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzze;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4}, Lcom/google/android/recaptcha/internal/zzsh;->zzi()Lcom/google/android/recaptcha/internal/zzsn;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    check-cast v4, Lcom/google/android/recaptcha/internal/zzzf;

    .line 232
    .line 233
    invoke-virtual {v4}, Lcom/google/android/recaptcha/internal/zzpw;->zzd()[B

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzpp;->zzh()Lcom/google/android/recaptcha/internal/zzpp;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    array-length v7, v4

    .line 242
    const/4 v9, 0x0

    .line 243
    invoke-virtual {v6, v4, v9, v7}, Lcom/google/android/recaptcha/internal/zzpp;->zzi([BII)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    invoke-static {v3}, Lcom/google/android/recaptcha/internal/zzly;->zzl(Lcom/google/android/recaptcha/internal/zzly;)Lcom/google/android/recaptcha/internal/zzcr;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    invoke-interface {v6}, Lcom/google/android/recaptcha/internal/zzcr;->zzb()Ly10;

    .line 252
    .line 253
    .line 254
    move-result-object v6

    .line 255
    new-instance v7, Lcom/google/android/recaptcha/internal/zzlj;

    .line 256
    .line 257
    invoke-direct {v7, v3, v4, v8}, Lcom/google/android/recaptcha/internal/zzlj;-><init>(Lcom/google/android/recaptcha/internal/zzly;Ljava/lang/String;Lc10;)V

    .line 258
    .line 259
    .line 260
    invoke-static {v6, v8, v7, v5}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 261
    .line 262
    .line 263
    const/4 v3, 0x6

    .line 264
    iput v3, v1, Lcom/google/android/recaptcha/internal/zzlk;->zza:I

    .line 265
    .line 266
    invoke-virtual {v2, v1}, Lz01;->i(Lc10;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    if-ne v2, v0, :cond_8

    .line 271
    .line 272
    goto :goto_8

    .line 273
    :cond_8
    :goto_5
    check-cast v2, Lcom/google/android/recaptcha/internal/zzxx;

    .line 274
    .line 275
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzxx;->zzf()Lcom/google/android/recaptcha/internal/zzxw;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    iget-object v3, v1, Lcom/google/android/recaptcha/internal/zzlk;->zzc:Ljava/lang/String;

    .line 280
    .line 281
    invoke-virtual {v0, v3}, Lcom/google/android/recaptcha/internal/zzxw;->zze(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzxw;

    .line 282
    .line 283
    .line 284
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzyb;->zzf()Lcom/google/android/recaptcha/internal/zzya;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzxx;->zzl()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    invoke-virtual {v3, v4}, Lcom/google/android/recaptcha/internal/zzya;->zze(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzya;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0, v3}, Lcom/google/android/recaptcha/internal/zzxw;->zzr(Lcom/google/android/recaptcha/internal/zzya;)Lcom/google/android/recaptcha/internal/zzxw;

    .line 296
    .line 297
    .line 298
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzxz;->zzf()Lcom/google/android/recaptcha/internal/zzxy;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzxx;->zzj()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    invoke-virtual {v3, v4}, Lcom/google/android/recaptcha/internal/zzxy;->zze(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzxy;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzxx;->zzM()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-virtual {v3, v2}, Lcom/google/android/recaptcha/internal/zzxy;->zzf(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzxy;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0, v3}, Lcom/google/android/recaptcha/internal/zzxw;->zzs(Lcom/google/android/recaptcha/internal/zzxy;)Lcom/google/android/recaptcha/internal/zzxw;

    .line 317
    .line 318
    .line 319
    sget-object v2, Lo42;->b:Lm42;

    .line 320
    .line 321
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzsh;->zzi()Lcom/google/android/recaptcha/internal/zzsn;

    .line 322
    .line 323
    .line 324
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 325
    goto :goto_7

    .line 326
    :goto_6
    new-instance v2, Lcom/google/android/recaptcha/internal/zzcg;

    .line 327
    .line 328
    sget-object v3, Lcom/google/android/recaptcha/internal/zzce;->zzb:Lcom/google/android/recaptcha/internal/zzce;

    .line 329
    .line 330
    sget-object v4, Lcom/google/android/recaptcha/internal/zzcd;->zzW:Lcom/google/android/recaptcha/internal/zzcd;

    .line 331
    .line 332
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v5

    .line 336
    const/16 v7, 0x8

    .line 337
    .line 338
    const/4 v8, 0x0

    .line 339
    const/4 v6, 0x0

    .line 340
    invoke-direct/range {v2 .. v8}, Lcom/google/android/recaptcha/internal/zzcg;-><init>(Lcom/google/android/recaptcha/internal/zzce;Lcom/google/android/recaptcha/internal/zzcd;Ljava/lang/String;Ljava/lang/Exception;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 341
    .line 342
    .line 343
    invoke-static {v0, v2}, Lcom/google/android/recaptcha/internal/zzh;->zza(Ljava/lang/Exception;Lcom/google/android/recaptcha/internal/zzcg;)Lcom/google/android/recaptcha/internal/zzcg;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    iget-object v2, v1, Lcom/google/android/recaptcha/internal/zzlk;->zzb:Lcom/google/android/recaptcha/internal/zzly;

    .line 348
    .line 349
    iget-object v1, v1, Lcom/google/android/recaptcha/internal/zzlk;->zzc:Ljava/lang/String;

    .line 350
    .line 351
    invoke-static {v2}, Lcom/google/android/recaptcha/internal/zzly;->zzy(Lcom/google/android/recaptcha/internal/zzly;)Ljava/util/Map;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    check-cast v1, Ljx;

    .line 360
    .line 361
    if-eqz v1, :cond_9

    .line 362
    .line 363
    check-cast v1, Lkx;

    .line 364
    .line 365
    invoke-virtual {v1, v0}, Lkx;->U(Ljava/lang/Throwable;)Z

    .line 366
    .line 367
    .line 368
    :cond_9
    sget-object v1, Lo42;->b:Lm42;

    .line 369
    .line 370
    invoke-static {v0}, Lpg3;->e(Ljava/lang/Throwable;)Ln42;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    :goto_7
    new-instance v1, Lo42;

    .line 375
    .line 376
    invoke-direct {v1, v0}, Lo42;-><init>(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    return-object v1

    .line 380
    :cond_a
    :goto_8
    return-object v0
.end method
