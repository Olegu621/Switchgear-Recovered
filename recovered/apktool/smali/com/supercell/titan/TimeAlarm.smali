.class public Lcom/supercell/titan/TimeAlarm;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final DEFAULT_CHANNEL_ID:Ljava/lang/String;

.field public static final NOTIFICATION_CHANNEL_DESCRIPTION:Ljava/lang/String;

.field public static final NOTIFICATION_CHANNEL_ID:Ljava/lang/String;

.field public static final NOTIFICATION_CHANNEL_NAME:Ljava/lang/String;

.field public static final NOTIFICATION_CHRONOS_ID:Ljava/lang/String;

.field public static final NOTIFICATION_COLOR:Ljava/lang/String;

.field public static final NOTIFICATION_ICON_RESOURCE_NAME:Ljava/lang/String;

.field public static final NOTIFICATION_ID:Ljava/lang/String;

.field public static final NOTIFICATION_IMAGE_URL:Ljava/lang/String;

.field public static final NOTIFICATION_MESSAGE:Ljava/lang/String;

.field public static final NOTIFICATION_SOUND:Ljava/lang/String;

.field public static final NOTIFICATION_SOURCE:Ljava/lang/String;

.field public static final NOTIFICATION_TITLE:Ljava/lang/String;

.field public static final NOTIFICATION_UNIQUE_ID:Ljava/lang/String;

