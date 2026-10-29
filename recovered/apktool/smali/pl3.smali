.class public final synthetic Lpl3;
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

    .line 12
    iput p1, p0, Lpl3;->a:I

    iput-object p2, p0, Lpl3;->b:Ljava/lang/Object;

    iput-object p3, p0, Lpl3;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lac3;Lmp3;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    const/4 p1, 0x3

    .line 2
    iput p1, p0, Lpl3;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lpl3;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Lpl3;->c:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lpl3;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lpl3;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lej;

    .line 10
    .line 11
    iget-object p0, p0, Lpl3;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lkj;

    .line 14
    .line 15
    iget-object v2, v0, Lej;->e:Lu93;

    .line 16
    .line 17
    iget-object v2, v2, Lu93;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Ltz1;

    .line 20
    .line 21
    iget-object v0, v0, Lej;->e:Lu93;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    iget-object v0, v0, Lu93;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ltz1;

    .line 28
    .line 29
    invoke-interface {v0, p0, v1}, Ltz1;->e(Lkj;Ljava/util/List;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-string p0, "BillingClient"

    .line 34
    .line 35
    const-string v0, "No valid listener is set in BroadcastManager"

    .line 36
    .line 37
    invoke-static {p0, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    return-void

    .line 41
    :pswitch_0
    iget-object v0, p0, Lpl3;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lmp3;

    .line 44
    .line 45
    invoke-virtual {v0}, Lmp3;->A()V

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Lpl3;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Ljava/lang/Runnable;

    .line 51
    .line 52
    invoke-virtual {v0}, Lmp3;->b()Lbj3;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Lbj3;->y()V

    .line 57
    .line 58
    .line 59
    iget-object v1, v0, Lmp3;->a0:Ljava/util/ArrayList;

    .line 60
    .line 61
    if-nez v1, :cond_1

    .line 62
    .line 63
    new-instance v1, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object v1, v0, Lmp3;->a0:Ljava/util/ArrayList;

    .line 69
    .line 70
    :cond_1
    iget-object v1, v0, Lmp3;->a0:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lmp3;->q()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_1
    iget-object v0, p0, Lpl3;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Lgp3;

    .line 82
    .line 83
    iget-object p0, p0, Lpl3;->c:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p0, Lvq3;

    .line 86
    .line 87
    iget p0, p0, Lvq3;->a:I

    .line 88
    .line 89
    const-string v2, "Timing out request: "

    .line 90
    .line 91
    monitor-enter v0

    .line 92
    :try_start_0
    iget-object v3, v0, Lgp3;->e:Landroid/util/SparseArray;

    .line 93
    .line 94
    invoke-virtual {v3, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    check-cast v3, Lvq3;

    .line 99
    .line 100
    if-eqz v3, :cond_2

    .line 101
    .line 102
    new-instance v4, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    const-string v4, "MessengerIpcClient"

    .line 115
    .line 116
    invoke-static {v4, v2}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    iget-object v2, v0, Lgp3;->e:Landroid/util/SparseArray;

    .line 120
    .line 121
    invoke-virtual {v2, p0}, Landroid/util/SparseArray;->remove(I)V

    .line 122
    .line 123
    .line 124
    const-string p0, "Timed out waiting for response"

    .line 125
    .line 126
    new-instance v2, Llp;

    .line 127
    .line 128
    const/4 v4, 0x7

    .line 129
    invoke-direct {v2, p0, v4, v1}, Llp;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, v2}, Lvq3;->b(Llp;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Lgp3;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    .line 137
    .line 138
    :cond_2
    monitor-exit v0

    .line 139
    goto :goto_1

    .line 140
    :catchall_0
    move-exception p0

    .line 141
    goto :goto_2

    .line 142
    :goto_1
    return-void

    .line 143
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 144
    throw p0

    .line 145
    :pswitch_2
    iget-object v0, p0, Lpl3;->b:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, Lsl3;

    .line 148
    .line 149
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, Lij3;

    .line 152
    .line 153
    invoke-virtual {v0}, Lij3;->q()Lih3;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    iget-object p0, p0, Lpl3;->c:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p0, Ljava/lang/String;

    .line 160
    .line 161
    iget-object v2, v1, Lih3;->b0:Ljava/lang/String;

    .line 162
    .line 163
    const/4 v3, 0x0

    .line 164
    if-eqz v2, :cond_3

    .line 165
    .line 166
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-nez v2, :cond_3

    .line 171
    .line 172
    const/4 v3, 0x1

    .line 173
    :cond_3
    iput-object p0, v1, Lih3;->b0:Ljava/lang/String;

    .line 174
    .line 175
    if-eqz v3, :cond_4

    .line 176
    .line 177
    invoke-virtual {v0}, Lij3;->q()Lih3;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    invoke-virtual {p0}, Lih3;->E()V

    .line 182
    .line 183
    .line 184
    :cond_4
    return-void

    .line 185
    :pswitch_3
    iget-object v0, p0, Lpl3;->b:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v0, Lsl3;

    .line 188
    .line 189
    invoke-virtual {v0}, Leg3;->y()V

    .line 190
    .line 191
    .line 192
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 193
    .line 194
    const/16 v2, 0x1e

    .line 195
    .line 196
    if-ge v1, v2, :cond_5

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_5
    iget-object p0, p0, Lpl3;->c:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast p0, Ljava/util/List;

    .line 202
    .line 203
    iget-object v1, v0, Lsq3;->a:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v1, Lij3;

    .line 206
    .line 207
    iget-object v1, v1, Lij3;->e:Lki3;

    .line 208
    .line 209
    invoke-static {v1}, Lij3;->j(Lsq3;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1}, Lki3;->F()Landroid/util/SparseArray;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    :cond_6
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-eqz v2, :cond_8

    .line 225
    .line 226
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzog;

    .line 231
    .line 232
    iget v3, v2, Lcom/google/android/gms/measurement/internal/zzog;->c:I

    .line 233
    .line 234
    invoke-static {v1, v3}, Lk83;->e(Landroid/util/SparseArray;I)Z

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    if-eqz v4, :cond_7

    .line 239
    .line 240
    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    check-cast v3, Ljava/lang/Long;

    .line 245
    .line 246
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 247
    .line 248
    .line 249
    move-result-wide v3

    .line 250
    iget-wide v5, v2, Lcom/google/android/gms/measurement/internal/zzog;->b:J

    .line 251
    .line 252
    cmp-long v3, v3, v5

    .line 253
    .line 254
    if-gez v3, :cond_6

    .line 255
    .line 256
    :cond_7
    invoke-virtual {v0}, Lsl3;->W()Ljava/util/PriorityQueue;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    invoke-virtual {v3, v2}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_8
    invoke-virtual {v0}, Lsl3;->X()V

    .line 265
    .line 266
    .line 267
    :goto_4
    return-void

    .line 268
    nop

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
