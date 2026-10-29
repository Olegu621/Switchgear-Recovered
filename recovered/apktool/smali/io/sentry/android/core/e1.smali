.class public final Lio/sentry/android/core/e1;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lio/sentry/h4;

.field public final b:Lio/sentry/android/core/o0;

.field public c:Landroid/net/NetworkCapabilities;

.field public d:J

.field public final e:Lio/sentry/u4;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/o0;Lio/sentry/u4;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lio/sentry/android/core/e1;->c:Landroid/net/NetworkCapabilities;

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    iput-wide v0, p0, Lio/sentry/android/core/e1;->d:J

    .line 10
    .line 11
    sget-object v0, Lio/sentry/h4;->a:Lio/sentry/h4;

    .line 12
    .line 13
    iput-object v0, p0, Lio/sentry/android/core/e1;->a:Lio/sentry/h4;

    .line 14
    .line 15
    const-string v0, "BuildInfoProvider is required"

    .line 16
    .line 17
    invoke-static {p1, v0}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lio/sentry/android/core/e1;->b:Lio/sentry/android/core/o0;

    .line 21
    .line 22
    const-string p1, "SentryDateProvider is required"

    .line 23
    .line 24
    invoke-static {p2, p1}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iput-object p2, p0, Lio/sentry/android/core/e1;->e:Lio/sentry/u4;

    .line 28
    .line 29
    return-void
.end method

.method public static a(Ljava/lang/String;)Lio/sentry/f;
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/f;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "system"

    .line 7
    .line 8
    iput-object v1, v0, Lio/sentry/f;->e:Ljava/lang/String;

    .line 9
    .line 10
    const-string v1, "network.event"

    .line 11
    .line 12
    iput-object v1, v0, Lio/sentry/f;->i:Ljava/lang/String;

    .line 13
    .line 14
    const-string v1, "action"

    .line 15
    .line 16
    invoke-virtual {v0, p0, v1}, Lio/sentry/f;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 20
    .line 21
    iput-object p0, v0, Lio/sentry/f;->w:Lio/sentry/m5;

    .line 22
    .line 23
    return-object v0
.end method


