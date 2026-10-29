.class public final Ltn3;
.super Lwo3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final U:Lio/sentry/android/core/s;

.field public final d:Ljava/util/HashMap;

.field public final e:Lio/sentry/android/core/s;

.field public final f:Lio/sentry/android/core/s;

.field public final i:Lio/sentry/android/core/s;

.field public final v:Lio/sentry/android/core/s;

.field public final w:Lio/sentry/android/core/s;


# direct methods
.method public constructor <init>(Lmp3;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lwo3;-><init>(Lmp3;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ltn3;->d:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance p1, Lio/sentry/android/core/s;

    .line 12
    .line 13
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lij3;

    .line 16
    .line 17
    iget-object v0, v0, Lij3;->e:Lki3;

    .line 18
    .line 19
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 20
    .line 21
    .line 22
    const-string v1, "last_delete_stale"

    .line 23
    .line 24
    const-wide/16 v2, 0x0

    .line 25
    .line 26
    invoke-direct {p1, v0, v1, v2, v3}, Lio/sentry/android/core/s;-><init>(Lki3;Ljava/lang/String;J)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Ltn3;->e:Lio/sentry/android/core/s;

    .line 30
    .line 31
    new-instance p1, Lio/sentry/android/core/s;

    .line 32
    .line 33
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lij3;

    .line 36
    .line 37
    iget-object v0, v0, Lij3;->e:Lki3;

    .line 38
    .line 39
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 40
    .line 41
    .line 42
    const-string v1, "last_delete_stale_batch"

    .line 43
    .line 44
    invoke-direct {p1, v0, v1, v2, v3}, Lio/sentry/android/core/s;-><init>(Lki3;Ljava/lang/String;J)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Ltn3;->f:Lio/sentry/android/core/s;

    .line 48
    .line 49
    new-instance p1, Lio/sentry/android/core/s;

    .line 50
    .line 51
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lij3;

    .line 54
    .line 55
    iget-object v0, v0, Lij3;->e:Lki3;

    .line 56
    .line 57
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 58
    .line 59
    .line 60
    const-string v1, "backoff"

    .line 61
    .line 62
    invoke-direct {p1, v0, v1, v2, v3}, Lio/sentry/android/core/s;-><init>(Lki3;Ljava/lang/String;J)V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Ltn3;->i:Lio/sentry/android/core/s;

    .line 66
    .line 67
    new-instance p1, Lio/sentry/android/core/s;

    .line 68
    .line 69
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Lij3;

    .line 72
    .line 73
    iget-object v0, v0, Lij3;->e:Lki3;

    .line 74
    .line 75
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 76
    .line 77
    .line 78
    const-string v1, "last_upload"

    .line 79
    .line 80
    invoke-direct {p1, v0, v1, v2, v3}, Lio/sentry/android/core/s;-><init>(Lki3;Ljava/lang/String;J)V

    .line 81
    .line 82
    .line 83
    iput-object p1, p0, Ltn3;->v:Lio/sentry/android/core/s;

    .line 84
    .line 85
    new-instance p1, Lio/sentry/android/core/s;

    .line 86
    .line 87
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Lij3;

    .line 90
    .line 91
    iget-object v0, v0, Lij3;->e:Lki3;

    .line 92
    .line 93
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 94
    .line 95
    .line 96
    const-string v1, "last_upload_attempt"

    .line 97
    .line 98
    invoke-direct {p1, v0, v1, v2, v3}, Lio/sentry/android/core/s;-><init>(Lki3;Ljava/lang/String;J)V

    .line 99
    .line 100
    .line 101
    iput-object p1, p0, Ltn3;->w:Lio/sentry/android/core/s;

    .line 102
    .line 103
    new-instance p1, Lio/sentry/android/core/s;

    .line 104
    .line 105
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Lij3;

    .line 108
    .line 109
    iget-object v0, v0, Lij3;->e:Lki3;

    .line 110
    .line 111
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 112
    .line 113
    .line 114
    const-string v1, "midnight_offset"

    .line 115
    .line 116
    invoke-direct {p1, v0, v1, v2, v3}, Lio/sentry/android/core/s;-><init>(Lki3;Ljava/lang/String;J)V

    .line 117
    .line 118
    .line 119
    iput-object p1, p0, Ltn3;->U:Lio/sentry/android/core/s;

    .line 120
    .line 121
    return-void
.end method


# virtual methods
.method public final C()V
    .locals 0

    .line 1
    return-void
.end method

.method public final D(Ljava/lang/String;)Landroid/util/Pair;
    .locals 14

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-virtual {p0}, Lsq3;->y()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lsq3;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lij3;

    .line 9
    .line 10
    iget-object v2, v1, Lij3;->V:Lxt0;

    .line 11
    .line 12
    iget-object v3, v1, Lij3;->d:Lpd3;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    iget-object p0, p0, Ltn3;->d:Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lrn3;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    iget-wide v6, v2, Lrn3;->c:J

    .line 32
    .line 33
    cmp-long v6, v4, v6

    .line 34
    .line 35
    if-ltz v6, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object p0, v2, Lrn3;->a:Ljava/lang/String;

    .line 39
    .line 40
    iget-boolean p1, v2, Lrn3;->b:Z

    .line 41
    .line 42
    new-instance v0, Landroid/util/Pair;

    .line 43
    .line 44
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {v0, p0, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_1
    :goto_0
    const/4 v6, 0x1

    .line 53
    invoke-static {v6}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->setShouldSkipGmsCoreVersionCheck(Z)V

    .line 54
    .line 55
    .line 56
    sget-object v6, Lvg3;->b:Lug3;

    .line 57
    .line 58
    invoke-virtual {v3, p1, v6}, Lpd3;->G(Ljava/lang/String;Lug3;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v6

    .line 62
    add-long/2addr v6, v4

    .line 63
    const/4 v8, 0x0

    .line 64
    :try_start_0
    iget-object v9, v1, Lij3;->a:Landroid/content/Context;

    .line 65
    .line 66
    invoke-static {v9}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    .line 67
    .line 68
    .line 69
    move-result-object v2
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    goto :goto_1

    .line 71
    :catch_0
    move-exception v2

    .line 72
    goto :goto_2

    .line 73
    :catch_1
    const/4 v9, 0x0

    .line 74
    if-eqz v2, :cond_2

    .line 75
    .line 76
    :try_start_1
    iget-wide v10, v2, Lrn3;->c:J

    .line 77
    .line 78
    sget-object v12, Lvg3;->c:Lug3;

    .line 79
    .line 80
    invoke-virtual {v3, p1, v12}, Lpd3;->G(Ljava/lang/String;Lug3;)J

    .line 81
    .line 82
    .line 83
    move-result-wide v12

    .line 84
    add-long/2addr v10, v12

    .line 85
    cmp-long v3, v4, v10

    .line 86
    .line 87
    if-gez v3, :cond_2

    .line 88
    .line 89
    new-instance v3, Landroid/util/Pair;

    .line 90
    .line 91
    iget-object v4, v2, Lrn3;->a:Ljava/lang/String;

    .line 92
    .line 93
    iget-boolean v2, v2, Lrn3;->b:Z

    .line 94
    .line 95
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-direct {v3, v4, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return-object v3

    .line 103
    :cond_2
    move-object v2, v9

    .line 104
    :goto_1
    if-nez v2, :cond_3

    .line 105
    .line 106
    new-instance v2, Landroid/util/Pair;

    .line 107
    .line 108
    const-string v3, "00000000-0000-0000-0000-000000000000"

    .line 109
    .line 110
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 111
    .line 112
    invoke-direct {v2, v3, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    return-object v2

    .line 116
    :cond_3
    invoke-virtual {v2}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    if-eqz v3, :cond_4

    .line 121
    .line 122
    new-instance v4, Lrn3;

    .line 123
    .line 124
    invoke-virtual {v2}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    invoke-direct {v4, v3, v6, v7, v2}, Lrn3;-><init>(Ljava/lang/String;JZ)V

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_4
    new-instance v4, Lrn3;

    .line 133
    .line 134
    invoke-virtual {v2}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    invoke-direct {v4, v0, v6, v7, v2}, Lrn3;-><init>(Ljava/lang/String;JZ)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :goto_2
    iget-object v1, v1, Lij3;->f:Luh3;

    .line 143
    .line 144
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 145
    .line 146
    .line 147
    iget-object v1, v1, Luh3;->X:Lsh3;

    .line 148
    .line 149
    const-string v3, "Unable to get advertising id"

    .line 150
    .line 151
    invoke-virtual {v1, v2, v3}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    new-instance v4, Lrn3;

    .line 155
    .line 156
    invoke-direct {v4, v0, v6, v7, v8}, Lrn3;-><init>(Ljava/lang/String;JZ)V

    .line 157
    .line 158
    .line 159
    :goto_3
    invoke-virtual {p0, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    invoke-static {v8}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->setShouldSkipGmsCoreVersionCheck(Z)V

    .line 163
    .line 164
    .line 165
    new-instance p0, Landroid/util/Pair;

    .line 166
    .line 167
    iget-boolean p1, v4, Lrn3;->b:Z

    .line 168
    .line 169
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    iget-object v0, v4, Lrn3;->a:Ljava/lang/String;

    .line 174
    .line 175
    invoke-direct {p0, v0, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    return-object p0
.end method

.method public final E(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsq3;->y()V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ltn3;->D(Ljava/lang/String;)Landroid/util/Pair;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ljava/lang/String;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "00000000-0000-0000-0000-000000000000"

    .line 16
    .line 17
    :goto_0
    invoke-static {}, Lup3;->Q()Ljava/security/MessageDigest;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0

    .line 25
    :cond_1
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 26
    .line 27
    new-instance v0, Ljava/math/BigInteger;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p1, p0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const/4 p1, 0x1

    .line 38
    invoke-direct {v0, p1, p0}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 39
    .line 40
    .line 41
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const-string p1, "%032X"

    .line 46
    .line 47
    invoke-static {p2, p1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method
