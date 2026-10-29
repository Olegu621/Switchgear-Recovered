.class public final synthetic Lh7;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 8
    iput p1, p0, Lh7;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lmr;)V
    .locals 0

    .line 1
    const/4 p1, 0x2

    .line 2
    iput p1, p0, Lh7;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private final a()V
    .locals 0

    .line 1
    return-void
.end method

.method private final b()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget p0, p0, Lh7;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lio/sentry/android/ndk/SentryNdk;->a()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    int-to-long v0, p0

    .line 15
    sput-wide v0, Lio/sentry/android/core/internal/util/e;->b:J

    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    invoke-static {}, Lcom/appsflyer/internal/AFj1sSDK;->d()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_2
    :try_start_0
    sget-object p0, Landroidx/lifecycle/ProcessLifecycleOwner;->w:Landroidx/lifecycle/ProcessLifecycleOwner;

    .line 23
    .line 24
    iget-object p0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->f:Li71;

    .line 25
    .line 26
    new-instance v0, Lvx1;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Li71;->a(Lf71;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x3

    .line 35
    sput p0, Lvx1;->b:I
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catch_0
    const/4 p0, 0x1

    .line 39
    sput p0, Lvx1;->b:I

    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    new-array p0, p0, [Ljava/lang/Object;

    .line 43
    .line 44
    const-string v0, "vx1"

    .line 45
    .line 46
    const-string v1, "Class \'ProcessLifecycleOwner\' not found. The tracker can\'t track lifecycle events."

    .line 47
    .line 48
    invoke-static {v0, v1, p0}, Lk50;->q(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    :pswitch_3
    return-void

    .line 52
    :pswitch_4
    sget p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AlarmManagerSchedulerBroadcastReceiver;->a:I

    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
