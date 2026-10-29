.class public final Lmj3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzr;

.field public final synthetic c:Lcom/google/android/gms/measurement/internal/zzjc;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/zzjc;Lcom/google/android/gms/measurement/internal/zzr;I)V
    .locals 0

    .line 1
    iput p3, p0, Lmj3;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lmj3;->b:Lcom/google/android/gms/measurement/internal/zzr;

    .line 4
    .line 5
    iput-object p1, p0, Lmj3;->c:Lcom/google/android/gms/measurement/internal/zzjc;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lmj3;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lmj3;->b:Lcom/google/android/gms/measurement/internal/zzr;

    .line 4
    .line 5
    iget-object p0, p0, Lmj3;->c:Lcom/google/android/gms/measurement/internal/zzjc;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 11
    .line 12
    invoke-virtual {p0}, Lmp3;->A()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lmp3;->l0(Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 20
    .line 21
    invoke-virtual {v0}, Lmp3;->A()V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 25
    .line 26
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lbj3;->y()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lmp3;->k0()V

    .line 34
    .line 35
    .line 36
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v0}, Lkb1;->k(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v1}, Lmp3;->l0(Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v1}, Lmp3;->m0(Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 49
    .line 50
    invoke-virtual {v0}, Lmp3;->A()V

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 54
    .line 55
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Lbj3;->y()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lmp3;->k0()V

    .line 63
    .line 64
    .line 65
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v0}, Lkb1;->k(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v1}, Lmp3;->a0(Lcom/google/android/gms/measurement/internal/zzr;)Ldi3;

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 75
    .line 76
    invoke-virtual {v0}, Lmp3;->A()V

    .line 77
    .line 78
    .line 79
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 80
    .line 81
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Lbj3;->y()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lmp3;->k0()V

    .line 89
    .line 90
    .line 91
    invoke-static {v1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {v0}, Lkb1;->k(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lmp3;->d0()Lpd3;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    sget-object v3, Lvg3;->z0:Lug3;

    .line 104
    .line 105
    const/4 v4, 0x0

    .line 106
    invoke-virtual {v2, v4, v3}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    const/4 v3, 0x0

    .line 111
    if-eqz v2, :cond_0

    .line 112
    .line 113
    invoke-virtual {p0}, Lmp3;->f()Lxv;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    check-cast v2, Lxt0;

    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 123
    .line 124
    .line 125
    move-result-wide v5

    .line 126
    invoke-virtual {p0}, Lmp3;->d0()Lpd3;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    sget-object v7, Lvg3;->i0:Lug3;

    .line 131
    .line 132
    invoke-virtual {v2, v4, v7}, Lpd3;->H(Ljava/lang/String;Lug3;)I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    invoke-virtual {p0}, Lmp3;->d0()Lpd3;

    .line 137
    .line 138
    .line 139
    sget-object v7, Lvg3;->e:Lug3;

    .line 140
    .line 141
    invoke-virtual {v7, v4}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    check-cast v7, Ljava/lang/Long;

    .line 146
    .line 147
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 148
    .line 149
    .line 150
    move-result-wide v7

    .line 151
    sub-long/2addr v5, v7

    .line 152
    :goto_0
    if-ge v3, v2, :cond_1

    .line 153
    .line 154
    invoke-virtual {p0, v4, v5, v6}, Lmp3;->G(Ljava/lang/String;J)Z

    .line 155
    .line 156
    .line 157
    move-result v7

    .line 158
    if-eqz v7, :cond_1

    .line 159
    .line 160
    add-int/lit8 v3, v3, 0x1

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_0
    invoke-virtual {p0}, Lmp3;->d0()Lpd3;

    .line 164
    .line 165
    .line 166
    sget-object v2, Lvg3;->l:Lug3;

    .line 167
    .line 168
    invoke-virtual {v2, v4}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    check-cast v2, Ljava/lang/Integer;

    .line 173
    .line 174
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    int-to-long v5, v2

    .line 179
    :goto_1
    int-to-long v7, v3

    .line 180
    cmp-long v2, v7, v5

    .line 181
    .line 182
    if-gez v2, :cond_1

    .line 183
    .line 184
    const-wide/16 v7, 0x0

    .line 185
    .line 186
    invoke-virtual {p0, v0, v7, v8}, Lmp3;->G(Ljava/lang/String;J)Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-eqz v2, :cond_1

    .line 191
    .line 192
    add-int/lit8 v3, v3, 0x1

    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_1
    invoke-virtual {p0}, Lmp3;->d0()Lpd3;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    sget-object v3, Lvg3;->A0:Lug3;

    .line 200
    .line 201
    invoke-virtual {v2, v4, v3}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    if-eqz v2, :cond_2

    .line 206
    .line 207
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-virtual {v2}, Lbj3;->y()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0}, Lmp3;->F()V

    .line 215
    .line 216
    .line 217
    :cond_2
    iget-object v2, p0, Lmp3;->U:Lyo3;

    .line 218
    .line 219
    iget v1, v1, Lcom/google/android/gms/measurement/internal/zzr;->p0:I

    .line 220
    .line 221
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzin;->zzb(I)Lcom/google/android/gms/internal/measurement/zzin;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-virtual {v2}, Lsq3;->y()V

    .line 226
    .line 227
    .line 228
    sget-object v3, Lcom/google/android/gms/internal/measurement/zzin;->zzb:Lcom/google/android/gms/internal/measurement/zzin;

    .line 229
    .line 230
    if-ne v1, v3, :cond_4

    .line 231
    .line 232
    invoke-static {v0}, Lyo3;->C(Ljava/lang/String;)Z

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    if-eqz v1, :cond_3

    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_3
    iget-object v1, v2, Lqo3;->b:Lmp3;

    .line 240
    .line 241
    iget-object v1, v1, Lmp3;->a:Lvi3;

    .line 242
    .line 243
    invoke-static {v1}, Lmp3;->S(Lwo3;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v1, v0}, Lvi3;->L(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgl;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    if-eqz v1, :cond_4

    .line 251
    .line 252
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgl;->zzp()Z

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    if-eqz v2, :cond_4

    .line 257
    .line 258
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgl;->zzq()Lcom/google/android/gms/internal/measurement/zzgv;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgv;->zzd()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-nez v1, :cond_4

    .line 271
    .line 272
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    iget-object v1, v1, Luh3;->Y:Lsh3;

    .line 277
    .line 278
    const-string v2, "[sgtm] Going background, trigger client side upload. appId"

    .line 279
    .line 280
    invoke-virtual {v1, v0, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p0}, Lmp3;->f()Lxv;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    check-cast v1, Lxt0;

    .line 288
    .line 289
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 293
    .line 294
    .line 295
    move-result-wide v1

    .line 296
    invoke-virtual {p0, v0, v1, v2}, Lmp3;->r(Ljava/lang/String;J)V

    .line 297
    .line 298
    .line 299
    :cond_4
    :goto_2
    return-void

    .line 300
    nop

    .line 301
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
