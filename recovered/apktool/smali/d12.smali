.class public final Ld12;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;
.implements Lio/flutter/embedding/engine/plugins/activity/ActivityAware;


# instance fields
.field public a:Lio/flutter/plugin/common/MethodChannel;

.field public b:Lcom/google/android/recaptcha/RecaptchaClient;

.field public c:Landroid/app/Application;


# virtual methods
.method public final onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Ld12;->c:Landroid/app/Application;

    .line 16
    .line 17
    return-void
.end method

.method public final onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 2

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
    move-result-object p1

    .line 10
    const-string v1, "recaptcha_enterprise"

    .line 11
    .line 12
    invoke-direct {v0, p1, v1}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Ld12;->a:Lio/flutter/plugin/common/MethodChannel;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onDetachedFromActivity()V
    .locals 0

    .line 1
    return-void
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 0

    .line 1
    return-void
.end method

.method public final onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ld12;->a:Lio/flutter/plugin/common/MethodChannel;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "channel"

    .line 14
    .line 15
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1
.end method

.method public final onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v2, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v2, :cond_e

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const v5, -0x4ea7088b    # -3.15728E-9f

    .line 16
    .line 17
    .line 18
    const/4 v7, 0x3

    .line 19
    const-string v6, "timeout"

    .line 20
    .line 21
    sget-object v8, Ljr0;->a:Ljr0;

    .line 22
    .line 23
    const/4 v9, 0x0

    .line 24
    const-string v10, "No application registered"

    .line 25
    .line 26
    const-string v11, "FL_INIT_FAILED"

    .line 27
    .line 28
    if-eq v3, v5, :cond_7

    .line 29
    .line 30
    const v5, -0xc52c705

    .line 31
    .line 32
    .line 33
    const-string v12, "siteKey"

    .line 34
    .line 35
    if-eq v3, v5, :cond_3

    .line 36
    .line 37
    const v5, 0x52f7325

    .line 38
    .line 39
    .line 40
    if-eq v3, v5, :cond_0

    .line 41
    .line 42
    goto/16 :goto_2

    .line 43
    .line 44
    :cond_0
    const-string v3, "fetchClient"

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_1

    .line 51
    .line 52
    goto/16 :goto_2

    .line 53
    .line 54
    :cond_1
    iget-object v2, p0, Ld12;->c:Landroid/app/Application;

    .line 55
    .line 56
    if-nez v2, :cond_2

    .line 57
    .line 58
    invoke-interface {p2, v11, v10, v9}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    invoke-virtual {p1, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    move-object v3, v0

    .line 67
    check-cast v3, Ljava/lang/String;

    .line 68
    .line 69
    if-eqz v3, :cond_6

    .line 70
    .line 71
    new-instance v0, Lb12;

    .line 72
    .line 73
    const/4 v5, 0x0

    .line 74
    move-object v1, p0

    .line 75
    move-object v4, p2

    .line 76
    invoke-direct/range {v0 .. v5}, Lb12;-><init>(Ld12;Landroid/app/Application;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;Lc10;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v8, v9, v0, v7}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_3
    const-string v3, "initClient"

    .line 84
    .line 85
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-nez v2, :cond_4

    .line 90
    .line 91
    goto/16 :goto_2

    .line 92
    .line 93
    :cond_4
    iget-object v2, p0, Ld12;->c:Landroid/app/Application;

    .line 94
    .line 95
    if-nez v2, :cond_5

    .line 96
    .line 97
    invoke-interface {p2, v11, v10, v9}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_5
    invoke-virtual {p1, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    check-cast v3, Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {p1, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    check-cast v0, Ljava/lang/Double;

    .line 112
    .line 113
    if-eqz v3, :cond_6

    .line 114
    .line 115
    move-object v1, v0

    .line 116
    new-instance v0, Lc12;

    .line 117
    .line 118
    const/4 v6, 0x0

    .line 119
    move-object v4, p0

    .line 120
    move-object v5, p2

    .line 121
    invoke-direct/range {v0 .. v6}, Lc12;-><init>(Ljava/lang/Double;Landroid/app/Application;Ljava/lang/String;Ld12;Lio/flutter/plugin/common/MethodChannel$Result;Lc10;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v8, v9, v0, v7}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 125
    .line 126
    .line 127
    :cond_6
    return-void

    .line 128
    :cond_7
    const-string v3, "execute"

    .line 129
    .line 130
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-nez v2, :cond_8

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_8
    iget-object v2, p0, Ld12;->b:Lcom/google/android/recaptcha/RecaptchaClient;

    .line 138
    .line 139
    const-string v3, "FL_EXECUTE_FAILED"

    .line 140
    .line 141
    if-eqz v2, :cond_d

    .line 142
    .line 143
    iget-object v2, p0, Ld12;->c:Landroid/app/Application;

    .line 144
    .line 145
    if-nez v2, :cond_9

    .line 146
    .line 147
    invoke-interface {p2, v11, v10, v9}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_9
    const-string v2, "action"

    .line 152
    .line 153
    invoke-virtual {p1, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    check-cast v2, Ljava/lang/String;

    .line 158
    .line 159
    if-nez v2, :cond_a

    .line 160
    .line 161
    const-string v0, "Missing action"

    .line 162
    .line 163
    invoke-interface {p2, v3, v0, v9}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :cond_a
    const-string v3, "login"

    .line 168
    .line 169
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    if-eqz v3, :cond_b

    .line 174
    .line 175
    sget-object v2, Lcom/google/android/recaptcha/RecaptchaAction;->LOGIN:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 176
    .line 177
    :goto_0
    move-object v3, v2

    .line 178
    goto :goto_1

    .line 179
    :cond_b
    const-string v3, "signup"

    .line 180
    .line 181
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-eqz v3, :cond_c

    .line 186
    .line 187
    sget-object v2, Lcom/google/android/recaptcha/RecaptchaAction;->SIGNUP:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 188
    .line 189
    goto :goto_0

    .line 190
    :cond_c
    sget-object v3, Lcom/google/android/recaptcha/RecaptchaAction;->Companion:Lcom/google/android/recaptcha/RecaptchaAction$Companion;

    .line 191
    .line 192
    invoke-virtual {v3, v2}, Lcom/google/android/recaptcha/RecaptchaAction$Companion;->custom(Ljava/lang/String;)Lcom/google/android/recaptcha/RecaptchaAction;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    goto :goto_0

    .line 197
    :goto_1
    invoke-virtual {p1, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    move-object v2, v0

    .line 202
    check-cast v2, Ljava/lang/Double;

    .line 203
    .line 204
    new-instance v0, La12;

    .line 205
    .line 206
    const/4 v5, 0x0

    .line 207
    move-object v1, p0

    .line 208
    move-object v4, p2

    .line 209
    invoke-direct/range {v0 .. v5}, La12;-><init>(Ld12;Ljava/lang/Double;Lcom/google/android/recaptcha/RecaptchaAction;Lio/flutter/plugin/common/MethodChannel$Result;Lc10;)V

    .line 210
    .line 211
    .line 212
    invoke-static {v8, v9, v0, v7}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :cond_d
    const-string v0, "Initialize client first"

    .line 217
    .line 218
    invoke-interface {p2, v3, v0, v9}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    return-void

    .line 222
    :cond_e
    :goto_2
    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    .line 223
    .line 224
    .line 225
    return-void
.end method

.method public final onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method