.field public static final NOTIFICATION_USER_ID:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/supercell/titan/TimeAlarm;

    const v1, 0x5

    const-string v0, "default"

    sput-object v0, Lcom/supercell/titan/TimeAlarm;->DEFAULT_CHANNEL_ID:Ljava/lang/String;

    const-string v0, "channelDesc"

    sput-object v0, Lcom/supercell/titan/TimeAlarm;->NOTIFICATION_CHANNEL_DESCRIPTION:Ljava/lang/String;

    const-string v0, "channelId"

    sput-object v0, Lcom/supercell/titan/TimeAlarm;->NOTIFICATION_CHANNEL_ID:Ljava/lang/String;

    const-string v0, "channelName"

    sput-object v0, Lcom/supercell/titan/TimeAlarm;->NOTIFICATION_CHANNEL_NAME:Ljava/lang/String;

    const-string v0, "chronosPushNotificationId"

    sput-object v0, Lcom/supercell/titan/TimeAlarm;->NOTIFICATION_CHRONOS_ID:Ljava/lang/String;

    const-string v0, "color"

    sput-object v0, Lcom/supercell/titan/TimeAlarm;->NOTIFICATION_COLOR:Ljava/lang/String;

    const-string v0, "iconResourceName"

    sput-object v0, Lcom/supercell/titan/TimeAlarm;->NOTIFICATION_ICON_RESOURCE_NAME:Ljava/lang/String;

    const-string v0, "id"

    sput-object v0, Lcom/supercell/titan/TimeAlarm;->NOTIFICATION_ID:Ljava/lang/String;

    const-string v0, "imageURL"

    sput-object v0, Lcom/supercell/titan/TimeAlarm;->NOTIFICATION_IMAGE_URL:Ljava/lang/String;

    const-string v0, "msg"

    sput-object v0, Lcom/supercell/titan/TimeAlarm;->NOTIFICATION_MESSAGE:Ljava/lang/String;

    const-string v0, "sound"

    sput-object v0, Lcom/supercell/titan/TimeAlarm;->NOTIFICATION_SOUND:Ljava/lang/String;

    const-string v0, "source"

    sput-object v0, Lcom/supercell/titan/TimeAlarm;->NOTIFICATION_SOURCE:Ljava/lang/String;

    const-string v0, "title"

    sput-object v0, Lcom/supercell/titan/TimeAlarm;->NOTIFICATION_TITLE:Ljava/lang/String;

    const-string v0, "notificationUniqueId"

    sput-object v0, Lcom/supercell/titan/TimeAlarm;->NOTIFICATION_UNIQUE_ID:Ljava/lang/String;

    const-string v0, "userId"

    sput-object v0, Lcom/supercell/titan/TimeAlarm;->NOTIFICATION_USER_ID:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static createNotification(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Class;Landroid/app/Service;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Landroid/app/Service;",
            ")V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v9, p12

    move-object/from16 v10, p13

    .line 1
    const v18, 0x2e

    const-string v11, "notification"

    invoke-virtual {v1, v11}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/app/NotificationManager;

    if-nez v11, :cond_0

    goto/16 :goto_13

    .line 2
    :cond_0
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v12

    .line 3
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v13

    .line 4
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v14

    .line 5
    invoke-static {v1}, Lcom/supercell/titan/TimeAlarm;->getApplicationName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v15

    move-object/from16 p15, v15

    .line 6
    const v18, 0x2f

    const-string v15, ""

    if-nez p2, :cond_1

    move-object v8, v15

    goto :goto_0

    :cond_1
    move-object/from16 v8, p2

    .line 7
    :goto_0
    const v18, 0x30

    const-string v3, "drawable"

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v16

    if-nez v16, :cond_2

    move-object/from16 v16, v15

    .line 8
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v7, v3, v15}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v15

    goto :goto_1

    :cond_2
    move-object/from16 v16, v15

    const/4 v15, 0x0

    :goto_1
    if-nez v15, :cond_3

    .line 9
    const v18, 0x31

    const-string v15, "ic_notification"

    invoke-virtual {v14, v15, v3, v13}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v15

    :cond_3
    if-nez v15, :cond_4

    .line 10
    iget v15, v12, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 11
    :cond_4
    new-instance v12, Landroid/content/Intent;

    move-object/from16 v17, v3

    move-object/from16 v3, p14

    invoke-direct {v12, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v3, 0x24000000

    .line 12
    invoke-virtual {v12, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 13
    const v18, 0x32

    const-string v3, "title"

    invoke-virtual {v12, v3, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 14
    const v18, 0x33

    const-string v3, "msg"

    invoke-virtual {v12, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 15
    const v18, 0x34

    const-string v3, "source"

    move/from16 v2, p11

    invoke-virtual {v12, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    if-eqz v9, :cond_5

    .line 16
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    .line 17
    const v18, 0x35

    const-string v2, "chronosPushNotificationId"

    invoke-virtual {v12, v2, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_5
    if-eqz v10, :cond_6

    .line 18
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    .line 19
    const v18, 0x36

    const-string v2, "notificationUniqueId"

    invoke-virtual {v12, v2, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 20
    :cond_6
    const v18, 0x37

    const-string v2, "userId"

    if-eqz v0, :cond_7

    .line 21
    invoke-virtual {v12, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_7
    if-eqz v5, :cond_8

    .line 22
    const v18, 0x38

    const-string v3, "channelId"

    invoke-virtual {v12, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_8
    if-eqz v4, :cond_9

    .line 23
    const v18, 0x39

    const-string v3, "imageURL"

    invoke-virtual {v12, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_9
    if-eqz v7, :cond_a

    .line 24
    const v18, 0x3a

    const-string v3, "iconResourceName"

    invoke-virtual {v12, v3, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_a
    if-eqz v0, :cond_b

    .line 25
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_b

    .line 26
    invoke-virtual {v12, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 27
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_2
    move v2, v0

    goto :goto_3

    .line 28
    :cond_b
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_2

    :cond_c
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_2

    :goto_3
    if-eqz v5, :cond_e

    .line 29
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_4

    :cond_d
    move-object v0, v5

    goto :goto_5

    .line 30
    :cond_e
    :goto_4
    const v18, 0x3b

    const-string v0, "default"

    .line 31
    :goto_5
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1a

    if-lt v3, v5, :cond_13

    if-eqz p7, :cond_10

    .line 32
    invoke-virtual/range {p7 .. p7}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_f

    goto :goto_6

    :cond_f
    move-object/from16 v3, p7

    goto :goto_7

    :cond_10
    :goto_6
    if-eqz p15, :cond_11

    move-object/from16 v3, p15

    goto :goto_7

    :cond_11
    const v3, 0x104000f

    .line 33
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 34
    :goto_7
    invoke-static {v0, v3}, Lho2;->a(Ljava/lang/String;Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object v3

    if-eqz v6, :cond_12

    .line 35
    invoke-static {v3, v6}, Lwt0;->s(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    .line 36
    :cond_12
    invoke-static {v11, v3}, Lp30;->r(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    :cond_13
    const/high16 v3, 0x4000000

    .line 37
    invoke-static {v1, v2, v12, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    .line 38
    new-instance v5, Lpo1;

    invoke-direct {v5, v1, v0}, Lpo1;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 39
    iput-object v3, v5, Lpo1;->g:Landroid/app/PendingIntent;

    .line 40
    iget-object v3, v5, Lpo1;->t:Landroid/app/Notification;

    iput v15, v3, Landroid/app/Notification;->icon:I

    .line 41
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 42
    iput-object v0, v5, Lpo1;->m:Ljava/lang/String;

    const/4 v6, 0x1

    .line 43
    invoke-virtual {v5, v6}, Lpo1;->c(Z)V

    if-eqz v4, :cond_19

    .line 44
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_19

    .line 45
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 46
    const v18, 0x3c

    const-string v7, "http://"

    invoke-virtual {v0, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_16

    const v18, 0x3d

    const-string v7, "https://"

    invoke-virtual {v0, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_14

    goto :goto_9

    .line 47
    :cond_14
    const v18, 0x3e

    const-string v7, "file://"

    invoke-virtual {v0, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 48
    invoke-static {v4}, Lcom/supercell/titan/TimeAlarm;->readFileContent(Ljava/lang/String;)[B

    move-result-object v0

    :goto_8
    move/from16 p4, v6

    goto :goto_b

    :catch_0
    move-exception v0

    move/from16 p4, v6

    goto :goto_f

    :cond_15
    const/4 v0, 0x0

    goto :goto_8

    .line 49
    :cond_16
    :goto_9
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 50
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    .line 51
    const v18, 0x3f

    const-string v7, "GET"

    invoke-virtual {v0, v7}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/16 v7, 0x1388

    .line 52
    invoke-virtual {v0, v7}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 53
    invoke-virtual {v0, v7}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 54
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v7
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    :try_start_1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v9, 0x4000

    .line 56
    new-array v10, v9, [B

    :goto_a
    const/4 v12, 0x0

    .line 57
    invoke-virtual {v7, v10, v12, v9}, Ljava/io/InputStream;->read([BII)I

    move-result v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move/from16 p4, v6

    const/4 v6, -0x1

    if-eq v15, v6, :cond_17

    .line 58
    :try_start_2
    invoke-virtual {v0, v10, v12, v15}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    move/from16 v6, p4

    goto :goto_a

    .line 59
    :cond_17
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 60
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 61
    :try_start_3
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V

    :goto_b
    if-eqz v0, :cond_1a

    .line 62
    array-length v6, v0

    const/4 v12, 0x0

    invoke-static {v0, v12, v6}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 63
    invoke-virtual {v5, v0}, Lpo1;->e(Landroid/graphics/Bitmap;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_11

    :catch_1
    move-exception v0

    goto :goto_f

    :catchall_0
    move-exception v0

    :goto_c
    move-object v6, v0

    goto :goto_d

    :catchall_1
    move-exception v0

    move/from16 p4, v6

    goto :goto_c

    :goto_d
    if-eqz v7, :cond_18

    .line 64
    :try_start_4
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_e

    :catchall_2
    move-exception v0

    :try_start_5
    invoke-virtual {v6, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_18
    :goto_e
    throw v6
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 65
    :goto_f
    const v18, 0x40

    const-string v6, "Could not download image from "

    const v18, 0x41

    const-string v7, ". Error: "

    .line 66
    invoke-static {v6, v4, v7}, Len;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 67
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v18, 0x42

    const-string v4, "TimeAlarm"

    invoke-static {v4, v0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_10

    :cond_19
    move/from16 p4, v6

    .line 68
    :cond_1a
    :goto_10
    :try_start_6
    const v18, 0x43

    const-string v0, "ic_icon"

    move-object/from16 v4, v17

    invoke-virtual {v14, v0, v4, v13}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1b

    .line 69
    invoke-static {v14, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 70
    invoke-virtual {v5, v0}, Lpo1;->e(Landroid/graphics/Bitmap;)V
    :try_end_6
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_6 .. :try_end_6} :catch_2

    .line 71
    :catch_2
    :cond_1b
    :goto_11
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1c

    .line 72
    invoke-static {v8}, Lpo1;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, v5, Lpo1;->e:Ljava/lang/CharSequence;

    :cond_1c
    if-eqz p1, :cond_1d

    .line 73
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1d

    .line 74
    invoke-static/range {p1 .. p1}, Lpo1;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, v5, Lpo1;->f:Ljava/lang/CharSequence;

    .line 75
    invoke-static/range {p1 .. p1}, Lpo1;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, v3, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 76
    new-instance v0, Ljo1;

    .line 77
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 78
    invoke-static/range {p1 .. p1}, Lpo1;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    iput-object v3, v0, Ljo1;->b:Ljava/lang/CharSequence;

    .line 79
    invoke-virtual {v5, v0}, Lpo1;->g(Lsq3;)V

    :cond_1d
    if-eqz p3, :cond_1e

    .line 80
    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1e

    .line 81
    const v18, 0x44

    const-string v0, "res/"

    move-object/from16 v3, p3

    move-object/from16 v4, v16

    invoke-virtual {v3, v0, v4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 82
    const v18, 0x45

    const-string v3, "\\.wav"

    const v18, 0x46

    const-string v4, "\\.ogg"

    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 83
    const v18, 0x47

    const-string v3, "\\.caf"

    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 84
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v18, 0x48

    const-string v1, ".assetprovider"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 85
    new-instance v3, Ljava/lang/StringBuilder;

    const v18, 0x49

    const-string v4, "content://"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v18, 0x4a

    const-string v1, "/"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 86
    invoke-virtual {v5, v1}, Lpo1;->f(Landroid/net/Uri;)V

    goto :goto_12

    :cond_1e
    move-object/from16 v3, p3

    move-object v0, v3

    :goto_12
    if-eqz p10, :cond_1f

    move/from16 v8, p10

    .line 87
    iput v8, v5, Lpo1;->p:I

    .line 88
    :cond_1f
    invoke-virtual {v5}, Lpo1;->a()Landroid/app/Notification;

    move-result-object v1

    if-eqz v0, :cond_20

    .line 89
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_21

    .line 90
    :cond_20
    iget v0, v1, Landroid/app/Notification;->defaults:I

    or-int/lit8 v0, v0, 0x1

    iput v0, v1, Landroid/app/Notification;->defaults:I

    .line 91
    :cond_21
    iget v0, v1, Landroid/app/Notification;->defaults:I

    or-int/lit8 v0, v0, 0x6

    iput v0, v1, Landroid/app/Notification;->defaults:I

    .line 92
    iget v0, v1, Landroid/app/Notification;->flags:I

    or-int/lit8 v0, v0, 0x10

    iput v0, v1, Landroid/app/Notification;->flags:I

    .line 93
    :try_start_7
    invoke-virtual {v11, v2, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
    :try_end_7
    .catch Ljava/lang/SecurityException; {:try_start_7 .. :try_end_7} :catch_3

    :catch_3
    :goto_13
    return-void
.end method

.method public static getApplicationName(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const v3, 0x4b

    const-string v3, "app_name"

    .line 14
    .line 15
    const v4, 0x4c

    const-string v4, "string"

    .line 16
    .line 17
    invoke-virtual {v1, v3, v4, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    iget v1, v0, Landroid/content/pm/ApplicationInfo;->labelRes:I

    .line 24
    .line 25
    :cond_0
    if-nez v1, :cond_1

    .line 26
    .line 27
    iget-object p0, v0, Landroid/content/pm/ApplicationInfo;->nonLocalizedLabel:Ljava/lang/CharSequence;

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_1
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public static handleLocalNotification(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 184
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 185
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 186
    invoke-virtual {v0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v0

    .line 187
    new-instance v1, Lh20;

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 188
    invoke-direct {v1}, Landroid/os/AsyncTask;-><init>()V

    .line 189
    iput-object p0, v1, Lh20;->a:Landroid/content/Context;

    .line 190
    iput-object p1, v1, Lh20;->b:Landroid/content/Intent;

    .line 191
    iput-object v0, v1, Lh20;->c:Ljava/lang/Class;

    const/4 p0, 0x0

    .line 192
    new-array p0, p0, [Ljava/lang/String;

    invoke-virtual {v1, p0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static handleLocalNotification(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/Class;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/content/Intent;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    const v1, 0x4d

    const-string v1, "title"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    move-object v4, v1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    goto :goto_0

    .line 23
    :goto_1
    const v1, 0x4e

    const-string v1, "msg"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const v1, 0x4f

    const-string v1, "sound"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const v1, 0x50

    const-string v1, "id"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const v2, 0x51

    const-string v2, "userId"

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    const v2, 0x52

    const-string v2, "imageURL"

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    const v2, 0x53

    const-string v2, "channelId"

    .line 54
    .line 55
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    const v2, 0x54

    const-string v2, "channelName"

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    const v2, 0x55

    const-string v2, "channelDesc"

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    const v2, 0x56

    const-string v2, "color"

    .line 72
    .line 73
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v12

    .line 77
    const v2, 0x57

    const-string v2, "iconResourceName"

    .line 78
    .line 79
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    sget-object v2, Lcom/supercell/titan/GameApp$NotificationSource;->NOT_SET:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 84
    .line 85
    iget v2, v2, Lcom/supercell/titan/GameApp$NotificationSource;->a:I

    .line 86
    .line 87
    const v13, 0x58

    const-string v13, "source"

    .line 88
    .line 89
    invoke-virtual {v0, v13, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    invoke-static {v0}, Lcom/supercell/titan/GameApp$NotificationSource;->fromCode(I)Lcom/supercell/titan/GameApp$NotificationSource;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    new-instance v2, Lcom/supercell/titan/GameApp$NotificationData;

    .line 98
    .line 99
    invoke-direct {v2}, Lcom/supercell/titan/GameApp$NotificationData;-><init>()V

    .line 100
    .line 101
    .line 102
    if-eqz v6, :cond_1

    .line 103
    .line 104
    move-object v13, v6

    .line 105
    goto :goto_2

    .line 106
    :cond_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 107
    .line 108
    .line 109
    move-result-object v13

    .line 110
    invoke-virtual {v13}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v13

    .line 114
    :goto_2
    iput-object v13, v2, Lcom/supercell/titan/GameApp$NotificationData;->notificationId:Ljava/lang/String;

    .line 115
    .line 116
    const v13, 0x59

    const-string v13, ""

    .line 117
    .line 118
    if-eqz v4, :cond_2

    .line 119
    .line 120
    move-object v14, v4

    .line 121
    goto :goto_3

    .line 122
    :cond_2
    move-object v14, v13

    .line 123
    :goto_3
    iput-object v14, v2, Lcom/supercell/titan/GameApp$NotificationData;->title:Ljava/lang/String;

    .line 124
    .line 125
    if-eqz v3, :cond_3

    .line 126
    .line 127
    move-object v14, v3

    .line 128
    goto :goto_4

    .line 129
    :cond_3
    move-object v14, v13

    .line 130
    :goto_4
    iput-object v14, v2, Lcom/supercell/titan/GameApp$NotificationData;->message:Ljava/lang/String;

    .line 131
    .line 132
    if-eqz v8, :cond_4

    .line 133
    .line 134
    move-object v14, v8

    .line 135
    goto :goto_5

    .line 136
    :cond_4
    move-object v14, v13

    .line 137
    :goto_5
    iput-object v14, v2, Lcom/supercell/titan/GameApp$NotificationData;->channelId:Ljava/lang/String;

    .line 138
    .line 139
    iput-object v13, v2, Lcom/supercell/titan/GameApp$NotificationData;->chronosEventId:Ljava/lang/String;

    .line 140
    .line 141
    iput-object v13, v2, Lcom/supercell/titan/GameApp$NotificationData;->actionId:Ljava/lang/String;

    .line 142
    .line 143
    iget v13, v0, Lcom/supercell/titan/GameApp$NotificationSource;->a:I

    .line 144
    .line 145
    iput v13, v2, Lcom/supercell/titan/GameApp$NotificationData;->source:I

    .line 146
    .line 147
    invoke-static {v2}, Lcom/supercell/titan/GameApp;->trackNotificationDelivered(Lcom/supercell/titan/GameApp$NotificationData;)V

    .line 148
    .line 149
    .line 150
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    if-eqz v2, :cond_5

    .line 155
    .line 156
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-virtual {v2}, Lcom/supercell/titan/GameApp;->isStopped()Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-nez v2, :cond_5

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_5
    iget v13, v0, Lcom/supercell/titan/GameApp$NotificationSource;->a:I

    .line 168
    .line 169
    const/4 v15, 0x0

    .line 170
    const/16 v17, 0x0

    .line 171
    .line 172
    const/4 v14, 0x0

    .line 173
    move-object/from16 v2, p0

    .line 174
    .line 175
    move-object/from16 v16, p2

    .line 176
    .line 177
    invoke-static/range {v2 .. v17}, Lcom/supercell/titan/TimeAlarm;->createNotification(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Class;Landroid/app/Service;)V

    .line 178
    .line 179
    .line 180
    :goto_6
    invoke-static {v1}, Lcom/supercell/titan/GameApp;->cancelNotification(I)V

    .line 181
    .line 182
    .line 183
    :cond_6
    return-void
.end method

.method public static readFileContent(Ljava/lang/String;)[B
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ljava/io/File;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance p0, Ljava/io/FileInputStream;

    .line 15
    .line 16
    invoke-direct {p0, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, p0}, Lio/sentry/config/a;->b(Ljava/io/File;Ljava/io/FileInputStream;)Ljava/io/FileInputStream;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 26
    .line 27
    .line 28
    const/16 v1, 0x4000

    .line 29
    .line 30
    new-array v2, v1, [B

    .line 31
    .line 32
    :goto_0
    const/4 v3, 0x0

    .line 33
    invoke-virtual {p0, v2, v3, v1}, Ljava/io/InputStream;->read([BII)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    const/4 v5, -0x1

    .line 38
    if-eq v4, v5, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0, v2, v3, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 48
    .line 49
    .line 50
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :catchall_1
    move-exception p0

    .line 61
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    throw v0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lcom/supercell/titan/TimeAlarm;->handleLocalNotification(Landroid/content/Context;Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
