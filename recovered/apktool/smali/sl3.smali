.class public final Lsl3;
.super Lwg3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public U:I

.field public V:Lwk3;

.field public W:Lwk3;

.field public X:Ljava/util/PriorityQueue;

.field public Y:Z

.field public Z:Lok3;

.field public final a0:Ljava/util/concurrent/atomic/AtomicLong;

.field public b0:J

.field public c:Ldh0;

.field public final c0:Loi3;

.field public d:Lqk3;

.field public d0:Z

.field public final e:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public e0:Lwk3;

.field public f:Z

.field public f0:Lrl3;

.field public g0:Lwk3;

.field public final h0:Lac3;

.field public final i:Ljava/util/concurrent/atomic/AtomicReference;

.field public final v:Ljava/lang/Object;

.field public w:Z


# direct methods
.method public constructor <init>(Lij3;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lwg3;-><init>(Lij3;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lsl3;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lsl3;->v:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lsl3;->w:Z

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    iput v0, p0, Lsl3;->U:I

    .line 23
    .line 24
    iput-boolean v0, p0, Lsl3;->d0:Z

    .line 25
    .line 26
    new-instance v0, Lac3;

    .line 27
    .line 28
    const/4 v1, 0x7

    .line 29
    invoke-direct {v0, p0, v1}, Lac3;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lsl3;->h0:Lac3;

    .line 33
    .line 34
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lsl3;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 40
    .line 41
    sget-object v0, Lok3;->c:Lok3;

    .line 42
    .line 43
    iput-object v0, p0, Lsl3;->Z:Lok3;

    .line 44
    .line 45
    const-wide/16 v0, -0x1

    .line 46
    .line 47
    iput-wide v0, p0, Lsl3;->b0:J

    .line 48
    .line 49
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 50
    .line 51
    const-wide/16 v1, 0x0

    .line 52
    .line 53
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lsl3;->a0:Ljava/util/concurrent/atomic/AtomicLong;

    .line 57
    .line 58
    new-instance v0, Loi3;

    .line 59
    .line 60
    invoke-direct {v0, p1}, Loi3;-><init>(Lij3;)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lsl3;->c0:Loi3;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final C()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final D(Lok3;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Leg3;->y()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lnk3;->c:Lnk3;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lok3;->i(Lnk3;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    sget-object v0, Lnk3;->b:Lnk3;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lok3;->i(Lnk3;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    move p1, v2

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    :goto_1
    iget-object p1, p0, Lsq3;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Lij3;

    .line 28
    .line 29
    invoke-virtual {p1}, Lij3;->o()Lpn3;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lpn3;->I()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move p1, v1

    .line 41
    :goto_2
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lij3;

    .line 44
    .line 45
    iget-object v3, v0, Lij3;->i:Lbj3;

    .line 46
    .line 47
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Lbj3;->y()V

    .line 51
    .line 52
    .line 53
    iget-boolean v3, v0, Lij3;->k0:Z

    .line 54
    .line 55
    if-eq p1, v3, :cond_5

    .line 56
    .line 57
    iget-object v3, v0, Lij3;->i:Lbj3;

    .line 58
    .line 59
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3}, Lbj3;->y()V

    .line 63
    .line 64
    .line 65
    iput-boolean p1, v0, Lij3;->k0:Z

    .line 66
    .line 67
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Lij3;

    .line 70
    .line 71
    iget-object v0, v0, Lij3;->e:Lki3;

    .line 72
    .line 73
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lsq3;->y()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    const-string v4, "measurement_enabled_from_api"

    .line 84
    .line 85
    invoke-interface {v3, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_3

    .line 90
    .line 91
    invoke-virtual {v0}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    goto :goto_3

    .line 104
    :cond_3
    const/4 v0, 0x0

    .line 105
    :goto_3
    if-eqz p1, :cond_4

    .line 106
    .line 107
    if-eqz v0, :cond_4

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_5

    .line 114
    .line 115
    :cond_4
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p0, p1, v1}, Lsl3;->P(Ljava/lang/Boolean;Z)V

    .line 120
    .line 121
    .line 122
    :cond_5
    return-void
.end method

.method public final E(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V
    .locals 12

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    new-instance v0, Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v0, p3

    .line 10
    :goto_0
    const-string v1, "screen_view"

    .line 11
    .line 12
    invoke-static {p2, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_b

    .line 18
    .line 19
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Lij3;

    .line 22
    .line 23
    iget-object p1, p0, Lij3;->W:Llm3;

    .line 24
    .line 25
    invoke-static {p1}, Lij3;->k(Lwg3;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p1, Llm3;->W:Ljava/lang/Object;

    .line 29
    .line 30
    monitor-enter v1

    .line 31
    :try_start_0
    iget-boolean p0, p1, Llm3;->V:Z

    .line 32
    .line 33
    if-nez p0, :cond_1

    .line 34
    .line 35
    iget-object p0, p1, Lsq3;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Lij3;

    .line 38
    .line 39
    iget-object p0, p0, Lij3;->f:Luh3;

    .line 40
    .line 41
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Luh3;->V:Lsh3;

    .line 45
    .line 46
    const-string p1, "Cannot log screen view event when the app is in the background."

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lsh3;->a(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    monitor-exit v1

    .line 52
    return-void

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    move-object p0, v0

    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :cond_1
    const-string p0, "screen_name"

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    const/16 p0, 0x1f4

    .line 64
    .line 65
    if-eqz v4, :cond_3

    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    if-lez p2, :cond_2

    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    iget-object v3, p1, Lsq3;->a:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v3, Lij3;

    .line 80
    .line 81
    iget-object v3, v3, Lij3;->d:Lpd3;

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    if-le p2, p0, :cond_3

    .line 87
    .line 88
    :cond_2
    iget-object p0, p1, Lsq3;->a:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p0, Lij3;

    .line 91
    .line 92
    iget-object p0, p0, Lij3;->f:Luh3;

    .line 93
    .line 94
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 95
    .line 96
    .line 97
    iget-object p0, p0, Luh3;->V:Lsh3;

    .line 98
    .line 99
    const-string p1, "Invalid screen name length for screen view. Length"

    .line 100
    .line 101
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-virtual {p0, p2, p1}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    monitor-exit v1

    .line 113
    return-void

    .line 114
    :cond_3
    const-string p2, "screen_class"

    .line 115
    .line 116
    invoke-virtual {v0, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    if-eqz p2, :cond_5

    .line 121
    .line 122
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-lez v3, :cond_4

    .line 127
    .line 128
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    iget-object v5, p1, Lsq3;->a:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v5, Lij3;

    .line 135
    .line 136
    iget-object v5, v5, Lij3;->d:Lpd3;

    .line 137
    .line 138
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    if-le v3, p0, :cond_5

    .line 142
    .line 143
    :cond_4
    iget-object p0, p1, Lsq3;->a:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast p0, Lij3;

    .line 146
    .line 147
    iget-object p0, p0, Lij3;->f:Luh3;

    .line 148
    .line 149
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 150
    .line 151
    .line 152
    iget-object p0, p0, Luh3;->V:Lsh3;

    .line 153
    .line 154
    const-string p1, "Invalid screen class length for screen view. Length"

    .line 155
    .line 156
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 157
    .line 158
    .line 159
    move-result p2

    .line 160
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    invoke-virtual {p0, p2, p1}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    monitor-exit v1

    .line 168
    return-void

    .line 169
    :cond_5
    if-nez p2, :cond_6

    .line 170
    .line 171
    iget-object p0, p1, Llm3;->i:Lcom/google/android/gms/internal/measurement/zzdf;

    .line 172
    .line 173
    if-eqz p0, :cond_7

    .line 174
    .line 175
    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzb:Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {p1, p0}, Llm3;->G(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    :cond_6
    :goto_1
    move-object v5, p2

    .line 182
    goto :goto_2

    .line 183
    :cond_7
    const-string p2, "Activity"

    .line 184
    .line 185
    goto :goto_1

    .line 186
    :goto_2
    iget-object p0, p1, Llm3;->c:Lbm3;

    .line 187
    .line 188
    iget-boolean p2, p1, Llm3;->v:Z

    .line 189
    .line 190
    if-eqz p2, :cond_8

    .line 191
    .line 192
    if-eqz p0, :cond_8

    .line 193
    .line 194
    iput-boolean v2, p1, Llm3;->v:Z

    .line 195
    .line 196
    iget-object p2, p0, Lbm3;->b:Ljava/lang/String;

    .line 197
    .line 198
    invoke-static {p2, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result p2

    .line 202
    iget-object p0, p0, Lbm3;->a:Ljava/lang/String;

    .line 203
    .line 204
    invoke-static {p0, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result p0

    .line 208
    if-eqz p2, :cond_8

    .line 209
    .line 210
    if-eqz p0, :cond_8

    .line 211
    .line 212
    iget-object p0, p1, Lsq3;->a:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast p0, Lij3;

    .line 215
    .line 216
    iget-object p0, p0, Lij3;->f:Luh3;

    .line 217
    .line 218
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 219
    .line 220
    .line 221
    iget-object p0, p0, Luh3;->V:Lsh3;

    .line 222
    .line 223
    const-string p1, "Ignoring call to log screen view event with duplicate parameters."

    .line 224
    .line 225
    invoke-virtual {p0, p1}, Lsh3;->a(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    monitor-exit v1

    .line 229
    return-void

    .line 230
    :cond_8
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 231
    iget-object p0, p1, Lsq3;->a:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast p0, Lij3;

    .line 234
    .line 235
    iget-object p2, p0, Lij3;->f:Luh3;

    .line 236
    .line 237
    invoke-static {p2}, Lij3;->l(Lhk3;)V

    .line 238
    .line 239
    .line 240
    iget-object p2, p2, Luh3;->Y:Lsh3;

    .line 241
    .line 242
    if-nez v4, :cond_9

    .line 243
    .line 244
    const-string v1, "null"

    .line 245
    .line 246
    goto :goto_3

    .line 247
    :cond_9
    move-object v1, v4

    .line 248
    :goto_3
    const-string v2, "Logging screen view with name, class"

    .line 249
    .line 250
    invoke-virtual {p2, v1, v2, v5}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    iget-object p2, p1, Llm3;->c:Lbm3;

    .line 254
    .line 255
    if-nez p2, :cond_a

    .line 256
    .line 257
    iget-object p2, p1, Llm3;->d:Lbm3;

    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_a
    iget-object p2, p1, Llm3;->c:Lbm3;

    .line 261
    .line 262
    :goto_4
    new-instance v3, Lbm3;

    .line 263
    .line 264
    iget-object v1, p0, Lij3;->w:Lup3;

    .line 265
    .line 266
    invoke-static {v1}, Lij3;->j(Lsq3;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1}, Lup3;->v0()J

    .line 270
    .line 271
    .line 272
    move-result-wide v6

    .line 273
    const/4 v8, 0x1

    .line 274
    move-wide/from16 v9, p6

    .line 275
    .line 276
    invoke-direct/range {v3 .. v10}, Lbm3;-><init>(Ljava/lang/String;Ljava/lang/String;JZJ)V

    .line 277
    .line 278
    .line 279
    iput-object v3, p1, Llm3;->c:Lbm3;

    .line 280
    .line 281
    iput-object p2, p1, Llm3;->d:Lbm3;

    .line 282
    .line 283
    iput-object v3, p1, Llm3;->w:Lbm3;

    .line 284
    .line 285
    iget-object v1, p0, Lij3;->V:Lxt0;

    .line 286
    .line 287
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 291
    .line 292
    .line 293
    move-result-wide v1

    .line 294
    iget-object v4, p0, Lij3;->i:Lbj3;

    .line 295
    .line 296
    invoke-static {v4}, Lij3;->l(Lhk3;)V

    .line 297
    .line 298
    .line 299
    new-instance p0, Lkq2;

    .line 300
    .line 301
    move-object/from16 p4, p2

    .line 302
    .line 303
    move-object p2, v0

    .line 304
    move-wide/from16 p5, v1

    .line 305
    .line 306
    move-object p3, v3

    .line 307
    invoke-direct/range {p0 .. p6}, Lkq2;-><init>(Llm3;Landroid/os/Bundle;Lbm3;Lbm3;J)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v4, p0}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 311
    .line 312
    .line 313
    return-void

    .line 314
    :goto_5
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 315
    throw p0

    .line 316
    :cond_b
    const/4 v1, 0x1

    .line 317
    if-eqz p5, :cond_c

    .line 318
    .line 319
    iget-object v3, p0, Lsl3;->d:Lqk3;

    .line 320
    .line 321
    if-eqz v3, :cond_c

    .line 322
    .line 323
    invoke-static {p2}, Lup3;->X(Ljava/lang/String;)Z

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    if-eqz v3, :cond_d

    .line 328
    .line 329
    :cond_c
    move v10, v1

    .line 330
    goto :goto_6

    .line 331
    :cond_d
    move v10, v2

    .line 332
    :goto_6
    if-nez p1, :cond_e

    .line 333
    .line 334
    const-string p1, "app"

    .line 335
    .line 336
    :cond_e
    move-object v4, p1

    .line 337
    new-instance v8, Landroid/os/Bundle;

    .line 338
    .line 339
    invoke-direct {v8, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v8}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 347
    .line 348
    .line 349
    move-result-object p1

    .line 350
    :cond_f
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    if-eqz v0, :cond_14

    .line 355
    .line 356
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    check-cast v0, Ljava/lang/String;

    .line 361
    .line 362
    invoke-virtual {v8, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    instance-of v3, v1, Landroid/os/Bundle;

    .line 367
    .line 368
    if-eqz v3, :cond_10

    .line 369
    .line 370
    new-instance v3, Landroid/os/Bundle;

    .line 371
    .line 372
    check-cast v1, Landroid/os/Bundle;

    .line 373
    .line 374
    invoke-direct {v3, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v8, v0, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 378
    .line 379
    .line 380
    goto :goto_7

    .line 381
    :cond_10
    instance-of v0, v1, [Landroid/os/Parcelable;

    .line 382
    .line 383
    if-eqz v0, :cond_12

    .line 384
    .line 385
    check-cast v1, [Landroid/os/Parcelable;

    .line 386
    .line 387
    move v0, v2

    .line 388
    :goto_8
    array-length v3, v1

    .line 389
    if-ge v0, v3, :cond_f

    .line 390
    .line 391
    aget-object v3, v1, v0

    .line 392
    .line 393
    instance-of v5, v3, Landroid/os/Bundle;

    .line 394
    .line 395
    if-eqz v5, :cond_11

    .line 396
    .line 397
    new-instance v5, Landroid/os/Bundle;

    .line 398
    .line 399
    check-cast v3, Landroid/os/Bundle;

    .line 400
    .line 401
    invoke-direct {v5, v3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 402
    .line 403
    .line 404
    aput-object v5, v1, v0

    .line 405
    .line 406
    :cond_11
    add-int/lit8 v0, v0, 0x1

    .line 407
    .line 408
    goto :goto_8

    .line 409
    :cond_12
    instance-of v0, v1, Ljava/util/List;

    .line 410
    .line 411
    if-eqz v0, :cond_f

    .line 412
    .line 413
    check-cast v1, Ljava/util/List;

    .line 414
    .line 415
    move v0, v2

    .line 416
    :goto_9
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    if-ge v0, v3, :cond_f

    .line 421
    .line 422
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    instance-of v5, v3, Landroid/os/Bundle;

    .line 427
    .line 428
    if-eqz v5, :cond_13

    .line 429
    .line 430
    new-instance v5, Landroid/os/Bundle;

    .line 431
    .line 432
    check-cast v3, Landroid/os/Bundle;

    .line 433
    .line 434
    invoke-direct {v5, v3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 435
    .line 436
    .line 437
    invoke-interface {v1, v0, v5}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    :cond_13
    add-int/lit8 v0, v0, 0x1

    .line 441
    .line 442
    goto :goto_9

    .line 443
    :cond_14
    iget-object p1, p0, Lsq3;->a:Ljava/lang/Object;

    .line 444
    .line 445
    check-cast p1, Lij3;

    .line 446
    .line 447
    iget-object p1, p1, Lij3;->i:Lbj3;

    .line 448
    .line 449
    invoke-static {p1}, Lij3;->l(Lhk3;)V

    .line 450
    .line 451
    .line 452
    new-instance v2, Lel3;

    .line 453
    .line 454
    move-object v3, p0

    .line 455
    move-object v5, p2

    .line 456
    move/from16 v11, p4

    .line 457
    .line 458
    move/from16 v9, p5

    .line 459
    .line 460
    move-wide/from16 v6, p6

    .line 461
    .line 462
    invoke-direct/range {v2 .. v11}, Lel3;-><init>(Lsl3;Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZ)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {p1, v2}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 466
    .line 467
    .line 468
    return-void
.end method

.method public final F()V
    .locals 54

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Leg3;->y()V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lsq3;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lij3;

    .line 9
    .line 10
    iget-object v2, v1, Lij3;->f:Luh3;

    .line 11
    .line 12
    iget-object v3, v1, Lij3;->V:Lxt0;

    .line 13
    .line 14
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 15
    .line 16
    .line 17
    iget-object v4, v2, Luh3;->X:Lsh3;

    .line 18
    .line 19
    const-string v5, "Handle tcf update."

    .line 20
    .line 21
    invoke-virtual {v4, v5}, Lsh3;->a(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v4, v1, Lij3;->e:Lki3;

    .line 25
    .line 26
    invoke-static {v4}, Lij3;->j(Lsq3;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4}, Lki3;->E()Landroid/content/SharedPreferences;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    new-instance v6, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    sget-object v7, Lvg3;->Z0:Lug3;

    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    invoke-virtual {v7, v8}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    check-cast v9, Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    const-string v10, "CmpSdkID"

    .line 52
    .line 53
    const-string v11, "PolicyVersion"

    .line 54
    .line 55
    const-string v12, "EnableAdvertiserConsentMode"

    .line 56
    .line 57
    const-string v13, "gdprApplies"

    .line 58
    .line 59
    const-string v14, "Version"

    .line 60
    .line 61
    const-string v15, "0"

    .line 62
    .line 63
    const-string v16, "1"

    .line 64
    .line 65
    const-string v8, "IABTCF_VendorConsents"

    .line 66
    .line 67
    move-object/from16 v17, v3

    .line 68
    .line 69
    const-string v3, "IABTCF_PurposeConsents"

    .line 70
    .line 71
    move/from16 v18, v9

    .line 72
    .line 73
    const/16 v19, 0x2

    .line 74
    .line 75
    const-string v9, "IABTCF_EnableAdvertiserConsentMode"

    .line 76
    .line 77
    move-object/from16 v20, v15

    .line 78
    .line 79
    const-string v15, "IABTCF_gdprApplies"

    .line 80
    .line 81
    const-string v0, "IABTCF_PolicyVersion"

    .line 82
    .line 83
    move-object/from16 v21, v4

    .line 84
    .line 85
    const-string v4, "IABTCF_CmpSdkID"

    .line 86
    .line 87
    move-object/from16 v22, v7

    .line 88
    .line 89
    const-string v7, ""

    .line 90
    .line 91
    move-object/from16 v23, v1

    .line 92
    .line 93
    const/16 v25, 0x1

    .line 94
    .line 95
    const/16 v26, 0x0

    .line 96
    .line 97
    if-eqz v18, :cond_1a

    .line 98
    .line 99
    sget-object v6, Loo3;->a:Lt22;

    .line 100
    .line 101
    sget-object v6, Lcom/google/android/gms/internal/measurement/zzko;->zzb:Lcom/google/android/gms/internal/measurement/zzko;

    .line 102
    .line 103
    new-instance v1, Ljava/util/AbstractMap$SimpleImmutableEntry;

    .line 104
    .line 105
    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-object/from16 v27, v2

    .line 109
    .line 110
    sget-object v2, Lno3;->a:Lno3;

    .line 111
    .line 112
    invoke-direct {v1, v6, v2}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    sget-object v6, Lcom/google/android/gms/internal/measurement/zzko;->zzc:Lcom/google/android/gms/internal/measurement/zzko;

    .line 116
    .line 117
    move-object/from16 v28, v1

    .line 118
    .line 119
    new-instance v1, Ljava/util/AbstractMap$SimpleImmutableEntry;

    .line 120
    .line 121
    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-object/from16 v29, v7

    .line 125
    .line 126
    sget-object v7, Lno3;->b:Lno3;

    .line 127
    .line 128
    invoke-direct {v1, v6, v7}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    sget-object v6, Lcom/google/android/gms/internal/measurement/zzko;->zzd:Lcom/google/android/gms/internal/measurement/zzko;

    .line 132
    .line 133
    move-object/from16 v30, v1

    .line 134
    .line 135
    new-instance v1, Ljava/util/AbstractMap$SimpleImmutableEntry;

    .line 136
    .line 137
    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    invoke-direct {v1, v6, v2}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    sget-object v6, Lcom/google/android/gms/internal/measurement/zzko;->zze:Lcom/google/android/gms/internal/measurement/zzko;

    .line 144
    .line 145
    move-object/from16 v31, v1

    .line 146
    .line 147
    new-instance v1, Ljava/util/AbstractMap$SimpleImmutableEntry;

    .line 148
    .line 149
    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    invoke-direct {v1, v6, v2}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    sget-object v2, Lcom/google/android/gms/internal/measurement/zzko;->zzh:Lcom/google/android/gms/internal/measurement/zzko;

    .line 156
    .line 157
    new-instance v6, Ljava/util/AbstractMap$SimpleImmutableEntry;

    .line 158
    .line 159
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    invoke-direct {v6, v2, v7}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    sget-object v2, Lcom/google/android/gms/internal/measurement/zzko;->zzj:Lcom/google/android/gms/internal/measurement/zzko;

    .line 166
    .line 167
    move-object/from16 v32, v1

    .line 168
    .line 169
    new-instance v1, Ljava/util/AbstractMap$SimpleImmutableEntry;

    .line 170
    .line 171
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    invoke-direct {v1, v2, v7}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    sget-object v2, Lcom/google/android/gms/internal/measurement/zzko;->zzk:Lcom/google/android/gms/internal/measurement/zzko;

    .line 178
    .line 179
    move-object/from16 v33, v1

    .line 180
    .line 181
    new-instance v1, Ljava/util/AbstractMap$SimpleImmutableEntry;

    .line 182
    .line 183
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    invoke-direct {v1, v2, v7}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    const/4 v2, 0x7

    .line 190
    new-array v2, v2, [Ljava/util/Map$Entry;

    .line 191
    .line 192
    aput-object v28, v2, v26

    .line 193
    .line 194
    aput-object v30, v2, v25

    .line 195
    .line 196
    aput-object v31, v2, v19

    .line 197
    .line 198
    const/4 v7, 0x3

    .line 199
    aput-object v32, v2, v7

    .line 200
    .line 201
    const/4 v7, 0x4

    .line 202
    aput-object v6, v2, v7

    .line 203
    .line 204
    const/4 v6, 0x5

    .line 205
    aput-object v33, v2, v6

    .line 206
    .line 207
    const/16 v28, 0x6

    .line 208
    .line 209
    aput-object v1, v2, v28

    .line 210
    .line 211
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    if-eqz v1, :cond_0

    .line 216
    .line 217
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    goto :goto_0

    .line 222
    :cond_0
    move v2, v7

    .line 223
    :goto_0
    new-instance v7, Lbx0;

    .line 224
    .line 225
    invoke-direct {v7, v2}, Lbx0;-><init>(I)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v7, v1}, Lbx0;->e(Ljava/util/Collection;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v7}, Lbx0;->b()Ly22;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    sget v2, Lfx0;->c:I

    .line 236
    .line 237
    new-instance v2, Lre2;

    .line 238
    .line 239
    const-string v7, "CH"

    .line 240
    .line 241
    invoke-direct {v2, v7}, Lre2;-><init>(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    new-array v7, v6, [C

    .line 245
    .line 246
    const-string v6, "IABTCF_TCString"

    .line 247
    .line 248
    invoke-interface {v5, v6}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 249
    .line 250
    .line 251
    move-result v6

    .line 252
    move-object/from16 v33, v2

    .line 253
    .line 254
    const/4 v2, -0x1

    .line 255
    :try_start_0
    invoke-interface {v5, v4, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 256
    .line 257
    .line 258
    move-result v18
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 259
    move/from16 v4, v18

    .line 260
    .line 261
    goto :goto_1

    .line 262
    :catch_0
    move v4, v2

    .line 263
    :goto_1
    :try_start_1
    invoke-interface {v5, v0, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 264
    .line 265
    .line 266
    move-result v18
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1

    .line 267
    move/from16 v0, v18

    .line 268
    .line 269
    goto :goto_2

    .line 270
    :catch_1
    move v0, v2

    .line 271
    :goto_2
    :try_start_2
    invoke-interface {v5, v15, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 272
    .line 273
    .line 274
    move-result v18
    :try_end_2
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_2

    .line 275
    move/from16 v15, v18

    .line 276
    .line 277
    :goto_3
    move/from16 v30, v0

    .line 278
    .line 279
    goto :goto_4

    .line 280
    :catch_2
    move v15, v2

    .line 281
    goto :goto_3

    .line 282
    :goto_4
    const-string v0, "IABTCF_PurposeOneTreatment"

    .line 283
    .line 284
    :try_start_3
    invoke-interface {v5, v0, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 285
    .line 286
    .line 287
    move-result v18
    :try_end_3
    .catch Ljava/lang/ClassCastException; {:try_start_3 .. :try_end_3} :catch_3

    .line 288
    move/from16 v0, v18

    .line 289
    .line 290
    goto :goto_5

    .line 291
    :catch_3
    move v0, v2

    .line 292
    :goto_5
    :try_start_4
    invoke-interface {v5, v9, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 293
    .line 294
    .line 295
    move-result v2
    :try_end_4
    .catch Ljava/lang/ClassCastException; {:try_start_4 .. :try_end_4} :catch_4

    .line 296
    goto :goto_6

    .line 297
    :catch_4
    const/4 v2, -0x1

    .line 298
    :goto_6
    const-string v9, "IABTCF_PublisherCC"

    .line 299
    .line 300
    invoke-static {v5, v9}, Loo3;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v9

    .line 304
    move/from16 v31, v4

    .line 305
    .line 306
    new-instance v4, Lbx0;

    .line 307
    .line 308
    move/from16 v32, v6

    .line 309
    .line 310
    const/4 v6, 0x4

    .line 311
    invoke-direct {v4, v6}, Lbx0;-><init>(I)V

    .line 312
    .line 313
    .line 314
    iget-object v6, v1, Ldx0;->b:Lw22;

    .line 315
    .line 316
    if-nez v6, :cond_1

    .line 317
    .line 318
    new-instance v6, Lx22;

    .line 319
    .line 320
    move-object/from16 v34, v7

    .line 321
    .line 322
    iget-object v7, v1, Ly22;->e:[Ljava/lang/Object;

    .line 323
    .line 324
    move-object/from16 v38, v9

    .line 325
    .line 326
    iget v9, v1, Ly22;->f:I

    .line 327
    .line 328
    move/from16 v37, v0

    .line 329
    .line 330
    move/from16 v0, v26

    .line 331
    .line 332
    invoke-direct {v6, v7, v0, v9}, Lx22;-><init>([Ljava/lang/Object;II)V

    .line 333
    .line 334
    .line 335
    new-instance v0, Lw22;

    .line 336
    .line 337
    invoke-direct {v0, v1, v6}, Lw22;-><init>(Ldx0;Lx22;)V

    .line 338
    .line 339
    .line 340
    iput-object v0, v1, Ldx0;->b:Lw22;

    .line 341
    .line 342
    move-object v6, v0

    .line 343
    goto :goto_7

    .line 344
    :cond_1
    move/from16 v37, v0

    .line 345
    .line 346
    move-object/from16 v34, v7

    .line 347
    .line 348
    move-object/from16 v38, v9

    .line 349
    .line 350
    :goto_7
    invoke-virtual {v6}, Lw22;->e()Lwx2;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 355
    .line 356
    .line 357
    move-result v6

    .line 358
    if-eqz v6, :cond_8

    .line 359
    .line 360
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v6

    .line 364
    check-cast v6, Lcom/google/android/gms/internal/measurement/zzko;

    .line 365
    .line 366
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzko;->zza()I

    .line 367
    .line 368
    .line 369
    move-result v9

    .line 370
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v18

    .line 374
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    .line 375
    .line 376
    .line 377
    move-result v18

    .line 378
    new-instance v7, Ljava/lang/StringBuilder;

    .line 379
    .line 380
    move-object/from16 v36, v0

    .line 381
    .line 382
    add-int/lit8 v0, v18, 0x1c

    .line 383
    .line 384
    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 385
    .line 386
    .line 387
    const-string v0, "IABTCF_PublisherRestrictions"

    .line 388
    .line 389
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-static {v5, v0}, Loo3;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 404
    .line 405
    .line 406
    move-result v7

    .line 407
    if-nez v7, :cond_7

    .line 408
    .line 409
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 410
    .line 411
    .line 412
    move-result v7

    .line 413
    const/16 v9, 0x2f3

    .line 414
    .line 415
    if-ge v7, v9, :cond_2

    .line 416
    .line 417
    goto :goto_a

    .line 418
    :cond_2
    const/16 v7, 0x2f2

    .line 419
    .line 420
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    const/16 v7, 0xa

    .line 425
    .line 426
    invoke-static {v0, v7}, Ljava/lang/Character;->digit(CI)I

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    if-ltz v0, :cond_6

    .line 431
    .line 432
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzkp;->values()[Lcom/google/android/gms/internal/measurement/zzkp;

    .line 433
    .line 434
    .line 435
    move-result-object v7

    .line 436
    array-length v7, v7

    .line 437
    if-le v0, v7, :cond_3

    .line 438
    .line 439
    goto :goto_9

    .line 440
    :cond_3
    if-eqz v0, :cond_6

    .line 441
    .line 442
    move/from16 v7, v25

    .line 443
    .line 444
    if-eq v0, v7, :cond_5

    .line 445
    .line 446
    move/from16 v7, v19

    .line 447
    .line 448
    if-eq v0, v7, :cond_4

    .line 449
    .line 450
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzkp;->zzd:Lcom/google/android/gms/internal/measurement/zzkp;

    .line 451
    .line 452
    goto :goto_b

    .line 453
    :cond_4
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzkp;->zzc:Lcom/google/android/gms/internal/measurement/zzkp;

    .line 454
    .line 455
    goto :goto_b

    .line 456
    :cond_5
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzkp;->zzb:Lcom/google/android/gms/internal/measurement/zzkp;

    .line 457
    .line 458
    goto :goto_b

    .line 459
    :cond_6
    :goto_9
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzkp;->zza:Lcom/google/android/gms/internal/measurement/zzkp;

    .line 460
    .line 461
    goto :goto_b

    .line 462
    :cond_7
    :goto_a
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzkp;->zzd:Lcom/google/android/gms/internal/measurement/zzkp;

    .line 463
    .line 464
    :goto_b
    invoke-virtual {v4, v6, v0}, Lbx0;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    move-object/from16 v0, v36

    .line 468
    .line 469
    const/16 v19, 0x2

    .line 470
    .line 471
    const/16 v25, 0x1

    .line 472
    .line 473
    goto :goto_8

    .line 474
    :cond_8
    invoke-virtual {v4}, Lbx0;->b()Ly22;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    invoke-static {v5, v3}, Loo3;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v3

    .line 482
    invoke-static {v5, v8}, Loo3;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v4

    .line 486
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 487
    .line 488
    .line 489
    move-result v6

    .line 490
    const/16 v7, 0x31

    .line 491
    .line 492
    if-nez v6, :cond_9

    .line 493
    .line 494
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 495
    .line 496
    .line 497
    move-result v6

    .line 498
    const/16 v9, 0x2f3

    .line 499
    .line 500
    if-lt v6, v9, :cond_9

    .line 501
    .line 502
    const/16 v6, 0x2f2

    .line 503
    .line 504
    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    .line 505
    .line 506
    .line 507
    move-result v4

    .line 508
    if-ne v4, v7, :cond_9

    .line 509
    .line 510
    const/4 v4, 0x1

    .line 511
    goto :goto_c

    .line 512
    :cond_9
    const/4 v4, 0x0

    .line 513
    :goto_c
    const-string v6, "IABTCF_PurposeLegitimateInterests"

    .line 514
    .line 515
    invoke-static {v5, v6}, Loo3;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v6

    .line 519
    const-string v8, "IABTCF_VendorLegitimateInterests"

    .line 520
    .line 521
    invoke-static {v5, v8}, Loo3;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v5

    .line 525
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 526
    .line 527
    .line 528
    move-result v8

    .line 529
    if-nez v8, :cond_a

    .line 530
    .line 531
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 532
    .line 533
    .line 534
    move-result v8

    .line 535
    const/16 v9, 0x2f3

    .line 536
    .line 537
    if-lt v8, v9, :cond_a

    .line 538
    .line 539
    const/16 v8, 0x2f2

    .line 540
    .line 541
    invoke-virtual {v5, v8}, Ljava/lang/String;->charAt(I)C

    .line 542
    .line 543
    .line 544
    move-result v5

    .line 545
    if-ne v5, v7, :cond_a

    .line 546
    .line 547
    const/4 v5, 0x1

    .line 548
    goto :goto_d

    .line 549
    :cond_a
    const/4 v5, 0x0

    .line 550
    :goto_d
    const/16 v7, 0x32

    .line 551
    .line 552
    const/16 v26, 0x0

    .line 553
    .line 554
    aput-char v7, v34, v26

    .line 555
    .line 556
    new-instance v7, Lmo3;

    .line 557
    .line 558
    sget-object v8, Lvg3;->a1:Lug3;

    .line 559
    .line 560
    const/4 v9, 0x0

    .line 561
    invoke-virtual {v8, v9}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v8

    .line 565
    check-cast v8, Ljava/lang/Boolean;

    .line 566
    .line 567
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 568
    .line 569
    .line 570
    move-result v8

    .line 571
    if-eqz v8, :cond_c

    .line 572
    .line 573
    if-eqz v32, :cond_b

    .line 574
    .line 575
    goto :goto_e

    .line 576
    :cond_b
    sget-object v0, Ly22;->i:Ly22;

    .line 577
    .line 578
    move-object v1, v7

    .line 579
    goto/16 :goto_21

    .line 580
    .line 581
    :cond_c
    :goto_e
    sget-object v8, Lcom/google/android/gms/internal/measurement/zzko;->zzb:Lcom/google/android/gms/internal/measurement/zzko;

    .line 582
    .line 583
    invoke-virtual {v0, v8}, Ly22;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v9

    .line 587
    check-cast v9, Lcom/google/android/gms/internal/measurement/zzkp;

    .line 588
    .line 589
    move-object/from16 v24, v1

    .line 590
    .line 591
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzko;->zzd:Lcom/google/android/gms/internal/measurement/zzko;

    .line 592
    .line 593
    invoke-virtual {v0, v1}, Ly22;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v18

    .line 597
    check-cast v18, Lcom/google/android/gms/internal/measurement/zzkp;

    .line 598
    .line 599
    move-object/from16 v32, v9

    .line 600
    .line 601
    sget-object v9, Lcom/google/android/gms/internal/measurement/zzko;->zze:Lcom/google/android/gms/internal/measurement/zzko;

    .line 602
    .line 603
    invoke-virtual {v0, v9}, Ly22;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v35

    .line 607
    check-cast v35, Lcom/google/android/gms/internal/measurement/zzkp;

    .line 608
    .line 609
    move-object/from16 v43, v7

    .line 610
    .line 611
    sget-object v7, Lcom/google/android/gms/internal/measurement/zzko;->zzh:Lcom/google/android/gms/internal/measurement/zzko;

    .line 612
    .line 613
    invoke-virtual {v0, v7}, Ly22;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v36

    .line 617
    check-cast v36, Lcom/google/android/gms/internal/measurement/zzkp;

    .line 618
    .line 619
    move-object/from16 v39, v0

    .line 620
    .line 621
    new-instance v0, Lbx0;

    .line 622
    .line 623
    move-object/from16 v44, v7

    .line 624
    .line 625
    const/4 v7, 0x4

    .line 626
    invoke-direct {v0, v7}, Lbx0;-><init>(I)V

    .line 627
    .line 628
    .line 629
    const-string v7, "2"

    .line 630
    .line 631
    invoke-virtual {v0, v14, v7}, Lbx0;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 632
    .line 633
    .line 634
    const/4 v7, 0x1

    .line 635
    if-eq v7, v4, :cond_d

    .line 636
    .line 637
    move-object/from16 v7, v20

    .line 638
    .line 639
    :goto_f
    move/from16 v41, v4

    .line 640
    .line 641
    goto :goto_10

    .line 642
    :cond_d
    move-object/from16 v7, v16

    .line 643
    .line 644
    goto :goto_f

    .line 645
    :goto_10
    const-string v4, "VendorConsent"

    .line 646
    .line 647
    invoke-virtual {v0, v4, v7}, Lbx0;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 648
    .line 649
    .line 650
    const/4 v7, 0x1

    .line 651
    if-eq v7, v5, :cond_e

    .line 652
    .line 653
    move-object/from16 v4, v20

    .line 654
    .line 655
    :goto_11
    move/from16 v42, v5

    .line 656
    .line 657
    goto :goto_12

    .line 658
    :cond_e
    move-object/from16 v4, v16

    .line 659
    .line 660
    goto :goto_11

    .line 661
    :goto_12
    const-string v5, "VendorLegitimateInterest"

    .line 662
    .line 663
    invoke-virtual {v0, v5, v4}, Lbx0;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 664
    .line 665
    .line 666
    if-eq v15, v7, :cond_f

    .line 667
    .line 668
    move-object/from16 v4, v20

    .line 669
    .line 670
    goto :goto_13

    .line 671
    :cond_f
    move-object/from16 v4, v16

    .line 672
    .line 673
    :goto_13
    invoke-virtual {v0, v13, v4}, Lbx0;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 674
    .line 675
    .line 676
    if-eq v2, v7, :cond_10

    .line 677
    .line 678
    move-object/from16 v4, v20

    .line 679
    .line 680
    goto :goto_14

    .line 681
    :cond_10
    move-object/from16 v4, v16

    .line 682
    .line 683
    :goto_14
    invoke-virtual {v0, v12, v4}, Lbx0;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 684
    .line 685
    .line 686
    invoke-static/range {v30 .. v30}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v4

    .line 690
    invoke-virtual {v0, v11, v4}, Lbx0;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 691
    .line 692
    .line 693
    invoke-static/range {v31 .. v31}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v4

    .line 697
    invoke-virtual {v0, v10, v4}, Lbx0;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 698
    .line 699
    .line 700
    move/from16 v4, v37

    .line 701
    .line 702
    if-eq v4, v7, :cond_11

    .line 703
    .line 704
    move-object/from16 v5, v20

    .line 705
    .line 706
    goto :goto_15

    .line 707
    :cond_11
    move-object/from16 v5, v16

    .line 708
    .line 709
    :goto_15
    const-string v7, "PurposeOneTreatment"

    .line 710
    .line 711
    invoke-virtual {v0, v7, v5}, Lbx0;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 712
    .line 713
    .line 714
    const-string v5, "PublisherCC"

    .line 715
    .line 716
    move-object/from16 v7, v38

    .line 717
    .line 718
    invoke-virtual {v0, v5, v7}, Lbx0;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 719
    .line 720
    .line 721
    if-eqz v32, :cond_12

    .line 722
    .line 723
    invoke-virtual/range {v32 .. v32}, Lcom/google/android/gms/internal/measurement/zzkp;->zza()I

    .line 724
    .line 725
    .line 726
    move-result v5

    .line 727
    goto :goto_16

    .line 728
    :cond_12
    sget-object v5, Lcom/google/android/gms/internal/measurement/zzkp;->zzd:Lcom/google/android/gms/internal/measurement/zzkp;

    .line 729
    .line 730
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzkp;->zza()I

    .line 731
    .line 732
    .line 733
    move-result v5

    .line 734
    :goto_16
    const-string v10, "PublisherRestrictions1"

    .line 735
    .line 736
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v5

    .line 740
    invoke-virtual {v0, v10, v5}, Lbx0;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 741
    .line 742
    .line 743
    if-eqz v18, :cond_13

    .line 744
    .line 745
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/zzkp;->zza()I

    .line 746
    .line 747
    .line 748
    move-result v5

    .line 749
    goto :goto_17

    .line 750
    :cond_13
    sget-object v5, Lcom/google/android/gms/internal/measurement/zzkp;->zzd:Lcom/google/android/gms/internal/measurement/zzkp;

    .line 751
    .line 752
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzkp;->zza()I

    .line 753
    .line 754
    .line 755
    move-result v5

    .line 756
    :goto_17
    const-string v10, "PublisherRestrictions3"

    .line 757
    .line 758
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v5

    .line 762
    invoke-virtual {v0, v10, v5}, Lbx0;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 763
    .line 764
    .line 765
    if-eqz v35, :cond_14

    .line 766
    .line 767
    invoke-virtual/range {v35 .. v35}, Lcom/google/android/gms/internal/measurement/zzkp;->zza()I

    .line 768
    .line 769
    .line 770
    move-result v5

    .line 771
    goto :goto_18

    .line 772
    :cond_14
    sget-object v5, Lcom/google/android/gms/internal/measurement/zzkp;->zzd:Lcom/google/android/gms/internal/measurement/zzkp;

    .line 773
    .line 774
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzkp;->zza()I

    .line 775
    .line 776
    .line 777
    move-result v5

    .line 778
    :goto_18
    const-string v10, "PublisherRestrictions4"

    .line 779
    .line 780
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object v5

    .line 784
    invoke-virtual {v0, v10, v5}, Lbx0;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 785
    .line 786
    .line 787
    if-eqz v36, :cond_15

    .line 788
    .line 789
    invoke-virtual/range {v36 .. v36}, Lcom/google/android/gms/internal/measurement/zzkp;->zza()I

    .line 790
    .line 791
    .line 792
    move-result v5

    .line 793
    goto :goto_19

    .line 794
    :cond_15
    sget-object v5, Lcom/google/android/gms/internal/measurement/zzkp;->zzd:Lcom/google/android/gms/internal/measurement/zzkp;

    .line 795
    .line 796
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzkp;->zza()I

    .line 797
    .line 798
    .line 799
    move-result v5

    .line 800
    :goto_19
    const-string v10, "PublisherRestrictions7"

    .line 801
    .line 802
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v5

    .line 806
    invoke-virtual {v0, v10, v5}, Lbx0;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 807
    .line 808
    .line 809
    invoke-static {v8, v3, v6}, Loo3;->d(Lcom/google/android/gms/internal/measurement/zzko;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v46

    .line 813
    invoke-static {v1, v3, v6}, Loo3;->d(Lcom/google/android/gms/internal/measurement/zzko;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v48

    .line 817
    invoke-static {v9, v3, v6}, Loo3;->d(Lcom/google/android/gms/internal/measurement/zzko;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v50

    .line 821
    move-object/from16 v5, v44

    .line 822
    .line 823
    invoke-static {v5, v3, v6}, Loo3;->d(Lcom/google/android/gms/internal/measurement/zzko;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v52

    .line 827
    const-string v47, "Purpose3"

    .line 828
    .line 829
    const-string v45, "Purpose1"

    .line 830
    .line 831
    const-string v49, "Purpose4"

    .line 832
    .line 833
    const-string v51, "Purpose7"

    .line 834
    .line 835
    filled-new-array/range {v45 .. v52}, [Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v10

    .line 839
    const/4 v11, 0x4

    .line 840
    const/4 v12, 0x0

    .line 841
    invoke-static {v11, v10, v12}, Ly22;->b(I[Ljava/lang/Object;Lbx0;)Ly22;

    .line 842
    .line 843
    .line 844
    move-result-object v10

    .line 845
    invoke-virtual {v10}, Ldx0;->a()Lfx0;

    .line 846
    .line 847
    .line 848
    move-result-object v10

    .line 849
    invoke-virtual {v0, v10}, Lbx0;->e(Ljava/util/Collection;)V

    .line 850
    .line 851
    .line 852
    move/from16 v35, v2

    .line 853
    .line 854
    move/from16 v37, v4

    .line 855
    .line 856
    move-object/from16 v40, v6

    .line 857
    .line 858
    move-object/from16 v38, v7

    .line 859
    .line 860
    move-object/from16 v30, v8

    .line 861
    .line 862
    move/from16 v36, v15

    .line 863
    .line 864
    move-object/from16 v31, v24

    .line 865
    .line 866
    move-object/from16 v32, v39

    .line 867
    .line 868
    move-object/from16 v39, v3

    .line 869
    .line 870
    invoke-static/range {v30 .. v42}, Loo3;->b(Lcom/google/android/gms/internal/measurement/zzko;Ly22;Ly22;Lre2;[CIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Z

    .line 871
    .line 872
    .line 873
    move-result v2

    .line 874
    const/4 v7, 0x1

    .line 875
    if-eq v7, v2, :cond_16

    .line 876
    .line 877
    move-object/from16 v45, v20

    .line 878
    .line 879
    :goto_1a
    move-object/from16 v30, v1

    .line 880
    .line 881
    goto :goto_1b

    .line 882
    :cond_16
    move-object/from16 v45, v16

    .line 883
    .line 884
    goto :goto_1a

    .line 885
    :goto_1b
    invoke-static/range {v30 .. v42}, Loo3;->b(Lcom/google/android/gms/internal/measurement/zzko;Ly22;Ly22;Lre2;[CIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Z

    .line 886
    .line 887
    .line 888
    move-result v1

    .line 889
    if-eq v7, v1, :cond_17

    .line 890
    .line 891
    move-object/from16 v47, v20

    .line 892
    .line 893
    :goto_1c
    move-object/from16 v30, v9

    .line 894
    .line 895
    goto :goto_1d

    .line 896
    :cond_17
    move-object/from16 v47, v16

    .line 897
    .line 898
    goto :goto_1c

    .line 899
    :goto_1d
    invoke-static/range {v30 .. v42}, Loo3;->b(Lcom/google/android/gms/internal/measurement/zzko;Ly22;Ly22;Lre2;[CIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Z

    .line 900
    .line 901
    .line 902
    move-result v1

    .line 903
    if-eq v7, v1, :cond_18

    .line 904
    .line 905
    move-object/from16 v49, v20

    .line 906
    .line 907
    :goto_1e
    move-object/from16 v30, v5

    .line 908
    .line 909
    goto :goto_1f

    .line 910
    :cond_18
    move-object/from16 v49, v16

    .line 911
    .line 912
    goto :goto_1e

    .line 913
    :goto_1f
    invoke-static/range {v30 .. v42}, Loo3;->b(Lcom/google/android/gms/internal/measurement/zzko;Ly22;Ly22;Lre2;[CIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Z

    .line 914
    .line 915
    .line 916
    move-result v1

    .line 917
    move-object/from16 v2, v34

    .line 918
    .line 919
    if-eq v7, v1, :cond_19

    .line 920
    .line 921
    move-object/from16 v51, v20

    .line 922
    .line 923
    goto :goto_20

    .line 924
    :cond_19
    move-object/from16 v51, v16

    .line 925
    .line 926
    :goto_20
    new-instance v1, Ljava/lang/String;

    .line 927
    .line 928
    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V

    .line 929
    .line 930
    .line 931
    const-string v46, "AuthorizePurpose3"

    .line 932
    .line 933
    const-string v44, "AuthorizePurpose1"

    .line 934
    .line 935
    const-string v48, "AuthorizePurpose4"

    .line 936
    .line 937
    const-string v50, "AuthorizePurpose7"

    .line 938
    .line 939
    const-string v52, "PurposeDiagnostics"

    .line 940
    .line 941
    move-object/from16 v53, v1

    .line 942
    .line 943
    filled-new-array/range {v44 .. v53}, [Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object v1

    .line 947
    const/4 v2, 0x5

    .line 948
    const/4 v9, 0x0

    .line 949
    invoke-static {v2, v1, v9}, Ly22;->b(I[Ljava/lang/Object;Lbx0;)Ly22;

    .line 950
    .line 951
    .line 952
    move-result-object v1

    .line 953
    invoke-virtual {v1}, Ldx0;->a()Lfx0;

    .line 954
    .line 955
    .line 956
    move-result-object v1

    .line 957
    invoke-virtual {v0, v1}, Lbx0;->e(Ljava/util/Collection;)V

    .line 958
    .line 959
    .line 960
    invoke-virtual {v0}, Lbx0;->b()Ly22;

    .line 961
    .line 962
    .line 963
    move-result-object v0

    .line 964
    move-object/from16 v1, v43

    .line 965
    .line 966
    :goto_21
    invoke-direct {v1, v0}, Lmo3;-><init>(Ljava/util/Map;)V

    .line 967
    .line 968
    .line 969
    move-object v7, v1

    .line 970
    move-object/from16 v2, v29

    .line 971
    .line 972
    goto/16 :goto_26

    .line 973
    .line 974
    :cond_1a
    move-object/from16 v27, v2

    .line 975
    .line 976
    move-object/from16 v29, v7

    .line 977
    .line 978
    invoke-static {v5, v8}, Loo3;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    .line 979
    .line 980
    .line 981
    move-result-object v1

    .line 982
    move-object/from16 v2, v29

    .line 983
    .line 984
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 985
    .line 986
    .line 987
    move-result v7

    .line 988
    if-nez v7, :cond_1b

    .line 989
    .line 990
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 991
    .line 992
    .line 993
    move-result v7

    .line 994
    const/16 v8, 0x2f2

    .line 995
    .line 996
    if-le v7, v8, :cond_1b

    .line 997
    .line 998
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 999
    .line 1000
    .line 1001
    move-result v1

    .line 1002
    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v1

    .line 1006
    const-string v7, "GoogleConsent"

    .line 1007
    .line 1008
    invoke-virtual {v6, v7, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1009
    .line 1010
    .line 1011
    :cond_1b
    const/4 v1, -0x1

    .line 1012
    :try_start_5
    invoke-interface {v5, v15, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1013
    .line 1014
    .line 1015
    move-result v18
    :try_end_5
    .catch Ljava/lang/ClassCastException; {:try_start_5 .. :try_end_5} :catch_5

    .line 1016
    move/from16 v7, v18

    .line 1017
    .line 1018
    goto :goto_22

    .line 1019
    :catch_5
    move v7, v1

    .line 1020
    :goto_22
    if-eq v7, v1, :cond_1c

    .line 1021
    .line 1022
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v7

    .line 1026
    invoke-virtual {v6, v13, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1027
    .line 1028
    .line 1029
    :cond_1c
    :try_start_6
    invoke-interface {v5, v9, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1030
    .line 1031
    .line 1032
    move-result v18
    :try_end_6
    .catch Ljava/lang/ClassCastException; {:try_start_6 .. :try_end_6} :catch_6

    .line 1033
    move/from16 v7, v18

    .line 1034
    .line 1035
    goto :goto_23

    .line 1036
    :catch_6
    move v7, v1

    .line 1037
    :goto_23
    if-eq v7, v1, :cond_1d

    .line 1038
    .line 1039
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v7

    .line 1043
    invoke-virtual {v6, v12, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1044
    .line 1045
    .line 1046
    :cond_1d
    :try_start_7
    invoke-interface {v5, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1047
    .line 1048
    .line 1049
    move-result v18
    :try_end_7
    .catch Ljava/lang/ClassCastException; {:try_start_7 .. :try_end_7} :catch_7

    .line 1050
    move/from16 v0, v18

    .line 1051
    .line 1052
    goto :goto_24

    .line 1053
    :catch_7
    move v0, v1

    .line 1054
    :goto_24
    if-eq v0, v1, :cond_1e

    .line 1055
    .line 1056
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v0

    .line 1060
    invoke-virtual {v6, v11, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1061
    .line 1062
    .line 1063
    :cond_1e
    invoke-static {v5, v3}, Loo3;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v0

    .line 1067
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1068
    .line 1069
    .line 1070
    move-result v1

    .line 1071
    if-nez v1, :cond_1f

    .line 1072
    .line 1073
    const-string v1, "PurposeConsents"

    .line 1074
    .line 1075
    invoke-virtual {v6, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1076
    .line 1077
    .line 1078
    :cond_1f
    const/4 v1, -0x1

    .line 1079
    :try_start_8
    invoke-interface {v5, v4, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1080
    .line 1081
    .line 1082
    move-result v0
    :try_end_8
    .catch Ljava/lang/ClassCastException; {:try_start_8 .. :try_end_8} :catch_8

    .line 1083
    goto :goto_25

    .line 1084
    :catch_8
    move v0, v1

    .line 1085
    :goto_25
    if-eq v0, v1, :cond_20

    .line 1086
    .line 1087
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v0

    .line 1091
    invoke-virtual {v6, v10, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1092
    .line 1093
    .line 1094
    :cond_20
    new-instance v7, Lmo3;

    .line 1095
    .line 1096
    invoke-direct {v7, v6}, Lmo3;-><init>(Ljava/util/Map;)V

    .line 1097
    .line 1098
    .line 1099
    :goto_26
    invoke-static/range {v27 .. v27}, Lij3;->l(Lhk3;)V

    .line 1100
    .line 1101
    .line 1102
    move-object/from16 v0, v27

    .line 1103
    .line 1104
    iget-object v1, v0, Luh3;->Y:Lsh3;

    .line 1105
    .line 1106
    const-string v3, "Tcf preferences read"

    .line 1107
    .line 1108
    invoke-virtual {v1, v7, v3}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1109
    .line 1110
    .line 1111
    move-object/from16 v3, v23

    .line 1112
    .line 1113
    iget-object v3, v3, Lij3;->d:Lpd3;

    .line 1114
    .line 1115
    move-object/from16 v4, v22

    .line 1116
    .line 1117
    const/4 v9, 0x0

    .line 1118
    invoke-virtual {v3, v9, v4}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 1119
    .line 1120
    .line 1121
    move-result v3

    .line 1122
    const-string v4, "_tcf"

    .line 1123
    .line 1124
    const-string v5, "auto"

    .line 1125
    .line 1126
    const-string v6, "_tcfd"

    .line 1127
    .line 1128
    const/16 v8, -0x1e

    .line 1129
    .line 1130
    const-string v9, "Consent generated from Tcf"

    .line 1131
    .line 1132
    if-eqz v3, :cond_2c

    .line 1133
    .line 1134
    invoke-virtual/range {v21 .. v21}, Lsq3;->y()V

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual/range {v21 .. v21}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v3

    .line 1141
    const-string v10, "stored_tcf_param"

    .line 1142
    .line 1143
    invoke-interface {v3, v10, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v2

    .line 1147
    new-instance v3, Ljava/util/HashMap;

    .line 1148
    .line 1149
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1150
    .line 1151
    .line 1152
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1153
    .line 1154
    .line 1155
    move-result v10

    .line 1156
    if-eqz v10, :cond_21

    .line 1157
    .line 1158
    new-instance v2, Lmo3;

    .line 1159
    .line 1160
    invoke-direct {v2, v3}, Lmo3;-><init>(Ljava/util/Map;)V

    .line 1161
    .line 1162
    .line 1163
    :goto_27
    move-object/from16 v3, v21

    .line 1164
    .line 1165
    goto :goto_2a

    .line 1166
    :cond_21
    const-string v10, ";"

    .line 1167
    .line 1168
    invoke-virtual {v2, v10}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v2

    .line 1172
    array-length v10, v2

    .line 1173
    const/4 v11, 0x0

    .line 1174
    :goto_28
    if-ge v11, v10, :cond_24

    .line 1175
    .line 1176
    aget-object v12, v2, v11

    .line 1177
    .line 1178
    const-string v13, "="

    .line 1179
    .line 1180
    invoke-virtual {v12, v13}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v12

    .line 1184
    array-length v13, v12

    .line 1185
    const/4 v15, 0x2

    .line 1186
    if-lt v13, v15, :cond_23

    .line 1187
    .line 1188
    sget-object v13, Loo3;->a:Lt22;

    .line 1189
    .line 1190
    const/16 v26, 0x0

    .line 1191
    .line 1192
    aget-object v15, v12, v26

    .line 1193
    .line 1194
    invoke-virtual {v13, v15}, Lzw0;->contains(Ljava/lang/Object;)Z

    .line 1195
    .line 1196
    .line 1197
    move-result v13

    .line 1198
    if-eqz v13, :cond_22

    .line 1199
    .line 1200
    aget-object v13, v12, v26

    .line 1201
    .line 1202
    const/16 v25, 0x1

    .line 1203
    .line 1204
    aget-object v12, v12, v25

    .line 1205
    .line 1206
    invoke-virtual {v3, v13, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1207
    .line 1208
    .line 1209
    goto :goto_29

    .line 1210
    :cond_22
    const/16 v25, 0x1

    .line 1211
    .line 1212
    goto :goto_29

    .line 1213
    :cond_23
    const/16 v25, 0x1

    .line 1214
    .line 1215
    const/16 v26, 0x0

    .line 1216
    .line 1217
    :goto_29
    add-int/lit8 v11, v11, 0x1

    .line 1218
    .line 1219
    goto :goto_28

    .line 1220
    :cond_24
    new-instance v2, Lmo3;

    .line 1221
    .line 1222
    invoke-direct {v2, v3}, Lmo3;-><init>(Ljava/util/Map;)V

    .line 1223
    .line 1224
    .line 1225
    goto :goto_27

    .line 1226
    :goto_2a
    invoke-virtual {v3, v7}, Lki3;->H(Lmo3;)Z

    .line 1227
    .line 1228
    .line 1229
    move-result v3

    .line 1230
    if-eqz v3, :cond_2e

    .line 1231
    .line 1232
    invoke-virtual {v7}, Lmo3;->b()Landroid/os/Bundle;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v3

    .line 1236
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 1237
    .line 1238
    .line 1239
    invoke-virtual {v1, v3, v9}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1240
    .line 1241
    .line 1242
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 1243
    .line 1244
    if-eq v3, v0, :cond_25

    .line 1245
    .line 1246
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1247
    .line 1248
    .line 1249
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1250
    .line 1251
    .line 1252
    move-result-wide v0

    .line 1253
    move-object/from16 v10, p0

    .line 1254
    .line 1255
    invoke-virtual {v10, v3, v8, v0, v1}, Lsl3;->S(Landroid/os/Bundle;IJ)V

    .line 1256
    .line 1257
    .line 1258
    goto :goto_2b

    .line 1259
    :cond_25
    move-object/from16 v10, p0

    .line 1260
    .line 1261
    :goto_2b
    new-instance v0, Landroid/os/Bundle;

    .line 1262
    .line 1263
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1264
    .line 1265
    .line 1266
    iget-object v1, v2, Lmo3;->a:Ljava/util/HashMap;

    .line 1267
    .line 1268
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 1269
    .line 1270
    .line 1271
    move-result v3

    .line 1272
    if-nez v3, :cond_26

    .line 1273
    .line 1274
    invoke-virtual {v1, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v1

    .line 1278
    check-cast v1, Ljava/lang/String;

    .line 1279
    .line 1280
    if-nez v1, :cond_26

    .line 1281
    .line 1282
    move-object/from16 v1, v16

    .line 1283
    .line 1284
    goto :goto_2c

    .line 1285
    :cond_26
    move-object/from16 v1, v20

    .line 1286
    .line 1287
    :goto_2c
    invoke-virtual {v7}, Lmo3;->b()Landroid/os/Bundle;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v3

    .line 1291
    invoke-virtual {v2}, Lmo3;->b()Landroid/os/Bundle;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v2

    .line 1295
    invoke-virtual {v3}, Landroid/os/BaseBundle;->size()I

    .line 1296
    .line 1297
    .line 1298
    move-result v8

    .line 1299
    invoke-virtual {v2}, Landroid/os/BaseBundle;->size()I

    .line 1300
    .line 1301
    .line 1302
    move-result v9

    .line 1303
    if-eq v8, v9, :cond_27

    .line 1304
    .line 1305
    goto :goto_2d

    .line 1306
    :cond_27
    const-string v8, "ad_storage"

    .line 1307
    .line 1308
    invoke-virtual {v3, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v9

    .line 1312
    invoke-virtual {v2, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v8

    .line 1316
    invoke-static {v9, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1317
    .line 1318
    .line 1319
    move-result v8

    .line 1320
    if-nez v8, :cond_28

    .line 1321
    .line 1322
    goto :goto_2d

    .line 1323
    :cond_28
    const-string v8, "ad_personalization"

    .line 1324
    .line 1325
    invoke-virtual {v3, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v9

    .line 1329
    invoke-virtual {v2, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v8

    .line 1333
    invoke-static {v9, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1334
    .line 1335
    .line 1336
    move-result v8

    .line 1337
    if-nez v8, :cond_29

    .line 1338
    .line 1339
    goto :goto_2d

    .line 1340
    :cond_29
    const-string v8, "ad_user_data"

    .line 1341
    .line 1342
    invoke-virtual {v3, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v3

    .line 1346
    invoke-virtual {v2, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v2

    .line 1350
    invoke-static {v3, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1351
    .line 1352
    .line 1353
    move-result v2

    .line 1354
    if-nez v2, :cond_2a

    .line 1355
    .line 1356
    :goto_2d
    move-object/from16 v15, v16

    .line 1357
    .line 1358
    goto :goto_2e

    .line 1359
    :cond_2a
    move-object/from16 v15, v20

    .line 1360
    .line 1361
    :goto_2e
    invoke-virtual {v1, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v1

    .line 1365
    const-string v2, "_tcfm"

    .line 1366
    .line 1367
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1368
    .line 1369
    .line 1370
    iget-object v1, v7, Lmo3;->a:Ljava/util/HashMap;

    .line 1371
    .line 1372
    const-string v2, "PurposeDiagnostics"

    .line 1373
    .line 1374
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v1

    .line 1378
    check-cast v1, Ljava/lang/String;

    .line 1379
    .line 1380
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1381
    .line 1382
    .line 1383
    move-result v2

    .line 1384
    if-eqz v2, :cond_2b

    .line 1385
    .line 1386
    const-string v1, "200000"

    .line 1387
    .line 1388
    :cond_2b
    const-string v2, "_tcfd2"

    .line 1389
    .line 1390
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1391
    .line 1392
    .line 1393
    invoke-virtual {v7}, Lmo3;->c()Ljava/lang/String;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v1

    .line 1397
    invoke-virtual {v0, v6, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1398
    .line 1399
    .line 1400
    invoke-virtual {v10, v5, v4, v0}, Lsl3;->G(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1401
    .line 1402
    .line 1403
    return-void

    .line 1404
    :cond_2c
    move-object/from16 v10, p0

    .line 1405
    .line 1406
    move-object/from16 v3, v21

    .line 1407
    .line 1408
    invoke-virtual {v3, v7}, Lki3;->H(Lmo3;)Z

    .line 1409
    .line 1410
    .line 1411
    move-result v2

    .line 1412
    if-eqz v2, :cond_2e

    .line 1413
    .line 1414
    invoke-virtual {v7}, Lmo3;->b()Landroid/os/Bundle;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v2

    .line 1418
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 1419
    .line 1420
    .line 1421
    invoke-virtual {v1, v2, v9}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1422
    .line 1423
    .line 1424
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 1425
    .line 1426
    if-eq v2, v0, :cond_2d

    .line 1427
    .line 1428
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1429
    .line 1430
    .line 1431
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1432
    .line 1433
    .line 1434
    move-result-wide v0

    .line 1435
    invoke-virtual {v10, v2, v8, v0, v1}, Lsl3;->S(Landroid/os/Bundle;IJ)V

    .line 1436
    .line 1437
    .line 1438
    :cond_2d
    new-instance v0, Landroid/os/Bundle;

    .line 1439
    .line 1440
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1441
    .line 1442
    .line 1443
    invoke-virtual {v7}, Lmo3;->c()Ljava/lang/String;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v1

    .line 1447
    invoke-virtual {v0, v6, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1448
    .line 1449
    .line 1450
    invoke-virtual {v10, v5, v4, v0}, Lsl3;->G(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1451
    .line 1452
    .line 1453
    :cond_2e
    return-void
.end method

.method public final G(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Leg3;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lij3;

    .line 7
    .line 8
    iget-object v0, v0, Lij3;->V:Lxt0;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v5

    .line 17
    move-object v1, p0

    .line 18
    move-object v2, p1

    .line 19
    move-object v3, p2

    .line 20
    move-object v4, p3

    .line 21
    invoke-virtual/range {v1 .. v6}, Lsl3;->H(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final H(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Leg3;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Lsl3;->d:Lqk3;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {p2}, Lup3;->X(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    :cond_0
    :goto_0
    move v7, v2

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    const/4 v2, 0x0

    .line 18
    goto :goto_0

    .line 19
    :goto_1
    const/4 v6, 0x1

    .line 20
    const/4 v8, 0x1

    .line 21
    move-object v0, p0

    .line 22
    move-object v1, p1

    .line 23
    move-object v2, p2

    .line 24
    move-object v5, p3

    .line 25
    move-wide v3, p4

    .line 26
    invoke-virtual/range {v0 .. v8}, Lsl3;->I(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZ)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final I(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZ)V
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v8, p2

    .line 6
    .line 7
    move-object/from16 v9, p5

    .line 8
    .line 9
    move/from16 v10, p8

    .line 10
    .line 11
    invoke-static {v7}, Lkb1;->k(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v9}, Lkb1;->n(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Leg3;->y()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lwg3;->A()V

    .line 21
    .line 22
    .line 23
    iget-object v0, v1, Lsq3;->a:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v11, v0

    .line 26
    check-cast v11, Lij3;

    .line 27
    .line 28
    invoke-virtual {v11}, Lij3;->d()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v12, v11, Lij3;->v:Llo3;

    .line 33
    .line 34
    iget-object v13, v11, Lij3;->d:Lpd3;

    .line 35
    .line 36
    iget-object v2, v11, Lij3;->a:Landroid/content/Context;

    .line 37
    .line 38
    iget-object v14, v11, Lij3;->w:Lup3;

    .line 39
    .line 40
    iget-object v15, v11, Lij3;->f:Luh3;

    .line 41
    .line 42
    if-eqz v0, :cond_29

    .line 43
    .line 44
    invoke-virtual {v11}, Lij3;->q()Lih3;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v0, v0, Lih3;->V:Ljava/util/List;

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    invoke-interface {v0, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, v15, Luh3;->X:Lsh3;

    .line 63
    .line 64
    const-string v1, "Dropping non-safelisted event. event name, origin"

    .line 65
    .line 66
    invoke-virtual {v0, v8, v1, v7}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    :goto_0
    iget-boolean v0, v1, Lsl3;->f:Z

    .line 71
    .line 72
    const/4 v3, 0x0

    .line 73
    const/4 v4, 0x1

    .line 74
    if-nez v0, :cond_3

    .line 75
    .line 76
    iput-boolean v4, v1, Lsl3;->f:Z

    .line 77
    .line 78
    :try_start_0
    iget-boolean v0, v11, Lij3;->b:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 79
    .line 80
    const-string v5, "com.google.android.gms.tagmanager.TagManagerService"

    .line 81
    .line 82
    if-nez v0, :cond_2

    .line 83
    .line 84
    :try_start_1
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-static {v5, v4, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    goto :goto_1

    .line 93
    :cond_2
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 97
    :goto_1
    :try_start_2
    const-string v5, "initialize"

    .line 98
    .line 99
    const-class v6, Landroid/content/Context;

    .line 100
    .line 101
    filled-new-array {v6}, [Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-virtual {v0, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :catch_0
    move-exception v0

    .line 118
    :try_start_3
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 119
    .line 120
    .line 121
    iget-object v2, v15, Luh3;->w:Lsh3;

    .line 122
    .line 123
    const-string v5, "Failed to invoke Tag Manager\'s initialize() method"

    .line 124
    .line 125
    invoke-virtual {v2, v0, v5}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_1

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :catch_1
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 130
    .line 131
    .line 132
    iget-object v0, v15, Luh3;->W:Lsh3;

    .line 133
    .line 134
    const-string v2, "Tag Manager is not found and thus will not be used"

    .line 135
    .line 136
    invoke-virtual {v0, v2}, Lsh3;->a(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :cond_3
    :goto_2
    iget-object v0, v11, Lij3;->U:Lmh3;

    .line 140
    .line 141
    iget-object v2, v11, Lij3;->e:Lki3;

    .line 142
    .line 143
    iget-object v5, v11, Lij3;->V:Lxt0;

    .line 144
    .line 145
    sget-object v6, Lvg3;->g1:Lug3;

    .line 146
    .line 147
    invoke-virtual {v13, v3, v6}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-nez v6, :cond_4

    .line 152
    .line 153
    const-string v6, "_cmp"

    .line 154
    .line 155
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    if-eqz v6, :cond_4

    .line 160
    .line 161
    const-string v6, "gclid"

    .line 162
    .line 163
    invoke-virtual {v9, v6}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 164
    .line 165
    .line 166
    move-result v16

    .line 167
    if-eqz v16, :cond_4

    .line 168
    .line 169
    invoke-virtual {v9, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-object/from16 v16, v2

    .line 177
    .line 178
    move-object/from16 v17, v3

    .line 179
    .line 180
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 181
    .line 182
    .line 183
    move-result-wide v2

    .line 184
    move-object/from16 v18, v5

    .line 185
    .line 186
    const-string v5, "auto"

    .line 187
    .line 188
    move/from16 v19, v4

    .line 189
    .line 190
    move-object v4, v6

    .line 191
    const-string v6, "_lgclid"

    .line 192
    .line 193
    move-object/from16 v17, v16

    .line 194
    .line 195
    move-object/from16 v16, v13

    .line 196
    .line 197
    move/from16 v13, v19

    .line 198
    .line 199
    invoke-virtual/range {v1 .. v6}, Lsl3;->K(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_4
    move-object/from16 v17, v2

    .line 204
    .line 205
    move-object/from16 v18, v5

    .line 206
    .line 207
    move-object/from16 v16, v13

    .line 208
    .line 209
    move v13, v4

    .line 210
    :goto_3
    const/4 v2, 0x0

    .line 211
    if-eqz p6, :cond_5

    .line 212
    .line 213
    sget-object v3, Lup3;->U:[Ljava/lang/String;

    .line 214
    .line 215
    aget-object v3, v3, v2

    .line 216
    .line 217
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    if-nez v3, :cond_5

    .line 222
    .line 223
    invoke-static {v14}, Lij3;->j(Lsq3;)V

    .line 224
    .line 225
    .line 226
    invoke-static/range {v17 .. v17}, Lij3;->j(Lsq3;)V

    .line 227
    .line 228
    .line 229
    move-object/from16 v3, v17

    .line 230
    .line 231
    iget-object v4, v3, Lki3;->j0:Lra2;

    .line 232
    .line 233
    invoke-virtual {v4}, Lra2;->x()Landroid/os/Bundle;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    invoke-virtual {v14, v9, v4}, Lup3;->K(Landroid/os/Bundle;Landroid/os/Bundle;)V

    .line 238
    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_5
    move-object/from16 v3, v17

    .line 242
    .line 243
    :goto_4
    iget-object v4, v1, Lsl3;->h0:Lac3;

    .line 244
    .line 245
    const/16 v5, 0x28

    .line 246
    .line 247
    if-nez v10, :cond_a

    .line 248
    .line 249
    const-string v6, "_iap"

    .line 250
    .line 251
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v6

    .line 255
    if-nez v6, :cond_a

    .line 256
    .line 257
    invoke-static {v14}, Lij3;->j(Lsq3;)V

    .line 258
    .line 259
    .line 260
    const-string v6, "event"

    .line 261
    .line 262
    invoke-virtual {v14, v6, v8}, Lup3;->z0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 263
    .line 264
    .line 265
    move-result v17

    .line 266
    const/16 v19, 0x2

    .line 267
    .line 268
    if-nez v17, :cond_6

    .line 269
    .line 270
    goto :goto_5

    .line 271
    :cond_6
    sget-object v2, Li13;->f:[Ljava/lang/String;

    .line 272
    .line 273
    sget-object v13, Li13;->g:[Ljava/lang/String;

    .line 274
    .line 275
    invoke-virtual {v14, v6, v2, v13, v8}, Lup3;->B0(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    if-nez v2, :cond_7

    .line 280
    .line 281
    const/16 v19, 0xd

    .line 282
    .line 283
    goto :goto_5

    .line 284
    :cond_7
    iget-object v2, v14, Lsq3;->a:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v2, Lij3;

    .line 287
    .line 288
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v14, v5, v6, v8}, Lup3;->C0(ILjava/lang/String;Ljava/lang/String;)Z

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    if-nez v2, :cond_8

    .line 296
    .line 297
    goto :goto_5

    .line 298
    :cond_8
    const/16 v19, 0x0

    .line 299
    .line 300
    :goto_5
    if-eqz v19, :cond_a

    .line 301
    .line 302
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 303
    .line 304
    .line 305
    iget-object v1, v15, Luh3;->v:Lsh3;

    .line 306
    .line 307
    invoke-virtual {v0, v8}, Lmh3;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    const-string v2, "Invalid public event name. Event will not be logged (FE)"

    .line 312
    .line 313
    invoke-virtual {v1, v0, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    invoke-static {v14}, Lij3;->j(Lsq3;)V

    .line 317
    .line 318
    .line 319
    const/4 v13, 0x1

    .line 320
    invoke-static {v5, v8, v13}, Lup3;->E(ILjava/lang/String;Z)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    if-eqz v8, :cond_9

    .line 325
    .line 326
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    goto :goto_6

    .line 331
    :cond_9
    const/4 v2, 0x0

    .line 332
    :goto_6
    const/4 v1, 0x0

    .line 333
    const-string v3, "_ev"

    .line 334
    .line 335
    move-object/from16 p4, v0

    .line 336
    .line 337
    move-object/from16 p1, v1

    .line 338
    .line 339
    move/from16 p5, v2

    .line 340
    .line 341
    move-object/from16 p3, v3

    .line 342
    .line 343
    move-object/from16 p0, v4

    .line 344
    .line 345
    move/from16 p2, v19

    .line 346
    .line 347
    invoke-static/range {p0 .. p5}, Lup3;->P(Lac3;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 348
    .line 349
    .line 350
    return-void

    .line 351
    :cond_a
    move-object v2, v4

    .line 352
    iget-object v13, v11, Lij3;->W:Llm3;

    .line 353
    .line 354
    invoke-static {v13}, Lij3;->k(Lwg3;)V

    .line 355
    .line 356
    .line 357
    const/4 v4, 0x0

    .line 358
    invoke-virtual {v13, v4}, Llm3;->F(Z)Lbm3;

    .line 359
    .line 360
    .line 361
    move-result-object v6

    .line 362
    const-string v4, "_sc"

    .line 363
    .line 364
    if-eqz v6, :cond_b

    .line 365
    .line 366
    invoke-virtual {v9, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 367
    .line 368
    .line 369
    move-result v19

    .line 370
    if-nez v19, :cond_b

    .line 371
    .line 372
    const/4 v5, 0x1

    .line 373
    iput-boolean v5, v6, Lbm3;->d:Z

    .line 374
    .line 375
    :cond_b
    if-eqz p6, :cond_c

    .line 376
    .line 377
    if-nez v10, :cond_c

    .line 378
    .line 379
    const/4 v5, 0x1

    .line 380
    goto :goto_7

    .line 381
    :cond_c
    const/4 v5, 0x0

    .line 382
    :goto_7
    invoke-static {v6, v9, v5}, Lup3;->q0(Lbm3;Landroid/os/Bundle;Z)V

    .line 383
    .line 384
    .line 385
    const-string v5, "am"

    .line 386
    .line 387
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v5

    .line 391
    invoke-static {v8}, Lup3;->X(Ljava/lang/String;)Z

    .line 392
    .line 393
    .line 394
    move-result v6

    .line 395
    if-eqz p6, :cond_f

    .line 396
    .line 397
    move-object/from16 v20, v2

    .line 398
    .line 399
    iget-object v2, v1, Lsl3;->d:Lqk3;

    .line 400
    .line 401
    if-eqz v2, :cond_e

    .line 402
    .line 403
    if-nez v6, :cond_e

    .line 404
    .line 405
    if-eqz v5, :cond_d

    .line 406
    .line 407
    move-wide/from16 v1, p3

    .line 408
    .line 409
    const/16 v21, 0x1

    .line 410
    .line 411
    goto :goto_a

    .line 412
    :cond_d
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 413
    .line 414
    .line 415
    iget-object v2, v15, Luh3;->X:Lsh3;

    .line 416
    .line 417
    invoke-virtual {v0, v8}, Lmh3;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    invoke-virtual {v0, v9}, Lmh3;->e(Landroid/os/Bundle;)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    const-string v4, "Passing event to registered event handler (FE)"

    .line 426
    .line 427
    invoke-virtual {v2, v3, v4, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    iget-object v0, v1, Lsl3;->d:Lqk3;

    .line 431
    .line 432
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    iget-object v0, v1, Lsl3;->d:Lqk3;

    .line 436
    .line 437
    check-cast v0, Lwe2;

    .line 438
    .line 439
    move-wide/from16 v4, p3

    .line 440
    .line 441
    move-object v1, v7

    .line 442
    move-object v2, v8

    .line 443
    move-object v3, v9

    .line 444
    invoke-virtual/range {v0 .. v5}, Lwe2;->l(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    .line 445
    .line 446
    .line 447
    return-void

    .line 448
    :cond_e
    :goto_8
    move-wide/from16 v1, p3

    .line 449
    .line 450
    goto :goto_9

    .line 451
    :cond_f
    move-object/from16 v20, v2

    .line 452
    .line 453
    goto :goto_8

    .line 454
    :goto_9
    move/from16 v21, v5

    .line 455
    .line 456
    :goto_a
    invoke-virtual {v11}, Lij3;->h()Z

    .line 457
    .line 458
    .line 459
    move-result v5

    .line 460
    if-nez v5, :cond_10

    .line 461
    .line 462
    goto/16 :goto_1b

    .line 463
    .line 464
    :cond_10
    invoke-static {v14}, Lij3;->j(Lsq3;)V

    .line 465
    .line 466
    .line 467
    iget-object v5, v14, Lsq3;->a:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast v5, Lij3;

    .line 470
    .line 471
    invoke-virtual {v14, v8}, Lup3;->D0(Ljava/lang/String;)I

    .line 472
    .line 473
    .line 474
    move-result v6

    .line 475
    if-eqz v6, :cond_12

    .line 476
    .line 477
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 478
    .line 479
    .line 480
    iget-object v1, v15, Luh3;->v:Lsh3;

    .line 481
    .line 482
    invoke-virtual {v0, v8}, Lmh3;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    const-string v2, "Invalid event name. Event will not be logged (FE)"

    .line 487
    .line 488
    invoke-virtual {v1, v0, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    const/16 v0, 0x28

    .line 492
    .line 493
    const/4 v13, 0x1

    .line 494
    invoke-static {v0, v8, v13}, Lup3;->E(ILjava/lang/String;Z)Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    if-eqz v8, :cond_11

    .line 499
    .line 500
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 501
    .line 502
    .line 503
    move-result v2

    .line 504
    goto :goto_b

    .line 505
    :cond_11
    const/4 v2, 0x0

    .line 506
    :goto_b
    invoke-static {v14}, Lij3;->j(Lsq3;)V

    .line 507
    .line 508
    .line 509
    const-string v1, "_ev"

    .line 510
    .line 511
    const/4 v3, 0x0

    .line 512
    move-object/from16 p4, v0

    .line 513
    .line 514
    move-object/from16 p3, v1

    .line 515
    .line 516
    move/from16 p5, v2

    .line 517
    .line 518
    move-object/from16 p1, v3

    .line 519
    .line 520
    move/from16 p2, v6

    .line 521
    .line 522
    move-object/from16 p0, v20

    .line 523
    .line 524
    invoke-static/range {p0 .. p5}, Lup3;->P(Lac3;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 525
    .line 526
    .line 527
    return-void

    .line 528
    :cond_12
    const-string v0, "_sn"

    .line 529
    .line 530
    const-string v6, "_si"

    .line 531
    .line 532
    move-object/from16 v19, v11

    .line 533
    .line 534
    const-string v11, "_o"

    .line 535
    .line 536
    filled-new-array {v11, v0, v4, v6}, [Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-virtual {v14, v8, v9, v0, v10}, Lup3;->H(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;Z)Landroid/os/Bundle;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    invoke-static {v13}, Lij3;->k(Lwg3;)V

    .line 556
    .line 557
    .line 558
    const/4 v4, 0x0

    .line 559
    invoke-virtual {v13, v4}, Llm3;->F(Z)Lbm3;

    .line 560
    .line 561
    .line 562
    move-result-object v6

    .line 563
    const-string v9, "_ae"

    .line 564
    .line 565
    move-object/from16 p6, v5

    .line 566
    .line 567
    if-eqz v6, :cond_13

    .line 568
    .line 569
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    move-result v6

    .line 573
    if-eqz v6, :cond_13

    .line 574
    .line 575
    invoke-static {v12}, Lij3;->k(Lwg3;)V

    .line 576
    .line 577
    .line 578
    iget-object v6, v12, Llo3;->f:Lio/sentry/android/core/internal/tombstone/b;

    .line 579
    .line 580
    iget-object v10, v6, Lio/sentry/android/core/internal/tombstone/b;->d:Ljava/lang/Object;

    .line 581
    .line 582
    check-cast v10, Llo3;

    .line 583
    .line 584
    iget-object v10, v10, Lsq3;->a:Ljava/lang/Object;

    .line 585
    .line 586
    check-cast v10, Lij3;

    .line 587
    .line 588
    iget-object v10, v10, Lij3;->V:Lxt0;

    .line 589
    .line 590
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    const-wide/16 v22, 0x0

    .line 594
    .line 595
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 596
    .line 597
    .line 598
    move-result-wide v4

    .line 599
    move-object/from16 v20, v11

    .line 600
    .line 601
    iget-wide v10, v6, Lio/sentry/android/core/internal/tombstone/b;->b:J

    .line 602
    .line 603
    sub-long v10, v4, v10

    .line 604
    .line 605
    iput-wide v4, v6, Lio/sentry/android/core/internal/tombstone/b;->b:J

    .line 606
    .line 607
    cmp-long v4, v10, v22

    .line 608
    .line 609
    if-lez v4, :cond_14

    .line 610
    .line 611
    invoke-virtual {v14, v0, v10, v11}, Lup3;->g0(Landroid/os/Bundle;J)V

    .line 612
    .line 613
    .line 614
    goto :goto_c

    .line 615
    :cond_13
    move-object/from16 v20, v11

    .line 616
    .line 617
    const-wide/16 v22, 0x0

    .line 618
    .line 619
    :cond_14
    :goto_c
    const-string v4, "auto"

    .line 620
    .line 621
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 622
    .line 623
    .line 624
    move-result v4

    .line 625
    const-string v5, "_ffr"

    .line 626
    .line 627
    if-nez v4, :cond_19

    .line 628
    .line 629
    const-string v4, "_ssr"

    .line 630
    .line 631
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 632
    .line 633
    .line 634
    move-result v4

    .line 635
    if-eqz v4, :cond_19

    .line 636
    .line 637
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v4

    .line 641
    sget v5, Lxh2;->a:I

    .line 642
    .line 643
    if-eqz v4, :cond_17

    .line 644
    .line 645
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v5

    .line 649
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 650
    .line 651
    .line 652
    move-result v5

    .line 653
    if-eqz v5, :cond_15

    .line 654
    .line 655
    goto :goto_d

    .line 656
    :cond_15
    if-eqz v4, :cond_16

    .line 657
    .line 658
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object v4

    .line 662
    :cond_16
    move-object/from16 v6, p6

    .line 663
    .line 664
    goto :goto_e

    .line 665
    :cond_17
    :goto_d
    move-object/from16 v6, p6

    .line 666
    .line 667
    const/4 v4, 0x0

    .line 668
    :goto_e
    iget-object v5, v6, Lij3;->e:Lki3;

    .line 669
    .line 670
    invoke-static {v5}, Lij3;->j(Lsq3;)V

    .line 671
    .line 672
    .line 673
    iget-object v5, v5, Lki3;->g0:Ltj;

    .line 674
    .line 675
    invoke-virtual {v5}, Ltj;->m()Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v5

    .line 679
    invoke-static {v4, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 680
    .line 681
    .line 682
    move-result v5

    .line 683
    if-nez v5, :cond_18

    .line 684
    .line 685
    iget-object v5, v6, Lij3;->e:Lki3;

    .line 686
    .line 687
    invoke-static {v5}, Lij3;->j(Lsq3;)V

    .line 688
    .line 689
    .line 690
    iget-object v5, v5, Lki3;->g0:Ltj;

    .line 691
    .line 692
    invoke-virtual {v5, v4}, Ltj;->n(Ljava/lang/String;)V

    .line 693
    .line 694
    .line 695
    goto :goto_f

    .line 696
    :cond_18
    iget-object v0, v6, Lij3;->f:Luh3;

    .line 697
    .line 698
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 699
    .line 700
    .line 701
    iget-object v0, v0, Luh3;->X:Lsh3;

    .line 702
    .line 703
    const-string v1, "Not logging duplicate session_start_with_rollout event"

    .line 704
    .line 705
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    return-void

    .line 709
    :cond_19
    move-object/from16 v6, p6

    .line 710
    .line 711
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 712
    .line 713
    .line 714
    move-result v4

    .line 715
    if-eqz v4, :cond_1a

    .line 716
    .line 717
    iget-object v4, v6, Lij3;->e:Lki3;

    .line 718
    .line 719
    invoke-static {v4}, Lij3;->j(Lsq3;)V

    .line 720
    .line 721
    .line 722
    iget-object v4, v4, Lki3;->g0:Ltj;

    .line 723
    .line 724
    invoke-virtual {v4}, Ltj;->m()Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v4

    .line 728
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 729
    .line 730
    .line 731
    move-result v6

    .line 732
    if-nez v6, :cond_1a

    .line 733
    .line 734
    invoke-virtual {v0, v5, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 735
    .line 736
    .line 737
    :cond_1a
    :goto_f
    new-instance v10, Ljava/util/ArrayList;

    .line 738
    .line 739
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 740
    .line 741
    .line 742
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 743
    .line 744
    .line 745
    sget-object v4, Lvg3;->U0:Lug3;

    .line 746
    .line 747
    move-object/from16 v5, v16

    .line 748
    .line 749
    const/4 v11, 0x0

    .line 750
    invoke-virtual {v5, v11, v4}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 751
    .line 752
    .line 753
    move-result v4

    .line 754
    if-eqz v4, :cond_1b

    .line 755
    .line 756
    invoke-static {v12}, Lij3;->k(Lwg3;)V

    .line 757
    .line 758
    .line 759
    invoke-virtual {v12}, Leg3;->y()V

    .line 760
    .line 761
    .line 762
    iget-boolean v4, v12, Llo3;->d:Z

    .line 763
    .line 764
    goto :goto_10

    .line 765
    :cond_1b
    invoke-static {v3}, Lij3;->j(Lsq3;)V

    .line 766
    .line 767
    .line 768
    iget-object v4, v3, Lki3;->d0:Lhi3;

    .line 769
    .line 770
    invoke-virtual {v4}, Lhi3;->a()Z

    .line 771
    .line 772
    .line 773
    move-result v4

    .line 774
    :goto_10
    invoke-static {v3}, Lij3;->j(Lsq3;)V

    .line 775
    .line 776
    .line 777
    iget-object v5, v3, Lki3;->a0:Lio/sentry/android/core/s;

    .line 778
    .line 779
    invoke-virtual {v5}, Lio/sentry/android/core/s;->a()J

    .line 780
    .line 781
    .line 782
    move-result-wide v5

    .line 783
    cmp-long v5, v5, v22

    .line 784
    .line 785
    if-lez v5, :cond_1c

    .line 786
    .line 787
    invoke-virtual {v3, v1, v2}, Lki3;->J(J)Z

    .line 788
    .line 789
    .line 790
    move-result v5

    .line 791
    if-eqz v5, :cond_1c

    .line 792
    .line 793
    if-eqz v4, :cond_1c

    .line 794
    .line 795
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 796
    .line 797
    .line 798
    iget-object v4, v15, Luh3;->Y:Lsh3;

    .line 799
    .line 800
    const-string v5, "Current session is expired, remove the session number, ID, and engagement time"

    .line 801
    .line 802
    invoke-virtual {v4, v5}, Lsh3;->a(Ljava/lang/String;)V

    .line 803
    .line 804
    .line 805
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 806
    .line 807
    .line 808
    move-object/from16 v16, v3

    .line 809
    .line 810
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 811
    .line 812
    .line 813
    move-result-wide v2

    .line 814
    const-string v6, "_sid"

    .line 815
    .line 816
    const/4 v4, 0x0

    .line 817
    const-string v5, "auto"

    .line 818
    .line 819
    const/16 v17, 0x0

    .line 820
    .line 821
    move-object/from16 v1, p0

    .line 822
    .line 823
    move-object/from16 p5, v9

    .line 824
    .line 825
    move-object/from16 v11, v16

    .line 826
    .line 827
    move-wide/from16 v8, v22

    .line 828
    .line 829
    invoke-virtual/range {v1 .. v6}, Lsl3;->K(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 833
    .line 834
    .line 835
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 836
    .line 837
    .line 838
    move-result-wide v2

    .line 839
    const-string v6, "_sno"

    .line 840
    .line 841
    const-string v5, "auto"

    .line 842
    .line 843
    invoke-virtual/range {v1 .. v6}, Lsl3;->K(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 844
    .line 845
    .line 846
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 847
    .line 848
    .line 849
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 850
    .line 851
    .line 852
    move-result-wide v2

    .line 853
    const-string v6, "_se"

    .line 854
    .line 855
    const-string v5, "auto"

    .line 856
    .line 857
    invoke-virtual/range {v1 .. v6}, Lsl3;->K(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 858
    .line 859
    .line 860
    move-object v6, v1

    .line 861
    iget-object v1, v11, Lki3;->b0:Lio/sentry/android/core/s;

    .line 862
    .line 863
    invoke-virtual {v1, v8, v9}, Lio/sentry/android/core/s;->b(J)V

    .line 864
    .line 865
    .line 866
    goto :goto_11

    .line 867
    :cond_1c
    move-object/from16 v6, p0

    .line 868
    .line 869
    move-object/from16 p5, v9

    .line 870
    .line 871
    move-wide/from16 v8, v22

    .line 872
    .line 873
    const/16 v17, 0x0

    .line 874
    .line 875
    :goto_11
    const-string v1, "extend_session"

    .line 876
    .line 877
    invoke-virtual {v0, v1, v8, v9}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 878
    .line 879
    .line 880
    move-result-wide v1

    .line 881
    const-wide/16 v3, 0x1

    .line 882
    .line 883
    cmp-long v1, v1, v3

    .line 884
    .line 885
    if-nez v1, :cond_1d

    .line 886
    .line 887
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 888
    .line 889
    .line 890
    iget-object v1, v15, Luh3;->Y:Lsh3;

    .line 891
    .line 892
    const-string v2, "EXTEND_SESSION param attached: initiate a new session or extend the current active session"

    .line 893
    .line 894
    invoke-virtual {v1, v2}, Lsh3;->a(Ljava/lang/String;)V

    .line 895
    .line 896
    .line 897
    invoke-static {v12}, Lij3;->k(Lwg3;)V

    .line 898
    .line 899
    .line 900
    iget-object v1, v12, Llo3;->e:Lpi3;

    .line 901
    .line 902
    move-wide/from16 v4, p3

    .line 903
    .line 904
    invoke-virtual {v1, v4, v5}, Lpi3;->c(J)V

    .line 905
    .line 906
    .line 907
    goto :goto_12

    .line 908
    :cond_1d
    move-wide/from16 v4, p3

    .line 909
    .line 910
    :goto_12
    new-instance v1, Ljava/util/ArrayList;

    .line 911
    .line 912
    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 913
    .line 914
    .line 915
    move-result-object v2

    .line 916
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 917
    .line 918
    .line 919
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 920
    .line 921
    .line 922
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 923
    .line 924
    .line 925
    move-result v2

    .line 926
    move/from16 v3, v17

    .line 927
    .line 928
    :goto_13
    if-ge v3, v2, :cond_22

    .line 929
    .line 930
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object v8

    .line 934
    check-cast v8, Ljava/lang/String;

    .line 935
    .line 936
    if-eqz v8, :cond_21

    .line 937
    .line 938
    invoke-static {v14}, Lij3;->j(Lsq3;)V

    .line 939
    .line 940
    .line 941
    invoke-virtual {v0, v8}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 942
    .line 943
    .line 944
    move-result-object v9

    .line 945
    instance-of v11, v9, Landroid/os/Bundle;

    .line 946
    .line 947
    if-eqz v11, :cond_1e

    .line 948
    .line 949
    const/4 v11, 0x1

    .line 950
    new-array v15, v11, [Landroid/os/Bundle;

    .line 951
    .line 952
    check-cast v9, Landroid/os/Bundle;

    .line 953
    .line 954
    aput-object v9, v15, v17

    .line 955
    .line 956
    move-object v9, v15

    .line 957
    goto :goto_14

    .line 958
    :cond_1e
    instance-of v11, v9, [Landroid/os/Parcelable;

    .line 959
    .line 960
    if-eqz v11, :cond_1f

    .line 961
    .line 962
    check-cast v9, [Landroid/os/Parcelable;

    .line 963
    .line 964
    array-length v11, v9

    .line 965
    const-class v15, [Landroid/os/Bundle;

    .line 966
    .line 967
    invoke-static {v9, v11, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;

    .line 968
    .line 969
    .line 970
    move-result-object v9

    .line 971
    check-cast v9, [Landroid/os/Bundle;

    .line 972
    .line 973
    goto :goto_14

    .line 974
    :cond_1f
    instance-of v11, v9, Ljava/util/ArrayList;

    .line 975
    .line 976
    if-eqz v11, :cond_20

    .line 977
    .line 978
    check-cast v9, Ljava/util/ArrayList;

    .line 979
    .line 980
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 981
    .line 982
    .line 983
    move-result v11

    .line 984
    new-array v11, v11, [Landroid/os/Bundle;

    .line 985
    .line 986
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object v9

    .line 990
    check-cast v9, [Landroid/os/Bundle;

    .line 991
    .line 992
    goto :goto_14

    .line 993
    :cond_20
    const/4 v9, 0x0

    .line 994
    :goto_14
    if-eqz v9, :cond_21

    .line 995
    .line 996
    invoke-virtual {v0, v8, v9}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 997
    .line 998
    .line 999
    :cond_21
    add-int/lit8 v3, v3, 0x1

    .line 1000
    .line 1001
    goto :goto_13

    .line 1002
    :cond_22
    move/from16 v8, v17

    .line 1003
    .line 1004
    :goto_15
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 1005
    .line 1006
    .line 1007
    move-result v0

    .line 1008
    if-ge v8, v0, :cond_27

    .line 1009
    .line 1010
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v0

    .line 1014
    check-cast v0, Landroid/os/Bundle;

    .line 1015
    .line 1016
    if-eqz v8, :cond_23

    .line 1017
    .line 1018
    const-string v1, "_ep"

    .line 1019
    .line 1020
    :goto_16
    move-object/from16 v9, v20

    .line 1021
    .line 1022
    goto :goto_17

    .line 1023
    :cond_23
    move-object/from16 v1, p2

    .line 1024
    .line 1025
    goto :goto_16

    .line 1026
    :goto_17
    invoke-virtual {v0, v9, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1027
    .line 1028
    .line 1029
    if-eqz p7, :cond_24

    .line 1030
    .line 1031
    invoke-virtual {v14, v0}, Lup3;->a0(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v0

    .line 1035
    :cond_24
    move-object v11, v0

    .line 1036
    new-instance v26, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 1037
    .line 1038
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzbe;

    .line 1039
    .line 1040
    invoke-direct {v2, v11}, Lcom/google/android/gms/measurement/internal/zzbe;-><init>(Landroid/os/Bundle;)V

    .line 1041
    .line 1042
    .line 1043
    move-object v3, v7

    .line 1044
    move-object/from16 v0, v26

    .line 1045
    .line 1046
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzbe;Ljava/lang/String;J)V

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual/range {v19 .. v19}, Lij3;->o()Lpn3;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v1

    .line 1053
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v1}, Leg3;->y()V

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v1}, Lwg3;->A()V

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v1}, Lpn3;->L()V

    .line 1063
    .line 1064
    .line 1065
    iget-object v2, v1, Lsq3;->a:Ljava/lang/Object;

    .line 1066
    .line 1067
    check-cast v2, Lij3;

    .line 1068
    .line 1069
    invoke-virtual {v2}, Lij3;->n()Llh3;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v2

    .line 1073
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1074
    .line 1075
    .line 1076
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v3

    .line 1080
    move/from16 v4, v17

    .line 1081
    .line 1082
    invoke-static {v0, v3, v4}, Lre3;->a(Lcom/google/android/gms/measurement/internal/zzbg;Landroid/os/Parcel;I)V

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v3}, Landroid/os/Parcel;->marshall()[B

    .line 1086
    .line 1087
    .line 1088
    move-result-object v4

    .line 1089
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1090
    .line 1091
    .line 1092
    array-length v3, v4

    .line 1093
    const/high16 v5, 0x20000

    .line 1094
    .line 1095
    if-le v3, v5, :cond_25

    .line 1096
    .line 1097
    iget-object v2, v2, Lsq3;->a:Ljava/lang/Object;

    .line 1098
    .line 1099
    check-cast v2, Lij3;

    .line 1100
    .line 1101
    iget-object v2, v2, Lij3;->f:Luh3;

    .line 1102
    .line 1103
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 1104
    .line 1105
    .line 1106
    iget-object v2, v2, Luh3;->i:Lsh3;

    .line 1107
    .line 1108
    const-string v3, "Event is too long for local database. Sending event directly to service"

    .line 1109
    .line 1110
    invoke-virtual {v2, v3}, Lsh3;->a(Ljava/lang/String;)V

    .line 1111
    .line 1112
    .line 1113
    const/16 v25, 0x0

    .line 1114
    .line 1115
    :goto_18
    const/4 v5, 0x1

    .line 1116
    goto :goto_19

    .line 1117
    :cond_25
    const/4 v3, 0x0

    .line 1118
    invoke-virtual {v2, v4, v3}, Llh3;->G([BI)Z

    .line 1119
    .line 1120
    .line 1121
    move-result v2

    .line 1122
    move/from16 v25, v2

    .line 1123
    .line 1124
    goto :goto_18

    .line 1125
    :goto_19
    invoke-virtual {v1, v5}, Lpn3;->P(Z)Lcom/google/android/gms/measurement/internal/zzr;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v24

    .line 1129
    new-instance v22, Lrm3;

    .line 1130
    .line 1131
    const/16 v27, 0x1

    .line 1132
    .line 1133
    move-object/from16 v26, v0

    .line 1134
    .line 1135
    move-object/from16 v23, v1

    .line 1136
    .line 1137
    invoke-direct/range {v22 .. v27}, Lrm3;-><init>(Lpn3;Lcom/google/android/gms/measurement/internal/zzr;ZLcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;I)V

    .line 1138
    .line 1139
    .line 1140
    move-object/from16 v1, v22

    .line 1141
    .line 1142
    move-object/from16 v0, v23

    .line 1143
    .line 1144
    invoke-virtual {v0, v1}, Lpn3;->N(Ljava/lang/Runnable;)V

    .line 1145
    .line 1146
    .line 1147
    if-nez v21, :cond_26

    .line 1148
    .line 1149
    iget-object v0, v6, Lsl3;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1150
    .line 1151
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v7

    .line 1155
    :goto_1a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1156
    .line 1157
    .line 1158
    move-result v0

    .line 1159
    if-eqz v0, :cond_26

    .line 1160
    .line 1161
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v0

    .line 1165
    check-cast v0, Lrk3;

    .line 1166
    .line 1167
    new-instance v3, Landroid/os/Bundle;

    .line 1168
    .line 1169
    invoke-direct {v3, v11}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 1170
    .line 1171
    .line 1172
    move-object/from16 v1, p1

    .line 1173
    .line 1174
    move-object/from16 v2, p2

    .line 1175
    .line 1176
    move-wide/from16 v4, p3

    .line 1177
    .line 1178
    invoke-interface/range {v0 .. v5}, Lrk3;->onEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    .line 1179
    .line 1180
    .line 1181
    goto :goto_1a

    .line 1182
    :cond_26
    move-object/from16 v2, p2

    .line 1183
    .line 1184
    add-int/lit8 v8, v8, 0x1

    .line 1185
    .line 1186
    move-object/from16 v7, p1

    .line 1187
    .line 1188
    move-wide/from16 v4, p3

    .line 1189
    .line 1190
    move-object/from16 v20, v9

    .line 1191
    .line 1192
    const/16 v17, 0x0

    .line 1193
    .line 1194
    goto/16 :goto_15

    .line 1195
    .line 1196
    :cond_27
    move-object/from16 v2, p2

    .line 1197
    .line 1198
    invoke-static {v13}, Lij3;->k(Lwg3;)V

    .line 1199
    .line 1200
    .line 1201
    const/4 v4, 0x0

    .line 1202
    invoke-virtual {v13, v4}, Llm3;->F(Z)Lbm3;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v0

    .line 1206
    if-eqz v0, :cond_28

    .line 1207
    .line 1208
    move-object/from16 v0, p5

    .line 1209
    .line 1210
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1211
    .line 1212
    .line 1213
    move-result v0

    .line 1214
    if-eqz v0, :cond_28

    .line 1215
    .line 1216
    invoke-static {v12}, Lij3;->k(Lwg3;)V

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1220
    .line 1221
    .line 1222
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1223
    .line 1224
    .line 1225
    move-result-wide v0

    .line 1226
    iget-object v2, v12, Llo3;->f:Lio/sentry/android/core/internal/tombstone/b;

    .line 1227
    .line 1228
    const/4 v13, 0x1

    .line 1229
    invoke-virtual {v2, v0, v1, v13, v13}, Lio/sentry/android/core/internal/tombstone/b;->b(JZZ)Z

    .line 1230
    .line 1231
    .line 1232
    :cond_28
    :goto_1b
    return-void

    .line 1233
    :cond_29
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 1234
    .line 1235
    .line 1236
    iget-object v0, v15, Luh3;->X:Lsh3;

    .line 1237
    .line 1238
    const-string v1, "Event not sent since app measurement is disabled"

    .line 1239
    .line 1240
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 1241
    .line 1242
    .line 1243
    return-void
.end method

.method public final J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V
    .locals 11

    .line 1
    iget-object v2, p0, Lsq3;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v2, Lij3;

    .line 4
    .line 5
    const/4 v4, 0x0

    .line 6
    const/16 v5, 0x18

    .line 7
    .line 8
    if-eqz p4, :cond_0

    .line 9
    .line 10
    iget-object v6, v2, Lij3;->w:Lup3;

    .line 11
    .line 12
    invoke-static {v6}, Lij3;->j(Lsq3;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v6, p2}, Lup3;->E0(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    iget-object v6, v2, Lij3;->w:Lup3;

    .line 21
    .line 22
    invoke-static {v6}, Lij3;->j(Lsq3;)V

    .line 23
    .line 24
    .line 25
    const-string v7, "user property"

    .line 26
    .line 27
    invoke-virtual {v6, v7, p2}, Lup3;->z0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    const/4 v9, 0x6

    .line 32
    if-nez v8, :cond_1

    .line 33
    .line 34
    :goto_0
    move v6, v9

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    sget-object v8, Lmn0;->h:[Ljava/lang/String;

    .line 37
    .line 38
    const/4 v10, 0x0

    .line 39
    invoke-virtual {v6, v7, v8, v10, p2}, Lup3;->B0(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-nez v8, :cond_2

    .line 44
    .line 45
    const/16 v6, 0xf

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    iget-object v8, v6, Lsq3;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v8, Lij3;

    .line 51
    .line 52
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6, v5, v7, p2}, Lup3;->C0(ILjava/lang/String;Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-nez v6, :cond_3

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    move v6, v4

    .line 63
    :goto_1
    iget-object v7, p0, Lsl3;->h0:Lac3;

    .line 64
    .line 65
    const/4 v8, 0x1

    .line 66
    if-eqz v6, :cond_5

    .line 67
    .line 68
    iget-object v0, v2, Lij3;->w:Lup3;

    .line 69
    .line 70
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v5, p2, v8}, Lup3;->E(ILjava/lang/String;Z)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-eqz p2, :cond_4

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    :cond_4
    iget-object v1, v2, Lij3;->w:Lup3;

    .line 84
    .line 85
    invoke-static {v1}, Lij3;->j(Lsq3;)V

    .line 86
    .line 87
    .line 88
    const/4 v1, 0x0

    .line 89
    const-string v2, "_ev"

    .line 90
    .line 91
    move-object p4, v0

    .line 92
    move-object p1, v1

    .line 93
    move-object p3, v2

    .line 94
    move/from16 p5, v4

    .line 95
    .line 96
    move p2, v6

    .line 97
    move-object p0, v7

    .line 98
    invoke-static/range {p0 .. p5}, Lup3;->P(Lac3;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_5
    move-object v6, v7

    .line 103
    if-nez p1, :cond_6

    .line 104
    .line 105
    const-string v7, "app"

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_6
    move-object v7, p1

    .line 109
    :goto_2
    if-eqz p3, :cond_b

    .line 110
    .line 111
    iget-object v9, v2, Lij3;->w:Lup3;

    .line 112
    .line 113
    iget-object v10, v2, Lij3;->w:Lup3;

    .line 114
    .line 115
    invoke-static {v9}, Lij3;->j(Lsq3;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v9, p3, p2}, Lup3;->M(Ljava/lang/Object;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    if-eqz v9, :cond_9

    .line 123
    .line 124
    invoke-static {v10}, Lij3;->j(Lsq3;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v5, p2, v8}, Lup3;->E(ILjava/lang/String;Z)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    instance-of v2, p3, Ljava/lang/String;

    .line 132
    .line 133
    if-nez v2, :cond_7

    .line 134
    .line 135
    instance-of v2, p3, Ljava/lang/CharSequence;

    .line 136
    .line 137
    if-eqz v2, :cond_8

    .line 138
    .line 139
    :cond_7
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    :cond_8
    invoke-static {v10}, Lij3;->j(Lsq3;)V

    .line 148
    .line 149
    .line 150
    const/4 v0, 0x0

    .line 151
    const-string v2, "_ev"

    .line 152
    .line 153
    move-object p1, v0

    .line 154
    move-object p4, v1

    .line 155
    move-object p3, v2

    .line 156
    move/from16 p5, v4

    .line 157
    .line 158
    move-object p0, v6

    .line 159
    move p2, v9

    .line 160
    invoke-static/range {p0 .. p5}, Lup3;->P(Lac3;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :cond_9
    invoke-static {v10}, Lij3;->j(Lsq3;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v10, p3, p2}, Lup3;->N(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    if-eqz v4, :cond_a

    .line 172
    .line 173
    iget-object v8, v2, Lij3;->i:Lbj3;

    .line 174
    .line 175
    invoke-static {v8}, Lij3;->l(Lhk3;)V

    .line 176
    .line 177
    .line 178
    new-instance v0, Lkq2;

    .line 179
    .line 180
    move-object v2, v7

    .line 181
    const/4 v7, 0x2

    .line 182
    move-object v1, p0

    .line 183
    move-object v3, p2

    .line 184
    move-wide/from16 v5, p5

    .line 185
    .line 186
    invoke-direct/range {v0 .. v7}, Lkq2;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;JI)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v8, v0}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 190
    .line 191
    .line 192
    :cond_a
    return-void

    .line 193
    :cond_b
    iget-object v8, v2, Lij3;->i:Lbj3;

    .line 194
    .line 195
    invoke-static {v8}, Lij3;->l(Lhk3;)V

    .line 196
    .line 197
    .line 198
    new-instance v0, Lkq2;

    .line 199
    .line 200
    move-object v2, v7

    .line 201
    const/4 v7, 0x2

    .line 202
    const/4 v4, 0x0

    .line 203
    move-object v1, p0

    .line 204
    move-object v3, p2

    .line 205
    move-wide/from16 v5, p5

    .line 206
    .line 207
    invoke-direct/range {v0 .. v7}, Lkq2;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;JI)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v8, v0}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 211
    .line 212
    .line 213
    return-void
.end method

.method public final K(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    iget-object v2, p0, Lsq3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, Lij3;

    .line 6
    .line 7
    invoke-static/range {p4 .. p4}, Lkb1;->k(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static/range {p5 .. p5}, Lkb1;->k(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Leg3;->y()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lwg3;->A()V

    .line 17
    .line 18
    .line 19
    const-string v1, "allow_personalized_ads"

    .line 20
    .line 21
    move-object/from16 v3, p5

    .line 22
    .line 23
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v4, 0x1

    .line 28
    if-eqz v1, :cond_4

    .line 29
    .line 30
    instance-of v1, v0, Ljava/lang/String;

    .line 31
    .line 32
    const-string v5, "_npa"

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    move-object v1, v0

    .line 37
    check-cast v1, Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-nez v6, :cond_2

    .line 44
    .line 45
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "false"

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    const-wide/16 v6, 0x1

    .line 58
    .line 59
    if-eq v4, v0, :cond_0

    .line 60
    .line 61
    const-wide/16 v8, 0x0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move-wide v8, v6

    .line 65
    :goto_0
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-object v3, v2, Lij3;->e:Lki3;

    .line 70
    .line 71
    invoke-static {v3}, Lij3;->j(Lsq3;)V

    .line 72
    .line 73
    .line 74
    iget-object v3, v3, Lki3;->X:Ltj;

    .line 75
    .line 76
    cmp-long v6, v8, v6

    .line 77
    .line 78
    if-nez v6, :cond_1

    .line 79
    .line 80
    const-string v1, "true"

    .line 81
    .line 82
    :cond_1
    invoke-virtual {v3, v1}, Ltj;->n(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    if-nez v0, :cond_3

    .line 87
    .line 88
    iget-object v1, v2, Lij3;->e:Lki3;

    .line 89
    .line 90
    invoke-static {v1}, Lij3;->j(Lsq3;)V

    .line 91
    .line 92
    .line 93
    iget-object v1, v1, Lki3;->X:Ltj;

    .line 94
    .line 95
    const-string v3, "unset"

    .line 96
    .line 97
    invoke-virtual {v1, v3}, Ltj;->n(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    move-object v5, v3

    .line 102
    :goto_1
    iget-object v1, v2, Lij3;->f:Luh3;

    .line 103
    .line 104
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 105
    .line 106
    .line 107
    iget-object v1, v1, Luh3;->Y:Lsh3;

    .line 108
    .line 109
    const-string v3, "Setting user property(FE)"

    .line 110
    .line 111
    const-string v6, "non_personalized_ads(_npa)"

    .line 112
    .line 113
    invoke-virtual {v1, v6, v3, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    move-object v11, v5

    .line 117
    :goto_2
    move-object v10, v0

    .line 118
    goto :goto_3

    .line 119
    :cond_4
    move-object v11, v3

    .line 120
    goto :goto_2

    .line 121
    :goto_3
    invoke-virtual {v2}, Lij3;->d()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-nez v0, :cond_5

    .line 126
    .line 127
    iget-object v0, v2, Lij3;->f:Luh3;

    .line 128
    .line 129
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 130
    .line 131
    .line 132
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 133
    .line 134
    const-string v1, "User property not set since app measurement is disabled"

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_5
    invoke-virtual {v2}, Lij3;->h()Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-nez v0, :cond_6

    .line 145
    .line 146
    return-void

    .line 147
    :cond_6
    new-instance v7, Lcom/google/android/gms/measurement/internal/zzpk;

    .line 148
    .line 149
    move-wide v8, p1

    .line 150
    move-object/from16 v12, p4

    .line 151
    .line 152
    invoke-direct/range {v7 .. v12}, Lcom/google/android/gms/measurement/internal/zzpk;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Lij3;->o()Lpn3;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v0}, Leg3;->y()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Lwg3;->A()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0}, Lpn3;->L()V

    .line 166
    .line 167
    .line 168
    iget-object v1, v0, Lsq3;->a:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v1, Lij3;

    .line 171
    .line 172
    invoke-virtual {v1}, Lij3;->n()Llh3;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-static {v7, v2}, Lcl3;->b(Lcom/google/android/gms/measurement/internal/zzpk;Landroid/os/Parcel;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2}, Landroid/os/Parcel;->marshall()[B

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 191
    .line 192
    .line 193
    array-length v2, v3

    .line 194
    const/high16 v5, 0x20000

    .line 195
    .line 196
    if-le v2, v5, :cond_7

    .line 197
    .line 198
    iget-object v1, v1, Lsq3;->a:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v1, Lij3;

    .line 201
    .line 202
    iget-object v1, v1, Lij3;->f:Luh3;

    .line 203
    .line 204
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 205
    .line 206
    .line 207
    iget-object v1, v1, Luh3;->i:Lsh3;

    .line 208
    .line 209
    const-string v2, "User property too long for local database. Sending directly to service"

    .line 210
    .line 211
    invoke-virtual {v1, v2}, Lsh3;->a(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    const/4 v1, 0x0

    .line 215
    goto :goto_4

    .line 216
    :cond_7
    invoke-virtual {v1, v3, v4}, Llh3;->G([BI)Z

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    :goto_4
    invoke-virtual {v0, v4}, Lpn3;->P(Z)Lcom/google/android/gms/measurement/internal/zzr;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    new-instance v3, Lrm3;

    .line 225
    .line 226
    const/4 v4, 0x0

    .line 227
    move-object p1, v0

    .line 228
    move/from16 p3, v1

    .line 229
    .line 230
    move-object p2, v2

    .line 231
    move-object p0, v3

    .line 232
    move/from16 p5, v4

    .line 233
    .line 234
    move-object/from16 p4, v7

    .line 235
    .line 236
    invoke-direct/range {p0 .. p5}, Lrm3;-><init>(Lpn3;Lcom/google/android/gms/measurement/internal/zzr;ZLcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;I)V

    .line 237
    .line 238
    .line 239
    move-object v1, p0

    .line 240
    invoke-virtual {v0, v1}, Lpn3;->N(Ljava/lang/Runnable;)V

    .line 241
    .line 242
    .line 243
    return-void
.end method

.method public final L()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Leg3;->y()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lwg3;->A()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lij3;

    .line 10
    .line 11
    invoke-virtual {v0}, Lij3;->h()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_0

    .line 18
    .line 19
    :cond_0
    iget-object v1, v0, Lij3;->d:Lpd3;

    .line 20
    .line 21
    iget-object v2, v1, Lsq3;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lij3;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const-string v2, "google_analytics_deferred_deep_link_enabled"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lpd3;->L(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iget-object v1, v0, Lij3;->f:Luh3;

    .line 43
    .line 44
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, v1, Luh3;->X:Lsh3;

    .line 48
    .line 49
    const-string v2, "Deferred Deep Link feature enabled."

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Lsh3;->a(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, v0, Lij3;->i:Lbj3;

    .line 55
    .line 56
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 57
    .line 58
    .line 59
    new-instance v2, Luk3;

    .line 60
    .line 61
    const/4 v3, 0x2

    .line 62
    invoke-direct {v2, p0, v3}, Luk3;-><init>(Lsl3;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    invoke-virtual {v0}, Lij3;->o()Lpn3;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, Leg3;->y()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Lwg3;->A()V

    .line 76
    .line 77
    .line 78
    const/4 v2, 0x1

    .line 79
    invoke-virtual {v1, v2}, Lpn3;->P(Z)Lcom/google/android/gms/measurement/internal/zzr;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v1}, Lpn3;->L()V

    .line 84
    .line 85
    .line 86
    iget-object v3, v1, Lsq3;->a:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v3, Lij3;

    .line 89
    .line 90
    iget-object v4, v3, Lij3;->d:Lpd3;

    .line 91
    .line 92
    sget-object v5, Lvg3;->c1:Lug3;

    .line 93
    .line 94
    const/4 v6, 0x0

    .line 95
    invoke-virtual {v4, v6, v5}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3}, Lij3;->n()Llh3;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    const/4 v4, 0x3

    .line 103
    const/4 v5, 0x0

    .line 104
    new-array v7, v5, [B

    .line 105
    .line 106
    invoke-virtual {v3, v7, v4}, Llh3;->G([BI)Z

    .line 107
    .line 108
    .line 109
    new-instance v3, Lum3;

    .line 110
    .line 111
    invoke-direct {v3, v1, v2, v5}, Lum3;-><init>(Lpn3;Lcom/google/android/gms/measurement/internal/zzr;I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v3}, Lpn3;->N(Ljava/lang/Runnable;)V

    .line 115
    .line 116
    .line 117
    iput-boolean v5, p0, Lsl3;->d0:Z

    .line 118
    .line 119
    iget-object v1, v0, Lij3;->e:Lki3;

    .line 120
    .line 121
    invoke-static {v1}, Lij3;->j(Lsq3;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Lsq3;->y()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    const-string v3, "previous_os_version"

    .line 132
    .line 133
    invoke-interface {v2, v3, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    iget-object v4, v1, Lsq3;->a:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v4, Lij3;

    .line 140
    .line 141
    invoke-virtual {v4}, Lij3;->p()Lme3;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-virtual {v4}, Lhk3;->B()V

    .line 146
    .line 147
    .line 148
    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 149
    .line 150
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    if-nez v5, :cond_2

    .line 155
    .line 156
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    if-nez v5, :cond_2

    .line 161
    .line 162
    invoke-virtual {v1}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 171
    .line 172
    .line 173
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 174
    .line 175
    .line 176
    :cond_2
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-nez v1, :cond_3

    .line 181
    .line 182
    invoke-virtual {v0}, Lij3;->p()Lme3;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v0}, Lhk3;->B()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-nez v0, :cond_3

    .line 194
    .line 195
    new-instance v0, Landroid/os/Bundle;

    .line 196
    .line 197
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 198
    .line 199
    .line 200
    const-string v1, "_po"

    .line 201
    .line 202
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    const-string v1, "auto"

    .line 206
    .line 207
    const-string v2, "_ou"

    .line 208
    .line 209
    invoke-virtual {p0, v1, v2, v0}, Lsl3;->G(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 210
    .line 211
    .line 212
    :cond_3
    :goto_0
    return-void
.end method

.method public final M(Landroid/os/Bundle;J)V
    .locals 12

    .line 1
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lij3;

    .line 4
    .line 5
    new-instance v1, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    const-string p1, "app_id"

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    iget-object v2, v0, Lij3;->f:Luh3;

    .line 23
    .line 24
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 25
    .line 26
    .line 27
    iget-object v2, v2, Luh3;->w:Lsh3;

    .line 28
    .line 29
    const-string v3, "Package name should be null when calling setConditionalUserProperty"

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Lsh3;->a(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-class v2, Ljava/lang/String;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-static {v1, p1, v2, v3}, Lhe3;->A(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    const-string p1, "origin"

    .line 44
    .line 45
    invoke-static {v1, p1, v2, v3}, Lhe3;->A(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    const-string v4, "name"

    .line 49
    .line 50
    invoke-static {v1, v4, v2, v3}, Lhe3;->A(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    const-class v5, Ljava/lang/Object;

    .line 54
    .line 55
    const-string v6, "value"

    .line 56
    .line 57
    invoke-static {v1, v6, v5, v3}, Lhe3;->A(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    const-string v5, "trigger_event_name"

    .line 61
    .line 62
    invoke-static {v1, v5, v2, v3}, Lhe3;->A(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    const-wide/16 v7, 0x0

    .line 66
    .line 67
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    const-string v8, "trigger_timeout"

    .line 72
    .line 73
    const-class v9, Ljava/lang/Long;

    .line 74
    .line 75
    invoke-static {v1, v8, v9, v7}, Lhe3;->A(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    const-string v10, "timed_out_event_name"

    .line 79
    .line 80
    invoke-static {v1, v10, v2, v3}, Lhe3;->A(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    const-string v10, "timed_out_event_params"

    .line 84
    .line 85
    const-class v11, Landroid/os/Bundle;

    .line 86
    .line 87
    invoke-static {v1, v10, v11, v3}, Lhe3;->A(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    const-string v10, "triggered_event_name"

    .line 91
    .line 92
    invoke-static {v1, v10, v2, v3}, Lhe3;->A(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    const-string v10, "triggered_event_params"

    .line 96
    .line 97
    invoke-static {v1, v10, v11, v3}, Lhe3;->A(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    const-string v10, "time_to_live"

    .line 101
    .line 102
    invoke-static {v1, v10, v9, v7}, Lhe3;->A(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    const-string v7, "expired_event_name"

    .line 106
    .line 107
    invoke-static {v1, v7, v2, v3}, Lhe3;->A(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    const-string v2, "expired_event_params"

    .line 111
    .line 112
    invoke-static {v1, v2, v11, v3}, Lhe3;->A(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-static {v2}, Lkb1;->k(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-static {p1}, Lkb1;->k(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v6}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    const-string p1, "creation_timestamp"

    .line 137
    .line 138
    invoke-virtual {v1, p1, p2, p3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {v1, v6}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    iget-object p3, v0, Lij3;->w:Lup3;

    .line 150
    .line 151
    iget-object v2, v0, Lij3;->U:Lmh3;

    .line 152
    .line 153
    iget-object v3, v0, Lij3;->f:Luh3;

    .line 154
    .line 155
    invoke-static {p3}, Lij3;->j(Lsq3;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p3, p1}, Lup3;->E0(Ljava/lang/String;)I

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-nez v4, :cond_7

    .line 163
    .line 164
    invoke-static {p3}, Lij3;->j(Lsq3;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p3, p2, p1}, Lup3;->M(Ljava/lang/Object;Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    if-nez v4, :cond_6

    .line 172
    .line 173
    invoke-virtual {p3, p2, p1}, Lup3;->N(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p3

    .line 177
    if-nez p3, :cond_1

    .line 178
    .line 179
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 180
    .line 181
    .line 182
    iget-object p0, v3, Luh3;->f:Lsh3;

    .line 183
    .line 184
    invoke-virtual {v2, p1}, Lmh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    const-string p3, "Unable to normalize conditional user property value"

    .line 189
    .line 190
    invoke-virtual {p0, p1, p3, p2}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :cond_1
    invoke-static {v1, p3}, Lhe3;->z(Landroid/os/Bundle;Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v8}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 198
    .line 199
    .line 200
    move-result-wide p2

    .line 201
    invoke-virtual {v1, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    const-wide/16 v5, 0x1

    .line 210
    .line 211
    const-wide v7, 0x39ef8b000L

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    if-nez v4, :cond_3

    .line 217
    .line 218
    cmp-long v4, p2, v7

    .line 219
    .line 220
    if-gtz v4, :cond_2

    .line 221
    .line 222
    cmp-long v4, p2, v5

    .line 223
    .line 224
    if-gez v4, :cond_3

    .line 225
    .line 226
    :cond_2
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 227
    .line 228
    .line 229
    iget-object p0, v3, Luh3;->f:Lsh3;

    .line 230
    .line 231
    invoke-virtual {v2, p1}, Lmh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 236
    .line 237
    .line 238
    move-result-object p2

    .line 239
    const-string p3, "Invalid conditional user property timeout"

    .line 240
    .line 241
    invoke-virtual {p0, p1, p3, p2}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :cond_3
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 246
    .line 247
    .line 248
    move-result-wide p2

    .line 249
    cmp-long v4, p2, v7

    .line 250
    .line 251
    if-gtz v4, :cond_5

    .line 252
    .line 253
    cmp-long v4, p2, v5

    .line 254
    .line 255
    if-gez v4, :cond_4

    .line 256
    .line 257
    goto :goto_0

    .line 258
    :cond_4
    iget-object p1, v0, Lij3;->i:Lbj3;

    .line 259
    .line 260
    invoke-static {p1}, Lij3;->l(Lhk3;)V

    .line 261
    .line 262
    .line 263
    new-instance p2, Lhl3;

    .line 264
    .line 265
    const/4 p3, 0x0

    .line 266
    invoke-direct {p2, p0, v1, p3}, Lhl3;-><init>(Lsl3;Landroid/os/Bundle;I)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p1, p2}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 270
    .line 271
    .line 272
    return-void

    .line 273
    :cond_5
    :goto_0
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 274
    .line 275
    .line 276
    iget-object p0, v3, Luh3;->f:Lsh3;

    .line 277
    .line 278
    invoke-virtual {v2, p1}, Lmh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 283
    .line 284
    .line 285
    move-result-object p2

    .line 286
    const-string p3, "Invalid conditional user property time to live"

    .line 287
    .line 288
    invoke-virtual {p0, p1, p3, p2}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    return-void

    .line 292
    :cond_6
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 293
    .line 294
    .line 295
    iget-object p0, v3, Luh3;->f:Lsh3;

    .line 296
    .line 297
    invoke-virtual {v2, p1}, Lmh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    const-string p3, "Invalid conditional user property value"

    .line 302
    .line 303
    invoke-virtual {p0, p1, p3, p2}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    return-void

    .line 307
    :cond_7
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 308
    .line 309
    .line 310
    iget-object p0, v3, Luh3;->f:Lsh3;

    .line 311
    .line 312
    invoke-virtual {v2, p1}, Lmh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    const-string p2, "Invalid conditional user property name"

    .line 317
    .line 318
    invoke-virtual {p0, p1, p2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    return-void
.end method

.method public final N(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lij3;

    .line 4
    .line 5
    iget-object v1, v0, Lij3;->V:Lxt0;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    invoke-static {p1}, Lkb1;->k(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v3, Landroid/os/Bundle;

    .line 18
    .line 19
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v4, "name"

    .line 23
    .line 24
    invoke-virtual {v3, v4, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string p1, "creation_timestamp"

    .line 28
    .line 29
    invoke-virtual {v3, p1, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 30
    .line 31
    .line 32
    if-eqz p2, :cond_0

    .line 33
    .line 34
    const-string p1, "expired_event_name"

    .line 35
    .line 36
    invoke-virtual {v3, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string p1, "expired_event_params"

    .line 40
    .line 41
    invoke-virtual {v3, p1, p3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    iget-object p1, v0, Lij3;->i:Lbj3;

    .line 45
    .line 46
    invoke-static {p1}, Lij3;->l(Lhk3;)V

    .line 47
    .line 48
    .line 49
    new-instance p2, Lcp0;

    .line 50
    .line 51
    const/16 p3, 0x1c

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    invoke-direct {p2, p0, v3, p3, v0}, Lcp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p2}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final O(Lok3;JZ)V
    .locals 7

    .line 1
    iget v0, p1, Lok3;->b:I

    .line 2
    .line 3
    invoke-virtual {p0}, Leg3;->y()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lwg3;->A()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lsq3;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lij3;

    .line 12
    .line 13
    iget-object v2, v1, Lij3;->e:Lki3;

    .line 14
    .line 15
    iget-object v3, v1, Lij3;->f:Luh3;

    .line 16
    .line 17
    invoke-static {v2}, Lij3;->j(Lsq3;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Lki3;->G()Lok3;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-wide v4, p0, Lsl3;->b0:J

    .line 25
    .line 26
    cmp-long v4, p2, v4

    .line 27
    .line 28
    if-gtz v4, :cond_1

    .line 29
    .line 30
    iget v2, v2, Lok3;->b:I

    .line 31
    .line 32
    invoke-static {v2, v0}, Lok3;->l(II)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 40
    .line 41
    .line 42
    iget-object p0, v3, Luh3;->W:Lsh3;

    .line 43
    .line 44
    const-string p2, "Dropped out-of-date consent setting, proposed settings"

    .line 45
    .line 46
    invoke-virtual {p0, p1, p2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    :goto_0
    iget-object v2, v1, Lij3;->e:Lki3;

    .line 51
    .line 52
    invoke-static {v2}, Lij3;->j(Lsq3;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Lsq3;->y()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    const/16 v5, 0x64

    .line 63
    .line 64
    const-string v6, "consent_source"

    .line 65
    .line 66
    invoke-interface {v4, v6, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-static {v0, v4}, Lok3;->l(II)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_5

    .line 75
    .line 76
    invoke-virtual {v2}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {p1}, Lok3;->g()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    const-string v5, "consent_settings"

    .line 89
    .line 90
    invoke-interface {v2, v5, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 91
    .line 92
    .line 93
    invoke-interface {v2, v6, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 94
    .line 95
    .line 96
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 97
    .line 98
    .line 99
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 100
    .line 101
    .line 102
    iget-object v0, v3, Luh3;->Y:Lsh3;

    .line 103
    .line 104
    const-string v2, "Setting storage consent(FE)"

    .line 105
    .line 106
    invoke-virtual {v0, p1, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iput-wide p2, p0, Lsl3;->b0:J

    .line 110
    .line 111
    invoke-virtual {v1}, Lij3;->o()Lpn3;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-virtual {p0}, Lpn3;->J()Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-eqz p0, :cond_2

    .line 120
    .line 121
    invoke-virtual {v1}, Lij3;->o()Lpn3;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {p0}, Leg3;->y()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lwg3;->A()V

    .line 129
    .line 130
    .line 131
    new-instance p1, Lln3;

    .line 132
    .line 133
    const/4 p2, 0x2

    .line 134
    invoke-direct {p1, p0, p2}, Lln3;-><init>(Lpn3;I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, p1}, Lpn3;->N(Ljava/lang/Runnable;)V

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_2
    invoke-virtual {v1}, Lij3;->o()Lpn3;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-virtual {p0}, Leg3;->y()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Lwg3;->A()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Lpn3;->I()Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-eqz p1, :cond_3

    .line 156
    .line 157
    const/4 p1, 0x0

    .line 158
    invoke-virtual {p0, p1}, Lpn3;->P(Z)Lcom/google/android/gms/measurement/internal/zzr;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    new-instance p2, Lum3;

    .line 163
    .line 164
    const/4 p3, 0x1

    .line 165
    invoke-direct {p2, p0, p1, p3}, Lum3;-><init>(Lpn3;Lcom/google/android/gms/measurement/internal/zzr;I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0, p2}, Lpn3;->N(Ljava/lang/Runnable;)V

    .line 169
    .line 170
    .line 171
    :cond_3
    :goto_1
    if-eqz p4, :cond_4

    .line 172
    .line 173
    invoke-virtual {v1}, Lij3;->o()Lpn3;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 178
    .line 179
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0, p1}, Lpn3;->D(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 183
    .line 184
    .line 185
    :cond_4
    return-void

    .line 186
    :cond_5
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 187
    .line 188
    .line 189
    iget-object p0, v3, Luh3;->W:Lsh3;

    .line 190
    .line 191
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    const-string p2, "Lower precedence consent source ignored, proposed source"

    .line 196
    .line 197
    invoke-virtual {p0, p1, p2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    return-void
.end method

.method public final P(Ljava/lang/Boolean;Z)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Leg3;->y()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lwg3;->A()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lij3;

    .line 10
    .line 11
    iget-object v1, v0, Lij3;->f:Luh3;

    .line 12
    .line 13
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, v1, Luh3;->X:Lsh3;

    .line 17
    .line 18
    const-string v2, "Setting app measurement enabled (FE)"

    .line 19
    .line 20
    invoke-virtual {v1, p1, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, v0, Lij3;->e:Lki3;

    .line 24
    .line 25
    invoke-static {v1}, Lij3;->j(Lsq3;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lsq3;->y()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-string v3, "measurement_enabled"

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-interface {v2, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 55
    .line 56
    .line 57
    if-eqz p2, :cond_2

    .line 58
    .line 59
    invoke-virtual {v1}, Lsq3;->y()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    const-string v1, "measurement_enabled_from_api"

    .line 71
    .line 72
    if-eqz p1, :cond_1

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    invoke-interface {p2, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    invoke-interface {p2, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 83
    .line 84
    .line 85
    :goto_1
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 86
    .line 87
    .line 88
    :cond_2
    iget-object p2, v0, Lij3;->i:Lbj3;

    .line 89
    .line 90
    invoke-static {p2}, Lij3;->l(Lhk3;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2}, Lbj3;->y()V

    .line 94
    .line 95
    .line 96
    iget-boolean p2, v0, Lij3;->k0:Z

    .line 97
    .line 98
    if-nez p2, :cond_4

    .line 99
    .line 100
    if-eqz p1, :cond_3

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-nez p1, :cond_3

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_3
    return-void

    .line 110
    :cond_4
    :goto_2
    invoke-virtual {p0}, Lsl3;->Q()V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public final Q()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Leg3;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Lsq3;->a:Ljava/lang/Object;

    .line 5
    .line 6
    move-object v6, v1

    .line 7
    check-cast v6, Lij3;

    .line 8
    .line 9
    iget-object v1, v6, Lij3;->e:Lki3;

    .line 10
    .line 11
    iget-object v7, v6, Lij3;->f:Luh3;

    .line 12
    .line 13
    iget-object v2, v6, Lij3;->V:Lxt0;

    .line 14
    .line 15
    invoke-static {v1}, Lij3;->j(Lsq3;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, v1, Lki3;->X:Ltj;

    .line 19
    .line 20
    invoke-virtual {v1}, Ltj;->m()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v8, 0x1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const-string v3, "unset"

    .line 28
    .line 29
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    const-string v5, "_npa"

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    const-string v4, "app"

    .line 46
    .line 47
    move-object v0, p0

    .line 48
    invoke-virtual/range {v0 .. v5}, Lsl3;->K(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    const-string v0, "true"

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eq v8, v0, :cond_1

    .line 59
    .line 60
    const-wide/16 v0, 0x0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    const-wide/16 v0, 0x1

    .line 64
    .line 65
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 73
    .line 74
    .line 75
    move-result-wide v1

    .line 76
    const-string v4, "app"

    .line 77
    .line 78
    const-string v5, "_npa"

    .line 79
    .line 80
    move-object v0, p0

    .line 81
    invoke-virtual/range {v0 .. v5}, Lsl3;->K(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    :goto_1
    invoke-virtual {v6}, Lij3;->d()Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_3

    .line 89
    .line 90
    iget-boolean v1, p0, Lsl3;->d0:Z

    .line 91
    .line 92
    if-eqz v1, :cond_3

    .line 93
    .line 94
    invoke-static {v7}, Lij3;->l(Lhk3;)V

    .line 95
    .line 96
    .line 97
    iget-object v1, v7, Luh3;->X:Lsh3;

    .line 98
    .line 99
    const-string v2, "Recording app launch after enabling measurement for the first time (FE)"

    .line 100
    .line 101
    invoke-virtual {v1, v2}, Lsh3;->a(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lsl3;->L()V

    .line 105
    .line 106
    .line 107
    iget-object v1, v6, Lij3;->v:Llo3;

    .line 108
    .line 109
    invoke-static {v1}, Lij3;->k(Lwg3;)V

    .line 110
    .line 111
    .line 112
    iget-object v1, v1, Llo3;->e:Lpi3;

    .line 113
    .line 114
    invoke-virtual {v1}, Lpi3;->a()V

    .line 115
    .line 116
    .line 117
    iget-object v1, v6, Lij3;->i:Lbj3;

    .line 118
    .line 119
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 120
    .line 121
    .line 122
    new-instance v2, Luk3;

    .line 123
    .line 124
    invoke-direct {v2, p0, v8}, Luk3;-><init>(Lsl3;I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, v2}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_3
    invoke-static {v7}, Lij3;->l(Lhk3;)V

    .line 132
    .line 133
    .line 134
    iget-object v0, v7, Luh3;->X:Lsh3;

    .line 135
    .line 136
    const-string v1, "Updating Scion state (FE)"

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v6}, Lij3;->o()Lpn3;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0}, Leg3;->y()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Lwg3;->A()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v8}, Lpn3;->P(Z)Lcom/google/android/gms/measurement/internal/zzr;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    new-instance v2, Lsm3;

    .line 156
    .line 157
    const/4 v3, 0x2

    .line 158
    invoke-direct {v2, v0, v1, v3}, Lsm3;-><init>(Lpn3;Lcom/google/android/gms/measurement/internal/zzr;I)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v2}, Lpn3;->N(Ljava/lang/Runnable;)V

    .line 162
    .line 163
    .line 164
    return-void
.end method

.method public final R()V
    .locals 2

    .line 1
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lij3;

    .line 4
    .line 5
    iget-object v1, v0, Lij3;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    instance-of v1, v1, Landroid/app/Application;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lsl3;->c:Ldh0;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v0, v0, Lij3;->a:Landroid/content/Context;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/app/Application;

    .line 26
    .line 27
    iget-object p0, p0, Lsl3;->c:Ldh0;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public final S(Landroid/os/Bundle;IJ)V
    .locals 10

    .line 1
    iget-object v3, p0, Lsq3;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v3, Lij3;

    .line 4
    .line 5
    invoke-virtual {p0}, Lwg3;->A()V

    .line 6
    .line 7
    .line 8
    sget-object v4, Lok3;->c:Lok3;

    .line 9
    .line 10
    sget-object v4, Lmk3;->b:Lmk3;

    .line 11
    .line 12
    iget-object v4, v4, Lmk3;->a:[Lnk3;

    .line 13
    .line 14
    array-length v5, v4

    .line 15
    const/4 v6, 0x0

    .line 16
    :goto_0
    const/4 v7, 0x0

    .line 17
    if-ge v6, v5, :cond_3

    .line 18
    .line 19
    aget-object v8, v4, v6

    .line 20
    .line 21
    iget-object v8, v8, Lnk3;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p1, v8}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v9

    .line 27
    if-eqz v9, :cond_2

    .line 28
    .line 29
    invoke-virtual {p1, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    if-eqz v8, :cond_2

    .line 34
    .line 35
    const-string v9, "granted"

    .line 36
    .line 37
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    if-eqz v9, :cond_0

    .line 42
    .line 43
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    const-string v9, "denied"

    .line 47
    .line 48
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    if-eqz v9, :cond_1

    .line 53
    .line 54
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    move-object v9, v7

    .line 58
    :goto_1
    if-nez v9, :cond_2

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    move-object v8, v7

    .line 65
    :goto_2
    if-eqz v8, :cond_4

    .line 66
    .line 67
    iget-object v4, v3, Lij3;->f:Luh3;

    .line 68
    .line 69
    invoke-static {v4}, Lij3;->l(Lhk3;)V

    .line 70
    .line 71
    .line 72
    iget-object v4, v4, Luh3;->V:Lsh3;

    .line 73
    .line 74
    const-string v5, "Ignoring invalid consent setting"

    .line 75
    .line 76
    invoke-virtual {v4, v8, v5}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object v4, v3, Lij3;->f:Luh3;

    .line 80
    .line 81
    invoke-static {v4}, Lij3;->l(Lhk3;)V

    .line 82
    .line 83
    .line 84
    iget-object v4, v4, Luh3;->V:Lsh3;

    .line 85
    .line 86
    const-string v5, "Valid consent values are \'granted\', \'denied\'"

    .line 87
    .line 88
    invoke-virtual {v4, v5}, Lsh3;->a(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    iget-object v3, v3, Lij3;->i:Lbj3;

    .line 92
    .line 93
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3}, Lbj3;->F()Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    invoke-static {p2, p1}, Lok3;->b(ILandroid/os/Bundle;)Lok3;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    iget-object v5, v4, Lok3;->a:Ljava/util/EnumMap;

    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    :cond_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    sget-object v8, Llk3;->b:Llk3;

    .line 119
    .line 120
    if-eqz v6, :cond_6

    .line 121
    .line 122
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    check-cast v6, Llk3;

    .line 127
    .line 128
    if-eq v6, v8, :cond_5

    .line 129
    .line 130
    invoke-virtual {p0, v4, v3}, Lsl3;->U(Lok3;Z)V

    .line 131
    .line 132
    .line 133
    :cond_6
    invoke-static {p2, p1}, Lce3;->c(ILandroid/os/Bundle;)Lce3;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    iget-object v5, v4, Lce3;->e:Ljava/util/EnumMap;

    .line 138
    .line 139
    invoke-virtual {v5}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    :cond_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-eqz v6, :cond_8

    .line 152
    .line 153
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    check-cast v6, Llk3;

    .line 158
    .line 159
    if-eq v6, v8, :cond_7

    .line 160
    .line 161
    invoke-virtual {p0, v4, v3}, Lsl3;->T(Lce3;Z)V

    .line 162
    .line 163
    .line 164
    :cond_8
    if-nez p1, :cond_9

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_9
    const-string v4, "ad_personalization"

    .line 168
    .line 169
    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-static {v1}, Lok3;->d(Ljava/lang/String;)Llk3;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    const/4 v4, 0x2

    .line 182
    if-eq v1, v4, :cond_b

    .line 183
    .line 184
    const/4 v4, 0x3

    .line 185
    if-eq v1, v4, :cond_a

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_a
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_b
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 192
    .line 193
    :goto_3
    if-eqz v7, :cond_e

    .line 194
    .line 195
    const/16 v1, -0x1e

    .line 196
    .line 197
    if-ne p2, v1, :cond_c

    .line 198
    .line 199
    const-string v1, "tcf"

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_c
    const-string v1, "app"

    .line 203
    .line 204
    :goto_4
    if-eqz v3, :cond_d

    .line 205
    .line 206
    invoke-virtual {v7}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    const-string v5, "allow_personalized_ads"

    .line 211
    .line 212
    move-object v0, p0

    .line 213
    move-object v4, v1

    .line 214
    move-wide v1, p3

    .line 215
    invoke-virtual/range {v0 .. v5}, Lsl3;->K(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :cond_d
    invoke-virtual {v7}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    const-string v2, "allow_personalized_ads"

    .line 224
    .line 225
    const/4 v4, 0x0

    .line 226
    move-object v0, p0

    .line 227
    move-wide v5, p3

    .line 228
    invoke-virtual/range {v0 .. v6}, Lsl3;->J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    .line 229
    .line 230
    .line 231
    :cond_e
    return-void
.end method

.method public final T(Lce3;Z)V
    .locals 3

    .line 1
    new-instance v0, Ldp0;

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, p0, p1, v1, v2}, Ldp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 7
    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Leg3;->y()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ldp0;->run()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lij3;

    .line 21
    .line 22
    iget-object p0, p0, Lij3;->i:Lbj3;

    .line 23
    .line 24
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final U(Lok3;Z)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Lwg3;->A()V

    .line 2
    .line 3
    .line 4
    iget v0, p1, Lok3;->b:I

    .line 5
    .line 6
    const/16 v1, -0xa

    .line 7
    .line 8
    if-eq v0, v1, :cond_3

    .line 9
    .line 10
    iget-object v2, p1, Lok3;->a:Ljava/util/EnumMap;

    .line 11
    .line 12
    sget-object v3, Lnk3;->b:Lnk3;

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Llk3;

    .line 19
    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    sget-object v2, Llk3;->b:Llk3;

    .line 23
    .line 24
    :cond_0
    sget-object v3, Llk3;->b:Llk3;

    .line 25
    .line 26
    if-ne v2, v3, :cond_3

    .line 27
    .line 28
    iget-object v2, p1, Lok3;->a:Ljava/util/EnumMap;

    .line 29
    .line 30
    sget-object v4, Lnk3;->c:Lnk3;

    .line 31
    .line 32
    invoke-virtual {v2, v4}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Llk3;

    .line 37
    .line 38
    if-nez v2, :cond_1

    .line 39
    .line 40
    move-object v2, v3

    .line 41
    :cond_1
    if-eq v2, v3, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Lij3;

    .line 47
    .line 48
    iget-object p0, p0, Lij3;->f:Luh3;

    .line 49
    .line 50
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, Luh3;->V:Lsh3;

    .line 54
    .line 55
    const-string p1, "Ignoring empty consent settings"

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Lsh3;->a(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_3
    :goto_0
    iget-object v2, p0, Lsl3;->v:Ljava/lang/Object;

    .line 62
    .line 63
    monitor-enter v2

    .line 64
    :try_start_0
    iget-object v3, p0, Lsl3;->Z:Lok3;

    .line 65
    .line 66
    iget v3, v3, Lok3;->b:I

    .line 67
    .line 68
    invoke-static {v0, v3}, Lok3;->l(II)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    const/4 v4, 0x0

    .line 73
    if-eqz v3, :cond_7

    .line 74
    .line 75
    iget-object v3, p0, Lsl3;->Z:Lok3;

    .line 76
    .line 77
    iget-object v5, p1, Lok3;->a:Ljava/util/EnumMap;

    .line 78
    .line 79
    invoke-virtual {v5}, Ljava/util/EnumMap;->keySet()Ljava/util/Set;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    new-array v7, v4, [Lnk3;

    .line 84
    .line 85
    invoke-interface {v6, v7}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    check-cast v6, [Lnk3;

    .line 90
    .line 91
    array-length v7, v6

    .line 92
    move v8, v4

    .line 93
    :goto_1
    const/4 v9, 0x1

    .line 94
    if-ge v8, v7, :cond_5

    .line 95
    .line 96
    aget-object v10, v6, v8

    .line 97
    .line 98
    invoke-virtual {v5, v10}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v11

    .line 102
    check-cast v11, Llk3;

    .line 103
    .line 104
    iget-object v12, v3, Lok3;->a:Ljava/util/EnumMap;

    .line 105
    .line 106
    invoke-virtual {v12, v10}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    check-cast v10, Llk3;

    .line 111
    .line 112
    sget-object v12, Llk3;->d:Llk3;

    .line 113
    .line 114
    if-ne v11, v12, :cond_4

    .line 115
    .line 116
    if-eq v10, v12, :cond_4

    .line 117
    .line 118
    move v3, v9

    .line 119
    goto :goto_2

    .line 120
    :cond_4
    add-int/lit8 v8, v8, 0x1

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_5
    move v3, v4

    .line 124
    :goto_2
    sget-object v5, Lnk3;->c:Lnk3;

    .line 125
    .line 126
    invoke-virtual {p1, v5}, Lok3;->i(Lnk3;)Z

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-eqz v6, :cond_6

    .line 131
    .line 132
    iget-object v6, p0, Lsl3;->Z:Lok3;

    .line 133
    .line 134
    invoke-virtual {v6, v5}, Lok3;->i(Lnk3;)Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-nez v5, :cond_6

    .line 139
    .line 140
    move v4, v9

    .line 141
    goto :goto_3

    .line 142
    :catchall_0
    move-exception v0

    .line 143
    move-object p0, v0

    .line 144
    goto/16 :goto_7

    .line 145
    .line 146
    :cond_6
    :goto_3
    iget-object v5, p0, Lsl3;->Z:Lok3;

    .line 147
    .line 148
    invoke-virtual {p1, v5}, Lok3;->k(Lok3;)Lok3;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    iput-object p1, p0, Lsl3;->Z:Lok3;

    .line 153
    .line 154
    move v8, v4

    .line 155
    move v4, v9

    .line 156
    :goto_4
    move-object v5, p1

    .line 157
    goto :goto_5

    .line 158
    :cond_7
    move v3, v4

    .line 159
    move v8, v3

    .line 160
    goto :goto_4

    .line 161
    :goto_5
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    if-nez v4, :cond_8

    .line 163
    .line 164
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast p0, Lij3;

    .line 167
    .line 168
    iget-object p0, p0, Lij3;->f:Luh3;

    .line 169
    .line 170
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 171
    .line 172
    .line 173
    iget-object p0, p0, Luh3;->W:Lsh3;

    .line 174
    .line 175
    const-string p1, "Ignoring lower-priority consent settings, proposed settings"

    .line 176
    .line 177
    invoke-virtual {p0, v5, p1}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :cond_8
    iget-object p1, p0, Lsl3;->a0:Ljava/util/concurrent/atomic/AtomicLong;

    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 184
    .line 185
    .line 186
    move-result-wide v6

    .line 187
    if-eqz v3, :cond_a

    .line 188
    .line 189
    iget-object p1, p0, Lsl3;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 190
    .line 191
    const/4 v0, 0x0

    .line 192
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    new-instance v3, Ljl3;

    .line 196
    .line 197
    const/4 v9, 0x0

    .line 198
    move-object v4, p0

    .line 199
    invoke-direct/range {v3 .. v9}, Ljl3;-><init>(Lsl3;Lok3;JZI)V

    .line 200
    .line 201
    .line 202
    if-eqz p2, :cond_9

    .line 203
    .line 204
    invoke-virtual {v4}, Leg3;->y()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3}, Ljl3;->run()V

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :cond_9
    iget-object p0, v4, Lsq3;->a:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast p0, Lij3;

    .line 214
    .line 215
    iget-object p0, p0, Lij3;->i:Lbj3;

    .line 216
    .line 217
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0, v3}, Lbj3;->K(Ljava/lang/Runnable;)V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :cond_a
    move-object v4, p0

    .line 225
    new-instance v3, Ljl3;

    .line 226
    .line 227
    const/4 v9, 0x1

    .line 228
    invoke-direct/range {v3 .. v9}, Ljl3;-><init>(Lsl3;Lok3;JZI)V

    .line 229
    .line 230
    .line 231
    if-eqz p2, :cond_b

    .line 232
    .line 233
    invoke-virtual {v4}, Leg3;->y()V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v3}, Ljl3;->run()V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :cond_b
    const/16 p0, 0x1e

    .line 241
    .line 242
    if-eq v0, p0, :cond_d

    .line 243
    .line 244
    if-ne v0, v1, :cond_c

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_c
    iget-object p0, v4, Lsq3;->a:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast p0, Lij3;

    .line 250
    .line 251
    iget-object p0, p0, Lij3;->i:Lbj3;

    .line 252
    .line 253
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0, v3}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :cond_d
    :goto_6
    iget-object p0, v4, Lsq3;->a:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast p0, Lij3;

    .line 263
    .line 264
    iget-object p0, p0, Lij3;->i:Lbj3;

    .line 265
    .line 266
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0, v3}, Lbj3;->K(Ljava/lang/Runnable;)V

    .line 270
    .line 271
    .line 272
    return-void

    .line 273
    :goto_7
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 274
    throw p0
.end method

.method public final V()V
    .locals 8

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzql;->zza()Z

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lij3;

    .line 7
    .line 8
    iget-object v1, v0, Lij3;->d:Lpd3;

    .line 9
    .line 10
    iget-object v2, v0, Lij3;->i:Lbj3;

    .line 11
    .line 12
    iget-object v0, v0, Lij3;->f:Luh3;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    sget-object v4, Lvg3;->Q0:Lug3;

    .line 16
    .line 17
    invoke-virtual {v1, v3, v4}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_3

    .line 22
    .line 23
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Lbj3;->F()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    invoke-static {}, Lq62;->g()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, Lwg3;->A()V

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, v0, Luh3;->Y:Lsh3;

    .line 45
    .line 46
    const-string v3, "Getting trigger URIs (FE)"

    .line 47
    .line 48
    invoke-virtual {v1, v3}, Lsh3;->a(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 52
    .line 53
    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 57
    .line 58
    .line 59
    new-instance v7, Lgl3;

    .line 60
    .line 61
    const/4 v1, 0x3

    .line 62
    invoke-direct {v7, p0, v3, v1}, Lgl3;-><init>(Lsl3;Ljava/util/concurrent/atomic/AtomicReference;I)V

    .line 63
    .line 64
    .line 65
    const-wide/16 v4, 0x2710

    .line 66
    .line 67
    const-string v6, "get trigger URIs"

    .line 68
    .line 69
    invoke-virtual/range {v2 .. v7}, Lbj3;->J(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, Ljava/util/List;

    .line 77
    .line 78
    if-nez v1, :cond_0

    .line 79
    .line 80
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 81
    .line 82
    .line 83
    iget-object p0, v0, Luh3;->v:Lsh3;

    .line 84
    .line 85
    const-string v0, "Timed out waiting for get trigger URIs"

    .line 86
    .line 87
    invoke-virtual {p0, v0}, Lsh3;->a(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_0
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 92
    .line 93
    .line 94
    new-instance v0, Lpl3;

    .line 95
    .line 96
    const/4 v3, 0x0

    .line 97
    invoke-direct {v0, v3, p0, v1}, Lpl3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v0}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_1
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 105
    .line 106
    .line 107
    iget-object p0, v0, Luh3;->f:Lsh3;

    .line 108
    .line 109
    const-string v0, "Cannot get trigger URIs from main thread"

    .line 110
    .line 111
    invoke-virtual {p0, v0}, Lsh3;->a(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_2
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 116
    .line 117
    .line 118
    iget-object p0, v0, Luh3;->f:Lsh3;

    .line 119
    .line 120
    const-string v0, "Cannot get trigger URIs from analytics worker thread"

    .line 121
    .line 122
    invoke-virtual {p0, v0}, Lsh3;->a(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :cond_3
    return-void
.end method

.method public final W()Ljava/util/PriorityQueue;
    .locals 3

    .line 1
    iget-object v0, p0, Lsl3;->X:Ljava/util/PriorityQueue;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/PriorityQueue;

    .line 6
    .line 7
    sget-object v1, Lql3;->a:Lql3;

    .line 8
    .line 9
    sget-object v2, Lwa3;->c:Lwa3;

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Ljava/util/PriorityQueue;-><init>(Ljava/util/Comparator;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lsl3;->X:Ljava/util/PriorityQueue;

    .line 19
    .line 20
    :cond_0
    iget-object p0, p0, Lsl3;->X:Ljava/util/PriorityQueue;

    .line 21
    .line 22
    return-object p0
.end method

.method public final X()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Leg3;->y()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lsl3;->Y:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Lsl3;->W()Ljava/util/PriorityQueue;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    iget-boolean v1, p0, Lsl3;->w:Z

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, Lsl3;->W()Ljava/util/PriorityQueue;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzog;

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    iget-object v2, p0, Lsq3;->a:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Lij3;

    .line 37
    .line 38
    iget-object v3, v2, Lij3;->w:Lup3;

    .line 39
    .line 40
    invoke-static {v3}, Lij3;->j(Lsq3;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Lup3;->T()Lpd1;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    iput-boolean v4, p0, Lsl3;->w:Z

    .line 51
    .line 52
    iget-object v2, v2, Lij3;->f:Luh3;

    .line 53
    .line 54
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 55
    .line 56
    .line 57
    iget-object v2, v2, Luh3;->Y:Lsh3;

    .line 58
    .line 59
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzog;->a:Ljava/lang/String;

    .line 60
    .line 61
    const-string v5, "Registering trigger URI"

    .line 62
    .line 63
    invoke-virtual {v2, v4, v5}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v3, v2}, Lpd1;->e(Landroid/net/Uri;)Ls81;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-nez v2, :cond_1

    .line 75
    .line 76
    iput-boolean v0, p0, Lsl3;->w:Z

    .line 77
    .line 78
    invoke-virtual {p0}, Lsl3;->W()Ljava/util/PriorityQueue;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0, v1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_1
    new-instance v3, Lku0;

    .line 87
    .line 88
    const/4 v4, 0x3

    .line 89
    invoke-direct {v3, p0, v4}, Lku0;-><init>(Ljava/lang/Object;I)V

    .line 90
    .line 91
    .line 92
    new-instance v4, Lwe2;

    .line 93
    .line 94
    const/16 v5, 0x15

    .line 95
    .line 96
    invoke-direct {v4, v5, p0, v1}, Lwe2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    new-instance p0, Lcp0;

    .line 100
    .line 101
    invoke-direct {p0, v0, v2, v4}, Lcp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v2, p0, v3}, Ls81;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 105
    .line 106
    .line 107
    :cond_2
    :goto_0
    return-void
.end method
