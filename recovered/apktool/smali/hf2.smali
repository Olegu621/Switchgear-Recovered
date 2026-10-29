.class public final Lhf2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;
.implements Lio/flutter/embedding/engine/plugins/activity/ActivityAware;
.implements Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Landroid/app/Activity;

.field public c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

.field public d:Lio/flutter/plugin/common/MethodChannel;

.field public e:Lio/flutter/plugin/common/MethodChannel$Result;

.field public f:Lfman/ge/smart_auth/SmartAuthPlugin$SmsBroadcastReceiver;

.field public i:Lfman/ge/smart_auth/SmartAuthPlugin$ConsentBroadcastReceiver;


# direct methods
.method public static a(Lcom/google/android/gms/auth/api/credentials/Credential;)Ljava/util/HashMap;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "accountType"

    .line 7
    .line 8
    iget-object v2, p0, Lcom/google/android/gms/auth/api/credentials/Credential;->f:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    const-string v1, "familyName"

    .line 14
    .line 15
    iget-object v2, p0, Lcom/google/android/gms/auth/api/credentials/Credential;->v:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    const-string v1, "givenName"

    .line 21
    .line 22
    iget-object v2, p0, Lcom/google/android/gms/auth/api/credentials/Credential;->i:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    const-string v1, "id"

    .line 28
    .line 29
    iget-object v2, p0, Lcom/google/android/gms/auth/api/credentials/Credential;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    const-string v1, "name"

    .line 35
    .line 36
    iget-object v2, p0, Lcom/google/android/gms/auth/api/credentials/Credential;->b:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    const-string v1, "password"

    .line 42
    .line 43
    iget-object v2, p0, Lcom/google/android/gms/auth/api/credentials/Credential;->e:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Lcom/google/android/gms/auth/api/credentials/Credential;->c:Landroid/net/Uri;

    .line 49
    .line 50
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    const-string v1, "profilePictureUri"

    .line 55
    .line 56
    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    return-object v0
.end method

