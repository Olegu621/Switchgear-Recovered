.class public final Ltc3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ltc3;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static a(Lcom/google/android/gms/games/stats/PlayerStatsEntity;Landroid/os/Parcel;)V
    .locals 5

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {v0, p1}, Lw11;->c0(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lcom/google/android/gms/games/stats/PlayerStatsEntity;->a:F

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x4

    .line 11
    invoke-static {p1, v2, v3}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeFloat(F)V

    .line 15
    .line 16
    .line 17
    iget v1, p0, Lcom/google/android/gms/games/stats/PlayerStatsEntity;->b:F

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-static {p1, v2, v3}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeFloat(F)V

    .line 24
    .line 25
    .line 26
    iget v1, p0, Lcom/google/android/gms/games/stats/PlayerStatsEntity;->c:I

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-static {p1, v2, v3}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 33
    .line 34
    .line 35
    iget v1, p0, Lcom/google/android/gms/games/stats/PlayerStatsEntity;->d:I

    .line 36
    .line 37
    invoke-static {p1, v3, v3}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 41
    .line 42
    .line 43
    iget v1, p0, Lcom/google/android/gms/games/stats/PlayerStatsEntity;->e:I

    .line 44
    .line 45
    const/4 v2, 0x5

    .line 46
    invoke-static {p1, v2, v3}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 50
    .line 51
    .line 52
    iget v1, p0, Lcom/google/android/gms/games/stats/PlayerStatsEntity;->f:F

    .line 53
    .line 54
    const/4 v2, 0x6

    .line 55
    invoke-static {p1, v2, v3}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeFloat(F)V

    .line 59
    .line 60
    .line 61
    iget v1, p0, Lcom/google/android/gms/games/stats/PlayerStatsEntity;->i:F

    .line 62
    .line 63
    const/4 v2, 0x7

    .line 64
    invoke-static {p1, v2, v3}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeFloat(F)V

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, Lcom/google/android/gms/games/stats/PlayerStatsEntity;->v:Landroid/os/Bundle;

    .line 71
    .line 72
    const/4 v2, 0x0

    .line 73
    const/16 v4, 0x8

    .line 74
    .line 75
    invoke-static {p1, v4, v1, v2}, Lw11;->L(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    .line 76
    .line 77
    .line 78
    iget v1, p0, Lcom/google/android/gms/games/stats/PlayerStatsEntity;->w:F

    .line 79
    .line 80
    const/16 v2, 0x9

    .line 81
    .line 82
    invoke-static {p1, v2, v3}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeFloat(F)V

    .line 86
    .line 87
    .line 88
    iget v1, p0, Lcom/google/android/gms/games/stats/PlayerStatsEntity;->U:F

    .line 89
    .line 90
    const/16 v2, 0xa

    .line 91
    .line 92
    invoke-static {p1, v2, v3}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeFloat(F)V

    .line 96
    .line 97
    .line 98
    iget p0, p0, Lcom/google/android/gms/games/stats/PlayerStatsEntity;->V:F

    .line 99
    .line 100
    const/16 v1, 0xb

    .line 101
    .line 102
    invoke-static {p1, v1, v3}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 106
    .line 107
    .line 108
    invoke-static {v0, p1}, Lw11;->f0(ILandroid/os/Parcel;)V

    .line 109
    .line 110
    .line 111
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Ltc3;->a:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x5

    .line 9
    const/4 v4, 0x4

    .line 10
    const-wide/16 v5, 0x0

    .line 11
    .line 12
    const/4 v7, 0x3

    .line 13
    const/4 v8, 0x2

    .line 14
    const/4 v9, 0x1

    .line 15
    const/4 v10, 0x0

    .line 16
    const/4 v11, 0x0

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    move-object v2, v11

    .line 25
    move-object v3, v2

    .line 26
    move-object v4, v3

    .line 27
    move-object v5, v4

    .line 28
    move-object v6, v5

    .line 29
    move-object v7, v6

    .line 30
    move-object v8, v7

    .line 31
    move-object v9, v8

    .line 32
    move-object v10, v9

    .line 33
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 34
    .line 35
    .line 36
    move-result v11

    .line 37
    if-ge v11, v0, :cond_0

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 40
    .line 41
    .line 42
    move-result v11

    .line 43
    int-to-char v12, v11

    .line 44
    packed-switch v12, :pswitch_data_1

    .line 45
    .line 46
    .line 47
    invoke-static {v11, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_0
    invoke-static {v11, v1}, Lqj3;->G(ILandroid/os/Parcel;)Ljava/lang/Long;

    .line 52
    .line 53
    .line 54
    move-result-object v10

    .line 55
    goto :goto_0

    .line 56
    :pswitch_1
    sget-object v9, Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensions;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 57
    .line 58
    invoke-static {v1, v11, v9}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    check-cast v9, Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensions;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :pswitch_2
    invoke-static {v11, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    goto :goto_0

    .line 70
    :pswitch_3
    sget-object v7, Lcom/google/android/gms/fido/fido2/api/common/TokenBinding;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 71
    .line 72
    invoke-static {v1, v11, v7}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    check-cast v7, Lcom/google/android/gms/fido/fido2/api/common/TokenBinding;

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :pswitch_4
    invoke-static {v11, v1}, Lqj3;->E(ILandroid/os/Parcel;)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    goto :goto_0

    .line 84
    :pswitch_5
    sget-object v5, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialDescriptor;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 85
    .line 86
    invoke-static {v1, v11, v5}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    goto :goto_0

    .line 91
    :pswitch_6
    invoke-static {v11, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    goto :goto_0

    .line 96
    :pswitch_7
    invoke-static {v11, v1}, Lqj3;->A(ILandroid/os/Parcel;)Ljava/lang/Double;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    goto :goto_0

    .line 101
    :pswitch_8
    invoke-static {v11, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    goto :goto_0

    .line 106
    :cond_0
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 107
    .line 108
    .line 109
    new-instance v1, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions;

    .line 110
    .line 111
    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions;-><init>([BLjava/lang/Double;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Integer;Lcom/google/android/gms/fido/fido2/api/common/TokenBinding;Ljava/lang/String;Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensions;Ljava/lang/Long;)V

    .line 112
    .line 113
    .line 114
    return-object v1

    .line 115
    :pswitch_9
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    move-object v2, v11

    .line 120
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-ge v3, v0, :cond_3

    .line 125
    .line 126
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    int-to-char v4, v3

    .line 131
    if-eq v4, v8, :cond_2

    .line 132
    .line 133
    if-eq v4, v7, :cond_1

    .line 134
    .line 135
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_1
    invoke-static {v3, v1}, Lqj3;->E(ILandroid/os/Parcel;)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    goto :goto_1

    .line 144
    :cond_2
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v11

    .line 148
    goto :goto_1

    .line 149
    :cond_3
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 150
    .line 151
    .line 152
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialParameters;

    .line 153
    .line 154
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    invoke-direct {v0, v11, v1}, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialParameters;-><init>(Ljava/lang/String;I)V

    .line 159
    .line 160
    .line 161
    return-object v0

    .line 162
    :pswitch_a
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    move-wide/from16 v16, v5

    .line 167
    .line 168
    move-wide/from16 v21, v16

    .line 169
    .line 170
    move-wide/from16 v24, v21

    .line 171
    .line 172
    move/from16 v18, v10

    .line 173
    .line 174
    move-object v13, v11

    .line 175
    move-object v14, v13

    .line 176
    move-object v15, v14

    .line 177
    move-object/from16 v19, v15

    .line 178
    .line 179
    move-object/from16 v20, v19

    .line 180
    .line 181
    move-object/from16 v23, v20

    .line 182
    .line 183
    move-object/from16 v26, v23

    .line 184
    .line 185
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-ge v2, v0, :cond_4

    .line 190
    .line 191
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    int-to-char v3, v2

    .line 196
    packed-switch v3, :pswitch_data_2

    .line 197
    .line 198
    .line 199
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 200
    .line 201
    .line 202
    goto :goto_2

    .line 203
    :pswitch_b
    sget-object v3, Lcom/google/android/gms/measurement/internal/zzbg;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 204
    .line 205
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 210
    .line 211
    move-object/from16 v26, v2

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :pswitch_c
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 215
    .line 216
    .line 217
    move-result-wide v2

    .line 218
    move-wide/from16 v24, v2

    .line 219
    .line 220
    goto :goto_2

    .line 221
    :pswitch_d
    sget-object v3, Lcom/google/android/gms/measurement/internal/zzbg;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 222
    .line 223
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 228
    .line 229
    move-object/from16 v23, v2

    .line 230
    .line 231
    goto :goto_2

    .line 232
    :pswitch_e
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 233
    .line 234
    .line 235
    move-result-wide v2

    .line 236
    move-wide/from16 v21, v2

    .line 237
    .line 238
    goto :goto_2

    .line 239
    :pswitch_f
    sget-object v3, Lcom/google/android/gms/measurement/internal/zzbg;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 240
    .line 241
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 246
    .line 247
    move-object/from16 v20, v2

    .line 248
    .line 249
    goto :goto_2

    .line 250
    :pswitch_10
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    move-object/from16 v19, v2

    .line 255
    .line 256
    goto :goto_2

    .line 257
    :pswitch_11
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    move/from16 v18, v2

    .line 262
    .line 263
    goto :goto_2

    .line 264
    :pswitch_12
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 265
    .line 266
    .line 267
    move-result-wide v2

    .line 268
    move-wide/from16 v16, v2

    .line 269
    .line 270
    goto :goto_2

    .line 271
    :pswitch_13
    sget-object v3, Lcom/google/android/gms/measurement/internal/zzpk;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 272
    .line 273
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzpk;

    .line 278
    .line 279
    move-object v15, v2

    .line 280
    goto :goto_2

    .line 281
    :pswitch_14
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    move-object v14, v2

    .line 286
    goto :goto_2

    .line 287
    :pswitch_15
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    move-object v13, v2

    .line 292
    goto :goto_2

    .line 293
    :cond_4
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 294
    .line 295
    .line 296
    new-instance v12, Lcom/google/android/gms/measurement/internal/zzah;

    .line 297
    .line 298
    invoke-direct/range {v12 .. v26}, Lcom/google/android/gms/measurement/internal/zzah;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzpk;JZLjava/lang/String;Lcom/google/android/gms/measurement/internal/zzbg;JLcom/google/android/gms/measurement/internal/zzbg;JLcom/google/android/gms/measurement/internal/zzbg;)V

    .line 299
    .line 300
    .line 301
    return-object v12

    .line 302
    :pswitch_16
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    move-object v2, v11

    .line 307
    move-object v3, v2

    .line 308
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    if-ge v5, v0, :cond_8

    .line 313
    .line 314
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 315
    .line 316
    .line 317
    move-result v5

    .line 318
    int-to-char v6, v5

    .line 319
    if-eq v6, v8, :cond_7

    .line 320
    .line 321
    if-eq v6, v7, :cond_6

    .line 322
    .line 323
    if-eq v6, v4, :cond_5

    .line 324
    .line 325
    invoke-static {v5, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 326
    .line 327
    .line 328
    goto :goto_3

    .line 329
    :cond_5
    sget-object v3, Lcom/google/android/gms/fido/common/Transport;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 330
    .line 331
    invoke-static {v1, v5, v3}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    goto :goto_3

    .line 336
    :cond_6
    invoke-static {v5, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    goto :goto_3

    .line 341
    :cond_7
    invoke-static {v5, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v11

    .line 345
    goto :goto_3

    .line 346
    :cond_8
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 347
    .line 348
    .line 349
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialDescriptor;

    .line 350
    .line 351
    invoke-direct {v0, v11, v2, v3}, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialDescriptor;-><init>(Ljava/lang/String;[BLjava/util/ArrayList;)V

    .line 352
    .line 353
    .line 354
    return-object v0

    .line 355
    :pswitch_17
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 356
    .line 357
    .line 358
    move-result v0

    .line 359
    move-wide v13, v5

    .line 360
    move-wide v15, v13

    .line 361
    move v12, v10

    .line 362
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    if-ge v2, v0, :cond_c

    .line 367
    .line 368
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    int-to-char v3, v2

    .line 373
    if-eq v3, v9, :cond_b

    .line 374
    .line 375
    if-eq v3, v8, :cond_a

    .line 376
    .line 377
    if-eq v3, v7, :cond_9

    .line 378
    .line 379
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 380
    .line 381
    .line 382
    goto :goto_4

    .line 383
    :cond_9
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 384
    .line 385
    .line 386
    move-result-wide v2

    .line 387
    move-wide v15, v2

    .line 388
    goto :goto_4

    .line 389
    :cond_a
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    move v12, v2

    .line 394
    goto :goto_4

    .line 395
    :cond_b
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 396
    .line 397
    .line 398
    move-result-wide v2

    .line 399
    move-wide v13, v2

    .line 400
    goto :goto_4

    .line 401
    :cond_c
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 402
    .line 403
    .line 404
    new-instance v11, Lcom/google/android/gms/measurement/internal/zzaf;

    .line 405
    .line 406
    invoke-direct/range {v11 .. v16}, Lcom/google/android/gms/measurement/internal/zzaf;-><init>(IJJ)V

    .line 407
    .line 408
    .line 409
    return-object v11

    .line 410
    :pswitch_18
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 411
    .line 412
    .line 413
    move-result v0

    .line 414
    move-object v2, v11

    .line 415
    move-object v3, v2

    .line 416
    move-object v4, v3

    .line 417
    move-object v5, v4

    .line 418
    move-object v6, v5

    .line 419
    move-object v7, v6

    .line 420
    move-object v8, v7

    .line 421
    move-object v9, v8

    .line 422
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 423
    .line 424
    .line 425
    move-result v10

    .line 426
    if-ge v10, v0, :cond_d

    .line 427
    .line 428
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 429
    .line 430
    .line 431
    move-result v10

    .line 432
    int-to-char v11, v10

    .line 433
    packed-switch v11, :pswitch_data_3

    .line 434
    .line 435
    .line 436
    invoke-static {v10, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 437
    .line 438
    .line 439
    goto :goto_5

    .line 440
    :pswitch_19
    invoke-static {v10, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v9

    .line 444
    goto :goto_5

    .line 445
    :pswitch_1a
    sget-object v8, Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsClientOutputs;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 446
    .line 447
    invoke-static {v1, v10, v8}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 448
    .line 449
    .line 450
    move-result-object v8

    .line 451
    check-cast v8, Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsClientOutputs;

    .line 452
    .line 453
    goto :goto_5

    .line 454
    :pswitch_1b
    sget-object v7, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorErrorResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 455
    .line 456
    invoke-static {v1, v10, v7}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 457
    .line 458
    .line 459
    move-result-object v7

    .line 460
    check-cast v7, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorErrorResponse;

    .line 461
    .line 462
    goto :goto_5

    .line 463
    :pswitch_1c
    sget-object v6, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAssertionResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 464
    .line 465
    invoke-static {v1, v10, v6}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 466
    .line 467
    .line 468
    move-result-object v6

    .line 469
    check-cast v6, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAssertionResponse;

    .line 470
    .line 471
    goto :goto_5

    .line 472
    :pswitch_1d
    sget-object v5, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 473
    .line 474
    invoke-static {v1, v10, v5}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 475
    .line 476
    .line 477
    move-result-object v5

    .line 478
    check-cast v5, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;

    .line 479
    .line 480
    goto :goto_5

    .line 481
    :pswitch_1e
    invoke-static {v10, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 482
    .line 483
    .line 484
    move-result-object v4

    .line 485
    goto :goto_5

    .line 486
    :pswitch_1f
    invoke-static {v10, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v3

    .line 490
    goto :goto_5

    .line 491
    :pswitch_20
    invoke-static {v10, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    goto :goto_5

    .line 496
    :cond_d
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 497
    .line 498
    .line 499
    new-instance v1, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;

    .line 500
    .line 501
    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;-><init>(Ljava/lang/String;Ljava/lang/String;[BLcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAssertionResponse;Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorErrorResponse;Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsClientOutputs;Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    return-object v1

    .line 505
    :pswitch_21
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 506
    .line 507
    .line 508
    move-result v0

    .line 509
    move v12, v10

    .line 510
    move v13, v12

    .line 511
    move v14, v13

    .line 512
    move v15, v14

    .line 513
    move/from16 v16, v15

    .line 514
    .line 515
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 516
    .line 517
    .line 518
    move-result v2

    .line 519
    if-ge v2, v0, :cond_13

    .line 520
    .line 521
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 522
    .line 523
    .line 524
    move-result v2

    .line 525
    int-to-char v5, v2

    .line 526
    if-eq v5, v9, :cond_12

    .line 527
    .line 528
    if-eq v5, v8, :cond_11

    .line 529
    .line 530
    if-eq v5, v7, :cond_10

    .line 531
    .line 532
    if-eq v5, v4, :cond_f

    .line 533
    .line 534
    if-eq v5, v3, :cond_e

    .line 535
    .line 536
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 537
    .line 538
    .line 539
    goto :goto_6

    .line 540
    :cond_e
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 541
    .line 542
    .line 543
    move-result v16

    .line 544
    goto :goto_6

    .line 545
    :cond_f
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 546
    .line 547
    .line 548
    move-result v15

    .line 549
    goto :goto_6

    .line 550
    :cond_10
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 551
    .line 552
    .line 553
    move-result v14

    .line 554
    goto :goto_6

    .line 555
    :cond_11
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 556
    .line 557
    .line 558
    move-result v13

    .line 559
    goto :goto_6

    .line 560
    :cond_12
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 561
    .line 562
    .line 563
    move-result v12

    .line 564
    goto :goto_6

    .line 565
    :cond_13
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 566
    .line 567
    .line 568
    new-instance v11, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;

    .line 569
    .line 570
    invoke-direct/range {v11 .. v16}, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;-><init>(IZZII)V

    .line 571
    .line 572
    .line 573
    return-object v11

    .line 574
    :pswitch_22
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 575
    .line 576
    .line 577
    move-result v0

    .line 578
    move-object v13, v11

    .line 579
    move-object v14, v13

    .line 580
    move-object v15, v14

    .line 581
    move-object/from16 v16, v15

    .line 582
    .line 583
    move-object/from16 v17, v16

    .line 584
    .line 585
    move-object/from16 v18, v17

    .line 586
    .line 587
    move-object/from16 v19, v18

    .line 588
    .line 589
    move-object/from16 v20, v19

    .line 590
    .line 591
    move-object/from16 v21, v20

    .line 592
    .line 593
    move-object/from16 v22, v21

    .line 594
    .line 595
    move-object/from16 v23, v22

    .line 596
    .line 597
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 598
    .line 599
    .line 600
    move-result v2

    .line 601
    if-ge v2, v0, :cond_14

    .line 602
    .line 603
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 604
    .line 605
    .line 606
    move-result v2

    .line 607
    int-to-char v3, v2

    .line 608
    packed-switch v3, :pswitch_data_4

    .line 609
    .line 610
    .line 611
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 612
    .line 613
    .line 614
    goto :goto_7

    .line 615
    :pswitch_23
    sget-object v3, Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensions;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 616
    .line 617
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    move-object/from16 v23, v2

    .line 622
    .line 623
    check-cast v23, Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensions;

    .line 624
    .line 625
    goto :goto_7

    .line 626
    :pswitch_24
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v22

    .line 630
    goto :goto_7

    .line 631
    :pswitch_25
    sget-object v3, Lcom/google/android/gms/fido/fido2/api/common/TokenBinding;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 632
    .line 633
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    move-object/from16 v21, v2

    .line 638
    .line 639
    check-cast v21, Lcom/google/android/gms/fido/fido2/api/common/TokenBinding;

    .line 640
    .line 641
    goto :goto_7

    .line 642
    :pswitch_26
    invoke-static {v2, v1}, Lqj3;->E(ILandroid/os/Parcel;)Ljava/lang/Integer;

    .line 643
    .line 644
    .line 645
    move-result-object v20

    .line 646
    goto :goto_7

    .line 647
    :pswitch_27
    sget-object v3, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorSelectionCriteria;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 648
    .line 649
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    move-object/from16 v19, v2

    .line 654
    .line 655
    check-cast v19, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorSelectionCriteria;

    .line 656
    .line 657
    goto :goto_7

    .line 658
    :pswitch_28
    sget-object v3, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialDescriptor;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 659
    .line 660
    invoke-static {v1, v2, v3}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 661
    .line 662
    .line 663
    move-result-object v18

    .line 664
    goto :goto_7

    .line 665
    :pswitch_29
    invoke-static {v2, v1}, Lqj3;->A(ILandroid/os/Parcel;)Ljava/lang/Double;

    .line 666
    .line 667
    .line 668
    move-result-object v17

    .line 669
    goto :goto_7

    .line 670
    :pswitch_2a
    sget-object v3, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialParameters;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 671
    .line 672
    invoke-static {v1, v2, v3}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 673
    .line 674
    .line 675
    move-result-object v16

    .line 676
    goto :goto_7

    .line 677
    :pswitch_2b
    invoke-static {v2, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 678
    .line 679
    .line 680
    move-result-object v15

    .line 681
    goto :goto_7

    .line 682
    :pswitch_2c
    sget-object v3, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialUserEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 683
    .line 684
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 685
    .line 686
    .line 687
    move-result-object v2

    .line 688
    move-object v14, v2

    .line 689
    check-cast v14, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialUserEntity;

    .line 690
    .line 691
    goto :goto_7

    .line 692
    :pswitch_2d
    sget-object v3, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRpEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 693
    .line 694
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 695
    .line 696
    .line 697
    move-result-object v2

    .line 698
    move-object v13, v2

    .line 699
    check-cast v13, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRpEntity;

    .line 700
    .line 701
    goto :goto_7

    .line 702
    :cond_14
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 703
    .line 704
    .line 705
    new-instance v12, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;

    .line 706
    .line 707
    invoke-direct/range {v12 .. v23}, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;-><init>(Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRpEntity;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialUserEntity;[BLjava/util/ArrayList;Ljava/lang/Double;Ljava/util/ArrayList;Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorSelectionCriteria;Ljava/lang/Integer;Lcom/google/android/gms/fido/fido2/api/common/TokenBinding;Ljava/lang/String;Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensions;)V

    .line 708
    .line 709
    .line 710
    return-object v12

    .line 711
    :pswitch_2e
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 712
    .line 713
    .line 714
    move-result v0

    .line 715
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 716
    .line 717
    .line 718
    move-result v2

    .line 719
    if-ge v2, v0, :cond_16

    .line 720
    .line 721
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 722
    .line 723
    .line 724
    move-result v2

    .line 725
    int-to-char v3, v2

    .line 726
    if-eq v3, v9, :cond_15

    .line 727
    .line 728
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 729
    .line 730
    .line 731
    goto :goto_8

    .line 732
    :cond_15
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v11

    .line 736
    goto :goto_8

    .line 737
    :cond_16
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 738
    .line 739
    .line 740
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/zzad;

    .line 741
    .line 742
    invoke-direct {v0, v11}, Lcom/google/android/gms/fido/fido2/api/common/zzad;-><init>(Ljava/lang/String;)V

    .line 743
    .line 744
    .line 745
    return-object v0

    .line 746
    :pswitch_2f
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 747
    .line 748
    .line 749
    move-result v0

    .line 750
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 751
    .line 752
    .line 753
    move-result v2

    .line 754
    if-ge v2, v0, :cond_18

    .line 755
    .line 756
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 757
    .line 758
    .line 759
    move-result v2

    .line 760
    int-to-char v3, v2

    .line 761
    if-eq v3, v9, :cond_17

    .line 762
    .line 763
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 764
    .line 765
    .line 766
    goto :goto_9

    .line 767
    :cond_17
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 768
    .line 769
    .line 770
    move-result v10

    .line 771
    goto :goto_9

    .line 772
    :cond_18
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 773
    .line 774
    .line 775
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/GoogleThirdPartyPaymentExtension;

    .line 776
    .line 777
    invoke-direct {v0, v10}, Lcom/google/android/gms/fido/fido2/api/common/GoogleThirdPartyPaymentExtension;-><init>(Z)V

    .line 778
    .line 779
    .line 780
    return-object v0

    .line 781
    :pswitch_30
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 782
    .line 783
    .line 784
    move-result v0

    .line 785
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 786
    .line 787
    .line 788
    move-result v2

    .line 789
    if-ge v2, v0, :cond_1a

    .line 790
    .line 791
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 792
    .line 793
    .line 794
    move-result v2

    .line 795
    int-to-char v3, v2

    .line 796
    if-eq v3, v9, :cond_19

    .line 797
    .line 798
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 799
    .line 800
    .line 801
    goto :goto_a

    .line 802
    :cond_19
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 803
    .line 804
    .line 805
    move-result v10

    .line 806
    goto :goto_a

    .line 807
    :cond_1a
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 808
    .line 809
    .line 810
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/zzaa;

    .line 811
    .line 812
    invoke-direct {v0, v10}, Lcom/google/android/gms/fido/fido2/api/common/zzaa;-><init>(Z)V

    .line 813
    .line 814
    .line 815
    return-object v0

    .line 816
    :pswitch_31
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 817
    .line 818
    .line 819
    move-result v0

    .line 820
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 821
    .line 822
    .line 823
    move-result v2

    .line 824
    if-ge v2, v0, :cond_1b

    .line 825
    .line 826
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 827
    .line 828
    .line 829
    move-result v2

    .line 830
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 831
    .line 832
    .line 833
    goto :goto_b

    .line 834
    :cond_1b
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 835
    .line 836
    .line 837
    new-instance v0, Lcom/google/android/gms/drive/query/internal/zzz;

    .line 838
    .line 839
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 840
    .line 841
    .line 842
    return-object v0

    .line 843
    :pswitch_32
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 844
    .line 845
    .line 846
    move-result v0

    .line 847
    move-wide v14, v5

    .line 848
    move v13, v10

    .line 849
    move/from16 v17, v13

    .line 850
    .line 851
    move/from16 v18, v17

    .line 852
    .line 853
    move-object/from16 v16, v11

    .line 854
    .line 855
    move-object/from16 v19, v16

    .line 856
    .line 857
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 858
    .line 859
    .line 860
    move-result v2

    .line 861
    if-ge v2, v0, :cond_1c

    .line 862
    .line 863
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 864
    .line 865
    .line 866
    move-result v2

    .line 867
    int-to-char v3, v2

    .line 868
    packed-switch v3, :pswitch_data_5

    .line 869
    .line 870
    .line 871
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 872
    .line 873
    .line 874
    goto :goto_c

    .line 875
    :pswitch_33
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object v2

    .line 879
    move-object/from16 v19, v2

    .line 880
    .line 881
    goto :goto_c

    .line 882
    :pswitch_34
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 883
    .line 884
    .line 885
    move-result v2

    .line 886
    move/from16 v18, v2

    .line 887
    .line 888
    goto :goto_c

    .line 889
    :pswitch_35
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 890
    .line 891
    .line 892
    move-result v2

    .line 893
    move/from16 v17, v2

    .line 894
    .line 895
    goto :goto_c

    .line 896
    :pswitch_36
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    move-result-object v2

    .line 900
    move-object/from16 v16, v2

    .line 901
    .line 902
    goto :goto_c

    .line 903
    :pswitch_37
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 904
    .line 905
    .line 906
    move-result-wide v2

    .line 907
    move-wide v14, v2

    .line 908
    goto :goto_c

    .line 909
    :pswitch_38
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 910
    .line 911
    .line 912
    move-result v2

    .line 913
    move v13, v2

    .line 914
    goto :goto_c

    .line 915
    :cond_1c
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 916
    .line 917
    .line 918
    new-instance v12, Lcom/google/android/gms/auth/AccountChangeEvent;

    .line 919
    .line 920
    invoke-direct/range {v12 .. v19}, Lcom/google/android/gms/auth/AccountChangeEvent;-><init>(IJLjava/lang/String;IILjava/lang/String;)V

    .line 921
    .line 922
    .line 923
    return-object v12

    .line 924
    :pswitch_39
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 925
    .line 926
    .line 927
    move-result v0

    .line 928
    move/from16 v26, v2

    .line 929
    .line 930
    move-wide v14, v5

    .line 931
    move-wide/from16 v21, v14

    .line 932
    .line 933
    move-wide/from16 v27, v21

    .line 934
    .line 935
    move v13, v10

    .line 936
    move/from16 v16, v13

    .line 937
    .line 938
    move/from16 v18, v16

    .line 939
    .line 940
    move/from16 v23, v18

    .line 941
    .line 942
    move/from16 v30, v23

    .line 943
    .line 944
    move-object/from16 v17, v11

    .line 945
    .line 946
    move-object/from16 v19, v17

    .line 947
    .line 948
    move-object/from16 v20, v19

    .line 949
    .line 950
    move-object/from16 v24, v20

    .line 951
    .line 952
    move-object/from16 v25, v24

    .line 953
    .line 954
    move-object/from16 v29, v25

    .line 955
    .line 956
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 957
    .line 958
    .line 959
    move-result v2

    .line 960
    if-ge v2, v0, :cond_1d

    .line 961
    .line 962
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 963
    .line 964
    .line 965
    move-result v2

    .line 966
    int-to-char v3, v2

    .line 967
    packed-switch v3, :pswitch_data_6

    .line 968
    .line 969
    .line 970
    :pswitch_3a
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 971
    .line 972
    .line 973
    goto :goto_d

    .line 974
    :pswitch_3b
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 975
    .line 976
    .line 977
    move-result v2

    .line 978
    move/from16 v30, v2

    .line 979
    .line 980
    goto :goto_d

    .line 981
    :pswitch_3c
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 982
    .line 983
    .line 984
    move-result-object v2

    .line 985
    move-object/from16 v29, v2

    .line 986
    .line 987
    goto :goto_d

    .line 988
    :pswitch_3d
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 989
    .line 990
    .line 991
    move-result-wide v2

    .line 992
    move-wide/from16 v27, v2

    .line 993
    .line 994
    goto :goto_d

    .line 995
    :pswitch_3e
    invoke-static {v2, v1}, Lqj3;->B(ILandroid/os/Parcel;)F

    .line 996
    .line 997
    .line 998
    move-result v2

    .line 999
    move/from16 v26, v2

    .line 1000
    .line 1001
    goto :goto_d

    .line 1002
    :pswitch_3f
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1003
    .line 1004
    .line 1005
    move-result v2

    .line 1006
    move/from16 v23, v2

    .line 1007
    .line 1008
    goto :goto_d

    .line 1009
    :pswitch_40
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v2

    .line 1013
    move-object/from16 v25, v2

    .line 1014
    .line 1015
    goto :goto_d

    .line 1016
    :pswitch_41
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v2

    .line 1020
    move-object/from16 v20, v2

    .line 1021
    .line 1022
    goto :goto_d

    .line 1023
    :pswitch_42
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1024
    .line 1025
    .line 1026
    move-result v2

    .line 1027
    move/from16 v16, v2

    .line 1028
    .line 1029
    goto :goto_d

    .line 1030
    :pswitch_43
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v2

    .line 1034
    move-object/from16 v24, v2

    .line 1035
    .line 1036
    goto :goto_d

    .line 1037
    :pswitch_44
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1038
    .line 1039
    .line 1040
    move-result-wide v2

    .line 1041
    move-wide/from16 v21, v2

    .line 1042
    .line 1043
    goto :goto_d

    .line 1044
    :pswitch_45
    invoke-static {v2, v1}, Lqj3;->l(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v2

    .line 1048
    move-object/from16 v19, v2

    .line 1049
    .line 1050
    goto :goto_d

    .line 1051
    :pswitch_46
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1052
    .line 1053
    .line 1054
    move-result v2

    .line 1055
    move/from16 v18, v2

    .line 1056
    .line 1057
    goto :goto_d

    .line 1058
    :pswitch_47
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v2

    .line 1062
    move-object/from16 v17, v2

    .line 1063
    .line 1064
    goto :goto_d

    .line 1065
    :pswitch_48
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1066
    .line 1067
    .line 1068
    move-result-wide v2

    .line 1069
    move-wide v14, v2

    .line 1070
    goto :goto_d

    .line 1071
    :pswitch_49
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1072
    .line 1073
    .line 1074
    move-result v2

    .line 1075
    move v13, v2

    .line 1076
    goto :goto_d

    .line 1077
    :cond_1d
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1078
    .line 1079
    .line 1080
    new-instance v12, Lcom/google/android/gms/common/stats/WakeLockEvent;

    .line 1081
    .line 1082
    invoke-direct/range {v12 .. v30}, Lcom/google/android/gms/common/stats/WakeLockEvent;-><init>(IJILjava/lang/String;ILjava/util/ArrayList;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;FJLjava/lang/String;Z)V

    .line 1083
    .line 1084
    .line 1085
    return-object v12

    .line 1086
    :pswitch_4a
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1087
    .line 1088
    .line 1089
    move-result v0

    .line 1090
    move v13, v10

    .line 1091
    move v14, v13

    .line 1092
    move-object v15, v11

    .line 1093
    move-object/from16 v16, v15

    .line 1094
    .line 1095
    move-object/from16 v17, v16

    .line 1096
    .line 1097
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1098
    .line 1099
    .line 1100
    move-result v2

    .line 1101
    if-ge v2, v0, :cond_23

    .line 1102
    .line 1103
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1104
    .line 1105
    .line 1106
    move-result v2

    .line 1107
    int-to-char v5, v2

    .line 1108
    if-eq v5, v9, :cond_22

    .line 1109
    .line 1110
    if-eq v5, v8, :cond_21

    .line 1111
    .line 1112
    if-eq v5, v7, :cond_20

    .line 1113
    .line 1114
    if-eq v5, v4, :cond_1f

    .line 1115
    .line 1116
    if-eq v5, v3, :cond_1e

    .line 1117
    .line 1118
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1119
    .line 1120
    .line 1121
    goto :goto_e

    .line 1122
    :cond_1e
    invoke-static {v2, v1}, Lqj3;->E(ILandroid/os/Parcel;)Ljava/lang/Integer;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v17

    .line 1126
    goto :goto_e

    .line 1127
    :cond_1f
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v16

    .line 1131
    goto :goto_e

    .line 1132
    :cond_20
    sget-object v5, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1133
    .line 1134
    invoke-static {v1, v2, v5}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v2

    .line 1138
    move-object v15, v2

    .line 1139
    check-cast v15, Landroid/app/PendingIntent;

    .line 1140
    .line 1141
    goto :goto_e

    .line 1142
    :cond_21
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1143
    .line 1144
    .line 1145
    move-result v14

    .line 1146
    goto :goto_e

    .line 1147
    :cond_22
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1148
    .line 1149
    .line 1150
    move-result v13

    .line 1151
    goto :goto_e

    .line 1152
    :cond_23
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1153
    .line 1154
    .line 1155
    new-instance v12, Lcom/google/android/gms/common/ConnectionResult;

    .line 1156
    .line 1157
    invoke-direct/range {v12 .. v17}, Lcom/google/android/gms/common/ConnectionResult;-><init>(IILandroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1158
    .line 1159
    .line 1160
    return-object v12

    .line 1161
    :pswitch_4b
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1162
    .line 1163
    .line 1164
    move-result v0

    .line 1165
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1166
    .line 1167
    .line 1168
    move-result v2

    .line 1169
    if-ge v2, v0, :cond_25

    .line 1170
    .line 1171
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1172
    .line 1173
    .line 1174
    move-result v2

    .line 1175
    int-to-char v3, v2

    .line 1176
    if-eq v3, v9, :cond_24

    .line 1177
    .line 1178
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1179
    .line 1180
    .line 1181
    goto :goto_f

    .line 1182
    :cond_24
    sget-object v3, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1183
    .line 1184
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v2

    .line 1188
    move-object v11, v2

    .line 1189
    check-cast v11, Landroid/content/Intent;

    .line 1190
    .line 1191
    goto :goto_f

    .line 1192
    :cond_25
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1193
    .line 1194
    .line 1195
    new-instance v0, Lcom/google/android/gms/cloudmessaging/CloudMessage;

    .line 1196
    .line 1197
    invoke-direct {v0, v11}, Lcom/google/android/gms/cloudmessaging/CloudMessage;-><init>(Landroid/content/Intent;)V

    .line 1198
    .line 1199
    .line 1200
    return-object v0

    .line 1201
    :pswitch_4c
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1202
    .line 1203
    .line 1204
    move-result v0

    .line 1205
    move-wide/from16 v16, v5

    .line 1206
    .line 1207
    move v13, v10

    .line 1208
    move v15, v13

    .line 1209
    move-object v14, v11

    .line 1210
    move-object/from16 v18, v14

    .line 1211
    .line 1212
    move-object/from16 v19, v18

    .line 1213
    .line 1214
    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1215
    .line 1216
    .line 1217
    move-result v2

    .line 1218
    if-ge v2, v0, :cond_2c

    .line 1219
    .line 1220
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1221
    .line 1222
    .line 1223
    move-result v2

    .line 1224
    int-to-char v5, v2

    .line 1225
    if-eq v5, v9, :cond_2b

    .line 1226
    .line 1227
    if-eq v5, v8, :cond_2a

    .line 1228
    .line 1229
    if-eq v5, v7, :cond_29

    .line 1230
    .line 1231
    if-eq v5, v4, :cond_28

    .line 1232
    .line 1233
    if-eq v5, v3, :cond_27

    .line 1234
    .line 1235
    const/16 v6, 0x3e8

    .line 1236
    .line 1237
    if-eq v5, v6, :cond_26

    .line 1238
    .line 1239
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1240
    .line 1241
    .line 1242
    goto :goto_10

    .line 1243
    :cond_26
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1244
    .line 1245
    .line 1246
    move-result v2

    .line 1247
    move v13, v2

    .line 1248
    goto :goto_10

    .line 1249
    :cond_27
    invoke-static {v2, v1}, Lqj3;->f(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v2

    .line 1253
    move-object/from16 v19, v2

    .line 1254
    .line 1255
    goto :goto_10

    .line 1256
    :cond_28
    invoke-static {v2, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 1257
    .line 1258
    .line 1259
    move-result-object v2

    .line 1260
    move-object/from16 v18, v2

    .line 1261
    .line 1262
    goto :goto_10

    .line 1263
    :cond_29
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1264
    .line 1265
    .line 1266
    move-result-wide v5

    .line 1267
    move-wide/from16 v16, v5

    .line 1268
    .line 1269
    goto :goto_10

    .line 1270
    :cond_2a
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1271
    .line 1272
    .line 1273
    move-result v2

    .line 1274
    move v15, v2

    .line 1275
    goto :goto_10

    .line 1276
    :cond_2b
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v2

    .line 1280
    move-object v14, v2

    .line 1281
    goto :goto_10

    .line 1282
    :cond_2c
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1283
    .line 1284
    .line 1285
    new-instance v12, Lcom/google/android/gms/auth/api/proxy/ProxyRequest;

    .line 1286
    .line 1287
    invoke-direct/range {v12 .. v19}, Lcom/google/android/gms/auth/api/proxy/ProxyRequest;-><init>(ILjava/lang/String;IJ[BLandroid/os/Bundle;)V

    .line 1288
    .line 1289
    .line 1290
    return-object v12

    .line 1291
    :pswitch_4d
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1292
    .line 1293
    .line 1294
    move-result v0

    .line 1295
    move-object v2, v11

    .line 1296
    move-object v3, v2

    .line 1297
    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1298
    .line 1299
    .line 1300
    move-result v5

    .line 1301
    if-ge v5, v0, :cond_31

    .line 1302
    .line 1303
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1304
    .line 1305
    .line 1306
    move-result v5

    .line 1307
    int-to-char v6, v5

    .line 1308
    if-eq v6, v9, :cond_30

    .line 1309
    .line 1310
    if-eq v6, v8, :cond_2f

    .line 1311
    .line 1312
    if-eq v6, v7, :cond_2e

    .line 1313
    .line 1314
    if-eq v6, v4, :cond_2d

    .line 1315
    .line 1316
    invoke-static {v5, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1317
    .line 1318
    .line 1319
    goto :goto_11

    .line 1320
    :cond_2d
    invoke-static {v5, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v3

    .line 1324
    goto :goto_11

    .line 1325
    :cond_2e
    invoke-static {v5, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v2

    .line 1329
    goto :goto_11

    .line 1330
    :cond_2f
    invoke-static {v5, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v11

    .line 1334
    goto :goto_11

    .line 1335
    :cond_30
    invoke-static {v5, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1336
    .line 1337
    .line 1338
    move-result v10

    .line 1339
    goto :goto_11

    .line 1340
    :cond_31
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1341
    .line 1342
    .line 1343
    new-instance v0, Lcom/google/android/gms/location/places/PlaceReport;

    .line 1344
    .line 1345
    invoke-direct {v0, v10, v11, v2, v3}, Lcom/google/android/gms/location/places/PlaceReport;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1346
    .line 1347
    .line 1348
    return-object v0

    .line 1349
    :pswitch_4e
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1350
    .line 1351
    .line 1352
    move-result v0

    .line 1353
    move v13, v10

    .line 1354
    move v14, v13

    .line 1355
    move v15, v14

    .line 1356
    move-object/from16 v16, v11

    .line 1357
    .line 1358
    move-object/from16 v17, v16

    .line 1359
    .line 1360
    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1361
    .line 1362
    .line 1363
    move-result v2

    .line 1364
    if-ge v2, v0, :cond_37

    .line 1365
    .line 1366
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1367
    .line 1368
    .line 1369
    move-result v2

    .line 1370
    int-to-char v5, v2

    .line 1371
    if-eq v5, v9, :cond_36

    .line 1372
    .line 1373
    if-eq v5, v8, :cond_35

    .line 1374
    .line 1375
    if-eq v5, v7, :cond_34

    .line 1376
    .line 1377
    if-eq v5, v4, :cond_33

    .line 1378
    .line 1379
    if-eq v5, v3, :cond_32

    .line 1380
    .line 1381
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1382
    .line 1383
    .line 1384
    goto :goto_12

    .line 1385
    :cond_32
    invoke-static {v2, v1}, Lqj3;->e(ILandroid/os/Parcel;)[Z

    .line 1386
    .line 1387
    .line 1388
    move-result-object v2

    .line 1389
    move-object/from16 v17, v2

    .line 1390
    .line 1391
    goto :goto_12

    .line 1392
    :cond_33
    invoke-static {v2, v1}, Lqj3;->e(ILandroid/os/Parcel;)[Z

    .line 1393
    .line 1394
    .line 1395
    move-result-object v2

    .line 1396
    move-object/from16 v16, v2

    .line 1397
    .line 1398
    goto :goto_12

    .line 1399
    :cond_34
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1400
    .line 1401
    .line 1402
    move-result v2

    .line 1403
    move v15, v2

    .line 1404
    goto :goto_12

    .line 1405
    :cond_35
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1406
    .line 1407
    .line 1408
    move-result v2

    .line 1409
    move v14, v2

    .line 1410
    goto :goto_12

    .line 1411
    :cond_36
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1412
    .line 1413
    .line 1414
    move-result v2

    .line 1415
    move v13, v2

    .line 1416
    goto :goto_12

    .line 1417
    :cond_37
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1418
    .line 1419
    .line 1420
    new-instance v12, Lcom/google/android/gms/games/video/VideoCapabilities;

    .line 1421
    .line 1422
    invoke-direct/range {v12 .. v17}, Lcom/google/android/gms/games/video/VideoCapabilities;-><init>(ZZZ[Z[Z)V

    .line 1423
    .line 1424
    .line 1425
    return-object v12

    .line 1426
    :pswitch_4f
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1427
    .line 1428
    .line 1429
    move-result v0

    .line 1430
    move v13, v2

    .line 1431
    move v14, v13

    .line 1432
    move/from16 v18, v14

    .line 1433
    .line 1434
    move/from16 v19, v18

    .line 1435
    .line 1436
    move/from16 v21, v19

    .line 1437
    .line 1438
    move/from16 v22, v21

    .line 1439
    .line 1440
    move/from16 v23, v22

    .line 1441
    .line 1442
    move v15, v10

    .line 1443
    move/from16 v16, v15

    .line 1444
    .line 1445
    move/from16 v17, v16

    .line 1446
    .line 1447
    move-object/from16 v20, v11

    .line 1448
    .line 1449
    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1450
    .line 1451
    .line 1452
    move-result v2

    .line 1453
    if-ge v2, v0, :cond_38

    .line 1454
    .line 1455
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1456
    .line 1457
    .line 1458
    move-result v2

    .line 1459
    int-to-char v3, v2

    .line 1460
    packed-switch v3, :pswitch_data_7

    .line 1461
    .line 1462
    .line 1463
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1464
    .line 1465
    .line 1466
    goto :goto_13

    .line 1467
    :pswitch_50
    invoke-static {v2, v1}, Lqj3;->B(ILandroid/os/Parcel;)F

    .line 1468
    .line 1469
    .line 1470
    move-result v2

    .line 1471
    move/from16 v23, v2

    .line 1472
    .line 1473
    goto :goto_13

    .line 1474
    :pswitch_51
    invoke-static {v2, v1}, Lqj3;->B(ILandroid/os/Parcel;)F

    .line 1475
    .line 1476
    .line 1477
    move-result v2

    .line 1478
    move/from16 v22, v2

    .line 1479
    .line 1480
    goto :goto_13

    .line 1481
    :pswitch_52
    invoke-static {v2, v1}, Lqj3;->B(ILandroid/os/Parcel;)F

    .line 1482
    .line 1483
    .line 1484
    move-result v2

    .line 1485
    move/from16 v21, v2

    .line 1486
    .line 1487
    goto :goto_13

    .line 1488
    :pswitch_53
    invoke-static {v2, v1}, Lqj3;->f(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v2

    .line 1492
    move-object/from16 v20, v2

    .line 1493
    .line 1494
    goto :goto_13

    .line 1495
    :pswitch_54
    invoke-static {v2, v1}, Lqj3;->B(ILandroid/os/Parcel;)F

    .line 1496
    .line 1497
    .line 1498
    move-result v2

    .line 1499
    move/from16 v19, v2

    .line 1500
    .line 1501
    goto :goto_13

    .line 1502
    :pswitch_55
    invoke-static {v2, v1}, Lqj3;->B(ILandroid/os/Parcel;)F

    .line 1503
    .line 1504
    .line 1505
    move-result v2

    .line 1506
    move/from16 v18, v2

    .line 1507
    .line 1508
    goto :goto_13

    .line 1509
    :pswitch_56
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1510
    .line 1511
    .line 1512
    move-result v2

    .line 1513
    move/from16 v17, v2

    .line 1514
    .line 1515
    goto :goto_13

    .line 1516
    :pswitch_57
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1517
    .line 1518
    .line 1519
    move-result v2

    .line 1520
    move/from16 v16, v2

    .line 1521
    .line 1522
    goto :goto_13

    .line 1523
    :pswitch_58
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1524
    .line 1525
    .line 1526
    move-result v2

    .line 1527
    move v15, v2

    .line 1528
    goto :goto_13

    .line 1529
    :pswitch_59
    invoke-static {v2, v1}, Lqj3;->B(ILandroid/os/Parcel;)F

    .line 1530
    .line 1531
    .line 1532
    move-result v2

    .line 1533
    move v14, v2

    .line 1534
    goto :goto_13

    .line 1535
    :pswitch_5a
    invoke-static {v2, v1}, Lqj3;->B(ILandroid/os/Parcel;)F

    .line 1536
    .line 1537
    .line 1538
    move-result v2

    .line 1539
    move v13, v2

    .line 1540
    goto :goto_13

    .line 1541
    :cond_38
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1542
    .line 1543
    .line 1544
    new-instance v12, Lcom/google/android/gms/games/stats/PlayerStatsEntity;

    .line 1545
    .line 1546
    invoke-direct/range {v12 .. v23}, Lcom/google/android/gms/games/stats/PlayerStatsEntity;-><init>(FFIIIFFLandroid/os/Bundle;FFF)V

    .line 1547
    .line 1548
    .line 1549
    return-object v12

    .line 1550
    :pswitch_5b
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1551
    .line 1552
    .line 1553
    move-result v0

    .line 1554
    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1555
    .line 1556
    .line 1557
    move-result v2

    .line 1558
    if-ge v2, v0, :cond_3a

    .line 1559
    .line 1560
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1561
    .line 1562
    .line 1563
    move-result v2

    .line 1564
    int-to-char v3, v2

    .line 1565
    if-eq v3, v9, :cond_39

    .line 1566
    .line 1567
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1568
    .line 1569
    .line 1570
    goto :goto_14

    .line 1571
    :cond_39
    sget-object v3, Lcom/google/android/gms/drive/Contents;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1572
    .line 1573
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v2

    .line 1577
    move-object v11, v2

    .line 1578
    check-cast v11, Lcom/google/android/gms/drive/Contents;

    .line 1579
    .line 1580
    goto :goto_14

    .line 1581
    :cond_3a
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1582
    .line 1583
    .line 1584
    new-instance v0, Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;

    .line 1585
    .line 1586
    invoke-direct {v0, v11}, Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;-><init>(Lcom/google/android/gms/drive/Contents;)V

    .line 1587
    .line 1588
    .line 1589
    return-object v0

    .line 1590
    :pswitch_5c
    new-instance v0, Lcom/google/android/gms/games/multiplayer/realtime/zzb;

    .line 1591
    .line 1592
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1593
    .line 1594
    .line 1595
    return-object v0

    .line 1596
    :pswitch_5d
    invoke-static {}, Lcom/google/android/gms/common/internal/DowngradeableSafeParcel;->E1()V

    .line 1597
    .line 1598
    .line 1599
    invoke-static {}, Lcom/google/android/gms/common/internal/DowngradeableSafeParcel;->D1()V

    .line 1600
    .line 1601
    .line 1602
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1603
    .line 1604
    .line 1605
    move-result v0

    .line 1606
    :goto_15
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1607
    .line 1608
    .line 1609
    move-result v2

    .line 1610
    if-ge v2, v0, :cond_3b

    .line 1611
    .line 1612
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1613
    .line 1614
    .line 1615
    move-result v2

    .line 1616
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1617
    .line 1618
    .line 1619
    goto :goto_15

    .line 1620
    :cond_3b
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1621
    .line 1622
    .line 1623
    new-instance v0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;

    .line 1624
    .line 1625
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1626
    .line 1627
    .line 1628
    return-object v0

    .line 1629
    :pswitch_5e
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1630
    .line 1631
    .line 1632
    move-result v0

    .line 1633
    move-wide/from16 v19, v5

    .line 1634
    .line 1635
    move-wide/from16 v21, v19

    .line 1636
    .line 1637
    move-wide/from16 v23, v21

    .line 1638
    .line 1639
    move/from16 v25, v10

    .line 1640
    .line 1641
    move/from16 v26, v25

    .line 1642
    .line 1643
    move-object v13, v11

    .line 1644
    move-object v14, v13

    .line 1645
    move-object v15, v14

    .line 1646
    move-object/from16 v16, v15

    .line 1647
    .line 1648
    move-object/from16 v17, v16

    .line 1649
    .line 1650
    move-object/from16 v18, v17

    .line 1651
    .line 1652
    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1653
    .line 1654
    .line 1655
    move-result v2

    .line 1656
    if-ge v2, v0, :cond_3c

    .line 1657
    .line 1658
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1659
    .line 1660
    .line 1661
    move-result v2

    .line 1662
    int-to-char v3, v2

    .line 1663
    packed-switch v3, :pswitch_data_8

    .line 1664
    .line 1665
    .line 1666
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1667
    .line 1668
    .line 1669
    goto :goto_16

    .line 1670
    :pswitch_5f
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1671
    .line 1672
    .line 1673
    move-result v2

    .line 1674
    move/from16 v26, v2

    .line 1675
    .line 1676
    goto :goto_16

    .line 1677
    :pswitch_60
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1678
    .line 1679
    .line 1680
    move-result v2

    .line 1681
    move/from16 v25, v2

    .line 1682
    .line 1683
    goto :goto_16

    .line 1684
    :pswitch_61
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1685
    .line 1686
    .line 1687
    move-result-wide v2

    .line 1688
    move-wide/from16 v23, v2

    .line 1689
    .line 1690
    goto :goto_16

    .line 1691
    :pswitch_62
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1692
    .line 1693
    .line 1694
    move-result-wide v2

    .line 1695
    move-wide/from16 v21, v2

    .line 1696
    .line 1697
    goto :goto_16

    .line 1698
    :pswitch_63
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1699
    .line 1700
    .line 1701
    move-result-wide v2

    .line 1702
    move-wide/from16 v19, v2

    .line 1703
    .line 1704
    goto :goto_16

    .line 1705
    :pswitch_64
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1706
    .line 1707
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1708
    .line 1709
    .line 1710
    move-result-object v2

    .line 1711
    check-cast v2, Landroid/net/Uri;

    .line 1712
    .line 1713
    move-object/from16 v18, v2

    .line 1714
    .line 1715
    goto :goto_16

    .line 1716
    :pswitch_65
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1717
    .line 1718
    .line 1719
    move-result-object v2

    .line 1720
    move-object/from16 v17, v2

    .line 1721
    .line 1722
    goto :goto_16

    .line 1723
    :pswitch_66
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1724
    .line 1725
    .line 1726
    move-result-object v2

    .line 1727
    move-object/from16 v16, v2

    .line 1728
    .line 1729
    goto :goto_16

    .line 1730
    :pswitch_67
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1731
    .line 1732
    .line 1733
    move-result-object v2

    .line 1734
    move-object v15, v2

    .line 1735
    goto :goto_16

    .line 1736
    :pswitch_68
    sget-object v3, Lcom/google/android/gms/games/GameEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1737
    .line 1738
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v2

    .line 1742
    check-cast v2, Lcom/google/android/gms/games/GameEntity;

    .line 1743
    .line 1744
    move-object v14, v2

    .line 1745
    goto :goto_16

    .line 1746
    :pswitch_69
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v2

    .line 1750
    move-object v13, v2

    .line 1751
    goto :goto_16

    .line 1752
    :cond_3c
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1753
    .line 1754
    .line 1755
    new-instance v12, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;

    .line 1756
    .line 1757
    invoke-direct/range {v12 .. v26}, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;-><init>(Ljava/lang/String;Lcom/google/android/gms/games/GameEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;JJJII)V

    .line 1758
    .line 1759
    .line 1760
    return-object v12

    .line 1761
    :pswitch_6a
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1762
    .line 1763
    .line 1764
    move-result v0

    .line 1765
    move-wide/from16 v19, v5

    .line 1766
    .line 1767
    move/from16 v22, v10

    .line 1768
    .line 1769
    move-object v13, v11

    .line 1770
    move-object v14, v13

    .line 1771
    move-object v15, v14

    .line 1772
    move-object/from16 v16, v15

    .line 1773
    .line 1774
    move-object/from16 v17, v16

    .line 1775
    .line 1776
    move-object/from16 v18, v17

    .line 1777
    .line 1778
    move-object/from16 v21, v18

    .line 1779
    .line 1780
    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1781
    .line 1782
    .line 1783
    move-result v2

    .line 1784
    if-ge v2, v0, :cond_3d

    .line 1785
    .line 1786
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1787
    .line 1788
    .line 1789
    move-result v2

    .line 1790
    int-to-char v3, v2

    .line 1791
    packed-switch v3, :pswitch_data_9

    .line 1792
    .line 1793
    .line 1794
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1795
    .line 1796
    .line 1797
    goto :goto_17

    .line 1798
    :pswitch_6b
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1799
    .line 1800
    .line 1801
    move-result v2

    .line 1802
    move/from16 v22, v2

    .line 1803
    .line 1804
    goto :goto_17

    .line 1805
    :pswitch_6c
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v2

    .line 1809
    move-object/from16 v21, v2

    .line 1810
    .line 1811
    goto :goto_17

    .line 1812
    :pswitch_6d
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1813
    .line 1814
    .line 1815
    move-result-wide v2

    .line 1816
    move-wide/from16 v19, v2

    .line 1817
    .line 1818
    goto :goto_17

    .line 1819
    :pswitch_6e
    sget-object v3, Lcom/google/android/gms/games/PlayerEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1820
    .line 1821
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v2

    .line 1825
    check-cast v2, Lcom/google/android/gms/games/PlayerEntity;

    .line 1826
    .line 1827
    move-object/from16 v18, v2

    .line 1828
    .line 1829
    goto :goto_17

    .line 1830
    :pswitch_6f
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1831
    .line 1832
    .line 1833
    move-result-object v2

    .line 1834
    move-object/from16 v17, v2

    .line 1835
    .line 1836
    goto :goto_17

    .line 1837
    :pswitch_70
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1838
    .line 1839
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1840
    .line 1841
    .line 1842
    move-result-object v2

    .line 1843
    check-cast v2, Landroid/net/Uri;

    .line 1844
    .line 1845
    move-object/from16 v16, v2

    .line 1846
    .line 1847
    goto :goto_17

    .line 1848
    :pswitch_71
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v2

    .line 1852
    move-object v15, v2

    .line 1853
    goto :goto_17

    .line 1854
    :pswitch_72
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v2

    .line 1858
    move-object v14, v2

    .line 1859
    goto :goto_17

    .line 1860
    :pswitch_73
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1861
    .line 1862
    .line 1863
    move-result-object v2

    .line 1864
    move-object v13, v2

    .line 1865
    goto :goto_17

    .line 1866
    :cond_3d
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1867
    .line 1868
    .line 1869
    new-instance v12, Lcom/google/android/gms/games/event/EventEntity;

    .line 1870
    .line 1871
    invoke-direct/range {v12 .. v22}, Lcom/google/android/gms/games/event/EventEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Lcom/google/android/gms/games/PlayerEntity;JLjava/lang/String;Z)V

    .line 1872
    .line 1873
    .line 1874
    return-object v12

    .line 1875
    :pswitch_74
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1876
    .line 1877
    .line 1878
    move-result v0

    .line 1879
    const/high16 v2, -0x40800000    # -1.0f

    .line 1880
    .line 1881
    move/from16 v31, v2

    .line 1882
    .line 1883
    move-wide/from16 v27, v5

    .line 1884
    .line 1885
    move-wide/from16 v29, v27

    .line 1886
    .line 1887
    move v14, v10

    .line 1888
    move/from16 v21, v14

    .line 1889
    .line 1890
    move/from16 v24, v21

    .line 1891
    .line 1892
    move/from16 v25, v24

    .line 1893
    .line 1894
    move-object v13, v11

    .line 1895
    move-object v15, v13

    .line 1896
    move-object/from16 v16, v15

    .line 1897
    .line 1898
    move-object/from16 v17, v16

    .line 1899
    .line 1900
    move-object/from16 v18, v17

    .line 1901
    .line 1902
    move-object/from16 v19, v18

    .line 1903
    .line 1904
    move-object/from16 v20, v19

    .line 1905
    .line 1906
    move-object/from16 v22, v20

    .line 1907
    .line 1908
    move-object/from16 v23, v22

    .line 1909
    .line 1910
    move-object/from16 v26, v23

    .line 1911
    .line 1912
    move-object/from16 v32, v26

    .line 1913
    .line 1914
    :goto_18
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1915
    .line 1916
    .line 1917
    move-result v2

    .line 1918
    if-ge v2, v0, :cond_3e

    .line 1919
    .line 1920
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1921
    .line 1922
    .line 1923
    move-result v2

    .line 1924
    int-to-char v3, v2

    .line 1925
    packed-switch v3, :pswitch_data_a

    .line 1926
    .line 1927
    .line 1928
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1929
    .line 1930
    .line 1931
    goto :goto_18

    .line 1932
    :pswitch_75
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1933
    .line 1934
    .line 1935
    move-result-object v2

    .line 1936
    move-object/from16 v32, v2

    .line 1937
    .line 1938
    goto :goto_18

    .line 1939
    :pswitch_76
    invoke-static {v2, v1}, Lqj3;->B(ILandroid/os/Parcel;)F

    .line 1940
    .line 1941
    .line 1942
    move-result v2

    .line 1943
    move/from16 v31, v2

    .line 1944
    .line 1945
    goto :goto_18

    .line 1946
    :pswitch_77
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1947
    .line 1948
    .line 1949
    move-result-wide v2

    .line 1950
    move-wide/from16 v29, v2

    .line 1951
    .line 1952
    goto :goto_18

    .line 1953
    :pswitch_78
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1954
    .line 1955
    .line 1956
    move-result-wide v2

    .line 1957
    move-wide/from16 v27, v2

    .line 1958
    .line 1959
    goto :goto_18

    .line 1960
    :pswitch_79
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1961
    .line 1962
    .line 1963
    move-result-object v2

    .line 1964
    move-object/from16 v26, v2

    .line 1965
    .line 1966
    goto :goto_18

    .line 1967
    :pswitch_7a
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1968
    .line 1969
    .line 1970
    move-result v2

    .line 1971
    move/from16 v25, v2

    .line 1972
    .line 1973
    goto :goto_18

    .line 1974
    :pswitch_7b
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1975
    .line 1976
    .line 1977
    move-result v2

    .line 1978
    move/from16 v24, v2

    .line 1979
    .line 1980
    goto :goto_18

    .line 1981
    :pswitch_7c
    sget-object v3, Lcom/google/android/gms/games/PlayerEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1982
    .line 1983
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1984
    .line 1985
    .line 1986
    move-result-object v2

    .line 1987
    check-cast v2, Lcom/google/android/gms/games/PlayerEntity;

    .line 1988
    .line 1989
    move-object/from16 v23, v2

    .line 1990
    .line 1991
    goto :goto_18

    .line 1992
    :pswitch_7d
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1993
    .line 1994
    .line 1995
    move-result-object v2

    .line 1996
    move-object/from16 v22, v2

    .line 1997
    .line 1998
    goto :goto_18

    .line 1999
    :pswitch_7e
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 2000
    .line 2001
    .line 2002
    move-result v2

    .line 2003
    move/from16 v21, v2

    .line 2004
    .line 2005
    goto :goto_18

    .line 2006
    :pswitch_7f
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 2007
    .line 2008
    .line 2009
    move-result-object v2

    .line 2010
    move-object/from16 v20, v2

    .line 2011
    .line 2012
    goto :goto_18

    .line 2013
    :pswitch_80
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2014
    .line 2015
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2016
    .line 2017
    .line 2018
    move-result-object v2

    .line 2019
    check-cast v2, Landroid/net/Uri;

    .line 2020
    .line 2021
    move-object/from16 v19, v2

    .line 2022
    .line 2023
    goto :goto_18

    .line 2024
    :pswitch_81
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 2025
    .line 2026
    .line 2027
    move-result-object v2

    .line 2028
    move-object/from16 v18, v2

    .line 2029
    .line 2030
    goto :goto_18

    .line 2031
    :pswitch_82
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2032
    .line 2033
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v2

    .line 2037
    check-cast v2, Landroid/net/Uri;

    .line 2038
    .line 2039
    move-object/from16 v17, v2

    .line 2040
    .line 2041
    goto :goto_18

    .line 2042
    :pswitch_83
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 2043
    .line 2044
    .line 2045
    move-result-object v2

    .line 2046
    move-object/from16 v16, v2

    .line 2047
    .line 2048
    goto/16 :goto_18

    .line 2049
    .line 2050
    :pswitch_84
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 2051
    .line 2052
    .line 2053
    move-result-object v2

    .line 2054
    move-object v15, v2

    .line 2055
    goto/16 :goto_18

    .line 2056
    .line 2057
    :pswitch_85
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 2058
    .line 2059
    .line 2060
    move-result v2

    .line 2061
    move v14, v2

    .line 2062
    goto/16 :goto_18

    .line 2063
    .line 2064
    :pswitch_86
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 2065
    .line 2066
    .line 2067
    move-result-object v2

    .line 2068
    move-object v13, v2

    .line 2069
    goto/16 :goto_18

    .line 2070
    .line 2071
    :cond_3e
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 2072
    .line 2073
    .line 2074
    new-instance v12, Lcom/google/android/gms/games/achievement/AchievementEntity;

    .line 2075
    .line 2076
    invoke-direct/range {v12 .. v32}, Lcom/google/android/gms/games/achievement/AchievementEntity;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;ILjava/lang/String;Lcom/google/android/gms/games/PlayerEntity;IILjava/lang/String;JJFLjava/lang/String;)V

    .line 2077
    .line 2078
    .line 2079
    return-object v12

    .line 2080
    :pswitch_87
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 2081
    .line 2082
    .line 2083
    move-result v0

    .line 2084
    :goto_19
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 2085
    .line 2086
    .line 2087
    move-result v2

    .line 2088
    if-ge v2, v0, :cond_41

    .line 2089
    .line 2090
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2091
    .line 2092
    .line 2093
    move-result v2

    .line 2094
    int-to-char v3, v2

    .line 2095
    if-eq v3, v9, :cond_40

    .line 2096
    .line 2097
    if-eq v3, v8, :cond_3f

    .line 2098
    .line 2099
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 2100
    .line 2101
    .line 2102
    goto :goto_19

    .line 2103
    :cond_3f
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 2104
    .line 2105
    .line 2106
    move-result v10

    .line 2107
    goto :goto_19

    .line 2108
    :cond_40
    sget-object v3, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2109
    .line 2110
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2111
    .line 2112
    .line 2113
    move-result-object v2

    .line 2114
    move-object v11, v2

    .line 2115
    check-cast v11, Lcom/google/android/gms/common/api/Status;

    .line 2116
    .line 2117
    goto :goto_19

    .line 2118
    :cond_41
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 2119
    .line 2120
    .line 2121
    new-instance v0, Lcom/google/android/gms/fido/sourcedevice/SourceDirectTransferResult;

    .line 2122
    .line 2123
    invoke-direct {v0, v11, v10}, Lcom/google/android/gms/fido/sourcedevice/SourceDirectTransferResult;-><init>(Lcom/google/android/gms/common/api/Status;I)V

    .line 2124
    .line 2125
    .line 2126
    return-object v0

    .line 2127
    :pswitch_88
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 2128
    .line 2129
    .line 2130
    move-result-object v0

    .line 2131
    :try_start_0
    invoke-static {v0}, Lcom/google/android/gms/fido/fido2/api/common/Attachment;->a(Ljava/lang/String;)Lcom/google/android/gms/fido/fido2/api/common/Attachment;

    .line 2132
    .line 2133
    .line 2134
    move-result-object v11
    :try_end_0
    .catch Lyd; {:try_start_0 .. :try_end_0} :catch_0

    .line 2135
    goto :goto_1a

    .line 2136
    :catch_0
    move-exception v0

    .line 2137
    invoke-static {v0}, Lds0;->p(Ljava/lang/Throwable;)V

    .line 2138
    .line 2139
    .line 2140
    :goto_1a
    return-object v11

    .line 2141
    :pswitch_89
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 2142
    .line 2143
    .line 2144
    move-result-object v0

    .line 2145
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/fido/common/Transport;->values()[Lcom/google/android/gms/fido/common/Transport;

    .line 2146
    .line 2147
    .line 2148
    move-result-object v1

    .line 2149
    array-length v2, v1

    .line 2150
    :goto_1b
    if-ge v10, v2, :cond_43

    .line 2151
    .line 2152
    aget-object v3, v1, v10

    .line 2153
    .line 2154
    iget-object v4, v3, Lcom/google/android/gms/fido/common/Transport;->a:Ljava/lang/String;

    .line 2155
    .line 2156
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2157
    .line 2158
    .line 2159
    move-result v4

    .line 2160
    if-eqz v4, :cond_42

    .line 2161
    .line 2162
    move-object v11, v3

    .line 2163
    goto :goto_1c

    .line 2164
    :cond_42
    add-int/lit8 v10, v10, 0x1

    .line 2165
    .line 2166
    goto :goto_1b

    .line 2167
    :cond_43
    new-instance v1, Ltr2;

    .line 2168
    .line 2169
    const-string v2, "Transport "

    .line 2170
    .line 2171
    const-string v3, " not supported"

    .line 2172
    .line 2173
    invoke-static {v2, v0, v3}, Lfm0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2174
    .line 2175
    .line 2176
    move-result-object v0

    .line 2177
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 2178
    .line 2179
    .line 2180
    throw v1
    :try_end_1
    .catch Ltr2; {:try_start_1 .. :try_end_1} :catch_1

    .line 2181
    :catch_1
    move-exception v0

    .line 2182
    invoke-static {v0}, Lds0;->p(Ljava/lang/Throwable;)V

    .line 2183
    .line 2184
    .line 2185
    :goto_1c
    return-object v11

    .line 2186
    :pswitch_8a
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 2187
    .line 2188
    .line 2189
    move-result v0

    .line 2190
    :goto_1d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 2191
    .line 2192
    .line 2193
    move-result v2

    .line 2194
    if-ge v2, v0, :cond_45

    .line 2195
    .line 2196
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2197
    .line 2198
    .line 2199
    move-result v2

    .line 2200
    int-to-char v3, v2

    .line 2201
    if-eq v3, v8, :cond_44

    .line 2202
    .line 2203
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 2204
    .line 2205
    .line 2206
    goto :goto_1d

    .line 2207
    :cond_44
    sget-object v3, Lcom/google/android/gms/drive/metadata/internal/zzc;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2208
    .line 2209
    invoke-static {v1, v2, v3}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 2210
    .line 2211
    .line 2212
    move-result-object v11

    .line 2213
    goto :goto_1d

    .line 2214
    :cond_45
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 2215
    .line 2216
    .line 2217
    new-instance v0, Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties;

    .line 2218
    .line 2219
    invoke-direct {v0, v11}, Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties;-><init>(Ljava/util/Collection;)V

    .line 2220
    .line 2221
    .line 2222
    return-object v0

    .line 2223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8a
        :pswitch_89
        :pswitch_88
        :pswitch_87
        :pswitch_74
        :pswitch_6a
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_39
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_22
        :pswitch_21
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_a
        :pswitch_9
    .end packed-switch

    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    :pswitch_data_2
    .packed-switch 0x2
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
    .end packed-switch

    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
    .end packed-switch

    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    :pswitch_data_4
    .packed-switch 0x2
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
    .end packed-switch

    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
    .end packed-switch

    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    :pswitch_data_6
    .packed-switch 0x1
        :pswitch_49
        :pswitch_48
        :pswitch_3a
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_3a
        :pswitch_44
        :pswitch_3a
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
    .end packed-switch

    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    :pswitch_data_7
    .packed-switch 0x1
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
    .end packed-switch

    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    :pswitch_data_8
    .packed-switch 0x1
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
    .end packed-switch

    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    :pswitch_data_9
    .packed-switch 0x1
        :pswitch_73
        :pswitch_72
        :pswitch_71
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
    .end packed-switch

    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    :pswitch_data_a
    .packed-switch 0x1
        :pswitch_86
        :pswitch_85
        :pswitch_84
        :pswitch_83
        :pswitch_82
        :pswitch_81
        :pswitch_80
        :pswitch_7f
        :pswitch_7e
        :pswitch_7d
        :pswitch_7c
        :pswitch_7b
        :pswitch_7a
        :pswitch_79
        :pswitch_78
        :pswitch_77
        :pswitch_76
        :pswitch_75
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Ltc3;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialParameters;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lcom/google/android/gms/measurement/internal/zzah;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialDescriptor;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lcom/google/android/gms/measurement/internal/zzaf;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/zzad;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/GoogleThirdPartyPaymentExtension;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/zzaa;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lcom/google/android/gms/drive/query/internal/zzz;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lcom/google/android/gms/auth/AccountChangeEvent;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lcom/google/android/gms/common/stats/WakeLockEvent;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lcom/google/android/gms/common/ConnectionResult;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lcom/google/android/gms/cloudmessaging/CloudMessage;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lcom/google/android/gms/auth/api/proxy/ProxyRequest;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lcom/google/android/gms/location/places/PlaceReport;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lcom/google/android/gms/games/video/VideoCapabilities;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lcom/google/android/gms/games/stats/PlayerStatsEntity;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lcom/google/android/gms/games/multiplayer/realtime/zzb;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lcom/google/android/gms/games/multiplayer/ParticipantEntity;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lcom/google/android/gms/games/event/EventEntity;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lcom/google/android/gms/games/achievement/AchievementEntity;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lcom/google/android/gms/fido/sourcedevice/SourceDirectTransferResult;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/Attachment;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lcom/google/android/gms/fido/common/Transport;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties;

    .line 94
    .line 95
    return-object p0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
