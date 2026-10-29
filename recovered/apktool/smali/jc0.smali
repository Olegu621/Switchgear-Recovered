.class public final Ljc0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public A:J

.field public B:J

.field public C:I

.field public D:I

.field public E:I

.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final e:Z

.field public final f:Landroid/content/Context;

.field public final g:Ljava/lang/String;

.field public h:I

.field public final i:Ljava/util/concurrent/TimeUnit;

.field public j:Lokhttp3/CookieJar;

.field public k:I

.field public l:Lokhttp3/OkHttpClient;

.field public final m:Lb5;

.field public final n:Ljava/util/EnumSet;

.field public final o:I

.field public final p:I

.field public q:I

.field public r:J

.field public s:J

.field public t:Ljava/lang/Integer;

.field public u:Ljava/lang/String;

.field public final v:Ljava/util/concurrent/atomic/AtomicReference;

.field public w:Z

.field public final x:Ljava/util/concurrent/atomic/AtomicReference;

.field public final y:Ljava/util/concurrent/atomic/AtomicReference;

.field public z:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lb5;Landroid/content/Context;Ljava/lang/String;Lo;)V
    .locals 6

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const-class v0, Ljc0;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Ljc0;->a:Ljava/lang/String;

    .line 14
    .line 15
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Ljc0;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    .line 23
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Ljc0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    .line 30
    sget-object v1, Lmc0;->j:Ljava/util/concurrent/TimeUnit;

    .line 31
    .line 32
    iput-object v1, p0, Ljc0;->i:Ljava/util/concurrent/TimeUnit;

    .line 33
    .line 34
    sget v1, Lmc0;->h:I

    .line 35
    .line 36
    iput v1, p0, Ljc0;->k:I

    .line 37
    .line 38
    if-nez p2, :cond_0

    .line 39
    .line 40
    new-instance p2, Lb5;

    .line 41
    .line 42
    invoke-direct {p2, p3, p1}, Lb5;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    iput-object p2, p0, Ljc0;->m:Lb5;

    .line 46
    .line 47
    sget-object p1, Lmc0;->a:Ljava/util/EnumSet;

    .line 48
    .line 49
    iput-object p1, p0, Ljc0;->n:Ljava/util/EnumSet;

    .line 50
    .line 51
    sget p2, Lmc0;->c:I

    .line 52
    .line 53
    iput p2, p0, Ljc0;->o:I

    .line 54
    .line 55
    sget p2, Lmc0;->d:I

    .line 56
    .line 57
    iput p2, p0, Ljc0;->p:I

    .line 58
    .line 59
    sget p2, Lmc0;->b:I

    .line 60
    .line 61
    iput p2, p0, Ljc0;->q:I

    .line 62
    .line 63
    sget-wide v3, Lmc0;->e:J

    .line 64
    .line 65
    iput-wide v3, p0, Ljc0;->r:J

    .line 66
    .line 67
    sget-wide v3, Lmc0;->f:J

    .line 68
    .line 69
    iput-wide v3, p0, Ljc0;->s:J

    .line 70
    .line 71
    const/4 p2, 0x2

    .line 72
    iput p2, p0, Ljc0;->C:I

    .line 73
    .line 74
    const/4 v1, 0x1

    .line 75
    iput v1, p0, Ljc0;->D:I

    .line 76
    .line 77
    iput p2, p0, Ljc0;->E:I

    .line 78
    .line 79
    sget v3, Lmc0;->g:I

    .line 80
    .line 81
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    iput-object v3, p0, Ljc0;->t:Ljava/lang/Integer;

    .line 86
    .line 87
    new-instance v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 88
    .line 89
    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object v3, p0, Ljc0;->v:Ljava/util/concurrent/atomic/AtomicReference;

    .line 93
    .line 94
    iput-boolean v2, p0, Ljc0;->w:Z

    .line 95
    .line 96
    new-instance v4, Ljava/util/concurrent/atomic/AtomicReference;

    .line 97
    .line 98
    invoke-direct {v4}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 99
    .line 100
    .line 101
    iput-object v4, p0, Ljc0;->x:Ljava/util/concurrent/atomic/AtomicReference;

    .line 102
    .line 103
    new-instance v4, Ljava/util/concurrent/atomic/AtomicReference;

    .line 104
    .line 105
    sget-boolean v5, Lmc0;->i:Z

    .line 106
    .line 107
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-direct {v4, v5}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    iput-object v4, p0, Ljc0;->y:Ljava/util/concurrent/atomic/AtomicReference;

    .line 115
    .line 116
    sget-wide v4, Lmc0;->l:J

    .line 117
    .line 118
    iput-wide v4, p0, Ljc0;->A:J

    .line 119
    .line 120
    sget-wide v4, Lmc0;->k:J

    .line 121
    .line 122
    iput-wide v4, p0, Ljc0;->B:J

    .line 123
    .line 124
    iput-object p3, p0, Ljc0;->f:Landroid/content/Context;

    .line 125
    .line 126
    invoke-virtual {p5, p0}, Lo;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p5

    .line 133
    check-cast p5, Lum1;

    .line 134
    .line 135
    if-nez p5, :cond_5

    .line 136
    .line 137
    iput-boolean v2, p0, Ljc0;->e:Z

    .line 138
    .line 139
    const-string p5, "http"

    .line 140
    .line 141
    invoke-static {p4, p5, v2}, Lkotlin/text/e;->m(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 142
    .line 143
    .line 144
    move-result p5

    .line 145
    if-nez p5, :cond_2

    .line 146
    .line 147
    iget p5, p0, Ljc0;->E:I

    .line 148
    .line 149
    if-ne p5, p2, :cond_1

    .line 150
    .line 151
    const-string p5, "https://"

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_1
    const-string p5, "http://"

    .line 155
    .line 156
    :goto_0
    invoke-virtual {p5, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p4

    .line 160
    :cond_2
    iput-object p4, p0, Ljc0;->g:Ljava/lang/String;

    .line 161
    .line 162
    iget-object p5, p0, Ljc0;->t:Ljava/lang/Integer;

    .line 163
    .line 164
    const/4 v3, 0x0

    .line 165
    if-eqz p5, :cond_4

    .line 166
    .line 167
    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    .line 168
    .line 169
    .line 170
    move-result p5

    .line 171
    new-instance v4, Lhp1;

    .line 172
    .line 173
    invoke-direct {v4, p3, p4}, Lhp1;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    iget p3, p0, Ljc0;->C:I

    .line 177
    .line 178
    if-eqz p3, :cond_3

    .line 179
    .line 180
    iput p3, v4, Lhp1;->c:I

    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    iput-object p1, v4, Lhp1;->d:Ljava/util/EnumSet;

    .line 186
    .line 187
    iput p5, v4, Lhp1;->e:I

    .line 188
    .line 189
    iget-object p1, p0, Ljc0;->u:Ljava/lang/String;

    .line 190
    .line 191
    iput-object p1, v4, Lhp1;->h:Ljava/lang/String;

    .line 192
    .line 193
    iget-object p1, p0, Ljc0;->l:Lokhttp3/OkHttpClient;

    .line 194
    .line 195
    iput-object p1, v4, Lhp1;->f:Lokhttp3/OkHttpClient;

    .line 196
    .line 197
    iget-object p1, p0, Ljc0;->j:Lokhttp3/CookieJar;

    .line 198
    .line 199
    iput-object p1, v4, Lhp1;->g:Lokhttp3/CookieJar;

    .line 200
    .line 201
    iget-boolean p1, p0, Ljc0;->w:Z

    .line 202
    .line 203
    iput-boolean p1, v4, Lhp1;->i:Z

    .line 204
    .line 205
    iget-object p1, p0, Ljc0;->z:Ljava/util/Map;

    .line 206
    .line 207
    iput-object p1, v4, Lhp1;->j:Ljava/util/Map;

    .line 208
    .line 209
    new-instance v3, Lip1;

    .line 210
    .line 211
    invoke-direct {v3, v4}, Lip1;-><init>(Lhp1;)V

    .line 212
    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_3
    throw v3

    .line 216
    :cond_4
    :goto_1
    invoke-virtual {p0, v3}, Ljc0;->d(Lum1;)V

    .line 217
    .line 218
    .line 219
    goto :goto_2

    .line 220
    :cond_5
    iput-boolean v1, p0, Ljc0;->e:Z

    .line 221
    .line 222
    :goto_2
    iget p1, p0, Ljc0;->k:I

    .line 223
    .line 224
    if-le p1, p2, :cond_7

    .line 225
    .line 226
    if-lt p1, p2, :cond_6

    .line 227
    .line 228
    sput p1, Lmf0;->b:I

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_6
    sget-object p1, Lmf0;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 232
    .line 233
    :cond_7
    :goto_3
    iput-boolean v1, p0, Ljc0;->b:Z

    .line 234
    .line 235
    const-string p0, "Emitter created successfully!"

    .line 236
    .line 237
    new-array p1, v2, [Ljava/lang/Object;

    .line 238
    .line 239
    invoke-static {v0, p0, p1}, Lk50;->L(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    return-void
.end method


# virtual methods
.method public final a(Lum1;)V
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Ljc0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x1

    .line 10
    iget-object v3, v1, Ljc0;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    iget-object v4, v1, Ljc0;->a:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const-string v0, "Emitter paused."

    .line 18
    .line 19
    new-array v1, v5, [Ljava/lang/Object;

    .line 20
    .line 21
    invoke-static {v4, v0, v1}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v2, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget-object v6, v1, Ljc0;->f:Landroid/content/Context;

    .line 29
    .line 30
    invoke-static {v6}, Lmn0;->v(Landroid/content/Context;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    const-string v0, "Emitter loop stopping: emitter offline."

    .line 37
    .line 38
    new-array v1, v5, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-static {v4, v0, v1}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v2, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    if-nez p1, :cond_2

    .line 48
    .line 49
    const-string v0, "No networkConnection set."

    .line 50
    .line 51
    new-array v1, v5, [Ljava/lang/Object;

    .line 52
    .line 53
    invoke-static {v4, v0, v1}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v2, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    iget-object v7, v1, Ljc0;->m:Lb5;

    .line 61
    .line 62
    invoke-virtual {v7}, Lb5;->p()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const-string v8, "events"

    .line 67
    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    invoke-virtual {v7}, Lb5;->w()V

    .line 71
    .line 72
    .line 73
    iget-object v0, v7, Lb5;->d:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Landroid/database/sqlite/SQLiteDatabase;

    .line 76
    .line 77
    invoke-static {v0, v8}, Landroid/database/DatabaseUtils;->queryNumEntries(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)J

    .line 78
    .line 79
    .line 80
    move-result-wide v9

    .line 81
    goto :goto_0

    .line 82
    :cond_3
    iget-object v0, v7, Lb5;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    int-to-long v9, v0

    .line 91
    :goto_0
    const-wide/16 v11, 0x0

    .line 92
    .line 93
    cmp-long v0, v9, v11

    .line 94
    .line 95
    if-gtz v0, :cond_5

    .line 96
    .line 97
    iget v0, v1, Ljc0;->h:I

    .line 98
    .line 99
    iget v6, v1, Ljc0;->p:I

    .line 100
    .line 101
    if-lt v0, v6, :cond_4

    .line 102
    .line 103
    const-string v0, "Emitter loop stopping: empty limit reached."

    .line 104
    .line 105
    new-array v1, v5, [Ljava/lang/Object;

    .line 106
    .line 107
    invoke-static {v4, v0, v1}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, v2, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_4
    add-int/2addr v0, v2

    .line 115
    iput v0, v1, Ljc0;->h:I

    .line 116
    .line 117
    new-instance v0, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    const-string v2, "Emitter database empty: "

    .line 120
    .line 121
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    iget v2, v1, Ljc0;->h:I

    .line 125
    .line 126
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    new-array v2, v5, [Ljava/lang/Object;

    .line 134
    .line 135
    invoke-static {v4, v0, v2}, Lk50;->q(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :try_start_0
    iget-object v0, v1, Ljc0;->i:Ljava/util/concurrent/TimeUnit;

    .line 139
    .line 140
    iget v2, v1, Ljc0;->o:I

    .line 141
    .line 142
    int-to-long v2, v2

    .line 143
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :catch_0
    move-exception v0

    .line 148
    new-instance v2, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    const-string v3, "Emitter thread sleep interrupted: "

    .line 151
    .line 152
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    new-array v2, v5, [Ljava/lang/Object;

    .line 163
    .line 164
    invoke-static {v4, v0, v2}, Lk50;->q(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :goto_1
    invoke-virtual/range {p0 .. p1}, Ljc0;->a(Lum1;)V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :cond_5
    iput v5, v1, Ljc0;->h:I

    .line 172
    .line 173
    iget v0, v1, Ljc0;->q:I

    .line 174
    .line 175
    invoke-virtual {v7}, Lb5;->p()Z

    .line 176
    .line 177
    .line 178
    move-result v9

    .line 179
    const-string v10, "b5"

    .line 180
    .line 181
    if-nez v9, :cond_6

    .line 182
    .line 183
    sget-object v0, Lnd0;->a:Lnd0;

    .line 184
    .line 185
    goto/16 :goto_e

    .line 186
    .line 187
    :cond_6
    invoke-virtual {v7}, Lb5;->w()V

    .line 188
    .line 189
    .line 190
    new-instance v9, Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 193
    .line 194
    .line 195
    const-string v12, "id DESC LIMIT "

    .line 196
    .line 197
    invoke-static {v0, v12}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v20

    .line 201
    new-instance v12, Ljava/util/ArrayList;

    .line 202
    .line 203
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v7}, Lb5;->p()Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    const-string v13, "eventData"

    .line 211
    .line 212
    const-string v14, "id"

    .line 213
    .line 214
    if-eqz v0, :cond_7

    .line 215
    .line 216
    iget-object v0, v7, Lb5;->d:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v0, Landroid/database/sqlite/SQLiteDatabase;

    .line 219
    .line 220
    if-nez v0, :cond_8

    .line 221
    .line 222
    :cond_7
    move-object v11, v13

    .line 223
    move-object v2, v14

    .line 224
    goto/16 :goto_a

    .line 225
    .line 226
    :cond_8
    move-object v15, v14

    .line 227
    :try_start_1
    const-string v14, "events"

    .line 228
    .line 229
    iget-object v11, v7, Lb5;->f:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v11, [Ljava/lang/String;

    .line 232
    .line 233
    const/16 v18, 0x0

    .line 234
    .line 235
    const/16 v19, 0x0

    .line 236
    .line 237
    const/16 v16, 0x0

    .line 238
    .line 239
    const/16 v17, 0x0

    .line 240
    .line 241
    move-object v2, v15

    .line 242
    move-object v15, v11

    .line 243
    move-object v11, v13

    .line 244
    move-object v13, v0

    .line 245
    invoke-virtual/range {v13 .. v20}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 246
    .line 247
    .line 248
    move-result-object v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 249
    :try_start_2
    invoke-interface {v13}, Landroid/database/Cursor;->moveToFirst()Z

    .line 250
    .line 251
    .line 252
    :goto_2
    invoke-interface {v13}, Landroid/database/Cursor;->isAfterLast()Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-nez v0, :cond_a

    .line 257
    .line 258
    new-instance v14, Ljava/util/HashMap;

    .line 259
    .line 260
    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    .line 261
    .line 262
    .line 263
    invoke-interface {v13, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 264
    .line 265
    .line 266
    move-result-wide v15

    .line 267
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-virtual {v14, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    const/4 v15, 0x1

    .line 275
    invoke-interface {v13, v15}, Landroid/database/Cursor;->getBlob(I)[B

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    sget v15, Lmn0;->p:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 283
    .line 284
    :try_start_3
    new-instance v15, Ljava/io/ByteArrayInputStream;

    .line 285
    .line 286
    invoke-direct {v15, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 287
    .line 288
    .line 289
    new-instance v0, Ljava/io/ObjectInputStream;

    .line 290
    .line 291
    invoke-direct {v0, v15}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    move-object/from16 v17, v0

    .line 299
    .line 300
    instance-of v0, v5, Ljava/util/HashMap;

    .line 301
    .line 302
    if-eqz v0, :cond_9

    .line 303
    .line 304
    check-cast v5, Ljava/util/HashMap;

    .line 305
    .line 306
    goto :goto_3

    .line 307
    :catch_1
    move-exception v0

    .line 308
    goto :goto_4

    .line 309
    :catch_2
    move-exception v0

    .line 310
    goto :goto_5

    .line 311
    :catch_3
    move-exception v0

    .line 312
    goto :goto_6

    .line 313
    :cond_9
    const/4 v5, 0x0

    .line 314
    :goto_3
    invoke-virtual/range {v17 .. v17}, Ljava/io/ObjectInputStream;->close()V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v15}, Ljava/io/ByteArrayInputStream;->close()V
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 318
    .line 319
    .line 320
    goto :goto_8

    .line 321
    :goto_4
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 322
    .line 323
    .line 324
    goto :goto_7

    .line 325
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 326
    .line 327
    .line 328
    goto :goto_7

    .line 329
    :goto_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 330
    .line 331
    .line 332
    :goto_7
    const/4 v5, 0x0

    .line 333
    :goto_8
    invoke-virtual {v14, v11, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    const-string v0, "dateCreated"

    .line 337
    .line 338
    const/4 v5, 0x2

    .line 339
    invoke-interface {v13, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v5

    .line 343
    invoke-virtual {v14, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    invoke-interface {v13}, Landroid/database/Cursor;->moveToNext()Z

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 350
    .line 351
    .line 352
    const/4 v5, 0x0

    .line 353
    goto :goto_2

    .line 354
    :catchall_0
    move-exception v0

    .line 355
    move-object v11, v13

    .line 356
    goto :goto_9

    .line 357
    :cond_a
    invoke-interface {v13}, Landroid/database/Cursor;->close()V

    .line 358
    .line 359
    .line 360
    goto :goto_a

    .line 361
    :catchall_1
    move-exception v0

    .line 362
    const/4 v11, 0x0

    .line 363
    :goto_9
    if-eqz v11, :cond_b

    .line 364
    .line 365
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 366
    .line 367
    .line 368
    :cond_b
    throw v0

    .line 369
    :goto_a
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 374
    .line 375
    .line 376
    move-result v5

    .line 377
    if-eqz v5, :cond_10

    .line 378
    .line 379
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v5

    .line 383
    check-cast v5, Ljava/util/Map;

    .line 384
    .line 385
    new-instance v12, Lzq2;

    .line 386
    .line 387
    invoke-direct {v12}, Lzq2;-><init>()V

    .line 388
    .line 389
    .line 390
    invoke-interface {v5, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v13

    .line 394
    instance-of v14, v13, Ljava/util/Map;

    .line 395
    .line 396
    if-eqz v14, :cond_c

    .line 397
    .line 398
    check-cast v13, Ljava/util/Map;

    .line 399
    .line 400
    goto :goto_c

    .line 401
    :cond_c
    const/4 v13, 0x0

    .line 402
    :goto_c
    if-eqz v13, :cond_d

    .line 403
    .line 404
    invoke-virtual {v12, v13}, Lzq2;->c(Ljava/util/Map;)V

    .line 405
    .line 406
    .line 407
    :cond_d
    invoke-interface {v5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v5

    .line 411
    instance-of v13, v5, Ljava/lang/Long;

    .line 412
    .line 413
    if-eqz v13, :cond_e

    .line 414
    .line 415
    check-cast v5, Ljava/lang/Long;

    .line 416
    .line 417
    goto :goto_d

    .line 418
    :cond_e
    const/4 v5, 0x0

    .line 419
    :goto_d
    if-nez v5, :cond_f

    .line 420
    .line 421
    const-string v5, "Unable to get ID of an event extracted from the database."

    .line 422
    .line 423
    const/4 v12, 0x0

    .line 424
    new-array v13, v12, [Ljava/lang/Object;

    .line 425
    .line 426
    invoke-static {v10, v5, v13}, Lk50;->q(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    goto :goto_b

    .line 430
    :cond_f
    new-instance v13, Lnc0;

    .line 431
    .line 432
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 433
    .line 434
    .line 435
    move-result-wide v14

    .line 436
    invoke-direct {v13, v12, v14, v15}, Lnc0;-><init>(Lzq2;J)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    goto :goto_b

    .line 443
    :cond_10
    move-object v0, v9

    .line 444
    :goto_e
    move-object/from16 v2, p1

    .line 445
    .line 446
    check-cast v2, Lip1;

    .line 447
    .line 448
    iget-object v5, v2, Lip1;->h:Landroid/net/Uri$Builder;

    .line 449
    .line 450
    iget v9, v2, Lip1;->c:I

    .line 451
    .line 452
    new-instance v11, Ljava/util/ArrayList;

    .line 453
    .line 454
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 455
    .line 456
    .line 457
    sget v12, Lmn0;->p:I

    .line 458
    .line 459
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 460
    .line 461
    .line 462
    move-result-wide v12

    .line 463
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v12

    .line 467
    const-string v13, "stm"

    .line 468
    .line 469
    const/4 v15, 0x1

    .line 470
    if-ne v9, v15, :cond_14

    .line 471
    .line 472
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    :cond_11
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 477
    .line 478
    .line 479
    move-result v14

    .line 480
    if-eqz v14, :cond_13

    .line 481
    .line 482
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v14

    .line 486
    check-cast v14, Lnc0;

    .line 487
    .line 488
    if-eqz v14, :cond_12

    .line 489
    .line 490
    iget-object v15, v14, Lnc0;->a:Lzq2;

    .line 491
    .line 492
    goto :goto_10

    .line 493
    :cond_12
    const/4 v15, 0x0

    .line 494
    :goto_10
    if-eqz v15, :cond_11

    .line 495
    .line 496
    invoke-virtual {v15, v13, v12}, Lzq2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 497
    .line 498
    .line 499
    move-object/from16 v17, v0

    .line 500
    .line 501
    new-instance v0, Ljava/util/ArrayList;

    .line 502
    .line 503
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v1, v15, v0, v9}, Ljc0;->b(Lzq2;Ljava/util/ArrayList;I)Z

    .line 507
    .line 508
    .line 509
    move-result v0

    .line 510
    move-object/from16 v18, v6

    .line 511
    .line 512
    new-instance v6, Ll32;

    .line 513
    .line 514
    move-object/from16 v19, v7

    .line 515
    .line 516
    move-object/from16 v20, v8

    .line 517
    .line 518
    iget-wide v7, v14, Lnc0;->b:J

    .line 519
    .line 520
    invoke-direct {v6, v15, v7, v8, v0}, Ll32;-><init>(Lzq2;JZ)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    move-object/from16 v0, v17

    .line 527
    .line 528
    move-object/from16 v6, v18

    .line 529
    .line 530
    move-object/from16 v7, v19

    .line 531
    .line 532
    move-object/from16 v8, v20

    .line 533
    .line 534
    goto :goto_f

    .line 535
    :cond_13
    move-object/from16 v18, v6

    .line 536
    .line 537
    move-object/from16 v19, v7

    .line 538
    .line 539
    move-object/from16 v20, v8

    .line 540
    .line 541
    move-object/from16 v17, v3

    .line 542
    .line 543
    move-object v15, v4

    .line 544
    goto/16 :goto_13

    .line 545
    .line 546
    :cond_14
    move-object/from16 v18, v6

    .line 547
    .line 548
    move-object/from16 v19, v7

    .line 549
    .line 550
    move-object/from16 v20, v8

    .line 551
    .line 552
    new-instance v6, Ljava/util/ArrayList;

    .line 553
    .line 554
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 555
    .line 556
    .line 557
    new-instance v7, Ljava/util/ArrayList;

    .line 558
    .line 559
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 560
    .line 561
    .line 562
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 567
    .line 568
    .line 569
    move-result v8

    .line 570
    if-eqz v8, :cond_18

    .line 571
    .line 572
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v8

    .line 576
    check-cast v8, Lnc0;

    .line 577
    .line 578
    if-eqz v8, :cond_17

    .line 579
    .line 580
    iget-object v14, v8, Lnc0;->a:Lzq2;

    .line 581
    .line 582
    move-object/from16 v17, v3

    .line 583
    .line 584
    move-object v15, v4

    .line 585
    iget-wide v3, v8, Lnc0;->b:J

    .line 586
    .line 587
    invoke-virtual {v14, v13, v12}, Lzq2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    new-instance v8, Ljava/util/ArrayList;

    .line 591
    .line 592
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v1, v14, v8, v9}, Ljc0;->b(Lzq2;Ljava/util/ArrayList;I)Z

    .line 596
    .line 597
    .line 598
    move-result v8

    .line 599
    if-eqz v8, :cond_15

    .line 600
    .line 601
    new-instance v8, Ll32;

    .line 602
    .line 603
    move-object/from16 v22, v12

    .line 604
    .line 605
    const/4 v12, 0x1

    .line 606
    invoke-direct {v8, v14, v3, v4, v12}, Ll32;-><init>(Lzq2;JZ)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    goto :goto_12

    .line 613
    :cond_15
    move-object/from16 v22, v12

    .line 614
    .line 615
    invoke-virtual {v1, v14, v7, v9}, Ljc0;->b(Lzq2;Ljava/util/ArrayList;I)Z

    .line 616
    .line 617
    .line 618
    move-result v8

    .line 619
    if-eqz v8, :cond_16

    .line 620
    .line 621
    new-instance v8, Ll32;

    .line 622
    .line 623
    invoke-direct {v8, v7, v6}, Ll32;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    new-instance v7, Ljava/util/ArrayList;

    .line 630
    .line 631
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 632
    .line 633
    .line 634
    new-instance v6, Ljava/util/ArrayList;

    .line 635
    .line 636
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 643
    .line 644
    .line 645
    move-result-object v3

    .line 646
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 647
    .line 648
    .line 649
    :goto_12
    move-object v4, v15

    .line 650
    move-object/from16 v3, v17

    .line 651
    .line 652
    move-object/from16 v12, v22

    .line 653
    .line 654
    goto :goto_11

    .line 655
    :cond_16
    invoke-interface {v7, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 659
    .line 660
    .line 661
    move-result-object v3

    .line 662
    invoke-interface {v6, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    goto :goto_12

    .line 666
    :cond_17
    move-object/from16 v17, v3

    .line 667
    .line 668
    move-object v15, v4

    .line 669
    move-object/from16 v22, v12

    .line 670
    .line 671
    goto :goto_12

    .line 672
    :cond_18
    move-object/from16 v17, v3

    .line 673
    .line 674
    move-object v15, v4

    .line 675
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 676
    .line 677
    .line 678
    move-result v0

    .line 679
    if-nez v0, :cond_19

    .line 680
    .line 681
    new-instance v0, Ll32;

    .line 682
    .line 683
    invoke-direct {v0, v7, v6}, Ll32;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    :cond_19
    :goto_13
    iget-object v0, v2, Lip1;->f:Ljava/util/Map;

    .line 690
    .line 691
    iget-object v3, v2, Lip1;->a:Ljava/lang/String;

    .line 692
    .line 693
    new-instance v4, Ljava/util/ArrayList;

    .line 694
    .line 695
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 696
    .line 697
    .line 698
    new-instance v6, Ljava/util/ArrayList;

    .line 699
    .line 700
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 704
    .line 705
    .line 706
    move-result-object v7

    .line 707
    :goto_14
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 708
    .line 709
    .line 710
    move-result v8

    .line 711
    if-eqz v8, :cond_23

    .line 712
    .line 713
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v8

    .line 717
    check-cast v8, Ll32;

    .line 718
    .line 719
    iget-object v12, v8, Ll32;->d:Ljava/lang/String;

    .line 720
    .line 721
    iget-object v8, v8, Ll32;->a:Lzq2;

    .line 722
    .line 723
    if-nez v12, :cond_1a

    .line 724
    .line 725
    sget-object v12, Lip1;->i:Ljava/lang/String;

    .line 726
    .line 727
    :cond_1a
    const-string v13, "*"

    .line 728
    .line 729
    const-string v14, "SP-Anonymous"

    .line 730
    .line 731
    move-object/from16 v22, v0

    .line 732
    .line 733
    const-string v0, "User-Agent"

    .line 734
    .line 735
    move-object/from16 v23, v7

    .line 736
    .line 737
    const/4 v7, 0x1

    .line 738
    if-ne v9, v7, :cond_1f

    .line 739
    .line 740
    invoke-virtual {v5}, Landroid/net/Uri$Builder;->clearQuery()Landroid/net/Uri$Builder;

    .line 741
    .line 742
    .line 743
    iget-object v7, v8, Lzq2;->b:Ljava/util/HashMap;

    .line 744
    .line 745
    invoke-virtual {v7}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 746
    .line 747
    .line 748
    move-result-object v8

    .line 749
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 750
    .line 751
    .line 752
    move-result-object v8

    .line 753
    :goto_15
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 754
    .line 755
    .line 756
    move-result v24

    .line 757
    if-eqz v24, :cond_1c

    .line 758
    .line 759
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object v24

    .line 763
    move-object/from16 v25, v8

    .line 764
    .line 765
    move-object/from16 v8, v24

    .line 766
    .line 767
    check-cast v8, Ljava/lang/String;

    .line 768
    .line 769
    move/from16 v24, v9

    .line 770
    .line 771
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v9

    .line 775
    move-object/from16 v26, v7

    .line 776
    .line 777
    instance-of v7, v9, Ljava/lang/String;

    .line 778
    .line 779
    if-eqz v7, :cond_1b

    .line 780
    .line 781
    check-cast v9, Ljava/lang/String;

    .line 782
    .line 783
    goto :goto_16

    .line 784
    :cond_1b
    const/4 v9, 0x0

    .line 785
    :goto_16
    invoke-virtual {v5, v8, v9}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 786
    .line 787
    .line 788
    move/from16 v9, v24

    .line 789
    .line 790
    move-object/from16 v8, v25

    .line 791
    .line 792
    move-object/from16 v7, v26

    .line 793
    .line 794
    goto :goto_15

    .line 795
    :cond_1c
    move/from16 v24, v9

    .line 796
    .line 797
    invoke-virtual {v5}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 798
    .line 799
    .line 800
    move-result-object v7

    .line 801
    invoke-virtual {v7}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v7

    .line 805
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 806
    .line 807
    .line 808
    new-instance v8, Lokhttp3/Request$Builder;

    .line 809
    .line 810
    invoke-direct {v8}, Lokhttp3/Request$Builder;-><init>()V

    .line 811
    .line 812
    .line 813
    invoke-virtual {v8, v7}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 814
    .line 815
    .line 816
    move-result-object v7

    .line 817
    invoke-virtual {v7, v0, v12}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->get()Lokhttp3/Request$Builder;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    iget-boolean v7, v2, Lip1;->e:Z

    .line 826
    .line 827
    if-eqz v7, :cond_1d

    .line 828
    .line 829
    invoke-virtual {v0, v14, v13}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 830
    .line 831
    .line 832
    :cond_1d
    if-eqz v22, :cond_1e

    .line 833
    .line 834
    invoke-interface/range {v22 .. v22}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 835
    .line 836
    .line 837
    move-result-object v7

    .line 838
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 839
    .line 840
    .line 841
    move-result-object v7

    .line 842
    :goto_17
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 843
    .line 844
    .line 845
    move-result v8

    .line 846
    if-eqz v8, :cond_1e

    .line 847
    .line 848
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    move-result-object v8

    .line 852
    check-cast v8, Ljava/util/Map$Entry;

    .line 853
    .line 854
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 855
    .line 856
    .line 857
    move-result-object v9

    .line 858
    check-cast v9, Ljava/lang/String;

    .line 859
    .line 860
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 861
    .line 862
    .line 863
    move-result-object v8

    .line 864
    check-cast v8, Ljava/lang/String;

    .line 865
    .line 866
    invoke-virtual {v0, v9, v8}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 867
    .line 868
    .line 869
    goto :goto_17

    .line 870
    :cond_1e
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 871
    .line 872
    .line 873
    move-result-object v0

    .line 874
    move-object/from16 v25, v5

    .line 875
    .line 876
    goto :goto_19

    .line 877
    :cond_1f
    move/from16 v24, v9

    .line 878
    .line 879
    invoke-virtual {v5}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 880
    .line 881
    .line 882
    move-result-object v7

    .line 883
    invoke-virtual {v7}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    move-result-object v7

    .line 887
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 888
    .line 889
    .line 890
    sget-object v9, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    .line 891
    .line 892
    invoke-virtual {v8}, Lzq2;->toString()Ljava/lang/String;

    .line 893
    .line 894
    .line 895
    move-result-object v8

    .line 896
    move-object/from16 v25, v5

    .line 897
    .line 898
    iget-object v5, v2, Lip1;->b:Lokhttp3/MediaType;

    .line 899
    .line 900
    invoke-virtual {v9, v8, v5}, Lokhttp3/RequestBody$Companion;->create(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;

    .line 901
    .line 902
    .line 903
    move-result-object v5

    .line 904
    new-instance v8, Lokhttp3/Request$Builder;

    .line 905
    .line 906
    invoke-direct {v8}, Lokhttp3/Request$Builder;-><init>()V

    .line 907
    .line 908
    .line 909
    invoke-virtual {v8, v7}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 910
    .line 911
    .line 912
    move-result-object v7

    .line 913
    invoke-virtual {v7, v0, v12}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    invoke-virtual {v0, v5}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    iget-boolean v5, v2, Lip1;->e:Z

    .line 922
    .line 923
    if-eqz v5, :cond_20

    .line 924
    .line 925
    invoke-virtual {v0, v14, v13}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 926
    .line 927
    .line 928
    :cond_20
    if-eqz v22, :cond_21

    .line 929
    .line 930
    invoke-interface/range {v22 .. v22}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 931
    .line 932
    .line 933
    move-result-object v5

    .line 934
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 935
    .line 936
    .line 937
    move-result-object v5

    .line 938
    :goto_18
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 939
    .line 940
    .line 941
    move-result v7

    .line 942
    if-eqz v7, :cond_21

    .line 943
    .line 944
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 945
    .line 946
    .line 947
    move-result-object v7

    .line 948
    check-cast v7, Ljava/util/Map$Entry;

    .line 949
    .line 950
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 951
    .line 952
    .line 953
    move-result-object v8

    .line 954
    check-cast v8, Ljava/lang/String;

    .line 955
    .line 956
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object v7

    .line 960
    check-cast v7, Ljava/lang/String;

    .line 961
    .line 962
    invoke-virtual {v0, v8, v7}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 963
    .line 964
    .line 965
    goto :goto_18

    .line 966
    :cond_21
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 967
    .line 968
    .line 969
    move-result-object v0

    .line 970
    :goto_19
    new-instance v5, Lbh0;

    .line 971
    .line 972
    const/4 v7, 0x1

    .line 973
    invoke-direct {v5, v7, v2, v0}, Lbh0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 974
    .line 975
    .line 976
    invoke-static {v5}, Lmf0;->b(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 977
    .line 978
    .line 979
    move-result-object v0

    .line 980
    if-eqz v0, :cond_22

    .line 981
    .line 982
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 983
    .line 984
    .line 985
    :cond_22
    move-object/from16 v0, v22

    .line 986
    .line 987
    move-object/from16 v7, v23

    .line 988
    .line 989
    move/from16 v9, v24

    .line 990
    .line 991
    move-object/from16 v5, v25

    .line 992
    .line 993
    goto/16 :goto_14

    .line 994
    .line 995
    :cond_23
    move-object/from16 v25, v5

    .line 996
    .line 997
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 998
    .line 999
    .line 1000
    move-result v0

    .line 1001
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v0

    .line 1005
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v0

    .line 1009
    const-string v5, "Request Futures: %s"

    .line 1010
    .line 1011
    invoke-static {v3, v5, v0}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1015
    .line 1016
    .line 1017
    move-result v5

    .line 1018
    const/4 v7, 0x0

    .line 1019
    :goto_1a
    if-ge v7, v5, :cond_27

    .line 1020
    .line 1021
    :try_start_5
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v0

    .line 1025
    check-cast v0, Ljava/util/concurrent/Future;

    .line 1026
    .line 1027
    iget v9, v2, Lip1;->d:I

    .line 1028
    .line 1029
    int-to-long v12, v9

    .line 1030
    sget-object v9, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1031
    .line 1032
    invoke-interface {v0, v12, v13, v9}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v0

    .line 1036
    instance-of v9, v0, Ljava/lang/Integer;

    .line 1037
    .line 1038
    if-eqz v9, :cond_24

    .line 1039
    .line 1040
    check-cast v0, Ljava/lang/Integer;

    .line 1041
    .line 1042
    goto :goto_1b

    .line 1043
    :catch_4
    move-exception v0

    .line 1044
    goto :goto_1c

    .line 1045
    :catch_5
    move-exception v0

    .line 1046
    goto :goto_1d

    .line 1047
    :catch_6
    move-exception v0

    .line 1048
    goto :goto_1e

    .line 1049
    :cond_24
    const/4 v0, 0x0

    .line 1050
    :goto_1b
    if-eqz v0, :cond_25

    .line 1051
    .line 1052
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1053
    .line 1054
    .line 1055
    move-result v8
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_6
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_5 .. :try_end_5} :catch_4

    .line 1056
    goto :goto_20

    .line 1057
    :goto_1c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v0

    .line 1061
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    const-string v9, "Request Future had a timeout: %s"

    .line 1066
    .line 1067
    invoke-static {v3, v9, v0}, Lk50;->q(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1068
    .line 1069
    .line 1070
    goto :goto_1f

    .line 1071
    :goto_1d
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v0

    .line 1075
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    const-string v9, "Request Future failed: %s"

    .line 1080
    .line 1081
    invoke-static {v3, v9, v0}, Lk50;->q(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1082
    .line 1083
    .line 1084
    goto :goto_1f

    .line 1085
    :goto_1e
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v0

    .line 1089
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    const-string v9, "Request Future was interrupted: %s"

    .line 1094
    .line 1095
    invoke-static {v3, v9, v0}, Lk50;->q(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1096
    .line 1097
    .line 1098
    :cond_25
    :goto_1f
    const/4 v8, -0x1

    .line 1099
    :goto_20
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v0

    .line 1103
    check-cast v0, Ll32;

    .line 1104
    .line 1105
    iget-object v9, v0, Ll32;->b:Ljava/util/ArrayList;

    .line 1106
    .line 1107
    iget-boolean v0, v0, Ll32;->c:Z

    .line 1108
    .line 1109
    new-instance v12, Ln32;

    .line 1110
    .line 1111
    invoke-direct {v12, v8, v0, v9}, Ln32;-><init>(IZLjava/util/List;)V

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1115
    .line 1116
    .line 1117
    if-eqz v0, :cond_26

    .line 1118
    .line 1119
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v0

    .line 1123
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v0

    .line 1127
    const-string v8, "Request is oversized for emitter event IDs: %s"

    .line 1128
    .line 1129
    invoke-static {v3, v8, v0}, Lk50;->K(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1130
    .line 1131
    .line 1132
    :cond_26
    add-int/lit8 v7, v7, 0x1

    .line 1133
    .line 1134
    goto :goto_1a

    .line 1135
    :cond_27
    const-string v0, "Processing emitter results."

    .line 1136
    .line 1137
    const/4 v12, 0x0

    .line 1138
    new-array v2, v12, [Ljava/lang/Object;

    .line 1139
    .line 1140
    invoke-static {v15, v0, v2}, Lk50;->L(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1141
    .line 1142
    .line 1143
    new-instance v0, Ljava/util/ArrayList;

    .line 1144
    .line 1145
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v2

    .line 1152
    const/4 v3, 0x0

    .line 1153
    const/4 v4, 0x0

    .line 1154
    const/4 v12, 0x0

    .line 1155
    :goto_21
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1156
    .line 1157
    .line 1158
    move-result v5

    .line 1159
    if-eqz v5, :cond_2f

    .line 1160
    .line 1161
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v5

    .line 1165
    check-cast v5, Ln32;

    .line 1166
    .line 1167
    iget v6, v5, Ln32;->a:I

    .line 1168
    .line 1169
    const/16 v7, 0x12c

    .line 1170
    .line 1171
    const/16 v9, 0xc8

    .line 1172
    .line 1173
    if-gt v9, v6, :cond_28

    .line 1174
    .line 1175
    if-ge v6, v7, :cond_28

    .line 1176
    .line 1177
    const/4 v11, 0x1

    .line 1178
    goto :goto_22

    .line 1179
    :cond_28
    const/4 v11, 0x0

    .line 1180
    :goto_22
    iget-object v13, v5, Ln32;->c:Ljava/util/List;

    .line 1181
    .line 1182
    if-eqz v11, :cond_29

    .line 1183
    .line 1184
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1185
    .line 1186
    .line 1187
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 1188
    .line 1189
    .line 1190
    move-result v5

    .line 1191
    add-int/2addr v4, v5

    .line 1192
    goto :goto_21

    .line 1193
    :cond_29
    iget-object v11, v1, Ljc0;->x:Ljava/util/concurrent/atomic/AtomicReference;

    .line 1194
    .line 1195
    invoke-virtual {v11}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v11

    .line 1199
    check-cast v11, Ljava/util/Map;

    .line 1200
    .line 1201
    iget-object v14, v1, Ljc0;->y:Ljava/util/concurrent/atomic/AtomicReference;

    .line 1202
    .line 1203
    invoke-virtual {v14}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v14

    .line 1207
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1208
    .line 1209
    .line 1210
    check-cast v14, Ljava/lang/Boolean;

    .line 1211
    .line 1212
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1213
    .line 1214
    .line 1215
    move-result v14

    .line 1216
    iget v8, v5, Ln32;->a:I

    .line 1217
    .line 1218
    if-gt v9, v8, :cond_2a

    .line 1219
    .line 1220
    if-ge v8, v7, :cond_2a

    .line 1221
    .line 1222
    :goto_23
    const/4 v5, 0x0

    .line 1223
    goto :goto_24

    .line 1224
    :cond_2a
    if-nez v14, :cond_2b

    .line 1225
    .line 1226
    goto :goto_23

    .line 1227
    :cond_2b
    iget-boolean v5, v5, Ln32;->b:Z

    .line 1228
    .line 1229
    if-eqz v5, :cond_2c

    .line 1230
    .line 1231
    goto :goto_23

    .line 1232
    :cond_2c
    if-eqz v11, :cond_2d

    .line 1233
    .line 1234
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v5

    .line 1238
    invoke-interface {v11, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1239
    .line 1240
    .line 1241
    move-result v5

    .line 1242
    const/4 v7, 0x1

    .line 1243
    if-ne v5, v7, :cond_2d

    .line 1244
    .line 1245
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v5

    .line 1249
    invoke-interface {v11, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v5

    .line 1253
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1254
    .line 1255
    .line 1256
    check-cast v5, Ljava/lang/Boolean;

    .line 1257
    .line 1258
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1259
    .line 1260
    .line 1261
    move-result v5

    .line 1262
    goto :goto_24

    .line 1263
    :cond_2d
    new-instance v5, Ljava/util/HashSet;

    .line 1264
    .line 1265
    const/16 v7, 0x190

    .line 1266
    .line 1267
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v7

    .line 1271
    const/16 v8, 0x191

    .line 1272
    .line 1273
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v8

    .line 1277
    const/16 v9, 0x193

    .line 1278
    .line 1279
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v9

    .line 1283
    const/16 v11, 0x19a

    .line 1284
    .line 1285
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v11

    .line 1289
    const/16 v14, 0x1a6

    .line 1290
    .line 1291
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v14

    .line 1295
    filled-new-array {v7, v8, v9, v11, v14}, [Ljava/lang/Integer;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v7

    .line 1299
    invoke-static {v7}, Lpw;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v7

    .line 1303
    invoke-direct {v5, v7}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 1304
    .line 1305
    .line 1306
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v7

    .line 1310
    invoke-virtual {v5, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1311
    .line 1312
    .line 1313
    move-result v5

    .line 1314
    const/16 v21, 0x1

    .line 1315
    .line 1316
    xor-int/lit8 v5, v5, 0x1

    .line 1317
    .line 1318
    :goto_24
    if-eqz v5, :cond_2e

    .line 1319
    .line 1320
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 1321
    .line 1322
    .line 1323
    move-result v5

    .line 1324
    add-int/2addr v12, v5

    .line 1325
    const-string v5, "Request sending failed but we will retry later."

    .line 1326
    .line 1327
    const/4 v7, 0x0

    .line 1328
    new-array v6, v7, [Ljava/lang/Object;

    .line 1329
    .line 1330
    invoke-static {v15, v5, v6}, Lk50;->q(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1331
    .line 1332
    .line 1333
    goto/16 :goto_21

    .line 1334
    .line 1335
    :cond_2e
    const/4 v7, 0x0

    .line 1336
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 1337
    .line 1338
    .line 1339
    move-result v5

    .line 1340
    add-int/2addr v3, v5

    .line 1341
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1342
    .line 1343
    .line 1344
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v5

    .line 1348
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v5

    .line 1352
    const/4 v6, 0x1

    .line 1353
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v5

    .line 1357
    const-string v6, "Sending events to Collector failed with status %d. Events will be dropped."

    .line 1358
    .line 1359
    invoke-static {v6, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v5

    .line 1363
    new-array v6, v7, [Ljava/lang/Object;

    .line 1364
    .line 1365
    invoke-static {v15, v5, v6}, Lk50;->q(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1366
    .line 1367
    .line 1368
    goto/16 :goto_21

    .line 1369
    .line 1370
    :cond_2f
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1371
    .line 1372
    .line 1373
    move-result v2

    .line 1374
    if-eqz v2, :cond_30

    .line 1375
    .line 1376
    goto/16 :goto_27

    .line 1377
    .line 1378
    :cond_30
    invoke-virtual/range {v19 .. v19}, Lb5;->p()Z

    .line 1379
    .line 1380
    .line 1381
    move-result v2

    .line 1382
    if-eqz v2, :cond_34

    .line 1383
    .line 1384
    move-object/from16 v2, v19

    .line 1385
    .line 1386
    iget-object v2, v2, Lb5;->d:Ljava/lang/Object;

    .line 1387
    .line 1388
    check-cast v2, Landroid/database/sqlite/SQLiteDatabase;

    .line 1389
    .line 1390
    if-eqz v2, :cond_34

    .line 1391
    .line 1392
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1393
    .line 1394
    const-string v6, "id in ("

    .line 1395
    .line 1396
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1397
    .line 1398
    .line 1399
    sget v6, Lmn0;->p:I

    .line 1400
    .line 1401
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1402
    .line 1403
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 1404
    .line 1405
    .line 1406
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1407
    .line 1408
    .line 1409
    move-result v7

    .line 1410
    const/4 v8, 0x0

    .line 1411
    :goto_25
    const-string v9, ","

    .line 1412
    .line 1413
    if-ge v8, v7, :cond_32

    .line 1414
    .line 1415
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v11

    .line 1419
    check-cast v11, Ljava/lang/Long;

    .line 1420
    .line 1421
    if-eqz v11, :cond_31

    .line 1422
    .line 1423
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v11

    .line 1427
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1428
    .line 1429
    .line 1430
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1431
    .line 1432
    .line 1433
    move-result v11

    .line 1434
    const/16 v21, 0x1

    .line 1435
    .line 1436
    add-int/lit8 v11, v11, -0x1

    .line 1437
    .line 1438
    if-ge v8, v11, :cond_31

    .line 1439
    .line 1440
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1441
    .line 1442
    .line 1443
    :cond_31
    add-int/lit8 v8, v8, 0x1

    .line 1444
    .line 1445
    goto :goto_25

    .line 1446
    :cond_32
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v7

    .line 1450
    const/4 v8, 0x0

    .line 1451
    invoke-static {v7, v9, v8}, Lkotlin/text/e;->g(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1452
    .line 1453
    .line 1454
    move-result v7

    .line 1455
    if-eqz v7, :cond_33

    .line 1456
    .line 1457
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1458
    .line 1459
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    .line 1460
    .line 1461
    .line 1462
    move-result v9

    .line 1463
    const/16 v21, 0x1

    .line 1464
    .line 1465
    add-int/lit8 v9, v9, -0x1

    .line 1466
    .line 1467
    invoke-virtual {v6, v8, v9}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v6

    .line 1471
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1472
    .line 1473
    .line 1474
    move-object v6, v7

    .line 1475
    :cond_33
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v6

    .line 1479
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1480
    .line 1481
    .line 1482
    const/16 v6, 0x29

    .line 1483
    .line 1484
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1485
    .line 1486
    .line 1487
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v5

    .line 1491
    move-object/from16 v6, v20

    .line 1492
    .line 1493
    const/4 v7, 0x0

    .line 1494
    invoke-virtual {v2, v6, v5, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 1495
    .line 1496
    .line 1497
    move-result v8

    .line 1498
    goto :goto_26

    .line 1499
    :cond_34
    const/4 v8, -0x1

    .line 1500
    :goto_26
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v2

    .line 1504
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v2

    .line 1508
    const-string v5, "Removed events from database: %s"

    .line 1509
    .line 1510
    invoke-static {v10, v5, v2}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1511
    .line 1512
    .line 1513
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1514
    .line 1515
    .line 1516
    :goto_27
    add-int/2addr v3, v12

    .line 1517
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v0

    .line 1521
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v0

    .line 1525
    const-string v2, "Success Count: %s"

    .line 1526
    .line 1527
    invoke-static {v15, v2, v0}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1528
    .line 1529
    .line 1530
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v0

    .line 1534
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v0

    .line 1538
    const-string v2, "Failure Count: %s"

    .line 1539
    .line 1540
    invoke-static {v15, v2, v0}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1541
    .line 1542
    .line 1543
    if-lez v12, :cond_36

    .line 1544
    .line 1545
    if-nez v4, :cond_36

    .line 1546
    .line 1547
    invoke-static/range {v18 .. v18}, Lmn0;->v(Landroid/content/Context;)Z

    .line 1548
    .line 1549
    .line 1550
    move-result v0

    .line 1551
    if-eqz v0, :cond_35

    .line 1552
    .line 1553
    invoke-virtual/range {v25 .. v25}, Landroid/net/Uri$Builder;->clearQuery()Landroid/net/Uri$Builder;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v0

    .line 1557
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v0

    .line 1561
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1562
    .line 1563
    .line 1564
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v0

    .line 1568
    const-string v1, "Ensure collector path is valid: %s"

    .line 1569
    .line 1570
    invoke-static {v15, v1, v0}, Lk50;->q(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1571
    .line 1572
    .line 1573
    :cond_35
    const-string v0, "Emitter loop stopping: failures."

    .line 1574
    .line 1575
    const/4 v12, 0x0

    .line 1576
    new-array v1, v12, [Ljava/lang/Object;

    .line 1577
    .line 1578
    invoke-static {v15, v0, v1}, Lk50;->q(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1579
    .line 1580
    .line 1581
    move-object/from16 v1, v17

    .line 1582
    .line 1583
    const/4 v7, 0x1

    .line 1584
    invoke-virtual {v1, v7, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1585
    .line 1586
    .line 1587
    goto :goto_28

    .line 1588
    :cond_36
    invoke-virtual/range {p0 .. p1}, Ljc0;->a(Lum1;)V

    .line 1589
    .line 1590
    .line 1591
    :goto_28
    return-void
.end method

.method public final b(Lzq2;Ljava/util/ArrayList;I)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p3, v0, :cond_0

    .line 3
    .line 4
    iget-wide v1, p0, Ljc0;->r:J

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-wide v1, p0, Ljc0;->s:J

    .line 8
    .line 9
    :goto_0
    invoke-virtual {p1}, Lzq2;->d()J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Lzq2;

    .line 28
    .line 29
    invoke-virtual {v3}, Lzq2;->d()J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    add-long/2addr p0, v3

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result p3

    .line 39
    const/4 v3, 0x0

    .line 40
    if-nez p3, :cond_2

    .line 41
    .line 42
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    add-int/lit8 p2, p2, 0x58

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move p2, v3

    .line 50
    :goto_2
    int-to-long p2, p2

    .line 51
    add-long/2addr p0, p2

    .line 52
    cmp-long p0, p0, v1

    .line 53
    .line 54
    if-lez p0, :cond_3

    .line 55
    .line 56
    return v0

    .line 57
    :cond_3
    return v3
.end method

.method public final c()V
    .locals 6

    .line 1
    iget-wide v0, p0, Ljc0;->A:J

    .line 2
    .line 3
    iget-wide v2, p0, Ljc0;->B:J

    .line 4
    .line 5
    iget-object p0, p0, Ljc0;->m:Lb5;

    .line 6
    .line 7
    invoke-virtual {p0}, Lb5;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lb5;->w()V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lb5;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Landroid/database/sqlite/SQLiteDatabase;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    new-instance v4, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v5, "\n                DELETE FROM events\n                WHERE id NOT IN (\n                    SELECT id\n                    FROM events\n                    WHERE dateCreated >= datetime(\'now\',\'-"

    .line 25
    .line 26
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sget-object v5, Lfb0;->b:Leb0;

    .line 30
    .line 31
    sget-object v5, Lib0;->d:Lib0;

    .line 32
    .line 33
    invoke-static {v2, v3, v5}, Lfb0;->j(JLib0;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v2, " seconds\')\n                    ORDER BY dateCreated DESC, id DESC\n                    LIMIT "

    .line 41
    .line 42
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v0, "\n                )\n                "

    .line 49
    .line 50
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Lkotlin/text/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    return-void
.end method

.method public final d(Lum1;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ljc0;->v:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    iget-object v2, p0, Ljc0;->a:Ljava/lang/String;

    .line 5
    .line 6
    const-string v3, "Shutting down emitter."

    .line 7
    .line 8
    invoke-static {v2, v3, v1}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Ljc0;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-virtual {p0, v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 15
    .line 16
    .line 17
    sget-object p0, Lmf0;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdown()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-nez p0, :cond_0

    .line 31
    .line 32
    const-string p0, "Failed to shutdown"

    .line 33
    .line 34
    :cond_0
    new-array v0, v0, [Ljava/lang/Object;

    .line 35
    .line 36
    const-string v1, "Executor"

    .line 37
    .line 38
    invoke-static {v1, p0, v0}, Lk50;->q(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    const/4 p0, 0x0

    .line 42
    sput-object p0, Lmf0;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 43
    .line 44
    :cond_1
    return-void
.end method
