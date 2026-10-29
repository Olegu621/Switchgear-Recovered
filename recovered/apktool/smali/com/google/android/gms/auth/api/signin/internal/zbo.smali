.class public abstract Lcom/google/android/gms/auth/api/signin/internal/zbo;
.super Lcom/google/android/gms/internal/auth-api/zbb;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/gms/auth/api/signin/internal/zbp;


# virtual methods
.method public final zba(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 5

    .line 1
    const/4 p2, 0x0

    .line 2
    const/4 p3, 0x1

    .line 3
    if-eq p1, p3, :cond_1

    .line 4
    .line 5
    const/4 p4, 0x2

    .line 6
    if-eq p1, p4, :cond_0

    .line 7
    .line 8
    return p2

    .line 9
    :cond_0
    check-cast p0, Lcom/google/android/gms/auth/api/signin/internal/zbt;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/gms/auth/api/signin/internal/zbt;->a()V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lcom/google/android/gms/auth/api/signin/internal/zbt;->a:Lcom/google/android/gms/auth/api/signin/RevocationBoundService;

    .line 15
    .line 16
    invoke-static {p0}, Lqc3;->m(Landroid/content/Context;)Lqc3;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Lqc3;->n()V

    .line 21
    .line 22
    .line 23
    return p3

    .line 24
    :cond_1
    check-cast p0, Lcom/google/android/gms/auth/api/signin/internal/zbt;

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/google/android/gms/auth/api/signin/internal/zbt;->a()V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lcom/google/android/gms/auth/api/signin/internal/zbt;->a:Lcom/google/android/gms/auth/api/signin/RevocationBoundService;

    .line 30
    .line 31
    invoke-static {p0}, Leh2;->a(Landroid/content/Context;)Leh2;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Leh2;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 36
    .line 37
    .line 38
    move-result-object p4

    .line 39
    sget-object v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->V:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    if-eqz p4, :cond_4

    .line 43
    .line 44
    const-string v0, "defaultGoogleSignInAccount"

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Leh2;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    const-string v2, "googleSignInOptions"

    .line 58
    .line 59
    invoke-static {v2, v0}, Leh2;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p1, v0}, Leh2;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->D1(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 70
    .line 71
    .line 72
    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    move-object v0, p1

    .line 74
    goto :goto_1

    .line 75
    :catch_0
    :cond_3
    :goto_0
    move-object v0, v1

    .line 76
    :cond_4
    :goto_1
    new-instance p1, Lfc3;

    .line 77
    .line 78
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    sget-object v2, Lce;->b:Lh9;

    .line 82
    .line 83
    new-instance v3, Lxt0;

    .line 84
    .line 85
    const/16 v4, 0x10

    .line 86
    .line 87
    invoke-direct {v3, v4}, Lxt0;-><init>(I)V

    .line 88
    .line 89
    .line 90
    invoke-direct {p1, p0, v2, v0, v3}, Lor0;-><init>(Landroid/content/Context;Lh9;Lb9;Lxt0;)V

    .line 91
    .line 92
    .line 93
    if-eqz p4, :cond_9

    .line 94
    .line 95
    invoke-virtual {p1}, Lor0;->asGoogleApiClient()Ltr0;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p1}, Lor0;->getApplicationContext()Landroid/content/Context;

    .line 100
    .line 101
    .line 102
    move-result-object p4

    .line 103
    invoke-virtual {p1}, Lfc3;->d()I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    const/4 v0, 0x3

    .line 108
    if-ne p1, v0, :cond_5

    .line 109
    .line 110
    move p1, p3

    .line 111
    goto :goto_2

    .line 112
    :cond_5
    move p1, p2

    .line 113
    :goto_2
    sget-object v2, Lpc3;->a:Lha1;

    .line 114
    .line 115
    new-array p2, p2, [Ljava/lang/Object;

    .line 116
    .line 117
    iget v3, v2, Lha1;->c:I

    .line 118
    .line 119
    if-gt v3, v0, :cond_6

    .line 120
    .line 121
    const-string v0, "Revoking access"

    .line 122
    .line 123
    invoke-virtual {v2, v0, p2}, Lha1;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    :cond_6
    invoke-static {p4}, Leh2;->a(Landroid/content/Context;)Leh2;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    const-string v0, "refreshToken"

    .line 131
    .line 132
    invoke-virtual {p2, v0}, Leh2;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    invoke-static {p4}, Lpc3;->a(Landroid/content/Context;)V

    .line 137
    .line 138
    .line 139
    if-eqz p1, :cond_8

    .line 140
    .line 141
    if-nez p2, :cond_7

    .line 142
    .line 143
    sget-object p0, Ljc3;->c:Lha1;

    .line 144
    .line 145
    new-instance p0, Lcom/google/android/gms/common/api/Status;

    .line 146
    .line 147
    const/4 p1, 0x4

    .line 148
    invoke-direct {p0, p1, v1, v1, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/Status;->D1()Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    xor-int/2addr p1, p3

    .line 156
    const-string p2, "Status code must not be SUCCESS"

    .line 157
    .line 158
    invoke-static {p2, p1}, Lkb1;->f(Ljava/lang/String;Z)V

    .line 159
    .line 160
    .line 161
    new-instance p1, Lzb3;

    .line 162
    .line 163
    invoke-direct {p1, p0}, Lzb3;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lp42;)V

    .line 167
    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_7
    new-instance p0, Ljc3;

    .line 171
    .line 172
    invoke-direct {p0, p2}, Ljc3;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    new-instance p1, Ljava/lang/Thread;

    .line 176
    .line 177
    invoke-direct {p1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 181
    .line 182
    .line 183
    iget-object p1, p0, Ljc3;->b:Lzg2;

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_8
    new-instance p1, Loc3;

    .line 187
    .line 188
    invoke-direct {p1, p0, p3}, Loc3;-><init>(Ltr0;I)V

    .line 189
    .line 190
    .line 191
    check-cast p0, Leb3;

    .line 192
    .line 193
    iget-object p0, p0, Leb3;->b:Lor0;

    .line 194
    .line 195
    invoke-virtual {p0, p1}, Lor0;->doWrite(Lgi;)Lgi;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    :goto_3
    new-instance p0, Lp62;

    .line 200
    .line 201
    const/16 p2, 0xb

    .line 202
    .line 203
    invoke-direct {p0, p2}, Lp62;-><init>(I)V

    .line 204
    .line 205
    .line 206
    new-instance p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 207
    .line 208
    invoke-direct {p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 209
    .line 210
    .line 211
    new-instance p4, Lhc3;

    .line 212
    .line 213
    invoke-direct {p4, p1, p2, p0}, Lhc3;-><init>(Lsr1;Lcom/google/android/gms/tasks/TaskCompletionSource;Ltr1;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p1, p4}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->addStatusListener(Lrr1;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 220
    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_9
    invoke-virtual {p1}, Lfc3;->signOut()Lcom/google/android/gms/tasks/Task;

    .line 224
    .line 225
    .line 226
    :goto_4
    return p3
.end method
