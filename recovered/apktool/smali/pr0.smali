.class public Lpr0;
.super Lqr0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final c:Ljava/lang/Object;

.field public static final d:Lpr0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lpr0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Lpr0;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lpr0;->d:Lpr0;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static e(Landroid/app/Activity;ILyb3;Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    new-instance v1, Landroid/util/TypedValue;

    .line 6
    .line 7
    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const v3, 0x1010309

    .line 15
    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    invoke-virtual {v2, v3, v1, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "Theme.Dialog.Alert"

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 40
    .line 41
    const/4 v2, 0x5

    .line 42
    invoke-direct {v1, p0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move-object v1, v0

    .line 47
    :goto_0
    if-nez v1, :cond_2

    .line 48
    .line 49
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 50
    .line 51
    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-static {p0, p1}, Lhb3;->b(Landroid/content/Context;I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 59
    .line 60
    .line 61
    if-eqz p3, :cond_3

    .line 62
    .line 63
    invoke-virtual {v1, p3}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 64
    .line 65
    .line 66
    :cond_3
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    if-eq p1, v4, :cond_6

    .line 71
    .line 72
    const/4 v2, 0x2

    .line 73
    if-eq p1, v2, :cond_5

    .line 74
    .line 75
    const/4 v2, 0x3

    .line 76
    if-eq p1, v2, :cond_4

    .line 77
    .line 78
    const v2, 0x104000a

    .line 79
    .line 80
    .line 81
    invoke-virtual {p3, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    goto :goto_1

    .line 86
    :cond_4
    sget v2, Lcom/google/android/gms/base/R$string;->common_google_play_services_enable_button:I

    .line 87
    .line 88
    invoke-virtual {p3, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    goto :goto_1

    .line 93
    :cond_5
    sget v2, Lcom/google/android/gms/base/R$string;->common_google_play_services_update_button:I

    .line 94
    .line 95
    invoke-virtual {p3, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    goto :goto_1

    .line 100
    :cond_6
    sget v2, Lcom/google/android/gms/base/R$string;->common_google_play_services_install_button:I

    .line 101
    .line 102
    invoke-virtual {p3, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p3

    .line 106
    :goto_1
    if-eqz p3, :cond_8

    .line 107
    .line 108
    if-nez p2, :cond_7

    .line 109
    .line 110
    move-object p2, v0

    .line 111
    :cond_7
    invoke-virtual {v1, p3, p2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 112
    .line 113
    .line 114
    :cond_8
    invoke-static {p0, p1}, Lhb3;->c(Landroid/content/Context;I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    if-eqz p0, :cond_9

    .line 119
    .line 120
    invoke-virtual {v1, p0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 121
    .line 122
    .line 123
    :cond_9
    const-string p0, "Creating dialog for Google Play services availability issue. ConnectionResult="

    .line 124
    .line 125
    invoke-static {p1, p0}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 130
    .line 131
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 132
    .line 133
    .line 134
    const-string p2, "GoogleApiAvailability"

    .line 135
    .line 136
    invoke-static {p2, p0, p1}, Lio/sentry/android/core/n0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    return-object p0
.end method

.method public static f(Landroid/app/Activity;Landroid/app/AlertDialog;Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V
    .locals 3

    .line 1
    const-string v0, "Cannot display null dialog"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    instance-of v2, p0, Landroidx/fragment/app/FragmentActivity;
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    .line 6
    if-eqz v2, :cond_1

    .line 7
    .line 8
    check-cast p0, Landroidx/fragment/app/FragmentActivity;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/w;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance v2, Lvi2;

    .line 15
    .line 16
    invoke-direct {v2}, Lvi2;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, v2, Lvi2;->b0:Landroid/app/Dialog;

    .line 29
    .line 30
    if-eqz p3, :cond_0

    .line 31
    .line 32
    iput-object p3, v2, Lvi2;->c0:Landroid/content/DialogInterface$OnCancelListener;

    .line 33
    .line 34
    :cond_0
    const/4 p1, 0x0

    .line 35
    iput-boolean p1, v2, Landroidx/fragment/app/i;->Y:Z

    .line 36
    .line 37
    const/4 p3, 0x1

    .line 38
    iput-boolean p3, v2, Landroidx/fragment/app/i;->Z:Z

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v0, Landroidx/fragment/app/a;

    .line 44
    .line 45
    invoke-direct {v0, p0}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/w;)V

    .line 46
    .line 47
    .line 48
    iput-boolean p3, v0, Landroidx/fragment/app/a;->p:Z

    .line 49
    .line 50
    invoke-virtual {v0, p1, v2, p2, p3}, Landroidx/fragment/app/a;->e(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p1}, Landroidx/fragment/app/a;->d(Z)I

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :catch_0
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance v2, Lqe0;

    .line 62
    .line 63
    invoke-direct {v2}, Landroid/app/DialogFragment;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-static {p1, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 73
    .line 74
    .line 75
    iput-object p1, v2, Lqe0;->a:Landroid/app/Dialog;

    .line 76
    .line 77
    if-eqz p3, :cond_2

    .line 78
    .line 79
    iput-object p3, v2, Lqe0;->b:Landroid/content/DialogInterface$OnCancelListener;

    .line 80
    .line 81
    :cond_2
    invoke-virtual {v2, p0, p2}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method


# virtual methods
.method public final b(Landroid/content/Context;)I
    .locals 1

    .line 1
    sget v0, Lqr0;->a:I

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lqr0;->c(Landroid/content/Context;I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final d(Lcom/google/android/gms/common/api/GoogleApiActivity;ILcom/google/android/gms/common/api/GoogleApiActivity;)V
    .locals 1

    .line 1
    const-string v0, "d"

    .line 2
    .line 3
    invoke-super {p0, p1, v0, p2}, Lqr0;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/Intent;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x2

    .line 8
    invoke-static {p1, p0, v0}, Lyb3;->b(Landroid/app/Activity;Landroid/content/Intent;I)Lyb3;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p1, p2, p0, p3}, Lpr0;->e(Landroid/app/Activity;ILyb3;Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p2, "GooglePlayServicesErrorDialog"

    .line 20
    .line 21
    invoke-static {p1, p0, p2, p3}, Lpr0;->f(Landroid/app/Activity;Landroid/app/AlertDialog;Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final g(Landroid/content/Context;ILandroid/app/PendingIntent;)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "GMS core API Availability. ConnectionResult="

    .line 6
    .line 7
    const-string v3, ", tag=null"

    .line 8
    .line 9
    invoke-static {v1, v2, v3}, Len;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    invoke-direct {v3}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v4, "GoogleApiAvailability"

    .line 19
    .line 20
    invoke-static {v4, v2, v3}, Lio/sentry/android/core/n0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    const/16 v2, 0x12

    .line 24
    .line 25
    const/4 v13, 0x1

    .line 26
    if-ne v1, v2, :cond_0

    .line 27
    .line 28
    new-instance v1, Lqb3;

    .line 29
    .line 30
    move-object/from16 v2, p0

    .line 31
    .line 32
    invoke-direct {v1, v2, v0}, Lqb3;-><init>(Lpr0;Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    const-wide/32 v2, 0x1d4c0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v13, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    const/4 v2, 0x6

    .line 43
    if-nez p3, :cond_2

    .line 44
    .line 45
    if-ne v1, v2, :cond_1

    .line 46
    .line 47
    const-string v0, "GoogleApiAvailability"

    .line 48
    .line 49
    const-string v1, "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead."

    .line 50
    .line 51
    invoke-static {v0, v1}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void

    .line 55
    :cond_2
    if-ne v1, v2, :cond_3

    .line 56
    .line 57
    const-string v3, "common_google_play_services_resolution_required_title"

    .line 58
    .line 59
    invoke-static {v0, v3}, Lhb3;->e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    goto :goto_0

    .line 64
    :cond_3
    invoke-static/range {p1 .. p2}, Lhb3;->c(Landroid/content/Context;I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    :goto_0
    if-nez v3, :cond_4

    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    sget v4, Lcom/google/android/gms/base/R$string;->common_google_play_services_notification_ticker:I

    .line 75
    .line 76
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    :cond_4
    if-eq v1, v2, :cond_6

    .line 81
    .line 82
    const/16 v2, 0x13

    .line 83
    .line 84
    if-ne v1, v2, :cond_5

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    invoke-static/range {p1 .. p2}, Lhb3;->b(Landroid/content/Context;I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    goto :goto_2

    .line 92
    :cond_6
    :goto_1
    invoke-static {v0}, Lhb3;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    const-string v4, "common_google_play_services_resolution_required_text"

    .line 97
    .line 98
    invoke-static {v0, v4, v2}, Lhb3;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    :goto_2
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    const-string v5, "notification"

    .line 107
    .line 108
    invoke-virtual {v0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-static {v5}, Lkb1;->n(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    move-object v14, v5

    .line 116
    check-cast v14, Landroid/app/NotificationManager;

    .line 117
    .line 118
    new-instance v15, Lpo1;

    .line 119
    .line 120
    const/4 v5, 0x0

    .line 121
    invoke-direct {v15, v0, v5}, Lpo1;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    iput-boolean v13, v15, Lpo1;->n:Z

    .line 125
    .line 126
    invoke-virtual {v15, v13}, Lpo1;->c(Z)V

    .line 127
    .line 128
    .line 129
    invoke-static {v3}, Lpo1;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    iput-object v3, v15, Lpo1;->e:Ljava/lang/CharSequence;

    .line 134
    .line 135
    new-instance v3, Ljo1;

    .line 136
    .line 137
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-static {v2}, Lpo1;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    iput-object v6, v3, Ljo1;->b:Ljava/lang/CharSequence;

    .line 145
    .line 146
    invoke-virtual {v15, v3}, Lpo1;->g(Lsq3;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v0}, Li13;->u(Landroid/content/Context;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    const/4 v6, 0x2

    .line 154
    if-eqz v3, :cond_9

    .line 155
    .line 156
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    iget v2, v2, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 161
    .line 162
    iget-object v3, v15, Lpo1;->t:Landroid/app/Notification;

    .line 163
    .line 164
    iput v2, v3, Landroid/app/Notification;->icon:I

    .line 165
    .line 166
    iput v6, v15, Lpo1;->j:I

    .line 167
    .line 168
    invoke-static {v0}, Li13;->v(Landroid/content/Context;)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_8

    .line 173
    .line 174
    sget v2, Lcom/google/android/gms/base/R$drawable;->common_full_open_on_phone:I

    .line 175
    .line 176
    sget v3, Lcom/google/android/gms/base/R$string;->common_open_on_phone:I

    .line 177
    .line 178
    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    iget-object v3, v15, Lpo1;->b:Ljava/util/ArrayList;

    .line 183
    .line 184
    new-instance v7, Lyn1;

    .line 185
    .line 186
    if-nez v2, :cond_7

    .line 187
    .line 188
    :goto_3
    move v2, v6

    .line 189
    goto :goto_4

    .line 190
    :cond_7
    const-string v5, ""

    .line 191
    .line 192
    invoke-static {v2, v5}, Landroidx/core/graphics/drawable/IconCompat;->b(ILjava/lang/String;)Landroidx/core/graphics/drawable/IconCompat;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    goto :goto_3

    .line 197
    :goto_4
    new-instance v6, Landroid/os/Bundle;

    .line 198
    .line 199
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 200
    .line 201
    .line 202
    const/4 v11, 0x0

    .line 203
    const/4 v12, 0x0

    .line 204
    move v8, v2

    .line 205
    move-object v2, v7

    .line 206
    const/4 v7, 0x0

    .line 207
    move v9, v8

    .line 208
    const/4 v8, 0x1

    .line 209
    move v10, v9

    .line 210
    const/4 v9, 0x0

    .line 211
    move/from16 v16, v10

    .line 212
    .line 213
    const/4 v10, 0x1

    .line 214
    move-object v13, v3

    .line 215
    move-object v3, v5

    .line 216
    move/from16 v0, v16

    .line 217
    .line 218
    move-object/from16 v5, p3

    .line 219
    .line 220
    invoke-direct/range {v2 .. v12}, Lyn1;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Lg32;ZIZZZ)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    goto :goto_5

    .line 227
    :cond_8
    move-object/from16 v5, p3

    .line 228
    .line 229
    move v0, v6

    .line 230
    iput-object v5, v15, Lpo1;->g:Landroid/app/PendingIntent;

    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_9
    move-object/from16 v5, p3

    .line 234
    .line 235
    move v0, v6

    .line 236
    const v3, 0x108008a

    .line 237
    .line 238
    .line 239
    iget-object v6, v15, Lpo1;->t:Landroid/app/Notification;

    .line 240
    .line 241
    iput v3, v6, Landroid/app/Notification;->icon:I

    .line 242
    .line 243
    sget v3, Lcom/google/android/gms/base/R$string;->common_google_play_services_notification_ticker:I

    .line 244
    .line 245
    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    iget-object v4, v15, Lpo1;->t:Landroid/app/Notification;

    .line 250
    .line 251
    invoke-static {v3}, Lpo1;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    iput-object v3, v4, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 256
    .line 257
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 258
    .line 259
    .line 260
    move-result-wide v3

    .line 261
    iget-object v6, v15, Lpo1;->t:Landroid/app/Notification;

    .line 262
    .line 263
    iput-wide v3, v6, Landroid/app/Notification;->when:J

    .line 264
    .line 265
    iput-object v5, v15, Lpo1;->g:Landroid/app/PendingIntent;

    .line 266
    .line 267
    invoke-static {v2}, Lpo1;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    iput-object v2, v15, Lpo1;->f:Ljava/lang/CharSequence;

    .line 272
    .line 273
    :goto_5
    invoke-static {}, Lj13;->l()Z

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    if-nez v2, :cond_a

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_a
    invoke-static {}, Lj13;->l()Z

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    invoke-static {v2}, Lkb1;->r(Z)V

    .line 285
    .line 286
    .line 287
    sget-object v2, Lpr0;->c:Ljava/lang/Object;

    .line 288
    .line 289
    monitor-enter v2

    .line 290
    :try_start_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 291
    const-string v2, "com.google.android.gms.availability"

    .line 292
    .line 293
    invoke-static {v14}, Lp30;->b(Landroid/app/NotificationManager;)Landroid/app/NotificationChannel;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    sget v5, Lcom/google/android/gms/base/R$string;->common_google_play_services_notification_channel_name:I

    .line 302
    .line 303
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    if-nez v3, :cond_b

    .line 308
    .line 309
    invoke-static {v4}, Lp30;->c(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    invoke-static {v14, v3}, Lp30;->r(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 314
    .line 315
    .line 316
    goto :goto_6

    .line 317
    :cond_b
    invoke-static {v3}, Lp30;->k(Landroid/app/NotificationChannel;)Ljava/lang/CharSequence;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    invoke-virtual {v4, v5}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    .line 322
    .line 323
    .line 324
    move-result v5

    .line 325
    if-nez v5, :cond_c

    .line 326
    .line 327
    invoke-static {v3, v4}, Lp30;->p(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    invoke-static {v14, v3}, Lp30;->r(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 331
    .line 332
    .line 333
    :cond_c
    :goto_6
    iput-object v2, v15, Lpo1;->r:Ljava/lang/String;

    .line 334
    .line 335
    :goto_7
    invoke-virtual {v15}, Lpo1;->a()Landroid/app/Notification;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    const/4 v3, 0x1

    .line 340
    if-eq v1, v3, :cond_d

    .line 341
    .line 342
    if-eq v1, v0, :cond_d

    .line 343
    .line 344
    const/4 v0, 0x3

    .line 345
    if-eq v1, v0, :cond_d

    .line 346
    .line 347
    const v0, 0x9b6d

    .line 348
    .line 349
    .line 350
    goto :goto_8

    .line 351
    :cond_d
    sget-object v0, Lwr0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 352
    .line 353
    const/4 v1, 0x0

    .line 354
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 355
    .line 356
    .line 357
    const/16 v0, 0x28c4

    .line 358
    .line 359
    :goto_8
    invoke-virtual {v14, v0, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 360
    .line 361
    .line 362
    return-void

    .line 363
    :catchall_0
    move-exception v0

    .line 364
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 365
    throw v0
.end method

.method public final h(Landroid/app/Activity;Le71;ILandroid/content/DialogInterface$OnCancelListener;)V
    .locals 1

    .line 1
    const-string v0, "d"

    .line 2
    .line 3
    invoke-super {p0, p1, v0, p3}, Lqr0;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/Intent;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x2

    .line 8
    invoke-static {p2, p0, v0}, Lyb3;->c(Le71;Landroid/content/Intent;I)Lyb3;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p1, p3, p0, p4}, Lpr0;->e(Landroid/app/Activity;ILyb3;Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p2, "GooglePlayServicesErrorDialog"

    .line 20
    .line 21
    invoke-static {p1, p0, p2, p4}, Lpr0;->f(Landroid/app/Activity;Landroid/app/AlertDialog;Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