.method public static c(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)Lcom/google/android/gms/auth/api/credentials/Credential;
    .locals 11

    .line 1
    const-string v0, "accountType"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    const-string v1, "id"

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    move-object v3, v1

    .line 16
    check-cast v3, Ljava/lang/String;

    .line 17
    .line 18
    const-string v1, "name"

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/String;

    .line 25
    .line 26
    const-string v2, "password"

    .line 27
    .line 28
    invoke-virtual {p0, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/String;

    .line 33
    .line 34
    const-string v4, "profilePictureUri"

    .line 35
    .line 36
    invoke-virtual {p0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Ljava/lang/String;

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    if-nez v3, :cond_0

    .line 44
    .line 45
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-interface {p1, p0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-object v4

    .line 51
    :cond_0
    if-eqz v0, :cond_1

    .line 52
    .line 53
    move-object v8, v0

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-object v8, v4

    .line 56
    :goto_0
    if-eqz v1, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move-object v1, v4

    .line 60
    :goto_1
    if-eqz v2, :cond_3

    .line 61
    .line 62
    move-object v7, v2

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    move-object v7, v4

    .line 65
    :goto_2
    if-eqz p0, :cond_4

    .line 66
    .line 67
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    :cond_4
    move-object v5, v4

    .line 72
    new-instance v2, Lcom/google/android/gms/auth/api/credentials/Credential;

    .line 73
    .line 74
    const/4 v9, 0x0

    .line 75
    const/4 v10, 0x0

    .line 76
    const/4 v6, 0x0

    .line 77
    move-object v4, v1

    .line 78
    invoke-direct/range {v2 .. v10}, Lcom/google/android/gms/auth/api/credentials/Credential;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object v2
.end method


# virtual methods
.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lhf2;->f:Lfman/ge/smart_auth/SmartAuthPlugin$SmsBroadcastReceiver;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lhf2;->d(Landroid/content/BroadcastReceiver;)V

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, Lhf2;->f:Lfman/ge/smart_auth/SmartAuthPlugin$SmsBroadcastReceiver;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lhf2;->i:Lfman/ge/smart_auth/SmartAuthPlugin$ConsentBroadcastReceiver;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lhf2;->d(Landroid/content/BroadcastReceiver;)V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lhf2;->i:Lfman/ge/smart_auth/SmartAuthPlugin$ConsentBroadcastReceiver;

    .line 19
    .line 20
    :cond_1
    :try_start_0
    iget-object v0, p0, Lhf2;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-interface {v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v0

    .line 29
    new-instance v2, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v3, "ignoring exception: "

    .line 32
    .line 33
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v2, "Pinput/SmartAuth"

    .line 44
    .line 45
    invoke-static {v2, v0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_0
    iput-object v1, p0, Lhf2;->b:Landroid/app/Activity;

    .line 49
    .line 50
    iget-object v0, p0, Lhf2;->c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    invoke-interface {v0, p0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->removeActivityResultListener(Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    iput-object v1, p0, Lhf2;->c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    .line 58
    .line 59
    return-void
.end method

.method public final d(Landroid/content/BroadcastReceiver;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    :try_start_0
    iget-object p0, p0, Lhf2;->a:Landroid/content/Context;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "mContext"

    .line 12
    .line 13
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    :catch_0
    move-exception p0

    .line 19
    const-string p1, "Pinput/SmartAuth"

    .line 20
    .line 21
    const-string v0, "Unregistering receiver failed."

    .line 22
    .line 23
    invoke-static {p1, v0, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public final onActivityResult(IILandroid/content/Intent;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "com.google.android.gms.credentials.Credential"

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, -0x1

    .line 6
    const-string v4, "Pinput/SmartAuth"

    .line 7
    .line 8
    const-string v5, "ignoring exception: "

    .line 9
    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    goto/16 :goto_1

    .line 14
    .line 15
    :pswitch_0
    if-ne p2, v3, :cond_0

    .line 16
    .line 17
    if-eqz p3, :cond_0

    .line 18
    .line 19
    invoke-virtual {p3, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lcom/google/android/gms/auth/api/credentials/Credential;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    :try_start_0
    iget-object p0, p0, Lhf2;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 28
    .line 29
    if-eqz p0, :cond_4

    .line 30
    .line 31
    invoke-static {p1}, Lhf2;->a(Lcom/google/android/gms/auth/api/credentials/Credential;)Ljava/util/HashMap;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    goto/16 :goto_1

    .line 39
    .line 40
    :catch_0
    move-exception p0

    .line 41
    new-instance p1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {v4, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    goto/16 :goto_1

    .line 57
    .line 58
    :cond_0
    :try_start_1
    iget-object p0, p0, Lhf2;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 59
    .line 60
    if-eqz p0, :cond_4

    .line 61
    .line 62
    invoke-interface {p0, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 63
    .line 64
    .line 65
    goto/16 :goto_1

    .line 66
    .line 67
    :catch_1
    move-exception p0

    .line 68
    new-instance p1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {v4, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    goto/16 :goto_1

    .line 84
    .line 85
    :pswitch_1
    :try_start_2
    iget-object p0, p0, Lhf2;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 86
    .line 87
    if-eqz p0, :cond_4

    .line 88
    .line 89
    if-ne p2, v3, :cond_1

    .line 90
    .line 91
    move p1, v0

    .line 92
    goto :goto_0

    .line 93
    :cond_1
    const/4 p1, 0x0

    .line 94
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-interface {p0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    .line 99
    .line 100
    .line 101
    goto/16 :goto_1

    .line 102
    .line 103
    :catch_2
    move-exception p0

    .line 104
    new-instance p1, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-static {v4, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    goto/16 :goto_1

    .line 120
    .line 121
    :pswitch_2
    if-ne p2, v3, :cond_2

    .line 122
    .line 123
    if-eqz p3, :cond_2

    .line 124
    .line 125
    const-string p1, "com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE"

    .line 126
    .line 127
    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    :try_start_3
    iget-object p0, p0, Lhf2;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 132
    .line 133
    if-eqz p0, :cond_4

    .line 134
    .line 135
    invoke-interface {p0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_3

    .line 136
    .line 137
    .line 138
    goto/16 :goto_1

    .line 139
    .line 140
    :catch_3
    move-exception p0

    .line 141
    new-instance p1, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-static {v4, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_2
    :try_start_4
    iget-object p0, p0, Lhf2;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 158
    .line 159
    if-eqz p0, :cond_4

    .line 160
    .line 161
    invoke-interface {p0, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_4

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :catch_4
    move-exception p0

    .line 166
    new-instance p1, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-static {v4, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :pswitch_3
    if-ne p2, v3, :cond_3

    .line 183
    .line 184
    if-eqz p3, :cond_3

    .line 185
    .line 186
    invoke-virtual {p3, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    check-cast p1, Lcom/google/android/gms/auth/api/credentials/Credential;

    .line 191
    .line 192
    if-eqz p1, :cond_3

    .line 193
    .line 194
    :try_start_5
    iget-object p0, p0, Lhf2;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 195
    .line 196
    if-eqz p0, :cond_4

    .line 197
    .line 198
    invoke-static {p1}, Lhf2;->a(Lcom/google/android/gms/auth/api/credentials/Credential;)Ljava/util/HashMap;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-interface {p0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_5

    .line 203
    .line 204
    .line 205
    goto :goto_1

    .line 206
    :catch_5
    move-exception p0

    .line 207
    new-instance p1, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    invoke-static {v4, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 220
    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_3
    :try_start_6
    iget-object p0, p0, Lhf2;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 224
    .line 225
    if-eqz p0, :cond_4

    .line 226
    .line 227
    invoke-interface {p0, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_6

    .line 228
    .line 229
    .line 230
    goto :goto_1

    .line 231
    :catch_6
    move-exception p0

    .line 232
    new-instance p1, Ljava/lang/StringBuilder;

    .line 233
    .line 234
    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    invoke-static {v4, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 245
    .line 246
    .line 247
    :cond_4
    :goto_1
    return v0

    .line 248
    nop

    .line 249
    :pswitch_data_0
    .packed-switch 0x2b5c
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lhf2;->b:Landroid/app/Activity;

    .line 9
    .line 10
    iput-object p1, p0, Lhf2;->c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    .line 11
    .line 12
    invoke-interface {p1, p0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->addActivityResultListener(Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    .line 5
    .line 6
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "fman.smart_auth"

    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lhf2;->d:Lio/flutter/plugin/common/MethodChannel;

    .line 16
    .line 17
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lhf2;->a:Landroid/content/Context;

    .line 22
    .line 23
    iget-object p1, p0, Lhf2;->d:Lio/flutter/plugin/common/MethodChannel;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final onDetachedFromActivity()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lhf2;->b()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lhf2;->b()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lhf2;->b()V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lhf2;->d:Lio/flutter/plugin/common/MethodChannel;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iput-object v0, p0, Lhf2;->d:Lio/flutter/plugin/common/MethodChannel;

    .line 16
    .line 17
    return-void
.end method

.method public final onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v3, v1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v3, :cond_34

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/16 v5, 0xb

    .line 22
    .line 23
    const-string v6, "com.google.android.gms.auth.api.phone.permission.SEND"

    .line 24
    .line 25
    const-string v7, "com.google.android.gms.auth.api.phone.SMS_RETRIEVED"

    .line 26
    .line 27
    const-string v8, "At least one authentication method must be specified"

    .line 28
    .line 29
    const-string v9, "serverClientId"

    .line 30
    .line 31
    const-string v10, "isIdTokenRequested"

    .line 32
    .line 33
    const-string v11, "idTokenNonce"

    .line 34
    .line 35
    const/4 v12, 0x1

    .line 36
    const/4 v13, 0x0

    .line 37
    const-string v14, "mContext"

    .line 38
    .line 39
    const/4 v15, 0x0

    .line 40
    sparse-switch v4, :sswitch_data_0

    .line 41
    .line 42
    .line 43
    goto/16 :goto_13

    .line 44
    .line 45
    :sswitch_0
    const-string v4, "deleteCredential"

    .line 46
    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-nez v3, :cond_0

    .line 52
    .line 53
    goto/16 :goto_13

    .line 54
    .line 55
    :cond_0
    invoke-static/range {p1 .. p2}, Lhf2;->c(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)Lcom/google/android/gms/auth/api/credentials/Credential;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-nez v1, :cond_1

    .line 60
    .line 61
    goto/16 :goto_9

    .line 62
    .line 63
    :cond_1
    iget-object v0, v0, Lhf2;->a:Landroid/content/Context;

    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-static {v0}, Lhu0;->Z(Landroid/content/Context;)Lfc3;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sget-object v3, Lce;->c:Lcom/google/android/gms/internal/auth-api/zbl;

    .line 72
    .line 73
    invoke-virtual {v0}, Lor0;->asGoogleApiClient()Ltr0;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v3, v0, v1}, Lcom/google/android/gms/internal/auth-api/zbl;->delete(Ltr0;Lcom/google/android/gms/auth/api/credentials/Credential;)Lsr1;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    new-instance v1, Lp62;

    .line 82
    .line 83
    invoke-direct {v1, v5}, Lp62;-><init>(I)V

    .line 84
    .line 85
    .line 86
    new-instance v3, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 87
    .line 88
    invoke-direct {v3}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 89
    .line 90
    .line 91
    new-instance v4, Lhc3;

    .line 92
    .line 93
    invoke-direct {v4, v0, v3, v1}, Lhc3;-><init>(Lsr1;Lcom/google/android/gms/tasks/TaskCompletionSource;Ltr1;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v4}, Lsr1;->addStatusListener(Lrr1;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-instance v1, Lsi1;

    .line 104
    .line 105
    invoke-direct {v1, v2}, Lsi1;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_2
    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v15

    .line 116
    :sswitch_1
    const-string v4, "saveCredential"

    .line 117
    .line 118
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-nez v3, :cond_3

    .line 123
    .line 124
    goto/16 :goto_13

    .line 125
    .line 126
    :cond_3
    invoke-static/range {p1 .. p2}, Lhf2;->c(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)Lcom/google/android/gms/auth/api/credentials/Credential;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    if-nez v1, :cond_4

    .line 131
    .line 132
    goto/16 :goto_9

    .line 133
    .line 134
    :cond_4
    iget-object v3, v0, Lhf2;->a:Landroid/content/Context;

    .line 135
    .line 136
    if-eqz v3, :cond_5

    .line 137
    .line 138
    invoke-static {v3}, Lhu0;->Z(Landroid/content/Context;)Lfc3;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    sget-object v4, Lce;->c:Lcom/google/android/gms/internal/auth-api/zbl;

    .line 143
    .line 144
    invoke-virtual {v3}, Lor0;->asGoogleApiClient()Ltr0;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-virtual {v4, v3, v1}, Lcom/google/android/gms/internal/auth-api/zbl;->save(Ltr0;Lcom/google/android/gms/auth/api/credentials/Credential;)Lsr1;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    new-instance v3, Lp62;

    .line 153
    .line 154
    invoke-direct {v3, v5}, Lp62;-><init>(I)V

    .line 155
    .line 156
    .line 157
    new-instance v4, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 158
    .line 159
    invoke-direct {v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 160
    .line 161
    .line 162
    new-instance v5, Lhc3;

    .line 163
    .line 164
    invoke-direct {v5, v1, v4, v3}, Lhc3;-><init>(Lsr1;Lcom/google/android/gms/tasks/TaskCompletionSource;Ltr1;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v5}, Lsr1;->addStatusListener(Lrr1;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    new-instance v3, Lpn;

    .line 175
    .line 176
    const/16 v4, 0xf

    .line 177
    .line 178
    invoke-direct {v3, v4, v2, v0}, Lpn;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, v3}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :cond_5
    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    throw v15

    .line 189
    :sswitch_2
    const-string v4, "requestHint"

    .line 190
    .line 191
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    if-nez v3, :cond_6

    .line 196
    .line 197
    goto/16 :goto_13

    .line 198
    .line 199
    :cond_6
    iput-object v2, v0, Lhf2;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 200
    .line 201
    const-string v2, "showAddAccountButton"

    .line 202
    .line 203
    invoke-virtual {v1, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    check-cast v2, Ljava/lang/Boolean;

    .line 208
    .line 209
    const-string v3, "showCancelButton"

    .line 210
    .line 211
    invoke-virtual {v1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    check-cast v3, Ljava/lang/Boolean;

    .line 216
    .line 217
    const-string v4, "isPhoneNumberIdentifierSupported"

    .line 218
    .line 219
    invoke-virtual {v1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    check-cast v4, Ljava/lang/Boolean;

    .line 224
    .line 225
    const-string v5, "isEmailAddressIdentifierSupported"

    .line 226
    .line 227
    invoke-virtual {v1, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    check-cast v5, Ljava/lang/Boolean;

    .line 232
    .line 233
    const-string v6, "accountTypes"

    .line 234
    .line 235
    invoke-virtual {v1, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    check-cast v6, Ljava/lang/String;

    .line 240
    .line 241
    invoke-virtual {v1, v11}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    check-cast v7, Ljava/lang/String;

    .line 246
    .line 247
    invoke-virtual {v1, v10}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v10

    .line 251
    check-cast v10, Ljava/lang/Boolean;

    .line 252
    .line 253
    invoke-virtual {v1, v9}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    check-cast v1, Ljava/lang/String;

    .line 258
    .line 259
    if-eqz v2, :cond_7

    .line 260
    .line 261
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    move/from16 v19, v2

    .line 266
    .line 267
    goto :goto_0

    .line 268
    :cond_7
    move/from16 v19, v13

    .line 269
    .line 270
    :goto_0
    if-eqz v3, :cond_8

    .line 271
    .line 272
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    move/from16 v20, v2

    .line 277
    .line 278
    goto :goto_1

    .line 279
    :cond_8
    move/from16 v20, v12

    .line 280
    .line 281
    :goto_1
    new-instance v16, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    .line 282
    .line 283
    const/16 v21, 0x0

    .line 284
    .line 285
    const/16 v18, 0x1

    .line 286
    .line 287
    const/16 v17, 0x2

    .line 288
    .line 289
    invoke-direct/range {v16 .. v21}, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;-><init>(IIZZZ)V

    .line 290
    .line 291
    .line 292
    if-eqz v4, :cond_9

    .line 293
    .line 294
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    move/from16 v25, v2

    .line 299
    .line 300
    goto :goto_2

    .line 301
    :cond_9
    move/from16 v25, v13

    .line 302
    .line 303
    :goto_2
    if-eqz v5, :cond_a

    .line 304
    .line 305
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    move/from16 v24, v2

    .line 310
    .line 311
    goto :goto_3

    .line 312
    :cond_a
    move/from16 v24, v13

    .line 313
    .line 314
    :goto_3
    if-eqz v6, :cond_b

    .line 315
    .line 316
    new-array v2, v12, [Ljava/lang/String;

    .line 317
    .line 318
    aput-object v6, v2, v13

    .line 319
    .line 320
    goto :goto_4

    .line 321
    :cond_b
    move-object v2, v15

    .line 322
    :goto_4
    if-eqz v7, :cond_c

    .line 323
    .line 324
    move-object/from16 v29, v7

    .line 325
    .line 326
    goto :goto_5

    .line 327
    :cond_c
    move-object/from16 v29, v15

    .line 328
    .line 329
    :goto_5
    if-eqz v10, :cond_d

    .line 330
    .line 331
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    move/from16 v27, v3

    .line 336
    .line 337
    goto :goto_6

    .line 338
    :cond_d
    move/from16 v27, v13

    .line 339
    .line 340
    :goto_6
    if-eqz v1, :cond_e

    .line 341
    .line 342
    move-object/from16 v28, v1

    .line 343
    .line 344
    goto :goto_7

    .line 345
    :cond_e
    move-object/from16 v28, v15

    .line 346
    .line 347
    :goto_7
    iget-object v1, v0, Lhf2;->a:Landroid/content/Context;

    .line 348
    .line 349
    if-eqz v1, :cond_13

    .line 350
    .line 351
    invoke-static {v1}, Lhu0;->Z(Landroid/content/Context;)Lfc3;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    if-nez v2, :cond_f

    .line 356
    .line 357
    new-array v2, v13, [Ljava/lang/String;

    .line 358
    .line 359
    :cond_f
    if-nez v24, :cond_11

    .line 360
    .line 361
    if-nez v25, :cond_11

    .line 362
    .line 363
    array-length v3, v2

    .line 364
    if-eqz v3, :cond_10

    .line 365
    .line 366
    goto :goto_8

    .line 367
    :cond_10
    invoke-static {v8}, Lf42;->l(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    return-void

    .line 371
    :cond_11
    :goto_8
    new-instance v21, Lcom/google/android/gms/auth/api/credentials/HintRequest;

    .line 372
    .line 373
    const/16 v22, 0x2

    .line 374
    .line 375
    move-object/from16 v26, v2

    .line 376
    .line 377
    move-object/from16 v23, v16

    .line 378
    .line 379
    invoke-direct/range {v21 .. v29}, Lcom/google/android/gms/auth/api/credentials/HintRequest;-><init>(ILcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;ZZ[Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    move-object/from16 v2, v21

    .line 383
    .line 384
    invoke-virtual {v1}, Lor0;->getApplicationContext()Landroid/content/Context;

    .line 385
    .line 386
    .line 387
    move-result-object v3

    .line 388
    invoke-virtual {v1}, Lor0;->getApiOptions()Lb9;

    .line 389
    .line 390
    .line 391
    move-result-object v4

    .line 392
    check-cast v4, Lbe;

    .line 393
    .line 394
    invoke-virtual {v1}, Lor0;->getApiOptions()Lb9;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    check-cast v1, Lbe;

    .line 399
    .line 400
    iget-object v1, v1, Lbe;->b:Ljava/lang/String;

    .line 401
    .line 402
    invoke-static {v3, v4, v2, v1}, Lcom/google/android/gms/internal/auth-api/zbn;->zba(Landroid/content/Context;Lbe;Lcom/google/android/gms/auth/api/credentials/HintRequest;Ljava/lang/String;)Landroid/app/PendingIntent;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    iget-object v2, v0, Lhf2;->b:Landroid/app/Activity;

    .line 410
    .line 411
    if-eqz v2, :cond_12

    .line 412
    .line 413
    invoke-virtual {v1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    const/4 v8, 0x0

    .line 418
    const/4 v9, 0x0

    .line 419
    const/16 v4, 0x2b5c

    .line 420
    .line 421
    const/4 v5, 0x0

    .line 422
    const/4 v6, 0x0

    .line 423
    const/4 v7, 0x0

    .line 424
    invoke-virtual/range {v2 .. v9}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    .line 425
    .line 426
    .line 427
    :cond_12
    :goto_9
    return-void

    .line 428
    :cond_13
    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    throw v15

    .line 432
    :sswitch_3
    const-string v1, "stopSmsRetriever"

    .line 433
    .line 434
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v1

    .line 438
    if-nez v1, :cond_14

    .line 439
    .line 440
    goto/16 :goto_13

    .line 441
    .line 442
    :cond_14
    iget-object v1, v0, Lhf2;->f:Lfman/ge/smart_auth/SmartAuthPlugin$SmsBroadcastReceiver;

    .line 443
    .line 444
    if-nez v1, :cond_15

    .line 445
    .line 446
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 447
    .line 448
    invoke-interface {v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    return-void

    .line 452
    :cond_15
    if-eqz v1, :cond_16

    .line 453
    .line 454
    invoke-virtual {v0, v1}, Lhf2;->d(Landroid/content/BroadcastReceiver;)V

    .line 455
    .line 456
    .line 457
    iput-object v15, v0, Lhf2;->f:Lfman/ge/smart_auth/SmartAuthPlugin$SmsBroadcastReceiver;

    .line 458
    .line 459
    :cond_16
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 460
    .line 461
    invoke-interface {v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    return-void

    .line 465
    :sswitch_4
    const-string v1, "getAppSignature"

    .line 466
    .line 467
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-result v1

    .line 471
    if-nez v1, :cond_17

    .line 472
    .line 473
    goto/16 :goto_13

    .line 474
    .line 475
    :cond_17
    new-instance v1, Lkc;

    .line 476
    .line 477
    iget-object v0, v0, Lhf2;->a:Landroid/content/Context;

    .line 478
    .line 479
    if-eqz v0, :cond_1c

    .line 480
    .line 481
    invoke-direct {v1, v0}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 482
    .line 483
    .line 484
    new-instance v0, Ljava/util/ArrayList;

    .line 485
    .line 486
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 487
    .line 488
    .line 489
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v3

    .line 493
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 498
    .line 499
    const/16 v5, 0x1c

    .line 500
    .line 501
    if-lt v4, v5, :cond_18

    .line 502
    .line 503
    const/high16 v4, 0x8000000

    .line 504
    .line 505
    invoke-virtual {v1, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    invoke-static {v1}, Lsk0;->e(Landroid/content/pm/PackageInfo;)Landroid/content/pm/SigningInfo;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    invoke-static {v1}, Lq0;->w(Landroid/content/pm/SigningInfo;)[Landroid/content/pm/Signature;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    goto :goto_a

    .line 521
    :catch_0
    move-exception v0

    .line 522
    goto :goto_d

    .line 523
    :cond_18
    const/16 v4, 0x40

    .line 524
    .line 525
    invoke-virtual {v1, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 530
    .line 531
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 532
    .line 533
    .line 534
    :goto_a
    new-instance v4, Ljava/util/ArrayList;

    .line 535
    .line 536
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 537
    .line 538
    .line 539
    array-length v5, v1

    .line 540
    move v6, v13

    .line 541
    :goto_b
    if-ge v6, v5, :cond_1a

    .line 542
    .line 543
    aget-object v7, v1, v6

    .line 544
    .line 545
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v7}, Landroid/content/pm/Signature;->toCharsString()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v7

    .line 552
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    invoke-static {v3, v7}, Lkc;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v7

    .line 559
    if-eqz v7, :cond_19

    .line 560
    .line 561
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 562
    .line 563
    .line 564
    :cond_19
    add-int/lit8 v6, v6, 0x1

    .line 565
    .line 566
    goto :goto_b

    .line 567
    :cond_1a
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 568
    .line 569
    .line 570
    move-result-object v1

    .line 571
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 572
    .line 573
    .line 574
    move-result v3

    .line 575
    if-eqz v3, :cond_1b

    .line 576
    .line 577
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v3

    .line 581
    check-cast v3, Ljava/lang/String;

    .line 582
    .line 583
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 584
    .line 585
    .line 586
    goto :goto_c

    .line 587
    :goto_d
    const-string v1, "kc"

    .line 588
    .line 589
    const-string v3, "Unable to find package to obtain hash."

    .line 590
    .line 591
    invoke-static {v1, v3, v0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 592
    .line 593
    .line 594
    new-instance v0, Ljava/util/ArrayList;

    .line 595
    .line 596
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 597
    .line 598
    .line 599
    :cond_1b
    invoke-static {v13, v0}, Lkotlin/collections/CollectionsKt;->v(ILjava/util/List;)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    invoke-interface {v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 604
    .line 605
    .line 606
    return-void

    .line 607
    :cond_1c
    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    throw v15

    .line 611
    :sswitch_5
    const-string v1, "startSmsRetriever"

    .line 612
    .line 613
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move-result v1

    .line 617
    if-nez v1, :cond_1d

    .line 618
    .line 619
    goto/16 :goto_13

    .line 620
    .line 621
    :cond_1d
    iget-object v1, v0, Lhf2;->f:Lfman/ge/smart_auth/SmartAuthPlugin$SmsBroadcastReceiver;

    .line 622
    .line 623
    if-eqz v1, :cond_1e

    .line 624
    .line 625
    invoke-virtual {v0, v1}, Lhf2;->d(Landroid/content/BroadcastReceiver;)V

    .line 626
    .line 627
    .line 628
    iput-object v15, v0, Lhf2;->f:Lfman/ge/smart_auth/SmartAuthPlugin$SmsBroadcastReceiver;

    .line 629
    .line 630
    :cond_1e
    iget-object v1, v0, Lhf2;->i:Lfman/ge/smart_auth/SmartAuthPlugin$ConsentBroadcastReceiver;

    .line 631
    .line 632
    if-eqz v1, :cond_1f

    .line 633
    .line 634
    invoke-virtual {v0, v1}, Lhf2;->d(Landroid/content/BroadcastReceiver;)V

    .line 635
    .line 636
    .line 637
    iput-object v15, v0, Lhf2;->i:Lfman/ge/smart_auth/SmartAuthPlugin$ConsentBroadcastReceiver;

    .line 638
    .line 639
    :cond_1f
    iput-object v2, v0, Lhf2;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 640
    .line 641
    new-instance v1, Lfman/ge/smart_auth/SmartAuthPlugin$SmsBroadcastReceiver;

    .line 642
    .line 643
    invoke-direct {v1, v0}, Lfman/ge/smart_auth/SmartAuthPlugin$SmsBroadcastReceiver;-><init>(Lhf2;)V

    .line 644
    .line 645
    .line 646
    iput-object v1, v0, Lhf2;->f:Lfman/ge/smart_auth/SmartAuthPlugin$SmsBroadcastReceiver;

    .line 647
    .line 648
    iget-object v2, v0, Lhf2;->a:Landroid/content/Context;

    .line 649
    .line 650
    if-eqz v2, :cond_21

    .line 651
    .line 652
    new-instance v3, Landroid/content/IntentFilter;

    .line 653
    .line 654
    invoke-direct {v3, v7}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v2, v1, v3, v6, v15}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 658
    .line 659
    .line 660
    iget-object v0, v0, Lhf2;->a:Landroid/content/Context;

    .line 661
    .line 662
    if-eqz v0, :cond_20

    .line 663
    .line 664
    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzab;

    .line 665
    .line 666
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/auth-api-phone/zzab;-><init>(Landroid/content/Context;)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v1}, Lcom/google/android/gms/internal/auth-api-phone/zzab;->startSmsRetriever()Lcom/google/android/gms/tasks/Task;

    .line 670
    .line 671
    .line 672
    return-void

    .line 673
    :cond_20
    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    throw v15

    .line 677
    :cond_21
    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    throw v15

    .line 681
    :sswitch_6
    const-string v4, "startSmsUserConsent"

    .line 682
    .line 683
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 684
    .line 685
    .line 686
    move-result v3

    .line 687
    if-nez v3, :cond_22

    .line 688
    .line 689
    goto/16 :goto_13

    .line 690
    .line 691
    :cond_22
    iget-object v3, v0, Lhf2;->f:Lfman/ge/smart_auth/SmartAuthPlugin$SmsBroadcastReceiver;

    .line 692
    .line 693
    if-eqz v3, :cond_23

    .line 694
    .line 695
    invoke-virtual {v0, v3}, Lhf2;->d(Landroid/content/BroadcastReceiver;)V

    .line 696
    .line 697
    .line 698
    iput-object v15, v0, Lhf2;->f:Lfman/ge/smart_auth/SmartAuthPlugin$SmsBroadcastReceiver;

    .line 699
    .line 700
    :cond_23
    iget-object v3, v0, Lhf2;->i:Lfman/ge/smart_auth/SmartAuthPlugin$ConsentBroadcastReceiver;

    .line 701
    .line 702
    if-eqz v3, :cond_24

    .line 703
    .line 704
    invoke-virtual {v0, v3}, Lhf2;->d(Landroid/content/BroadcastReceiver;)V

    .line 705
    .line 706
    .line 707
    iput-object v15, v0, Lhf2;->i:Lfman/ge/smart_auth/SmartAuthPlugin$ConsentBroadcastReceiver;

    .line 708
    .line 709
    :cond_24
    iput-object v2, v0, Lhf2;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 710
    .line 711
    new-instance v2, Lfman/ge/smart_auth/SmartAuthPlugin$ConsentBroadcastReceiver;

    .line 712
    .line 713
    invoke-direct {v2, v0}, Lfman/ge/smart_auth/SmartAuthPlugin$ConsentBroadcastReceiver;-><init>(Lhf2;)V

    .line 714
    .line 715
    .line 716
    iput-object v2, v0, Lhf2;->i:Lfman/ge/smart_auth/SmartAuthPlugin$ConsentBroadcastReceiver;

    .line 717
    .line 718
    iget-object v3, v0, Lhf2;->a:Landroid/content/Context;

    .line 719
    .line 720
    if-eqz v3, :cond_26

    .line 721
    .line 722
    new-instance v4, Landroid/content/IntentFilter;

    .line 723
    .line 724
    invoke-direct {v4, v7}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 725
    .line 726
    .line 727
    invoke-virtual {v3, v2, v4, v6, v15}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 728
    .line 729
    .line 730
    iget-object v0, v0, Lhf2;->a:Landroid/content/Context;

    .line 731
    .line 732
    if-eqz v0, :cond_25

    .line 733
    .line 734
    new-instance v2, Lcom/google/android/gms/internal/auth-api-phone/zzab;

    .line 735
    .line 736
    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/auth-api-phone/zzab;-><init>(Landroid/content/Context;)V

    .line 737
    .line 738
    .line 739
    const-string v0, "senderPhoneNumber"

    .line 740
    .line 741
    invoke-virtual {v1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    check-cast v0, Ljava/lang/String;

    .line 746
    .line 747
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/auth-api-phone/zzab;->startSmsUserConsent(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 748
    .line 749
    .line 750
    return-void

    .line 751
    :cond_25
    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 752
    .line 753
    .line 754
    throw v15

    .line 755
    :cond_26
    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 756
    .line 757
    .line 758
    throw v15

    .line 759
    :sswitch_7
    const-string v4, "getCredential"

    .line 760
    .line 761
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 762
    .line 763
    .line 764
    move-result v3

    .line 765
    if-nez v3, :cond_27

    .line 766
    .line 767
    goto/16 :goto_13

    .line 768
    .line 769
    :cond_27
    const-string v3, "accountType"

    .line 770
    .line 771
    invoke-virtual {v1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v3

    .line 775
    check-cast v3, Ljava/lang/String;

    .line 776
    .line 777
    invoke-virtual {v1, v9}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 778
    .line 779
    .line 780
    move-result-object v4

    .line 781
    check-cast v4, Ljava/lang/String;

    .line 782
    .line 783
    invoke-virtual {v1, v11}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v5

    .line 787
    check-cast v5, Ljava/lang/String;

    .line 788
    .line 789
    invoke-virtual {v1, v10}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v6

    .line 793
    check-cast v6, Ljava/lang/Boolean;

    .line 794
    .line 795
    const-string v7, "isPasswordLoginSupported"

    .line 796
    .line 797
    invoke-virtual {v1, v7}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v7

    .line 801
    check-cast v7, Ljava/lang/Boolean;

    .line 802
    .line 803
    const-string v9, "showResolveDialog"

    .line 804
    .line 805
    invoke-virtual {v1, v9}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v1

    .line 809
    check-cast v1, Ljava/lang/Boolean;

    .line 810
    .line 811
    if-eqz v1, :cond_28

    .line 812
    .line 813
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 814
    .line 815
    .line 816
    move-result v1

    .line 817
    goto :goto_e

    .line 818
    :cond_28
    move v1, v13

    .line 819
    :goto_e
    new-array v9, v12, [Ljava/lang/String;

    .line 820
    .line 821
    aput-object v3, v9, v13

    .line 822
    .line 823
    if-eqz v3, :cond_29

    .line 824
    .line 825
    new-array v9, v12, [Ljava/lang/String;

    .line 826
    .line 827
    aput-object v3, v9, v13

    .line 828
    .line 829
    :cond_29
    if-eqz v5, :cond_2a

    .line 830
    .line 831
    move-object/from16 v24, v5

    .line 832
    .line 833
    goto :goto_f

    .line 834
    :cond_2a
    move-object/from16 v24, v15

    .line 835
    .line 836
    :goto_f
    if-eqz v6, :cond_2b

    .line 837
    .line 838
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 839
    .line 840
    .line 841
    move-result v3

    .line 842
    move/from16 v22, v3

    .line 843
    .line 844
    goto :goto_10

    .line 845
    :cond_2b
    move/from16 v22, v13

    .line 846
    .line 847
    :goto_10
    if-eqz v7, :cond_2c

    .line 848
    .line 849
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 850
    .line 851
    .line 852
    move-result v13

    .line 853
    :cond_2c
    move/from16 v18, v13

    .line 854
    .line 855
    if-eqz v4, :cond_2d

    .line 856
    .line 857
    move-object/from16 v23, v4

    .line 858
    .line 859
    goto :goto_11

    .line 860
    :cond_2d
    move-object/from16 v23, v15

    .line 861
    .line 862
    :goto_11
    iget-object v3, v0, Lhf2;->a:Landroid/content/Context;

    .line 863
    .line 864
    if-eqz v3, :cond_30

    .line 865
    .line 866
    invoke-static {v3}, Lhu0;->Z(Landroid/content/Context;)Lfc3;

    .line 867
    .line 868
    .line 869
    move-result-object v3

    .line 870
    if-nez v18, :cond_2f

    .line 871
    .line 872
    array-length v4, v9

    .line 873
    if-eqz v4, :cond_2e

    .line 874
    .line 875
    goto :goto_12

    .line 876
    :cond_2e
    invoke-static {v8}, Lf42;->l(Ljava/lang/String;)V

    .line 877
    .line 878
    .line 879
    return-void

    .line 880
    :cond_2f
    :goto_12
    new-instance v16, Lcom/google/android/gms/auth/api/credentials/CredentialRequest;

    .line 881
    .line 882
    const/16 v21, 0x0

    .line 883
    .line 884
    const/16 v25, 0x0

    .line 885
    .line 886
    const/16 v17, 0x4

    .line 887
    .line 888
    const/16 v20, 0x0

    .line 889
    .line 890
    move-object/from16 v19, v9

    .line 891
    .line 892
    invoke-direct/range {v16 .. v25}, Lcom/google/android/gms/auth/api/credentials/CredentialRequest;-><init>(IZ[Ljava/lang/String;Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;ZLjava/lang/String;Ljava/lang/String;Z)V

    .line 893
    .line 894
    .line 895
    move-object/from16 v4, v16

    .line 896
    .line 897
    sget-object v5, Lce;->c:Lcom/google/android/gms/internal/auth-api/zbl;

    .line 898
    .line 899
    invoke-virtual {v3}, Lor0;->asGoogleApiClient()Ltr0;

    .line 900
    .line 901
    .line 902
    move-result-object v3

    .line 903
    invoke-virtual {v5, v3, v4}, Lcom/google/android/gms/internal/auth-api/zbl;->request(Ltr0;Lcom/google/android/gms/auth/api/credentials/CredentialRequest;)Lsr1;

    .line 904
    .line 905
    .line 906
    move-result-object v3

    .line 907
    new-instance v4, Ln20;

    .line 908
    .line 909
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 910
    .line 911
    .line 912
    new-instance v5, Lac3;

    .line 913
    .line 914
    invoke-direct {v5, v4, v12}, Lac3;-><init>(Ljava/lang/Object;I)V

    .line 915
    .line 916
    .line 917
    new-instance v4, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 918
    .line 919
    invoke-direct {v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 920
    .line 921
    .line 922
    new-instance v6, Lhc3;

    .line 923
    .line 924
    invoke-direct {v6, v3, v4, v5}, Lhc3;-><init>(Lsr1;Lcom/google/android/gms/tasks/TaskCompletionSource;Ltr1;)V

    .line 925
    .line 926
    .line 927
    invoke-virtual {v3, v6}, Lsr1;->addStatusListener(Lrr1;)V

    .line 928
    .line 929
    .line 930
    invoke-virtual {v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 931
    .line 932
    .line 933
    move-result-object v3

    .line 934
    new-instance v4, Lch0;

    .line 935
    .line 936
    invoke-direct {v4, v2, v0, v1}, Lch0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 937
    .line 938
    .line 939
    invoke-virtual {v3, v4}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 940
    .line 941
    .line 942
    return-void

    .line 943
    :cond_30
    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 944
    .line 945
    .line 946
    throw v15

    .line 947
    :sswitch_8
    const-string v1, "stopSmsUserConsent"

    .line 948
    .line 949
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 950
    .line 951
    .line 952
    move-result v1

    .line 953
    if-nez v1, :cond_31

    .line 954
    .line 955
    goto :goto_13

    .line 956
    :cond_31
    iget-object v1, v0, Lhf2;->i:Lfman/ge/smart_auth/SmartAuthPlugin$ConsentBroadcastReceiver;

    .line 957
    .line 958
    if-nez v1, :cond_32

    .line 959
    .line 960
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 961
    .line 962
    invoke-interface {v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 963
    .line 964
    .line 965
    return-void

    .line 966
    :cond_32
    if-eqz v1, :cond_33

    .line 967
    .line 968
    invoke-virtual {v0, v1}, Lhf2;->d(Landroid/content/BroadcastReceiver;)V

    .line 969
    .line 970
    .line 971
    iput-object v15, v0, Lhf2;->i:Lfman/ge/smart_auth/SmartAuthPlugin$ConsentBroadcastReceiver;

    .line 972
    .line 973
    :cond_33
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 974
    .line 975
    invoke-interface {v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 976
    .line 977
    .line 978
    return-void

    .line 979
    :cond_34
    :goto_13
    invoke-interface {v2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    .line 980
    .line 981
    .line 982
    return-void

    .line 983
    :sswitch_data_0
    .sparse-switch
        -0x3f9f6ca8 -> :sswitch_8
        -0x3a7b5fb3 -> :sswitch_7
        -0x7fbd848 -> :sswitch_6
        0x238b3df -> :sswitch_5
        0x6e1a60d -> :sswitch_4
        0x2ffb877f -> :sswitch_3
        0x448765b6 -> :sswitch_2
        0x6e798db4 -> :sswitch_1
        0x7c9d7062 -> :sswitch_0
    .end sparse-switch
.end method

.method public final onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lhf2;->b:Landroid/app/Activity;

    .line 9
    .line 10
    iput-object p1, p0, Lhf2;->c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    .line 11
    .line 12
    invoke-interface {p1, p0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->addActivityResultListener(Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