# virtual methods
.method public final onAvailable(Landroid/net/Network;)V
    .locals 1

    .line 1
    const-string p1, "NETWORK_AVAILABLE"

    .line 2
    .line 3
    invoke-static {p1}, Lio/sentry/android/core/e1;->a(Ljava/lang/String;)Lio/sentry/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lio/sentry/android/core/e1;->a:Lio/sentry/h4;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lio/sentry/h4;->i(Lio/sentry/f;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lio/sentry/android/core/e1;->c:Landroid/net/NetworkCapabilities;

    .line 14
    .line 15
    return-void
.end method

.method public final onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Lio/sentry/android/core/e1;->e:Lio/sentry/u4;

    .line 6
    .line 7
    invoke-interface {v2}, Lio/sentry/u4;->a()Lio/sentry/t4;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Lio/sentry/t4;->d()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    iget-object v4, v0, Lio/sentry/android/core/e1;->c:Landroid/net/NetworkCapabilities;

    .line 16
    .line 17
    iget-wide v5, v0, Lio/sentry/android/core/e1;->d:J

    .line 18
    .line 19
    iget-object v7, v0, Lio/sentry/android/core/e1;->b:Lio/sentry/android/core/o0;

    .line 20
    .line 21
    if-nez v4, :cond_0

    .line 22
    .line 23
    new-instance v4, Lio/sentry/android/core/d1;

    .line 24
    .line 25
    invoke-direct {v4, v1, v7, v2, v3}, Lio/sentry/android/core/d1;-><init>(Landroid/net/NetworkCapabilities;Lio/sentry/android/core/o0;J)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_b

    .line 29
    .line 30
    :cond_0
    const-string v8, "BuildInfoProvider is required"

    .line 31
    .line 32
    invoke-static {v7, v8}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4}, Landroid/net/NetworkCapabilities;->getLinkDownstreamBandwidthKbps()I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    invoke-virtual {v4}, Landroid/net/NetworkCapabilities;->getLinkUpstreamBandwidthKbps()I

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 44
    .line 45
    const/16 v11, 0x1d

    .line 46
    .line 47
    if-lt v10, v11, :cond_1

    .line 48
    .line 49
    invoke-static {v4}, Lio/sentry/android/core/l0;->b(Landroid/net/NetworkCapabilities;)I

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const/4 v10, 0x0

    .line 55
    :goto_0
    const/16 v11, -0x64

    .line 56
    .line 57
    if-le v10, v11, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    const/4 v10, 0x0

    .line 61
    :goto_1
    const/4 v11, 0x4

    .line 62
    invoke-virtual {v4, v11}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 63
    .line 64
    .line 65
    move-result v11

    .line 66
    invoke-static {v4}, Lio/sentry/android/core/internal/util/c;->k(Landroid/net/NetworkCapabilities;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    if-eqz v4, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    const-string v4, ""

    .line 74
    .line 75
    :goto_2
    new-instance v13, Lio/sentry/android/core/d1;

    .line 76
    .line 77
    invoke-direct {v13, v1, v7, v2, v3}, Lio/sentry/android/core/d1;-><init>(Landroid/net/NetworkCapabilities;Lio/sentry/android/core/o0;J)V

    .line 78
    .line 79
    .line 80
    iget v7, v13, Lio/sentry/android/core/d1;->c:I

    .line 81
    .line 82
    sub-int/2addr v10, v7

    .line 83
    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    iget v10, v13, Lio/sentry/android/core/d1;->a:I

    .line 88
    .line 89
    sub-int v10, v8, v10

    .line 90
    .line 91
    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    iget v14, v13, Lio/sentry/android/core/d1;->b:I

    .line 96
    .line 97
    sub-int v14, v9, v14

    .line 98
    .line 99
    invoke-static {v14}, Ljava/lang/Math;->abs(I)I

    .line 100
    .line 101
    .line 102
    move-result v14

    .line 103
    move-wide v15, v5

    .line 104
    iget-wide v5, v13, Lio/sentry/android/core/d1;->d:J

    .line 105
    .line 106
    sub-long v5, v15, v5

    .line 107
    .line 108
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    .line 109
    .line 110
    .line 111
    move-result-wide v5

    .line 112
    long-to-double v5, v5

    .line 113
    const-wide v15, 0x412e848000000000L    # 1000000.0

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    div-double/2addr v5, v15

    .line 119
    const-wide v15, 0x40b3880000000000L    # 5000.0

    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    cmpg-double v5, v5, v15

    .line 125
    .line 126
    if-gez v5, :cond_4

    .line 127
    .line 128
    const/4 v5, 0x1

    .line 129
    goto :goto_3

    .line 130
    :cond_4
    const/4 v5, 0x0

    .line 131
    :goto_3
    if-nez v5, :cond_6

    .line 132
    .line 133
    const/4 v15, 0x5

    .line 134
    if-gt v7, v15, :cond_5

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_5
    const/4 v7, 0x0

    .line 138
    goto :goto_5

    .line 139
    :cond_6
    :goto_4
    const/4 v7, 0x1

    .line 140
    :goto_5
    const-wide v15, 0x3fb999999999999aL    # 0.1

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    move/from16 v17, v7

    .line 146
    .line 147
    const-wide v6, 0x408f400000000000L    # 1000.0

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    if-nez v5, :cond_8

    .line 153
    .line 154
    move-object/from16 v18, v13

    .line 155
    .line 156
    int-to-double v12, v10

    .line 157
    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    move v10, v9

    .line 162
    int-to-double v8, v8

    .line 163
    mul-double/2addr v8, v15

    .line 164
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(DD)D

    .line 165
    .line 166
    .line 167
    move-result-wide v8

    .line 168
    cmpg-double v8, v12, v8

    .line 169
    .line 170
    if-gtz v8, :cond_7

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_7
    const/4 v8, 0x0

    .line 174
    goto :goto_7

    .line 175
    :cond_8
    move v10, v9

    .line 176
    move-object/from16 v18, v13

    .line 177
    .line 178
    :goto_6
    const/4 v8, 0x1

    .line 179
    :goto_7
    if-nez v5, :cond_a

    .line 180
    .line 181
    int-to-double v12, v14

    .line 182
    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    int-to-double v9, v5

    .line 187
    mul-double/2addr v9, v15

    .line 188
    invoke-static {v6, v7, v9, v10}, Ljava/lang/Math;->max(DD)D

    .line 189
    .line 190
    .line 191
    move-result-wide v5

    .line 192
    cmpg-double v5, v12, v5

    .line 193
    .line 194
    if-gtz v5, :cond_9

    .line 195
    .line 196
    goto :goto_9

    .line 197
    :cond_9
    const/4 v12, 0x0

    .line 198
    :goto_8
    move-object/from16 v5, v18

    .line 199
    .line 200
    goto :goto_a

    .line 201
    :cond_a
    :goto_9
    const/4 v12, 0x1

    .line 202
    goto :goto_8

    .line 203
    :goto_a
    iget-boolean v6, v5, Lio/sentry/android/core/d1;->e:Z

    .line 204
    .line 205
    if-ne v11, v6, :cond_b

    .line 206
    .line 207
    iget-object v6, v5, Lio/sentry/android/core/d1;->f:Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    if-eqz v4, :cond_b

    .line 214
    .line 215
    if-eqz v17, :cond_b

    .line 216
    .line 217
    if-eqz v8, :cond_b

    .line 218
    .line 219
    if-eqz v12, :cond_b

    .line 220
    .line 221
    const/4 v4, 0x0

    .line 222
    goto :goto_b

    .line 223
    :cond_b
    move-object v4, v5

    .line 224
    :goto_b
    if-nez v4, :cond_c

    .line 225
    .line 226
    return-void

    .line 227
    :cond_c
    iput-object v1, v0, Lio/sentry/android/core/e1;->c:Landroid/net/NetworkCapabilities;

    .line 228
    .line 229
    iput-wide v2, v0, Lio/sentry/android/core/e1;->d:J

    .line 230
    .line 231
    const-string v1, "NETWORK_CAPABILITIES_CHANGED"

    .line 232
    .line 233
    invoke-static {v1}, Lio/sentry/android/core/e1;->a(Ljava/lang/String;)Lio/sentry/f;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    iget v2, v4, Lio/sentry/android/core/d1;->a:I

    .line 238
    .line 239
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    const-string v3, "download_bandwidth"

    .line 244
    .line 245
    invoke-virtual {v1, v2, v3}, Lio/sentry/f;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    iget v2, v4, Lio/sentry/android/core/d1;->b:I

    .line 249
    .line 250
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    const-string v3, "upload_bandwidth"

    .line 255
    .line 256
    invoke-virtual {v1, v2, v3}, Lio/sentry/f;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    iget-boolean v2, v4, Lio/sentry/android/core/d1;->e:Z

    .line 260
    .line 261
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    const-string v3, "vpn_active"

    .line 266
    .line 267
    invoke-virtual {v1, v2, v3}, Lio/sentry/f;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    const-string v2, "network_type"

    .line 271
    .line 272
    iget-object v3, v4, Lio/sentry/android/core/d1;->f:Ljava/lang/String;

    .line 273
    .line 274
    invoke-virtual {v1, v3, v2}, Lio/sentry/f;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    iget v2, v4, Lio/sentry/android/core/d1;->c:I

    .line 278
    .line 279
    if-eqz v2, :cond_d

    .line 280
    .line 281
    const-string v3, "signal_strength"

    .line 282
    .line 283
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    invoke-virtual {v1, v2, v3}, Lio/sentry/f;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    :cond_d
    new-instance v2, Lio/sentry/i0;

    .line 291
    .line 292
    invoke-direct {v2}, Lio/sentry/i0;-><init>()V

    .line 293
    .line 294
    .line 295
    const-string v3, "android:networkCapabilities"

    .line 296
    .line 297
    invoke-virtual {v2, v4, v3}, Lio/sentry/i0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    iget-object v0, v0, Lio/sentry/android/core/e1;->a:Lio/sentry/h4;

    .line 301
    .line 302
    invoke-virtual {v0, v1, v2}, Lio/sentry/h4;->f(Lio/sentry/f;Lio/sentry/i0;)V

    .line 303
    .line 304
    .line 305
    return-void
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 1

    .line 1
    const-string p1, "NETWORK_LOST"

    .line 2
    .line 3
    invoke-static {p1}, Lio/sentry/android/core/e1;->a(Ljava/lang/String;)Lio/sentry/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lio/sentry/android/core/e1;->a:Lio/sentry/h4;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lio/sentry/h4;->i(Lio/sentry/f;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lio/sentry/android/core/e1;->c:Landroid/net/NetworkCapabilities;

    .line 14
    .line 15
    return-void
.end method
