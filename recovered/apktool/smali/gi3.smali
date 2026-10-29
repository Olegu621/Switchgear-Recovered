.class public final Lgi3;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:Z

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lmp3;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lgi3;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lgi3;->d:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lu93;Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lgi3;->a:I

    .line 13
    iput-object p1, p0, Lgi3;->d:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    iput-boolean p2, p0, Lgi3;->c:Z

    return-void
.end method


# virtual methods
.method public declared-synchronized a(Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lgi3;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v1, 0x21

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-lt v0, v1, :cond_2

    .line 14
    .line 15
    iget-boolean v0, p0, Lgi3;->c:Z

    .line 16
    .line 17
    if-eq v2, v0, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v0, 0x2

    .line 22
    :goto_0
    invoke-static {p1, p0, p2, v0}, Lho2;->f(Landroid/content/Context;Lgi3;Landroid/content/IntentFilter;I)V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_2

    .line 28
    :cond_2
    invoke-virtual {p1, p0, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 29
    .line 30
    .line 31
    :goto_1
    iput-boolean v2, p0, Lgi3;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    monitor-exit p0

    .line 34
    return-void

    .line 35
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 36
    throw p1
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lgi3;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmp3;

    .line 4
    .line 5
    invoke-virtual {v0}, Lmp3;->k0()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lmp3;->b()Lbj3;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Lbj3;->y()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lmp3;->b()Lbj3;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Lbj3;->y()V

    .line 20
    .line 21
    .line 22
    iget-boolean v1, p0, Lgi3;->b:Z

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-virtual {v0}, Lmp3;->a()Luh3;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v1, v1, Luh3;->Y:Lsh3;

    .line 32
    .line 33
    const-string v2, "Unregistering connectivity change receiver"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Lsh3;->a(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    iput-boolean v1, p0, Lgi3;->b:Z

    .line 40
    .line 41
    iput-boolean v1, p0, Lgi3;->c:Z

    .line 42
    .line 43
    iget-object v1, v0, Lmp3;->W:Lij3;

    .line 44
    .line 45
    iget-object v1, v1, Lij3;->a:Landroid/content/Context;

    .line 46
    .line 47
    :try_start_0
    invoke-virtual {v1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catch_0
    move-exception p0

    .line 52
    invoke-virtual {v0}, Lmp3;->a()Luh3;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 57
    .line 58
    const-string v1, "Failed to unregister the network broadcast receiver"

    .line 59
    .line 60
    invoke-virtual {v0, p0, v1}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public declared-synchronized c(Landroid/content/Context;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lgi3;->b:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lgi3;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    :try_start_1
    const-string p1, "BillingBroadcastManager"

    .line 17
    .line 18
    const-string v0, "Receiver is not registered."

    .line 19
    .line 20
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 26
    throw p1
.end method

.method public d(Landroid/os/Bundle;Lkj;I)V
    .locals 2

    .line 1
    const-string v0, "FAILURE_LOGGING_PAYLOAD"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object p0, p0, Lgi3;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lu93;

    .line 10
    .line 11
    iget-object p0, p0, Lu93;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljf3;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    :try_start_1
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzgw;->zza()Lcom/google/android/gms/internal/play_billing/zzgw;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/play_billing/zzjz;->zzC([BLcom/google/android/gms/internal/play_billing/zzgw;)Lcom/google/android/gms/internal/play_billing/zzjz;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p0, Lwe2;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lwe2;->t(Lcom/google/android/gms/internal/play_billing/zzjz;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    const/16 p1, 0x17

    .line 36
    .line 37
    invoke-static {p1, p3, p2}, Lif3;->b(IILkj;)Lcom/google/android/gms/internal/play_billing/zzjz;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p0, Lwe2;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lwe2;->t(Lcom/google/android/gms/internal/play_billing/zzjz;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :catchall_0
    const-string p0, "BillingBroadcastManager"

    .line 48
    .line 49
    const-string p1, "Failed parsing Api failure."

    .line 50
    .line 51
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 1
    iget p1, p0, Lgi3;->a:I

    .line 2
    .line 3
    iget-object v0, p0, Lgi3;->d:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v0, Lu93;

    .line 9
    .line 10
    iget-object p1, v0, Lu93;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Ljf3;

    .line 13
    .line 14
    iget-object v0, v0, Lu93;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ltz1;

    .line 17
    .line 18
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x1

    .line 23
    const-string v3, "BillingBroadcastManager"

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    const-string p0, "Bundle is null."

    .line 28
    .line 29
    invoke-static {v3, p0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkf3;->h:Lkj;

    .line 33
    .line 34
    const/16 p2, 0xb

    .line 35
    .line 36
    invoke-static {p2, v2, p0}, Lif3;->b(IILkj;)Lcom/google/android/gms/internal/play_billing/zzjz;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    check-cast p1, Lwe2;

    .line 41
    .line 42
    invoke-virtual {p1, p2}, Lwe2;->t(Lcom/google/android/gms/internal/play_billing/zzjz;)V

    .line 43
    .line 44
    .line 45
    if-eqz v0, :cond_6

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    invoke-interface {v0, p0, p1}, Ltz1;->e(Lkj;Ljava/util/List;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :cond_0
    invoke-static {p2, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzf(Landroid/content/Intent;Ljava/lang/String;)Lkj;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    const-string v5, "INTENT_SOURCE"

    .line 62
    .line 63
    invoke-virtual {v1, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    const-string v6, "LAUNCH_BILLING_FLOW"

    .line 68
    .line 69
    invoke-static {v5, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eq v2, v5, :cond_1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    const/4 v2, 0x2

    .line 77
    :goto_0
    const-string v5, "com.android.vending.billing.PURCHASES_UPDATED"

    .line 78
    .line 79
    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-nez v5, :cond_4

    .line 84
    .line 85
    const-string v5, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED"

    .line 86
    .line 87
    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_2

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    const-string v5, "com.android.vending.billing.ALTERNATIVE_BILLING"

    .line 95
    .line 96
    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    if-eqz p2, :cond_6

    .line 101
    .line 102
    iget p2, v4, Lkj;->a:I

    .line 103
    .line 104
    if-eqz p2, :cond_3

    .line 105
    .line 106
    invoke-virtual {p0, v1, v4, v2}, Lgi3;->d(Landroid/os/Bundle;Lkj;I)V

    .line 107
    .line 108
    .line 109
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzco;->zzl()Lcom/google/android/gms/internal/play_billing/zzco;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-interface {v0, v4, p0}, Ltz1;->e(Lkj;Ljava/util/List;)V

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_3
    const-string p0, "AlternativeBillingListener and UserChoiceBillingListener is null."

    .line 118
    .line 119
    invoke-static {v3, p0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    sget-object p0, Lkf3;->h:Lkj;

    .line 123
    .line 124
    const/16 p2, 0x4d

    .line 125
    .line 126
    invoke-static {p2, v2, p0}, Lif3;->b(IILkj;)Lcom/google/android/gms/internal/play_billing/zzjz;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    check-cast p1, Lwe2;

    .line 131
    .line 132
    invoke-virtual {p1, p2}, Lwe2;->t(Lcom/google/android/gms/internal/play_billing/zzjz;)V

    .line 133
    .line 134
    .line 135
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzco;->zzl()Lcom/google/android/gms/internal/play_billing/zzco;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-interface {v0, p0, p1}, Ltz1;->e(Lkj;Ljava/util/List;)V

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_4
    :goto_1
    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/zze;->zzj(Landroid/os/Bundle;)Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    iget v3, v4, Lkj;->a:I

    .line 148
    .line 149
    if-nez v3, :cond_5

    .line 150
    .line 151
    invoke-static {v2}, Lif3;->d(I)Lcom/google/android/gms/internal/play_billing/zzkd;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    check-cast p1, Lwe2;

    .line 156
    .line 157
    invoke-virtual {p1, p0}, Lwe2;->v(Lcom/google/android/gms/internal/play_billing/zzkd;)V

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_5
    invoke-virtual {p0, v1, v4, v2}, Lgi3;->d(Landroid/os/Bundle;Lkj;I)V

    .line 162
    .line 163
    .line 164
    :goto_2
    invoke-interface {v0, v4, p2}, Ltz1;->e(Lkj;Ljava/util/List;)V

    .line 165
    .line 166
    .line 167
    :cond_6
    :goto_3
    return-void

    .line 168
    :pswitch_0
    check-cast v0, Lmp3;

    .line 169
    .line 170
    invoke-virtual {v0}, Lmp3;->k0()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-virtual {v0}, Lmp3;->a()Luh3;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    iget-object p2, p2, Luh3;->Y:Lsh3;

    .line 182
    .line 183
    const-string v1, "NetworkBroadcastReceiver received action"

    .line 184
    .line 185
    invoke-virtual {p2, p1, v1}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    const-string p2, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 189
    .line 190
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result p2

    .line 194
    if-eqz p2, :cond_7

    .line 195
    .line 196
    iget-object p1, v0, Lmp3;->b:Lci3;

    .line 197
    .line 198
    invoke-static {p1}, Lmp3;->S(Lwo3;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1}, Lci3;->T()Z

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    iget-boolean p2, p0, Lgi3;->c:Z

    .line 206
    .line 207
    if-eq p2, p1, :cond_8

    .line 208
    .line 209
    iput-boolean p1, p0, Lgi3;->c:Z

    .line 210
    .line 211
    invoke-virtual {v0}, Lmp3;->b()Lbj3;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    new-instance v0, Lbb3;

    .line 216
    .line 217
    invoke-direct {v0, p0, p1}, Lbb3;-><init>(Lgi3;Z)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p2, v0}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 221
    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_7
    invoke-virtual {v0}, Lmp3;->a()Luh3;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    iget-object p0, p0, Luh3;->w:Lsh3;

    .line 229
    .line 230
    const-string p2, "NetworkBroadcastReceiver received unknown action"

    .line 231
    .line 232
    invoke-virtual {p0, p1, p2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    :cond_8
    :goto_4
    return-void

    .line 236
    nop

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
