.class public final Ltq2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Luq2;


# direct methods
.method public synthetic constructor <init>(Luq2;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltq2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ltq2;->b:Luq2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/HashMap;)V
    .locals 4

    .line 1
    iget v0, p0, Ltq2;->a:I

    .line 2
    .line 3
    const-string v1, "event"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Ltq2;->b:Luq2;

    .line 10
    .line 11
    iget-boolean v0, p0, Luq2;->t:Z

    .line 12
    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    instance-of v0, p1, Lv72;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    check-cast p1, Lv72;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object p1, v2

    .line 27
    :goto_0
    if-eqz p1, :cond_5

    .line 28
    .line 29
    iget-object v0, p0, Luq2;->e:Lf31;

    .line 30
    .line 31
    iget-object v0, v0, Lf31;->i:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lfs0;

    .line 34
    .line 35
    const-string v1, "ScreenContext"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lfs0;->r(Ljava/lang/String;)Lng2;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    instance-of v1, v0, Lt72;

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    move-object v2, v0

    .line 46
    check-cast v2, Lt72;

    .line 47
    .line 48
    :cond_1
    if-eqz v2, :cond_4

    .line 49
    .line 50
    iget-object v0, p1, Lv72;->i:Ljava/lang/String;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    iget-object v0, p1, Lv72;->i:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v1, v2, Lt72;->d:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    iget-object v0, p1, Lv72;->j:Ljava/lang/String;

    .line 72
    .line 73
    iget-object v1, v2, Lt72;->e:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_5

    .line 80
    .line 81
    :cond_3
    :goto_1
    invoke-virtual {p0, p1}, Luq2;->c(Lk;)Ljava/util/UUID;

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_4
    invoke-virtual {p0, p1}, Luq2;->c(Lk;)Ljava/util/UUID;

    .line 86
    .line 87
    .line 88
    :cond_5
    :goto_2
    return-void

    .line 89
    :pswitch_0
    iget-object v0, p0, Ltq2;->b:Luq2;

    .line 90
    .line 91
    iget-object v1, v0, Luq2;->k:Lza2;

    .line 92
    .line 93
    if-eqz v1, :cond_c

    .line 94
    .line 95
    iget-boolean v0, v0, Luq2;->r:Z

    .line 96
    .line 97
    if-nez v0, :cond_6

    .line 98
    .line 99
    goto/16 :goto_5

    .line 100
    .line 101
    :cond_6
    const-string v0, "isForeground"

    .line 102
    .line 103
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 108
    .line 109
    if-eqz v0, :cond_7

    .line 110
    .line 111
    move-object v2, p1

    .line 112
    check-cast v2, Ljava/lang/Boolean;

    .line 113
    .line 114
    :cond_7
    if-eqz v2, :cond_c

    .line 115
    .line 116
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    iget-object v0, v1, Lza2;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    xor-int/lit8 v2, p1, 0x1

    .line 127
    .line 128
    if-ne v0, v2, :cond_8

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_8
    iget-object p0, p0, Ltq2;->b:Luq2;

    .line 132
    .line 133
    if-eqz p1, :cond_9

    .line 134
    .line 135
    new-instance v0, Lxl0;

    .line 136
    .line 137
    invoke-direct {v0}, Lk;-><init>()V

    .line 138
    .line 139
    .line 140
    iget v3, v1, Lza2;->d:I

    .line 141
    .line 142
    add-int/lit8 v3, v3, 0x1

    .line 143
    .line 144
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    iput-object v3, v0, Lxl0;->b:Ljava/lang/Integer;

    .line 149
    .line 150
    invoke-virtual {p0, v0}, Luq2;->c(Lk;)Ljava/util/UUID;

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_9
    new-instance v0, Lhh;

    .line 155
    .line 156
    invoke-direct {v0}, Lk;-><init>()V

    .line 157
    .line 158
    .line 159
    iget v3, v1, Lza2;->c:I

    .line 160
    .line 161
    add-int/lit8 v3, v3, 0x1

    .line 162
    .line 163
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    iput-object v3, v0, Lhh;->b:Ljava/lang/Integer;

    .line 168
    .line 169
    invoke-virtual {p0, v0}, Luq2;->c(Lk;)Ljava/util/UUID;

    .line 170
    .line 171
    .line 172
    :goto_3
    iget-object p0, v1, Lza2;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 173
    .line 174
    invoke-virtual {p0, p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    if-nez p0, :cond_a

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_a
    const/4 p0, 0x0

    .line 182
    const-string v0, "za2"

    .line 183
    .line 184
    if-eqz p1, :cond_b

    .line 185
    .line 186
    const-string p1, "Application moved to foreground"

    .line 187
    .line 188
    new-array v2, p0, [Ljava/lang/Object;

    .line 189
    .line 190
    invoke-static {v0, p1, v2}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    iget-object p1, v1, Lza2;->l:Ljava/lang/Runnable;

    .line 194
    .line 195
    invoke-static {p1}, Lza2;->a(Ljava/lang/Runnable;)V

    .line 196
    .line 197
    .line 198
    :try_start_0
    invoke-virtual {v1, p0}, Lza2;->c(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 199
    .line 200
    .line 201
    goto :goto_4

    .line 202
    :catch_0
    move-exception p0

    .line 203
    const-string p1, "Could not resume checking as tracker not setup. Exception: %s"

    .line 204
    .line 205
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-static {v0, p1, p0}, Lk50;->q(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    :goto_4
    iget p0, v1, Lza2;->d:I

    .line 213
    .line 214
    add-int/lit8 p0, p0, 0x1

    .line 215
    .line 216
    iput p0, v1, Lza2;->d:I

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_b
    const-string p1, "Application moved to background"

    .line 220
    .line 221
    new-array p0, p0, [Ljava/lang/Object;

    .line 222
    .line 223
    invoke-static {v0, p1, p0}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    iget-object p0, v1, Lza2;->m:Ljava/lang/Runnable;

    .line 227
    .line 228
    invoke-static {p0}, Lza2;->a(Ljava/lang/Runnable;)V

    .line 229
    .line 230
    .line 231
    iget p0, v1, Lza2;->c:I

    .line 232
    .line 233
    add-int/lit8 p0, p0, 0x1

    .line 234
    .line 235
    iput p0, v1, Lza2;->c:I

    .line 236
    .line 237
    :cond_c
    :goto_5
    return-void

    .line 238
    :pswitch_1
    iget-object p0, p0, Ltq2;->b:Luq2;

    .line 239
    .line 240
    iget-boolean v0, p0, Luq2;->s:Z

    .line 241
    .line 242
    if-eqz v0, :cond_e

    .line 243
    .line 244
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    instance-of v0, p1, Lk;

    .line 249
    .line 250
    if-eqz v0, :cond_d

    .line 251
    .line 252
    move-object v2, p1

    .line 253
    check-cast v2, Lk;

    .line 254
    .line 255
    :cond_d
    if-eqz v2, :cond_e

    .line 256
    .line 257
    invoke-virtual {p0, v2}, Luq2;->c(Lk;)Ljava/util/UUID;

    .line 258
    .line 259
    .line 260
    :cond_e
    return-void

    .line 261
    :pswitch_2
    iget-object p0, p0, Ltq2;->b:Luq2;

    .line 262
    .line 263
    iget-boolean v0, p0, Luq2;->q:Z

    .line 264
    .line 265
    if-eqz v0, :cond_10

    .line 266
    .line 267
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    instance-of v0, p1, Lk;

    .line 272
    .line 273
    if-eqz v0, :cond_f

    .line 274
    .line 275
    move-object v2, p1

    .line 276
    check-cast v2, Lk;

    .line 277
    .line 278
    :cond_f
    if-eqz v2, :cond_10

    .line 279
    .line 280
    invoke-virtual {p0, v2}, Luq2;->c(Lk;)Ljava/util/UUID;

    .line 281
    .line 282
    .line 283
    :cond_10
    return-void

    .line 284
    :pswitch_3
    iget-object p0, p0, Ltq2;->b:Luq2;

    .line 285
    .line 286
    iget-boolean v0, p0, Luq2;->p:Z

    .line 287
    .line 288
    if-eqz v0, :cond_12

    .line 289
    .line 290
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    instance-of v0, p1, Lk;

    .line 295
    .line 296
    if-eqz v0, :cond_11

    .line 297
    .line 298
    move-object v2, p1

    .line 299
    check-cast v2, Lk;

    .line 300
    .line 301
    :cond_11
    if-eqz v2, :cond_12

    .line 302
    .line 303
    invoke-virtual {p0, v2}, Luq2;->c(Lk;)Ljava/util/UUID;

    .line 304
    .line 305
    .line 306
    :cond_12
    return-void

    .line 307
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
