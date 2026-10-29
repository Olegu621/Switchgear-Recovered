.class public final Lkj1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public final a:Landroid/app/Activity;

.field public final b:Luh;

.field public c:Lio/flutter/plugin/common/MethodChannel;

.field public d:Lfj1;

.field public e:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Luh;Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/view/TextureRegistry;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lkj1;->a:Landroid/app/Activity;

    .line 11
    .line 12
    iput-object p2, p0, Lkj1;->b:Luh;

    .line 13
    .line 14
    new-instance v4, Lgj1;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-direct {v4, p0, p2}, Lgj1;-><init>(Lkj1;I)V

    .line 18
    .line 19
    .line 20
    new-instance v5, Lgj1;

    .line 21
    .line 22
    const/4 p2, 0x1

    .line 23
    invoke-direct {v5, p0, p2}, Lgj1;-><init>(Lkj1;I)V

    .line 24
    .line 25
    .line 26
    new-instance v3, Lgj1;

    .line 27
    .line 28
    const/4 p2, 0x2

    .line 29
    invoke-direct {v3, p0, p2}, Lgj1;-><init>(Lkj1;I)V

    .line 30
    .line 31
    .line 32
    new-instance p2, Lio/flutter/plugin/common/MethodChannel;

    .line 33
    .line 34
    const-string v0, "com.supercell.social.SocialPlugin.mobile_scanner/method"

    .line 35
    .line 36
    invoke-direct {p2, p3, v0}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iput-object p2, p0, Lkj1;->c:Lio/flutter/plugin/common/MethodChannel;

    .line 40
    .line 41
    invoke-virtual {p2, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Lfj1;

    .line 45
    .line 46
    move-object v1, p1

    .line 47
    move-object v2, p4

    .line 48
    invoke-direct/range {v0 .. v5}, Lfj1;-><init>(Landroid/app/Activity;Lio/flutter/view/TextureRegistry;Lgj1;Lgj1;Lgj1;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lkj1;->d:Lfj1;

    .line 52
    .line 53
    iget-object p1, v0, Lfj1;->f:Li71;

    .line 54
    .line 55
    sget-object p2, Lu61;->c:Lu61;

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Li71;->g(Lu61;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lkj1;->a:Landroid/app/Activity;

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lkj1;->d:Lfj1;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lfj1;->f:Li71;

    .line 17
    .line 18
    sget-object p1, Lu61;->c:Lu61;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Li71;->g(Lu61;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkj1;->a:Landroid/app/Activity;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lkj1;->d:Lfj1;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lfj1;->f:Li71;

    .line 17
    .line 18
    sget-object p1, Lu61;->a:Lu61;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Li71;->g(Lu61;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkj1;->a:Landroid/app/Activity;

    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lkj1;->d:Lfj1;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lfj1;->f:Li71;

    .line 17
    .line 18
    sget-object p1, Lu61;->d:Lu61;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Li71;->g(Lu61;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkj1;->a:Landroid/app/Activity;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_2

    .line 11
    .line 12
    iget-object p1, p0, Lkj1;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-object v1, p0, Lkj1;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    const-string v1, "android.permission.CAMERA"

    .line 20
    .line 21
    invoke-static {v0, v1}, Lv00;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object p0, p0, Lkj1;->d:Lfj1;

    .line 38
    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    iget-object p0, p0, Lfj1;->f:Li71;

    .line 42
    .line 43
    sget-object p1, Lu61;->e:Lu61;

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Li71;->g(Lu61;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkj1;->a:Landroid/app/Activity;

    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lkj1;->d:Lfj1;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lfj1;->f:Li71;

    .line 17
    .line 18
    sget-object p1, Lu61;->d:Lu61;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Li71;->g(Lu61;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkj1;->a:Landroid/app/Activity;

    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lkj1;->d:Lfj1;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lfj1;->f:Li71;

    .line 17
    .line 18
    sget-object p1, Lu61;->c:Lu61;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Li71;->g(Lu61;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 21

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
    iget-object v3, v0, Lkj1;->d:Lfj1;

    .line 14
    .line 15
    iget-object v4, v1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    const-string v0, "Called "

    .line 21
    .line 22
    const-string v1, " before initializing."

    .line 23
    .line 24
    invoke-static {v0, v4, v1}, Lfm0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "MobileScanner"

    .line 29
    .line 30
    invoke-interface {v2, v1, v0, v5}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    if-eqz v4, :cond_21

    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const/4 v6, 0x3

    .line 41
    const/4 v7, 0x0

    .line 42
    const-string v8, "android.permission.CAMERA"

    .line 43
    .line 44
    const/4 v9, 0x1

    .line 45
    sparse-switch v3, :sswitch_data_0

    .line 46
    .line 47
    .line 48
    goto/16 :goto_11

    .line 49
    .line 50
    :sswitch_0
    const-string v1, "scanSingleCode"

    .line 51
    .line 52
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_1

    .line 57
    .line 58
    goto/16 :goto_11

    .line 59
    .line 60
    :cond_1
    iget-object v0, v0, Lkj1;->d:Lfj1;

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    iput-boolean v9, v0, Lfj1;->Z:Z

    .line 65
    .line 66
    :cond_2
    invoke-interface {v2, v5}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :sswitch_1
    const-string v1, "request"

    .line 71
    .line 72
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_3

    .line 77
    .line 78
    goto/16 :goto_11

    .line 79
    .line 80
    :cond_3
    iget-object v1, v0, Lkj1;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 81
    .line 82
    if-eqz v1, :cond_4

    .line 83
    .line 84
    const-string v0, "CameraPermissionsRequestOngoing"

    .line 85
    .line 86
    const-string v1, "Another request is ongoing and multiple requests cannot be handled at once."

    .line 87
    .line 88
    invoke-interface {v2, v0, v1, v5}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_4
    iput-object v2, v0, Lkj1;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 93
    .line 94
    iget-object v0, v0, Lkj1;->a:Landroid/app/Activity;

    .line 95
    .line 96
    filled-new-array {v8}, [Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-static {v0, v1, v7}, Lx2;->a(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :sswitch_2
    const-string v1, "state"

    .line 105
    .line 106
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_21

    .line 111
    .line 112
    iget-object v0, v0, Lkj1;->a:Landroid/app/Activity;

    .line 113
    .line 114
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    const-string v3, "android.hardware.camera"

    .line 119
    .line 120
    invoke-virtual {v1, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-nez v3, :cond_5

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_5
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    const/16 v4, 0x1000

    .line 132
    .line 133
    invoke-virtual {v1, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 138
    .line 139
    if-eqz v1, :cond_8

    .line 140
    .line 141
    array-length v3, v1

    .line 142
    move v4, v7

    .line 143
    :goto_0
    if-ge v4, v3, :cond_8

    .line 144
    .line 145
    aget-object v5, v1, v4

    .line 146
    .line 147
    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v5
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 151
    if-eqz v5, :cond_7

    .line 152
    .line 153
    invoke-static {v0, v8}, Lv00;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-nez v0, :cond_6

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_6
    move v6, v7

    .line 161
    goto :goto_2

    .line 162
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :catch_0
    :cond_8
    :goto_1
    move v6, v9

    .line 166
    :goto_2
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-interface {v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    goto/16 :goto_10

    .line 174
    .line 175
    :sswitch_3
    const-string v3, "start"

    .line 176
    .line 177
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    if-nez v3, :cond_9

    .line 182
    .line 183
    goto/16 :goto_11

    .line 184
    .line 185
    :cond_9
    const-string v3, "viewFinderSize"

    .line 186
    .line 187
    invoke-virtual {v1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    check-cast v3, Ljava/util/Map;

    .line 192
    .line 193
    const-string v4, "height"

    .line 194
    .line 195
    const-string v7, "width"

    .line 196
    .line 197
    if-eqz v3, :cond_f

    .line 198
    .line 199
    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v10

    .line 203
    instance-of v11, v10, Ljava/lang/Double;

    .line 204
    .line 205
    if-eqz v11, :cond_a

    .line 206
    .line 207
    check-cast v10, Ljava/lang/Double;

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_a
    move-object v10, v5

    .line 211
    :goto_3
    if-eqz v10, :cond_b

    .line 212
    .line 213
    invoke-virtual {v10}, Ljava/lang/Double;->doubleValue()D

    .line 214
    .line 215
    .line 216
    move-result-wide v10

    .line 217
    double-to-int v10, v10

    .line 218
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 219
    .line 220
    .line 221
    move-result-object v10

    .line 222
    goto :goto_4

    .line 223
    :cond_b
    move-object v10, v5

    .line 224
    :goto_4
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    instance-of v11, v3, Ljava/lang/Double;

    .line 229
    .line 230
    if-eqz v11, :cond_c

    .line 231
    .line 232
    check-cast v3, Ljava/lang/Double;

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_c
    move-object v3, v5

    .line 236
    :goto_5
    if-eqz v3, :cond_d

    .line 237
    .line 238
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 239
    .line 240
    .line 241
    move-result-wide v11

    .line 242
    double-to-int v3, v11

    .line 243
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    goto :goto_6

    .line 248
    :cond_d
    move-object v3, v5

    .line 249
    :goto_6
    if-eqz v10, :cond_e

    .line 250
    .line 251
    if-eqz v3, :cond_e

    .line 252
    .line 253
    new-instance v11, Landroid/util/Size;

    .line 254
    .line 255
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 256
    .line 257
    .line 258
    move-result v10

    .line 259
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    invoke-direct {v11, v10, v3}, Landroid/util/Size;-><init>(II)V

    .line 264
    .line 265
    .line 266
    goto :goto_7

    .line 267
    :cond_e
    move-object v11, v5

    .line 268
    :goto_7
    move-object/from16 v16, v11

    .line 269
    .line 270
    goto :goto_8

    .line 271
    :cond_f
    move-object/from16 v16, v5

    .line 272
    .line 273
    :goto_8
    const-string v3, "scanWindowSize"

    .line 274
    .line 275
    invoke-virtual {v1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    check-cast v1, Ljava/util/Map;

    .line 280
    .line 281
    if-eqz v1, :cond_15

    .line 282
    .line 283
    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    instance-of v7, v3, Ljava/lang/Double;

    .line 288
    .line 289
    if-eqz v7, :cond_10

    .line 290
    .line 291
    check-cast v3, Ljava/lang/Double;

    .line 292
    .line 293
    goto :goto_9

    .line 294
    :cond_10
    move-object v3, v5

    .line 295
    :goto_9
    if-eqz v3, :cond_11

    .line 296
    .line 297
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 298
    .line 299
    .line 300
    move-result-wide v10

    .line 301
    double-to-int v3, v10

    .line 302
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    goto :goto_a

    .line 307
    :cond_11
    move-object v3, v5

    .line 308
    :goto_a
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    instance-of v4, v1, Ljava/lang/Double;

    .line 313
    .line 314
    if-eqz v4, :cond_12

    .line 315
    .line 316
    check-cast v1, Ljava/lang/Double;

    .line 317
    .line 318
    goto :goto_b

    .line 319
    :cond_12
    move-object v1, v5

    .line 320
    :goto_b
    if-eqz v1, :cond_13

    .line 321
    .line 322
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 323
    .line 324
    .line 325
    move-result-wide v10

    .line 326
    double-to-int v1, v10

    .line 327
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    goto :goto_c

    .line 332
    :cond_13
    move-object v1, v5

    .line 333
    :goto_c
    if-eqz v3, :cond_14

    .line 334
    .line 335
    if-eqz v1, :cond_14

    .line 336
    .line 337
    new-instance v4, Landroid/util/Size;

    .line 338
    .line 339
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 340
    .line 341
    .line 342
    move-result v3

    .line 343
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    invoke-direct {v4, v3, v1}, Landroid/util/Size;-><init>(II)V

    .line 348
    .line 349
    .line 350
    goto :goto_d

    .line 351
    :cond_14
    move-object v4, v5

    .line 352
    :goto_d
    move-object/from16 v17, v4

    .line 353
    .line 354
    goto :goto_e

    .line 355
    :cond_15
    move-object/from16 v17, v5

    .line 356
    .line 357
    :goto_e
    iget-object v13, v0, Lkj1;->d:Lfj1;

    .line 358
    .line 359
    if-eqz v13, :cond_20

    .line 360
    .line 361
    new-instance v0, Lij1;

    .line 362
    .line 363
    invoke-direct {v0, v9, v2}, Lij1;-><init>(ILio/flutter/plugin/common/MethodChannel$Result;)V

    .line 364
    .line 365
    .line 366
    new-instance v15, Lij1;

    .line 367
    .line 368
    invoke-direct {v15, v6, v2}, Lij1;-><init>(ILio/flutter/plugin/common/MethodChannel$Result;)V

    .line 369
    .line 370
    .line 371
    iget-object v1, v13, Lfj1;->a:Landroid/app/Activity;

    .line 372
    .line 373
    invoke-static {v1, v8}, Lv00;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 374
    .line 375
    .line 376
    move-result v2

    .line 377
    if-eqz v2, :cond_16

    .line 378
    .line 379
    new-instance v0, Ljava/lang/SecurityException;

    .line 380
    .line 381
    const-string v1, "Camera permission not granted"

    .line 382
    .line 383
    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v15, v0}, Lij1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    return-void

    .line 390
    :cond_16
    iget-object v2, v13, Lfj1;->v:Ly61;

    .line 391
    .line 392
    if-eqz v2, :cond_17

    .line 393
    .line 394
    iget-object v2, v2, Ly61;->c:Lqq;

    .line 395
    .line 396
    iget-object v5, v2, Lqq;->a0:Lg42;

    .line 397
    .line 398
    :cond_17
    if-eqz v5, :cond_18

    .line 399
    .line 400
    iget-object v2, v13, Lfj1;->w:Lvw1;

    .line 401
    .line 402
    if-eqz v2, :cond_18

    .line 403
    .line 404
    iget-object v2, v13, Lfj1;->U:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    .line 405
    .line 406
    if-eqz v2, :cond_18

    .line 407
    .line 408
    invoke-interface {v2}, Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;->surfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    if-eqz v2, :cond_18

    .line 413
    .line 414
    invoke-static {v2}, Lwt0;->z(Landroid/graphics/SurfaceTexture;)Z

    .line 415
    .line 416
    .line 417
    move-result v2

    .line 418
    if-nez v2, :cond_18

    .line 419
    .line 420
    new-instance v0, Lt7;

    .line 421
    .line 422
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v15, v0}, Lij1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    return-void

    .line 429
    :cond_18
    iget-object v2, v13, Lfj1;->U:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    .line 430
    .line 431
    if-eqz v2, :cond_19

    .line 432
    .line 433
    invoke-interface {v2}, Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;->surfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    if-eqz v2, :cond_19

    .line 438
    .line 439
    invoke-static {v2}, Lwt0;->z(Landroid/graphics/SurfaceTexture;)Z

    .line 440
    .line 441
    .line 442
    move-result v2

    .line 443
    if-ne v2, v9, :cond_19

    .line 444
    .line 445
    new-instance v0, Ltp;

    .line 446
    .line 447
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v15, v0}, Lij1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    return-void

    .line 454
    :cond_19
    iget-object v2, v13, Lfj1;->f:Li71;

    .line 455
    .line 456
    sget-object v3, Lu61;->e:Lu61;

    .line 457
    .line 458
    invoke-virtual {v2, v3}, Li71;->g(Lu61;)V

    .line 459
    .line 460
    .line 461
    sget-object v2, Lsx1;->g:Lsx1;

    .line 462
    .line 463
    invoke-static {v1}, Lj13;->h(Landroid/content/Context;)Lls;

    .line 464
    .line 465
    .line 466
    move-result-object v14

    .line 467
    invoke-static {v1}, Lv00;->getMainExecutor(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 468
    .line 469
    .line 470
    move-result-object v19

    .line 471
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    new-instance v12, Lqv0;

    .line 475
    .line 476
    const/16 v20, 0x1

    .line 477
    .line 478
    move-object/from16 v18, v0

    .line 479
    .line 480
    invoke-direct/range {v12 .. v20}, Lqv0;-><init>(Lg71;Lls;Lkotlin/jvm/functions/Function1;Landroid/util/Size;Landroid/util/Size;Lkotlin/jvm/functions/Function1;Ljava/util/concurrent/Executor;I)V

    .line 481
    .line 482
    .line 483
    move-object/from16 v0, v19

    .line 484
    .line 485
    invoke-virtual {v14, v12, v0}, Lyo0;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 486
    .line 487
    .line 488
    return-void

    .line 489
    :sswitch_4
    const-string v1, "stop"

    .line 490
    .line 491
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    move-result v1

    .line 495
    if-nez v1, :cond_1a

    .line 496
    .line 497
    goto :goto_11

    .line 498
    :cond_1a
    :try_start_1
    iget-object v0, v0, Lkj1;->d:Lfj1;

    .line 499
    .line 500
    if-eqz v0, :cond_1f

    .line 501
    .line 502
    iget-object v1, v0, Lfj1;->v:Ly61;

    .line 503
    .line 504
    if-nez v1, :cond_1b

    .line 505
    .line 506
    iget-object v1, v0, Lfj1;->w:Lvw1;

    .line 507
    .line 508
    if-nez v1, :cond_1b

    .line 509
    .line 510
    move v7, v9

    .line 511
    :cond_1b
    if-nez v7, :cond_1e

    .line 512
    .line 513
    iget-object v1, v0, Lfj1;->W:La02;

    .line 514
    .line 515
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 516
    .line 517
    .line 518
    iget-object v1, v0, Lfj1;->i:Lsx1;

    .line 519
    .line 520
    if-eqz v1, :cond_1c

    .line 521
    .line 522
    invoke-virtual {v1}, Lsx1;->f()V

    .line 523
    .line 524
    .line 525
    :cond_1c
    iget-object v1, v0, Lfj1;->U:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    .line 526
    .line 527
    if-eqz v1, :cond_1d

    .line 528
    .line 529
    invoke-interface {v1}, Lio/flutter/view/TextureRegistry$TextureEntry;->release()V

    .line 530
    .line 531
    .line 532
    :cond_1d
    iput-object v5, v0, Lfj1;->v:Ly61;

    .line 533
    .line 534
    iput-object v5, v0, Lfj1;->w:Lvw1;

    .line 535
    .line 536
    iput-object v5, v0, Lfj1;->U:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    .line 537
    .line 538
    iput-object v5, v0, Lfj1;->i:Lsx1;

    .line 539
    .line 540
    goto :goto_f

    .line 541
    :cond_1e
    new-instance v0, Lu7;

    .line 542
    .line 543
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 544
    .line 545
    .line 546
    throw v0

    .line 547
    :cond_1f
    :goto_f
    invoke-interface {v2, v5}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_1
    .catch Lu7; {:try_start_1 .. :try_end_1} :catch_1

    .line 548
    .line 549
    .line 550
    goto :goto_10

    .line 551
    :catch_1
    invoke-interface {v2, v5}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    :cond_20
    :goto_10
    return-void

    .line 555
    :cond_21
    :goto_11
    invoke-interface {v2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    .line 556
    .line 557
    .line 558
    return-void

    .line 559
    :sswitch_data_0
    .sparse-switch
        0x360802 -> :sswitch_4
        0x68ac462 -> :sswitch_3
        0x68ac491 -> :sswitch_2
        0x414ef28f -> :sswitch_1
        0x4520acb2 -> :sswitch_0
    .end sparse-switch
.end method
