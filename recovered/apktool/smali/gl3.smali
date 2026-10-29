.class public final Lgl3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:Lsl3;


# direct methods
.method public constructor <init>(Lsl3;Ljava/util/concurrent/atomic/AtomicReference;I)V
    .locals 0

    .line 1
    iput p3, p0, Lgl3;->a:I

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lgl3;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lgl3;->c:Lsl3;

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lgl3;->c:Lsl3;

    .line 21
    .line 22
    iput-object p2, p0, Lgl3;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p2, p0, Lgl3;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 29
    .line 30
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lgl3;->c:Lsl3;

    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p2, p0, Lgl3;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 40
    .line 41
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lgl3;->c:Lsl3;

    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lgl3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lgl3;->c:Lsl3;

    .line 7
    .line 8
    iget-object v1, v0, Lsq3;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lij3;

    .line 11
    .line 12
    iget-object v1, v1, Lij3;->e:Lki3;

    .line 13
    .line 14
    invoke-static {v1}, Lij3;->j(Lsq3;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, v1, Lki3;->Y:Lra2;

    .line 18
    .line 19
    invoke-virtual {v1}, Lra2;->x()Landroid/os/Bundle;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lij3;

    .line 26
    .line 27
    invoke-virtual {v0}, Lij3;->o()Lpn3;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget-object v4, p0, Lgl3;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 32
    .line 33
    invoke-virtual {v3}, Leg3;->y()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Lwg3;->A()V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    invoke-virtual {v3, p0}, Lpn3;->P(Z)Lcom/google/android/gms/measurement/internal/zzr;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    new-instance v2, Lur;

    .line 45
    .line 46
    const/16 v7, 0x8

    .line 47
    .line 48
    const/4 v8, 0x0

    .line 49
    invoke-direct/range {v2 .. v8}, Lur;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v2}, Lpn3;->N(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_0
    iget-object v1, p0, Lgl3;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 57
    .line 58
    monitor-enter v1

    .line 59
    :try_start_0
    iget-object v0, p0, Lgl3;->c:Lsl3;

    .line 60
    .line 61
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Lij3;

    .line 64
    .line 65
    iget-object v2, v0, Lij3;->d:Lpd3;

    .line 66
    .line 67
    invoke-virtual {v0}, Lij3;->q()Lih3;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Lih3;->F()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sget-object v3, Lvg3;->d0:Lug3;

    .line 76
    .line 77
    invoke-virtual {v2, v0, v3}, Lpd3;->H(Ljava/lang/String;Lug3;)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 86
    .line 87
    .line 88
    :try_start_1
    iget-object p0, p0, Lgl3;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 91
    .line 92
    .line 93
    monitor-exit v1

    .line 94
    return-void

    .line 95
    :catchall_0
    move-exception v0

    .line 96
    move-object p0, v0

    .line 97
    goto :goto_0

    .line 98
    :catchall_1
    move-exception v0

    .line 99
    iget-object p0, p0, Lgl3;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 102
    .line 103
    .line 104
    throw v0

    .line 105
    :goto_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    throw p0

    .line 107
    :pswitch_1
    iget-object v1, p0, Lgl3;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 108
    .line 109
    monitor-enter v1

    .line 110
    :try_start_2
    iget-object v0, p0, Lgl3;->c:Lsl3;

    .line 111
    .line 112
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v0, Lij3;

    .line 115
    .line 116
    iget-object v2, v0, Lij3;->d:Lpd3;

    .line 117
    .line 118
    invoke-virtual {v0}, Lij3;->q()Lih3;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v0}, Lih3;->F()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    sget-object v3, Lvg3;->b0:Lug3;

    .line 127
    .line 128
    invoke-virtual {v2, v0, v3}, Lpd3;->F(Ljava/lang/String;Lug3;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 133
    .line 134
    .line 135
    :try_start_3
    iget-object p0, p0, Lgl3;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 136
    .line 137
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 138
    .line 139
    .line 140
    monitor-exit v1

    .line 141
    return-void

    .line 142
    :catchall_2
    move-exception v0

    .line 143
    move-object p0, v0

    .line 144
    goto :goto_1

    .line 145
    :catchall_3
    move-exception v0

    .line 146
    iget-object p0, p0, Lgl3;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 147
    .line 148
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 149
    .line 150
    .line 151
    throw v0

    .line 152
    :goto_1
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 153
    throw p0

    .line 154
    :pswitch_2
    iget-object v1, p0, Lgl3;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 155
    .line 156
    monitor-enter v1

    .line 157
    :try_start_4
    iget-object v0, p0, Lgl3;->c:Lsl3;

    .line 158
    .line 159
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v0, Lij3;

    .line 162
    .line 163
    iget-object v2, v0, Lij3;->d:Lpd3;

    .line 164
    .line 165
    invoke-virtual {v0}, Lij3;->q()Lih3;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v0}, Lih3;->F()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    sget-object v3, Lvg3;->a0:Lug3;

    .line 174
    .line 175
    invoke-virtual {v2, v0, v3}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 184
    .line 185
    .line 186
    :try_start_5
    iget-object p0, p0, Lgl3;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 187
    .line 188
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 189
    .line 190
    .line 191
    monitor-exit v1

    .line 192
    return-void

    .line 193
    :catchall_4
    move-exception v0

    .line 194
    move-object p0, v0

    .line 195
    goto :goto_2

    .line 196
    :catchall_5
    move-exception v0

    .line 197
    iget-object p0, p0, Lgl3;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 198
    .line 199
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 200
    .line 201
    .line 202
    throw v0

    .line 203
    :goto_2
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 204
    throw p0

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
