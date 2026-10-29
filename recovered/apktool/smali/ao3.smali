.class public final Lao3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Llo3;


# direct methods
.method public constructor <init>(Llo3;JI)V
    .locals 0

    .line 1
    iput p4, p0, Lao3;->a:I

    .line 2
    .line 3
    packed-switch p4, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-wide p2, p0, Lao3;->b:J

    .line 10
    .line 11
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lao3;->c:Llo3;

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-wide p2, p0, Lao3;->b:J

    .line 21
    .line 22
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lao3;->c:Llo3;

    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Lao3;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lao3;->c:Llo3;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Leg3;->y()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Llo3;->D()V

    .line 12
    .line 13
    .line 14
    iget-object v0, v1, Lsq3;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lij3;

    .line 17
    .line 18
    iget-object v2, v0, Lij3;->f:Luh3;

    .line 19
    .line 20
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 21
    .line 22
    .line 23
    iget-object v2, v2, Luh3;->Y:Lsh3;

    .line 24
    .line 25
    const-string v3, "Activity paused, time"

    .line 26
    .line 27
    iget-wide v8, p0, Lao3;->b:J

    .line 28
    .line 29
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v2, p0, v3}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v5, v1, Llo3;->i:Lwe2;

    .line 37
    .line 38
    new-instance v4, Lco3;

    .line 39
    .line 40
    iget-object p0, v5, Lwe2;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Llo3;

    .line 43
    .line 44
    iget-object v2, p0, Lsq3;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lij3;

    .line 47
    .line 48
    iget-object v2, v2, Lij3;->V:Lxt0;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 54
    .line 55
    .line 56
    move-result-wide v6

    .line 57
    invoke-direct/range {v4 .. v9}, Lco3;-><init>(Lwe2;JJ)V

    .line 58
    .line 59
    .line 60
    iput-object v4, v5, Lwe2;->c:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object p0, p0, Llo3;->c:Lcom/google/android/gms/internal/measurement/zzcn;

    .line 63
    .line 64
    const-wide/16 v2, 0x7d0

    .line 65
    .line 66
    invoke-virtual {p0, v4, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 67
    .line 68
    .line 69
    iget-object p0, v0, Lij3;->d:Lpd3;

    .line 70
    .line 71
    invoke-virtual {p0}, Lpd3;->N()Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-eqz p0, :cond_0

    .line 76
    .line 77
    iget-object p0, v1, Llo3;->f:Lio/sentry/android/core/internal/tombstone/b;

    .line 78
    .line 79
    iget-object p0, p0, Lio/sentry/android/core/internal/tombstone/b;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p0, Ldo3;

    .line 82
    .line 83
    invoke-virtual {p0}, Lbe3;->c()V

    .line 84
    .line 85
    .line 86
    :cond_0
    return-void

    .line 87
    :pswitch_0
    iget-object v0, v1, Llo3;->f:Lio/sentry/android/core/internal/tombstone/b;

    .line 88
    .line 89
    invoke-virtual {v1}, Leg3;->y()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Llo3;->D()V

    .line 93
    .line 94
    .line 95
    iget-object v2, v1, Lsq3;->a:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v2, Lij3;

    .line 98
    .line 99
    iget-object v3, v2, Lij3;->f:Luh3;

    .line 100
    .line 101
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 102
    .line 103
    .line 104
    iget-object v3, v3, Luh3;->Y:Lsh3;

    .line 105
    .line 106
    const-string v4, "Activity resumed, time"

    .line 107
    .line 108
    iget-wide v5, p0, Lao3;->b:J

    .line 109
    .line 110
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {v3, p0, v4}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iget-object p0, v2, Lij3;->d:Lpd3;

    .line 118
    .line 119
    sget-object v3, Lvg3;->U0:Lug3;

    .line 120
    .line 121
    const/4 v4, 0x0

    .line 122
    invoke-virtual {p0, v4, v3}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-eqz v3, :cond_2

    .line 127
    .line 128
    invoke-virtual {p0}, Lpd3;->N()Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    if-nez p0, :cond_1

    .line 133
    .line 134
    iget-boolean p0, v1, Llo3;->d:Z

    .line 135
    .line 136
    if-eqz p0, :cond_4

    .line 137
    .line 138
    :cond_1
    iget-object p0, v0, Lio/sentry/android/core/internal/tombstone/b;->d:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast p0, Llo3;

    .line 141
    .line 142
    invoke-virtual {p0}, Leg3;->y()V

    .line 143
    .line 144
    .line 145
    iget-object p0, v0, Lio/sentry/android/core/internal/tombstone/b;->c:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast p0, Ldo3;

    .line 148
    .line 149
    invoke-virtual {p0}, Lbe3;->c()V

    .line 150
    .line 151
    .line 152
    iput-wide v5, v0, Lio/sentry/android/core/internal/tombstone/b;->a:J

    .line 153
    .line 154
    iput-wide v5, v0, Lio/sentry/android/core/internal/tombstone/b;->b:J

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_2
    invoke-virtual {p0}, Lpd3;->N()Z

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    if-nez p0, :cond_3

    .line 162
    .line 163
    iget-object p0, v2, Lij3;->e:Lki3;

    .line 164
    .line 165
    invoke-static {p0}, Lij3;->j(Lsq3;)V

    .line 166
    .line 167
    .line 168
    iget-object p0, p0, Lki3;->d0:Lhi3;

    .line 169
    .line 170
    invoke-virtual {p0}, Lhi3;->a()Z

    .line 171
    .line 172
    .line 173
    move-result p0

    .line 174
    if-eqz p0, :cond_4

    .line 175
    .line 176
    :cond_3
    iget-object p0, v0, Lio/sentry/android/core/internal/tombstone/b;->d:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast p0, Llo3;

    .line 179
    .line 180
    invoke-virtual {p0}, Leg3;->y()V

    .line 181
    .line 182
    .line 183
    iget-object p0, v0, Lio/sentry/android/core/internal/tombstone/b;->c:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast p0, Ldo3;

    .line 186
    .line 187
    invoke-virtual {p0}, Lbe3;->c()V

    .line 188
    .line 189
    .line 190
    iput-wide v5, v0, Lio/sentry/android/core/internal/tombstone/b;->a:J

    .line 191
    .line 192
    iput-wide v5, v0, Lio/sentry/android/core/internal/tombstone/b;->b:J

    .line 193
    .line 194
    :cond_4
    :goto_0
    iget-object p0, v1, Llo3;->i:Lwe2;

    .line 195
    .line 196
    iget-object v0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v0, Llo3;

    .line 199
    .line 200
    invoke-virtual {v0}, Leg3;->y()V

    .line 201
    .line 202
    .line 203
    iget-object v2, v0, Lsq3;->a:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v2, Lij3;

    .line 206
    .line 207
    iget-object p0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast p0, Lco3;

    .line 210
    .line 211
    if-eqz p0, :cond_5

    .line 212
    .line 213
    iget-object v3, v0, Llo3;->c:Lcom/google/android/gms/internal/measurement/zzcn;

    .line 214
    .line 215
    invoke-virtual {v3, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 216
    .line 217
    .line 218
    :cond_5
    iget-object p0, v2, Lij3;->e:Lki3;

    .line 219
    .line 220
    iget-object v3, v2, Lij3;->X:Lsl3;

    .line 221
    .line 222
    invoke-static {p0}, Lij3;->j(Lsq3;)V

    .line 223
    .line 224
    .line 225
    iget-object p0, p0, Lki3;->d0:Lhi3;

    .line 226
    .line 227
    const/4 v5, 0x0

    .line 228
    invoke-virtual {p0, v5}, Lhi3;->b(Z)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0}, Leg3;->y()V

    .line 232
    .line 233
    .line 234
    iput-boolean v5, v0, Llo3;->d:Z

    .line 235
    .line 236
    iget-object p0, v2, Lij3;->d:Lpd3;

    .line 237
    .line 238
    sget-object v0, Lvg3;->T0:Lug3;

    .line 239
    .line 240
    invoke-virtual {p0, v4, v0}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 241
    .line 242
    .line 243
    move-result p0

    .line 244
    if-eqz p0, :cond_6

    .line 245
    .line 246
    invoke-static {v3}, Lij3;->k(Lwg3;)V

    .line 247
    .line 248
    .line 249
    iget-boolean p0, v3, Lsl3;->Y:Z

    .line 250
    .line 251
    if-eqz p0, :cond_6

    .line 252
    .line 253
    iget-object p0, v2, Lij3;->f:Luh3;

    .line 254
    .line 255
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 256
    .line 257
    .line 258
    iget-object p0, p0, Luh3;->Y:Lsh3;

    .line 259
    .line 260
    const-string v0, "Retrying trigger URI registration in foreground"

    .line 261
    .line 262
    invoke-virtual {p0, v0}, Lsh3;->a(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-static {v3}, Lij3;->k(Lwg3;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v3}, Lsl3;->X()V

    .line 269
    .line 270
    .line 271
    :cond_6
    iget-object p0, v1, Llo3;->e:Lpi3;

    .line 272
    .line 273
    iget-object v0, p0, Lpi3;->a:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v0, Llo3;

    .line 276
    .line 277
    invoke-virtual {v0}, Leg3;->y()V

    .line 278
    .line 279
    .line 280
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v0, Lij3;

    .line 283
    .line 284
    invoke-virtual {v0}, Lij3;->d()Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    if-nez v1, :cond_7

    .line 289
    .line 290
    goto :goto_1

    .line 291
    :cond_7
    iget-object v0, v0, Lij3;->V:Lxt0;

    .line 292
    .line 293
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 297
    .line 298
    .line 299
    move-result-wide v0

    .line 300
    invoke-virtual {p0, v0, v1}, Lpi3;->c(J)V

    .line 301
    .line 302
    .line 303
    :goto_1
    return-void

    .line 304
    nop

    .line 305
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
