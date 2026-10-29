.class public final Lol3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 16
    iput p1, p0, Lol3;->a:I

    iput-object p3, p0, Lol3;->b:Ljava/lang/Object;

    iput-object p2, p0, Lol3;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 15
    iput p3, p0, Lol3;->a:I

    iput-object p1, p0, Lol3;->b:Ljava/lang/Object;

    iput-object p2, p0, Lol3;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lpn3;Lbm3;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lol3;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lol3;->b:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lol3;->c:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Lol3;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lol3;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lej;

    .line 12
    .line 13
    iget-object p0, p0, Lol3;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lpn;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v1, Lkf3;->k:Lkj;

    .line 21
    .line 22
    const/16 v3, 0x18

    .line 23
    .line 24
    const/16 v4, 0xd

    .line 25
    .line 26
    invoke-virtual {v0, v3, v4, v1}, Lej;->x(IILkj;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v1, v2}, Lpn;->g(Lkj;Lgj;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    iget-object v0, p0, Lol3;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lac3;

    .line 36
    .line 37
    iget-object p0, p0, Lol3;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Landroid/app/job/JobParameters;

    .line 40
    .line 41
    iget-object v0, v0, Lac3;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Landroid/app/Service;

    .line 44
    .line 45
    check-cast v0, Lvn3;

    .line 46
    .line 47
    invoke-interface {v0, p0}, Lvn3;->b(Landroid/app/job/JobParameters;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_1
    iget-object v0, p0, Lol3;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lmn3;

    .line 54
    .line 55
    iget-object v0, v0, Lmn3;->c:Lpn3;

    .line 56
    .line 57
    iput-object v2, v0, Lpn3;->d:Lcom/google/android/gms/measurement/internal/zzga;

    .line 58
    .line 59
    iget-object v1, p0, Lol3;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Lcom/google/android/gms/common/ConnectionResult;

    .line 62
    .line 63
    iget v1, v1, Lcom/google/android/gms/common/ConnectionResult;->b:I

    .line 64
    .line 65
    const/16 v4, 0x1e61

    .line 66
    .line 67
    if-ne v1, v4, :cond_1

    .line 68
    .line 69
    iget-object v1, v0, Lpn3;->i:Ljava/util/concurrent/ScheduledExecutorService;

    .line 70
    .line 71
    if-nez v1, :cond_0

    .line 72
    .line 73
    invoke-static {v3}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iput-object v1, v0, Lpn3;->i:Ljava/util/concurrent/ScheduledExecutorService;

    .line 78
    .line 79
    :cond_0
    iget-object v0, v0, Lpn3;->i:Ljava/util/concurrent/ScheduledExecutorService;

    .line 80
    .line 81
    new-instance v1, Lbb3;

    .line 82
    .line 83
    const/16 v3, 0x9

    .line 84
    .line 85
    invoke-direct {v1, p0, v3}, Lbb3;-><init>(Ljava/lang/Object;I)V

    .line 86
    .line 87
    .line 88
    sget-object p0, Lvg3;->Z:Lug3;

    .line 89
    .line 90
    invoke-virtual {p0, v2}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    check-cast p0, Ljava/lang/Long;

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 97
    .line 98
    .line 99
    move-result-wide v2

    .line 100
    sget-object p0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 101
    .line 102
    invoke-interface {v0, v1, v2, v3, p0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_1
    invoke-virtual {v0}, Lpn3;->O()V

    .line 107
    .line 108
    .line 109
    :goto_0
    return-void

    .line 110
    :pswitch_2
    iget-object v0, p0, Lol3;->c:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 113
    .line 114
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 115
    .line 116
    iget-object v2, v2, Lij3;->w:Lup3;

    .line 117
    .line 118
    invoke-static {v2}, Lij3;->j(Lsq3;)V

    .line 119
    .line 120
    .line 121
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 122
    .line 123
    iget-object v4, v0, Lij3;->j0:Ljava/lang/Boolean;

    .line 124
    .line 125
    if-eqz v4, :cond_2

    .line 126
    .line 127
    iget-object v0, v0, Lij3;->j0:Ljava/lang/Boolean;

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_2

    .line 134
    .line 135
    move v1, v3

    .line 136
    :cond_2
    iget-object p0, p0, Lol3;->b:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p0, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 139
    .line 140
    invoke-virtual {v2, p0, v1}, Lup3;->l0(Lcom/google/android/gms/internal/measurement/zzcu;Z)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :pswitch_3
    iget-object v0, p0, Lol3;->c:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, Lmn3;

    .line 147
    .line 148
    iget-object v0, v0, Lmn3;->c:Lpn3;

    .line 149
    .line 150
    iget-object p0, p0, Lol3;->b:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast p0, Landroid/content/ComponentName;

    .line 153
    .line 154
    invoke-virtual {v0, p0}, Lpn3;->K(Landroid/content/ComponentName;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :pswitch_4
    iget-object v0, p0, Lol3;->c:Ljava/lang/Object;

    .line 159
    .line 160
    move-object v1, v0

    .line 161
    check-cast v1, Lpn3;

    .line 162
    .line 163
    iget-object v2, v1, Lpn3;->d:Lcom/google/android/gms/measurement/internal/zzga;

    .line 164
    .line 165
    iget-object v0, v1, Lsq3;->a:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v0, Lij3;

    .line 168
    .line 169
    if-nez v2, :cond_3

    .line 170
    .line 171
    iget-object p0, v0, Lij3;->f:Luh3;

    .line 172
    .line 173
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 174
    .line 175
    .line 176
    iget-object p0, p0, Luh3;->f:Lsh3;

    .line 177
    .line 178
    const-string v0, "Failed to send current screen to service"

    .line 179
    .line 180
    invoke-virtual {p0, v0}, Lsh3;->a(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_3
    :try_start_0
    iget-object p0, p0, Lol3;->b:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast p0, Lbm3;

    .line 187
    .line 188
    if-nez p0, :cond_4

    .line 189
    .line 190
    iget-object p0, v0, Lij3;->a:Landroid/content/Context;

    .line 191
    .line 192
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    const-wide/16 v3, 0x0

    .line 197
    .line 198
    const/4 v5, 0x0

    .line 199
    const/4 v6, 0x0

    .line 200
    invoke-interface/range {v2 .. v7}, Lcom/google/android/gms/measurement/internal/zzga;->n(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :catch_0
    move-exception v0

    .line 205
    move-object p0, v0

    .line 206
    goto :goto_2

    .line 207
    :cond_4
    iget-wide v3, p0, Lbm3;->c:J

    .line 208
    .line 209
    iget-object v5, p0, Lbm3;->a:Ljava/lang/String;

    .line 210
    .line 211
    iget-object v6, p0, Lbm3;->b:Ljava/lang/String;

    .line 212
    .line 213
    iget-object p0, v0, Lij3;->a:Landroid/content/Context;

    .line 214
    .line 215
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    invoke-interface/range {v2 .. v7}, Lcom/google/android/gms/measurement/internal/zzga;->n(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    :goto_1
    invoke-virtual {v1}, Lpn3;->M()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 223
    .line 224
    .line 225
    goto :goto_3

    .line 226
    :goto_2
    iget-object v0, v1, Lsq3;->a:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, Lij3;

    .line 229
    .line 230
    iget-object v0, v0, Lij3;->f:Luh3;

    .line 231
    .line 232
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 233
    .line 234
    .line 235
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 236
    .line 237
    const-string v1, "Failed to send current screen to the service"

    .line 238
    .line 239
    invoke-virtual {v0, p0, v1}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    :goto_3
    return-void

    .line 243
    :pswitch_5
    iget-object v0, p0, Lol3;->c:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 246
    .line 247
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 248
    .line 249
    iget-object v0, v0, Lij3;->X:Lsl3;

    .line 250
    .line 251
    invoke-static {v0}, Lij3;->k(Lwg3;)V

    .line 252
    .line 253
    .line 254
    iget-object p0, p0, Lol3;->b:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast p0, Lwe2;

    .line 257
    .line 258
    invoke-virtual {v0}, Leg3;->y()V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0}, Lwg3;->A()V

    .line 262
    .line 263
    .line 264
    iget-object v2, v0, Lsl3;->d:Lqk3;

    .line 265
    .line 266
    if-eq p0, v2, :cond_6

    .line 267
    .line 268
    if-nez v2, :cond_5

    .line 269
    .line 270
    move v1, v3

    .line 271
    :cond_5
    const-string v2, "EventInterceptor already set."

    .line 272
    .line 273
    invoke-static {v2, v1}, Lkb1;->p(Ljava/lang/String;Z)V

    .line 274
    .line 275
    .line 276
    :cond_6
    iput-object p0, v0, Lsl3;->d:Lqk3;

    .line 277
    .line 278
    return-void

    .line 279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
