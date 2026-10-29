.class final Lcom/google/android/recaptcha/internal/zzfq;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field zza:Ljava/lang/Object;

.field zzb:D

.field zzc:I

.field final synthetic zzd:Lcom/google/android/recaptcha/internal/zzgb;

.field final synthetic zze:J

.field final synthetic zzf:Ljava/lang/String;

.field final synthetic zzg:Lcom/google/android/recaptcha/RecaptchaAction;

.field private synthetic zzh:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzgb;JLjava/lang/String;Lcom/google/android/recaptcha/RecaptchaAction;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzd:Lcom/google/android/recaptcha/internal/zzgb;

    .line 2
    .line 3
    iput-wide p2, p0, Lcom/google/android/recaptcha/internal/zzfq;->zze:J

    .line 4
    .line 5
    iput-object p4, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzf:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p5, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzg:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p6}, Ltj2;-><init>(ILc10;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 7

    .line 1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzfq;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzd:Lcom/google/android/recaptcha/internal/zzgb;

    .line 4
    .line 5
    iget-wide v2, p0, Lcom/google/android/recaptcha/internal/zzfq;->zze:J

    .line 6
    .line 7
    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzf:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v5, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzg:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 10
    .line 11
    move-object v6, p2

    .line 12
    invoke-direct/range {v0 .. v6}, Lcom/google/android/recaptcha/internal/zzfq;-><init>(Lcom/google/android/recaptcha/internal/zzgb;JLjava/lang/String;Lcom/google/android/recaptcha/RecaptchaAction;Lc10;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lcom/google/android/recaptcha/internal/zzfq;->zzh:Ljava/lang/Object;

    .line 16
    .line 17
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
    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzfq;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/google/android/recaptcha/internal/zzfq;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/google/android/recaptcha/internal/zzfq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzc:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzh:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lcom/google/android/recaptcha/internal/zzyg;

    .line 12
    .line 13
    :try_start_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/android/recaptcha/internal/zzcg; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    goto/16 :goto_7

    .line 17
    .line 18
    :pswitch_0
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzfq;->zza:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 21
    .line 22
    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzh:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Lcom/google/android/recaptcha/internal/zzyg;

    .line 25
    .line 26
    :try_start_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/android/recaptcha/internal/zzcg; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 27
    .line 28
    .line 29
    move-object v10, v3

    .line 30
    move-object v3, p1

    .line 31
    move-object p1, v10

    .line 32
    goto/16 :goto_6

    .line 33
    .line 34
    :pswitch_1
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzh:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 37
    .line 38
    :try_start_2
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_2
    .catch Lcom/google/android/recaptcha/internal/zzcg; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 39
    .line 40
    .line 41
    goto/16 :goto_5

    .line 42
    .line 43
    :pswitch_2
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzfq;->zza:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 46
    .line 47
    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzh:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, Lcom/google/android/recaptcha/internal/zzhk;

    .line 50
    .line 51
    :try_start_3
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_3
    .catch Lcom/google/android/recaptcha/internal/zzcg; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 52
    .line 53
    .line 54
    goto/16 :goto_4

    .line 55
    .line 56
    :pswitch_3
    iget-wide v3, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzb:D

    .line 57
    .line 58
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzh:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 61
    .line 62
    :try_start_4
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_4
    .catch Lcom/google/android/recaptcha/internal/zzcg; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 63
    .line 64
    .line 65
    goto/16 :goto_3

    .line 66
    .line 67
    :pswitch_4
    iget-wide v3, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzb:D

    .line 68
    .line 69
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzfq;->zza:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 72
    .line 73
    iget-object v5, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzh:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v5, Lcom/google/android/recaptcha/internal/zzhk;

    .line 76
    .line 77
    :try_start_5
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_5
    .catch Lcom/google/android/recaptcha/internal/zzcg; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 78
    .line 79
    .line 80
    goto/16 :goto_2

    .line 81
    .line 82
    :pswitch_5
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzh:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 85
    .line 86
    :try_start_6
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_6
    .catch Lcom/google/android/recaptcha/internal/zzcg; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :pswitch_6
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzfq;->zza:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 93
    .line 94
    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzh:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v3, Lcom/google/android/recaptcha/internal/zzhk;

    .line 97
    .line 98
    :try_start_7
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_7
    .catch Lcom/google/android/recaptcha/internal/zzcg; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :pswitch_7
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzh:Ljava/lang/Object;

    .line 106
    .line 107
    move-object v1, p1

    .line 108
    check-cast v1, Lcom/google/android/recaptcha/internal/zzhk;

    .line 109
    .line 110
    :try_start_8
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzd:Lcom/google/android/recaptcha/internal/zzgb;

    .line 111
    .line 112
    iget-wide v3, p0, Lcom/google/android/recaptcha/internal/zzfq;->zze:J

    .line 113
    .line 114
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzh:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzfq;->zza:Ljava/lang/Object;

    .line 117
    .line 118
    const/4 v5, 0x1

    .line 119
    iput v5, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzc:I

    .line 120
    .line 121
    new-instance v5, Lcom/google/android/recaptcha/internal/zzfu;

    .line 122
    .line 123
    invoke-direct {v5, p1, v3, v4, v2}, Lcom/google/android/recaptcha/internal/zzfu;-><init>(Lcom/google/android/recaptcha/internal/zzgb;JLc10;)V

    .line 124
    .line 125
    .line 126
    new-instance p1, Lcom/google/android/recaptcha/internal/zzhg;

    .line 127
    .line 128
    invoke-direct {p1, v5}, Lcom/google/android/recaptcha/internal/zzhg;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 129
    .line 130
    .line 131
    if-eq p1, v0, :cond_1

    .line 132
    .line 133
    move-object v3, v1

    .line 134
    :goto_0
    check-cast p1, Lcom/google/android/recaptcha/internal/zzhg;

    .line 135
    .line 136
    iput-object v3, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzh:Ljava/lang/Object;

    .line 137
    .line 138
    iput-object v2, p0, Lcom/google/android/recaptcha/internal/zzfq;->zza:Ljava/lang/Object;

    .line 139
    .line 140
    const/4 v4, 0x2

    .line 141
    iput v4, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzc:I

    .line 142
    .line 143
    invoke-virtual {p1, v1, p0}, Lcom/google/android/recaptcha/internal/zzhg;->zza(Lcom/google/android/recaptcha/internal/zzhk;Lc10;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    if-eq p1, v0, :cond_1

    .line 148
    .line 149
    move-object v1, v3

    .line 150
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 153
    .line 154
    .line 155
    move-result-wide v3

    .line 156
    long-to-double v3, v3

    .line 157
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzd:Lcom/google/android/recaptcha/internal/zzgb;

    .line 158
    .line 159
    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzgb;->zzf(Lcom/google/android/recaptcha/internal/zzgb;)Lcom/google/android/recaptcha/internal/zzfp;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    iget-object v5, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzf:Ljava/lang/String;

    .line 164
    .line 165
    const-wide v6, 0x3fdccccccccccccdL    # 0.45

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    mul-double/2addr v6, v3

    .line 171
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzh:Ljava/lang/Object;

    .line 172
    .line 173
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzfq;->zza:Ljava/lang/Object;

    .line 174
    .line 175
    const-wide v8, 0x3fe199999999999aL    # 0.55

    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    mul-double/2addr v3, v8

    .line 181
    iput-wide v3, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzb:D

    .line 182
    .line 183
    const/4 v8, 0x3

    .line 184
    iput v8, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzc:I

    .line 185
    .line 186
    double-to-long v6, v6

    .line 187
    invoke-virtual {p1, v5, v6, v7, p0}, Lcom/google/android/recaptcha/internal/zzfp;->zzl(Ljava/lang/String;JLc10;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    if-eq p1, v0, :cond_1

    .line 192
    .line 193
    move-object v5, v1

    .line 194
    :goto_2
    check-cast p1, Lcom/google/android/recaptcha/internal/zzhf;

    .line 195
    .line 196
    iput-object v5, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzh:Ljava/lang/Object;

    .line 197
    .line 198
    iput-object v2, p0, Lcom/google/android/recaptcha/internal/zzfq;->zza:Ljava/lang/Object;

    .line 199
    .line 200
    iput-wide v3, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzb:D

    .line 201
    .line 202
    const/4 v6, 0x4

    .line 203
    iput v6, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzc:I

    .line 204
    .line 205
    invoke-virtual {p1, v1, p0}, Lcom/google/android/recaptcha/internal/zzhf;->zza(Lcom/google/android/recaptcha/internal/zzhk;Lc10;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    if-eq p1, v0, :cond_1

    .line 210
    .line 211
    move-object v1, v5

    .line 212
    :goto_3
    check-cast p1, Lcom/google/android/recaptcha/internal/zzxx;

    .line 213
    .line 214
    iget-object v5, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzd:Lcom/google/android/recaptcha/internal/zzgb;

    .line 215
    .line 216
    invoke-static {v5}, Lcom/google/android/recaptcha/internal/zzgb;->zzf(Lcom/google/android/recaptcha/internal/zzgb;)Lcom/google/android/recaptcha/internal/zzfp;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    iget-object v7, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzg:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 221
    .line 222
    invoke-static {v5}, Lcom/google/android/recaptcha/internal/zzgb;->zzg(Lcom/google/android/recaptcha/internal/zzgb;)Lcom/google/android/recaptcha/internal/zzxn;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    if-nez v8, :cond_0

    .line 227
    .line 228
    move-object v8, v2

    .line 229
    :cond_0
    invoke-virtual {v6, v7, p1, v8}, Lcom/google/android/recaptcha/internal/zzfp;->zzk(Lcom/google/android/recaptcha/RecaptchaAction;Lcom/google/android/recaptcha/internal/zzxx;Lcom/google/android/recaptcha/internal/zzxn;)Lcom/google/android/recaptcha/internal/zzye;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-static {v5}, Lcom/google/android/recaptcha/internal/zzgb;->zzf(Lcom/google/android/recaptcha/internal/zzgb;)Lcom/google/android/recaptcha/internal/zzfp;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    double-to-long v3, v3

    .line 238
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzh:Ljava/lang/Object;

    .line 239
    .line 240
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzfq;->zza:Ljava/lang/Object;

    .line 241
    .line 242
    const/4 v6, 0x5

    .line 243
    iput v6, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzc:I

    .line 244
    .line 245
    invoke-virtual {v5, p1, v3, v4, p0}, Lcom/google/android/recaptcha/internal/zzfp;->zzm(Lcom/google/android/recaptcha/internal/zzye;JLc10;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    if-eq p1, v0, :cond_1

    .line 250
    .line 251
    move-object v3, v1

    .line 252
    :goto_4
    check-cast p1, Lcom/google/android/recaptcha/internal/zzhf;

    .line 253
    .line 254
    iput-object v3, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzh:Ljava/lang/Object;

    .line 255
    .line 256
    iput-object v2, p0, Lcom/google/android/recaptcha/internal/zzfq;->zza:Ljava/lang/Object;

    .line 257
    .line 258
    const/4 v4, 0x6

    .line 259
    iput v4, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzc:I

    .line 260
    .line 261
    invoke-virtual {p1, v1, p0}, Lcom/google/android/recaptcha/internal/zzhf;->zza(Lcom/google/android/recaptcha/internal/zzhk;Lc10;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    if-eq p1, v0, :cond_1

    .line 266
    .line 267
    move-object v1, v3

    .line 268
    :goto_5
    check-cast p1, Lcom/google/android/recaptcha/internal/zzyg;

    .line 269
    .line 270
    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzd:Lcom/google/android/recaptcha/internal/zzgb;

    .line 271
    .line 272
    invoke-static {v3}, Lcom/google/android/recaptcha/internal/zzgb;->zzf(Lcom/google/android/recaptcha/internal/zzgb;)Lcom/google/android/recaptcha/internal/zzfp;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzh:Ljava/lang/Object;

    .line 277
    .line 278
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzfq;->zza:Ljava/lang/Object;

    .line 279
    .line 280
    const/4 v4, 0x7

    .line 281
    iput v4, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzc:I

    .line 282
    .line 283
    invoke-virtual {v3, p1, p0}, Lcom/google/android/recaptcha/internal/zzfp;->zzo(Lcom/google/android/recaptcha/internal/zzyg;Lc10;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    if-eq v3, v0, :cond_1

    .line 288
    .line 289
    :goto_6
    check-cast v3, Lcom/google/android/recaptcha/internal/zzhf;

    .line 290
    .line 291
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzh:Ljava/lang/Object;

    .line 292
    .line 293
    iput-object v2, p0, Lcom/google/android/recaptcha/internal/zzfq;->zza:Ljava/lang/Object;

    .line 294
    .line 295
    const/16 v2, 0x8

    .line 296
    .line 297
    iput v2, p0, Lcom/google/android/recaptcha/internal/zzfq;->zzc:I

    .line 298
    .line 299
    invoke-static {v1, v3, p0}, Lcom/google/android/recaptcha/internal/zzhj;->zzb(Lcom/google/android/recaptcha/internal/zzhk;Lcom/google/android/recaptcha/internal/zzhf;Lc10;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    if-eq p0, v0, :cond_1

    .line 304
    .line 305
    move-object p0, p1

    .line 306
    :goto_7
    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzyg;->zzj()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object p0
    :try_end_8
    .catch Lcom/google/android/recaptcha/internal/zzcg; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 310
    return-object p0

    .line 311
    :cond_1
    return-object v0

    .line 312
    :catch_0
    move-exception v0

    .line 313
    move-object p0, v0

    .line 314
    new-instance v0, Lcom/google/android/recaptcha/internal/zzcg;

    .line 315
    .line 316
    sget-object v1, Lcom/google/android/recaptcha/internal/zzce;->zzb:Lcom/google/android/recaptcha/internal/zzce;

    .line 317
    .line 318
    sget-object v2, Lcom/google/android/recaptcha/internal/zzcd;->zzaB:Lcom/google/android/recaptcha/internal/zzcd;

    .line 319
    .line 320
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    const/16 v5, 0x8

    .line 325
    .line 326
    const/4 v6, 0x0

    .line 327
    const/4 v4, 0x0

    .line 328
    invoke-direct/range {v0 .. v6}, Lcom/google/android/recaptcha/internal/zzcg;-><init>(Lcom/google/android/recaptcha/internal/zzce;Lcom/google/android/recaptcha/internal/zzcd;Ljava/lang/String;Ljava/lang/Exception;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 329
    .line 330
    .line 331
    throw v0

    .line 332
    :catch_1
    move-exception v0

    .line 333
    move-object p0, v0

    .line 334
    throw p0

    .line 335
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
