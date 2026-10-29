.class public final Ldh0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ldh0;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayDeque;

    .line 8
    .line 9
    const/16 v1, 0xa

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ldh0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 17
    iput p2, p0, Ldh0;->a:I

    iput-object p1, p0, Ldh0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final c(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final d(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final e(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final f(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final g(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final h(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final i(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final j(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final k(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final l(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final m(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Intent;)V
    .locals 5

    .line 1
    const-string v0, "FirebaseMessaging"

    .line 2
    .line 3
    iget-object p0, p0, Ldh0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ljava/util/ArrayDeque;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_3

    .line 13
    .line 14
    const-string v2, "google.message_id"

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    const-string v2, "message_id"

    .line 23
    .line 24
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :cond_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, v2}, Ljava/util/ArrayDeque;->contains(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    goto/16 :goto_5

    .line 41
    .line 42
    :cond_1
    invoke-virtual {p0, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catch_0
    move-exception p0

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    :goto_0
    const-string p0, "gcm.n.analytics_data"

    .line 49
    .line 50
    invoke-virtual {p1, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 51
    .line 52
    .line 53
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    goto :goto_2

    .line 55
    :goto_1
    const-string p1, "Failed trying to get analytics data from Intent extras."

    .line 56
    .line 57
    invoke-static {v0, p1, p0}, Lio/sentry/android/core/n0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    :cond_3
    :goto_2
    const-string p0, "1"

    .line 61
    .line 62
    if-nez v1, :cond_4

    .line 63
    .line 64
    const/4 p1, 0x0

    .line 65
    goto :goto_3

    .line 66
    :cond_4
    const-string p1, "google.c.a.e"

    .line 67
    .line 68
    invoke-virtual {v1, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    :goto_3
    if-eqz p1, :cond_8

    .line 77
    .line 78
    if-nez v1, :cond_5

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_5
    const-string p1, "google.c.a.tc"

    .line 82
    .line 83
    invoke-virtual {v1, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-eqz p0, :cond_7

    .line 92
    .line 93
    invoke-static {}, Lvi0;->c()Lvi0;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    const-class p1, Lcom/google/firebase/analytics/connector/AnalyticsConnector;

    .line 98
    .line 99
    invoke-virtual {p0, p1}, Lvi0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    check-cast p0, Lcom/google/firebase/analytics/connector/AnalyticsConnector;

    .line 104
    .line 105
    if-eqz p0, :cond_6

    .line 106
    .line 107
    const-string p1, "google.c.a.c_id"

    .line 108
    .line 109
    invoke-virtual {v1, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    const-string v0, "_ln"

    .line 114
    .line 115
    const-string v2, "fcm"

    .line 116
    .line 117
    invoke-interface {p0, v2, v0, p1}, Lcom/google/firebase/analytics/connector/AnalyticsConnector;->setUserProperty(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    new-instance v0, Landroid/os/Bundle;

    .line 121
    .line 122
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 123
    .line 124
    .line 125
    const-string v3, "source"

    .line 126
    .line 127
    const-string v4, "Firebase"

    .line 128
    .line 129
    invoke-virtual {v0, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    const-string v3, "medium"

    .line 133
    .line 134
    const-string v4, "notification"

    .line 135
    .line 136
    invoke-virtual {v0, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    const-string v3, "campaign"

    .line 140
    .line 141
    invoke-virtual {v0, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    const-string p1, "_cmp"

    .line 145
    .line 146
    invoke-interface {p0, v2, p1, v0}, Lcom/google/firebase/analytics/connector/AnalyticsConnector;->logEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 147
    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_6
    const-string p0, "Unable to set user property for conversion tracking:  analytics library is missing"

    .line 151
    .line 152
    invoke-static {v0, p0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    :cond_7
    :goto_4
    const-string p0, "_no"

    .line 156
    .line 157
    invoke-static {p0, v1}, Lb40;->y(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 158
    .line 159
    .line 160
    :cond_8
    :goto_5
    return-void
.end method

.method public n(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ldh0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lsl3;

    .line 5
    .line 6
    :try_start_0
    iget-object v0, v1, Lsq3;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lij3;

    .line 9
    .line 10
    iget-object v2, v0, Lij3;->f:Luh3;

    .line 11
    .line 12
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 13
    .line 14
    .line 15
    iget-object v2, v2, Luh3;->Y:Lsh3;

    .line 16
    .line 17
    const-string v3, "onActivityCreated"

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Lsh3;->a(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v2, p1, Lcom/google/android/gms/internal/measurement/zzdf;->zzc:Landroid/content/Intent;

    .line 23
    .line 24
    if-eqz v2, :cond_7

    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {v3}, Landroid/net/Uri;->isHierarchical()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-nez v4, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    :goto_0
    move-object v5, v3

    .line 40
    goto :goto_2

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    move-object p0, v0

    .line 43
    goto/16 :goto_c

    .line 44
    .line 45
    :catch_0
    move-exception v0

    .line 46
    move-object p0, v0

    .line 47
    goto/16 :goto_a

    .line 48
    .line 49
    :cond_1
    :goto_1
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    const/4 v4, 0x0

    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    const-string v5, "com.android.vending.referral_url"

    .line 57
    .line 58
    invoke-virtual {v3, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-nez v5, :cond_2

    .line 67
    .line 68
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    goto :goto_0

    .line 73
    :cond_2
    move-object v5, v4

    .line 74
    :goto_2
    if-eqz v5, :cond_7

    .line 75
    .line 76
    invoke-virtual {v5}, Landroid/net/Uri;->isHierarchical()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-nez v3, :cond_3

    .line 81
    .line 82
    goto :goto_8

    .line 83
    :cond_3
    iget-object v3, v0, Lij3;->w:Lup3;

    .line 84
    .line 85
    invoke-static {v3}, Lij3;->j(Lsq3;)V

    .line 86
    .line 87
    .line 88
    const-string v3, "android.intent.extra.REFERRER_NAME"

    .line 89
    .line 90
    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    const-string v3, "android-app://com.google.android.googlequicksearchbox/https/www.google.com"

    .line 95
    .line 96
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-nez v3, :cond_5

    .line 101
    .line 102
    const-string v3, "https://www.google.com"

    .line 103
    .line 104
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-nez v3, :cond_5

    .line 109
    .line 110
    const-string v3, "android-app://com.google.appcrawler"

    .line 111
    .line 112
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_4

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_4
    const-string v2, "auto"

    .line 120
    .line 121
    :goto_3
    move-object v6, v2

    .line 122
    goto :goto_5

    .line 123
    :cond_5
    :goto_4
    const-string v2, "gs"

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :goto_5
    const-string v2, "referrer"

    .line 127
    .line 128
    invoke-virtual {v5, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    if-nez p2, :cond_6

    .line 133
    .line 134
    const/4 v2, 0x1

    .line 135
    :goto_6
    move v4, v2

    .line 136
    goto :goto_7

    .line 137
    :cond_6
    const/4 v2, 0x0

    .line 138
    goto :goto_6

    .line 139
    :goto_7
    iget-object v0, v0, Lij3;->i:Lbj3;

    .line 140
    .line 141
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 142
    .line 143
    .line 144
    new-instance v2, Lft0;

    .line 145
    .line 146
    move-object v3, p0

    .line 147
    invoke-direct/range {v2 .. v7}, Lft0;-><init>(Ldh0;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v2}, Lbj3;->I(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    .line 152
    .line 153
    goto :goto_b

    .line 154
    :cond_7
    :goto_8
    iget-object p0, v1, Lsq3;->a:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast p0, Lij3;

    .line 157
    .line 158
    :goto_9
    iget-object p0, p0, Lij3;->W:Llm3;

    .line 159
    .line 160
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0, p1, p2}, Llm3;->H(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :goto_a
    :try_start_1
    iget-object v0, v1, Lsq3;->a:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v0, Lij3;

    .line 170
    .line 171
    iget-object v0, v0, Lij3;->f:Luh3;

    .line 172
    .line 173
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 174
    .line 175
    .line 176
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 177
    .line 178
    const-string v2, "Throwable caught in onActivityCreated"

    .line 179
    .line 180
    invoke-virtual {v0, p0, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 181
    .line 182
    .line 183
    :goto_b
    iget-object p0, v1, Lsq3;->a:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast p0, Lij3;

    .line 186
    .line 187
    goto :goto_9

    .line 188
    :goto_c
    iget-object v0, v1, Lsq3;->a:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v0, Lij3;

    .line 191
    .line 192
    iget-object v0, v0, Lij3;->W:Llm3;

    .line 193
    .line 194
    invoke-static {v0}, Lij3;->k(Lwg3;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, p1, p2}, Llm3;->H(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;)V

    .line 198
    .line 199
    .line 200
    throw p0
.end method

.method public o(Lcom/google/android/gms/internal/measurement/zzdf;)V
    .locals 2

    .line 1
    iget-object p0, p0, Ldh0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsl3;

    .line 4
    .line 5
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lij3;

    .line 8
    .line 9
    iget-object p0, p0, Lij3;->W:Llm3;

    .line 10
    .line 11
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Llm3;->W:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v0

    .line 17
    :try_start_0
    iget-object v1, p0, Llm3;->i:Lcom/google/android/gms/internal/measurement/zzdf;

    .line 18
    .line 19
    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iput-object v1, p0, Llm3;->i:Lcom/google/android/gms/internal/measurement/zzdf;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lij3;

    .line 35
    .line 36
    iget-object v0, v0, Lij3;->d:Lpd3;

    .line 37
    .line 38
    invoke-virtual {v0}, Lpd3;->N()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    iget-object p0, p0, Llm3;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 46
    .line 47
    iget p1, p1, Lcom/google/android/gms/internal/measurement/zzdf;->zza:I

    .line 48
    .line 49
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    throw p0
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget v0, p0, Ldh0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzdf;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1, p2}, Ldh0;->n(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;)V

    .line 11
    .line 12
    .line 13
    :pswitch_0
    return-void

    .line 14
    :pswitch_1
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 22
    .line 23
    const/16 v0, 0x19

    .line 24
    .line 25
    if-gt p2, v0, :cond_1

    .line 26
    .line 27
    new-instance p2, Landroid/os/Handler;

    .line 28
    .line 29
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Lj8;

    .line 37
    .line 38
    const/16 v1, 0x17

    .line 39
    .line 40
    invoke-direct {v0, v1, p0, p1}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {p0, p1}, Ldh0;->a(Landroid/content/Intent;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    return-void

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget v0, p0, Ldh0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzdf;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, Ldh0;->o(Lcom/google/android/gms/internal/measurement/zzdf;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p0, p0, Ldh0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lbh3;

    .line 17
    .line 18
    iget-object v0, p0, Lbh3;->c:Ljava/lang/Object;

    .line 19
    .line 20
    monitor-enter v0

    .line 21
    :try_start_0
    iget-object v1, p0, Lbh3;->e:Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    monitor-exit v0

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-ne v1, p1, :cond_1

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    iput-object p1, p0, Lbh3;->e:Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    :cond_1
    monitor-exit v0

    .line 39
    :goto_0
    return-void

    .line 40
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    throw p0

    .line 42
    :pswitch_1
    return-void

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget v0, p0, Ldh0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzdf;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, Ldh0;->p(Lcom/google/android/gms/internal/measurement/zzdf;)V

    .line 11
    .line 12
    .line 13
    :pswitch_0
    return-void

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget v0, p0, Ldh0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzdf;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, Ldh0;->q(Lcom/google/android/gms/internal/measurement/zzdf;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p0, p0, Ldh0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lbh3;

    .line 17
    .line 18
    invoke-static {p0, p1}, Lbh3;->c(Lbh3;Landroid/app/Activity;)V

    .line 19
    .line 20
    .line 21
    :pswitch_1
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget v0, p0, Ldh0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzdf;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1, p2}, Ldh0;->r(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;)V

    .line 11
    .line 12
    .line 13
    :pswitch_0
    return-void

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget v0, p0, Ldh0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p0, p0, Ldh0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lbh3;

    .line 10
    .line 11
    invoke-static {p0, p1}, Lbh3;->c(Lbh3;Landroid/app/Activity;)V

    .line 12
    .line 13
    .line 14
    :pswitch_1
    return-void

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iget p0, p0, Ldh0;->a:I

    .line 2
    .line 3
    return-void
.end method

.method public p(Lcom/google/android/gms/internal/measurement/zzdf;)V
    .locals 7

    .line 1
    iget-object p0, p0, Ldh0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsl3;

    .line 4
    .line 5
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lij3;

    .line 8
    .line 9
    iget-object v0, p0, Lij3;->W:Llm3;

    .line 10
    .line 11
    invoke-static {v0}, Lij3;->k(Lwg3;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Llm3;->W:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v1

    .line 17
    const/4 v2, 0x0

    .line 18
    :try_start_0
    iput-boolean v2, v0, Llm3;->V:Z

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    iput-boolean v2, v0, Llm3;->v:Z

    .line 22
    .line 23
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    iget-object v1, v0, Lsq3;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lij3;

    .line 27
    .line 28
    iget-object v3, v1, Lij3;->V:Lxt0;

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    iget-object v5, v1, Lij3;->d:Lpd3;

    .line 38
    .line 39
    invoke-virtual {v5}, Lpd3;->N()Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    const/4 v6, 0x0

    .line 44
    if-nez v5, :cond_0

    .line 45
    .line 46
    iput-object v6, v0, Llm3;->c:Lbm3;

    .line 47
    .line 48
    iget-object p1, v1, Lij3;->i:Lbj3;

    .line 49
    .line 50
    invoke-static {p1}, Lij3;->l(Lhk3;)V

    .line 51
    .line 52
    .line 53
    new-instance v1, Le50;

    .line 54
    .line 55
    invoke-direct {v1, v0, v3, v4}, Le50;-><init>(Llm3;J)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v1}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {v0, p1}, Llm3;->E(Lcom/google/android/gms/internal/measurement/zzdf;)Lbm3;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object v5, v0, Llm3;->c:Lbm3;

    .line 67
    .line 68
    iput-object v5, v0, Llm3;->d:Lbm3;

    .line 69
    .line 70
    iput-object v6, v0, Llm3;->c:Lbm3;

    .line 71
    .line 72
    iget-object v1, v1, Lij3;->i:Lbj3;

    .line 73
    .line 74
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 75
    .line 76
    .line 77
    new-instance v5, Les0;

    .line 78
    .line 79
    invoke-direct {v5, v0, p1, v3, v4}, Les0;-><init>(Llm3;Lbm3;J)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v5}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 83
    .line 84
    .line 85
    :goto_0
    iget-object p0, p0, Lij3;->v:Llo3;

    .line 86
    .line 87
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Lsq3;->a:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p1, Lij3;

    .line 93
    .line 94
    iget-object v0, p1, Lij3;->V:Lxt0;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 100
    .line 101
    .line 102
    move-result-wide v0

    .line 103
    iget-object p1, p1, Lij3;->i:Lbj3;

    .line 104
    .line 105
    invoke-static {p1}, Lij3;->l(Lhk3;)V

    .line 106
    .line 107
    .line 108
    new-instance v3, Lao3;

    .line 109
    .line 110
    invoke-direct {v3, p0, v0, v1, v2}, Lao3;-><init>(Llo3;JI)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v3}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :catchall_0
    move-exception p0

    .line 118
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    throw p0
.end method

.method public q(Lcom/google/android/gms/internal/measurement/zzdf;)V
    .locals 6

    .line 1
    iget-object p0, p0, Ldh0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsl3;

    .line 4
    .line 5
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lij3;

    .line 8
    .line 9
    iget-object v0, p0, Lij3;->v:Llo3;

    .line 10
    .line 11
    invoke-static {v0}, Lij3;->k(Lwg3;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Lsq3;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lij3;

    .line 17
    .line 18
    iget-object v2, v1, Lij3;->V:Lxt0;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    iget-object v1, v1, Lij3;->i:Lbj3;

    .line 28
    .line 29
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 30
    .line 31
    .line 32
    new-instance v4, Lao3;

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    invoke-direct {v4, v0, v2, v3, v5}, Lao3;-><init>(Llo3;JI)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v4}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, Lij3;->W:Llm3;

    .line 42
    .line 43
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Llm3;->W:Ljava/lang/Object;

    .line 47
    .line 48
    monitor-enter v0

    .line 49
    const/4 v1, 0x1

    .line 50
    :try_start_0
    iput-boolean v1, p0, Llm3;->V:Z

    .line 51
    .line 52
    iget-object v2, p0, Llm3;->i:Lcom/google/android/gms/internal/measurement/zzdf;

    .line 53
    .line 54
    invoke-static {p1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_0

    .line 59
    .line 60
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    :try_start_1
    iput-object p1, p0, Llm3;->i:Lcom/google/android/gms/internal/measurement/zzdf;

    .line 62
    .line 63
    iput-boolean v5, p0, Llm3;->v:Z

    .line 64
    .line 65
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 66
    :try_start_2
    iget-object v2, p0, Lsq3;->a:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Lij3;

    .line 69
    .line 70
    iget-object v3, v2, Lij3;->d:Lpd3;

    .line 71
    .line 72
    invoke-virtual {v3}, Lpd3;->N()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_0

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    iput-object v3, p0, Llm3;->w:Lbm3;

    .line 80
    .line 81
    iget-object v2, v2, Lij3;->i:Lbj3;

    .line 82
    .line 83
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 84
    .line 85
    .line 86
    new-instance v3, Lem3;

    .line 87
    .line 88
    invoke-direct {v3, p0, v1}, Lem3;-><init>(Llm3;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v3}, Lbj3;->I(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :catchall_0
    move-exception p0

    .line 96
    goto :goto_1

    .line 97
    :catchall_1
    move-exception p0

    .line 98
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 99
    :try_start_4
    throw p0

    .line 100
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 101
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Lij3;

    .line 104
    .line 105
    iget-object v1, v0, Lij3;->d:Lpd3;

    .line 106
    .line 107
    invoke-virtual {v1}, Lpd3;->N()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_1

    .line 112
    .line 113
    iget-object p1, p0, Llm3;->w:Lbm3;

    .line 114
    .line 115
    iput-object p1, p0, Llm3;->c:Lbm3;

    .line 116
    .line 117
    iget-object p1, v0, Lij3;->i:Lbj3;

    .line 118
    .line 119
    invoke-static {p1}, Lij3;->l(Lhk3;)V

    .line 120
    .line 121
    .line 122
    new-instance v0, Lem3;

    .line 123
    .line 124
    invoke-direct {v0, p0, v5}, Lem3;-><init>(Llm3;I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v0}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_1
    invoke-virtual {p0, p1}, Llm3;->E(Lcom/google/android/gms/internal/measurement/zzdf;)Lbm3;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzdf;->zzb:Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual {p0, p1, v0, v5}, Llm3;->I(Ljava/lang/String;Lbm3;Z)V

    .line 138
    .line 139
    .line 140
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p0, Lij3;

    .line 143
    .line 144
    iget-object p0, p0, Lij3;->Y:Lof3;

    .line 145
    .line 146
    invoke-static {p0}, Lij3;->i(Leg3;)V

    .line 147
    .line 148
    .line 149
    iget-object p1, p0, Lsq3;->a:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast p1, Lij3;

    .line 152
    .line 153
    iget-object v0, p1, Lij3;->V:Lxt0;

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 159
    .line 160
    .line 161
    move-result-wide v0

    .line 162
    iget-object p1, p1, Lij3;->i:Lbj3;

    .line 163
    .line 164
    invoke-static {p1}, Lij3;->l(Lhk3;)V

    .line 165
    .line 166
    .line 167
    new-instance v2, Le50;

    .line 168
    .line 169
    invoke-direct {v2, p0, v0, v1}, Le50;-><init>(Lof3;J)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, v2}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :goto_1
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 177
    throw p0
.end method

.method public r(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object p0, p0, Ldh0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsl3;

    .line 4
    .line 5
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lij3;

    .line 8
    .line 9
    iget-object p0, p0, Lij3;->W:Llm3;

    .line 10
    .line 11
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lij3;

    .line 17
    .line 18
    iget-object v0, v0, Lij3;->d:Lpd3;

    .line 19
    .line 20
    invoke-virtual {v0}, Lpd3;->N()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-eqz p2, :cond_1

    .line 28
    .line 29
    iget-object p0, p0, Llm3;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 30
    .line 31
    iget p1, p1, Lcom/google/android/gms/internal/measurement/zzdf;->zza:I

    .line 32
    .line 33
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Lbm3;

    .line 42
    .line 43
    if-eqz p0, :cond_1

    .line 44
    .line 45
    new-instance p1, Landroid/os/Bundle;

    .line 46
    .line 47
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v0, "id"

    .line 51
    .line 52
    iget-wide v1, p0, Lbm3;->c:J

    .line 53
    .line 54
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 55
    .line 56
    .line 57
    const-string v0, "name"

    .line 58
    .line 59
    iget-object v1, p0, Lbm3;->a:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v0, "referrer_name"

    .line 65
    .line 66
    iget-object p0, p0, Lbm3;->b:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {p1, v0, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string p0, "com.google.app_measurement.screen_service"

    .line 72
    .line 73
    invoke-virtual {p2, p0, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    :goto_0
    return-void
.end method
