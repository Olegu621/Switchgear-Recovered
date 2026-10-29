.class public final Lha0;
.super Lcom/google/android/gms/internal/drive/zzet;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/drive/events/DriveEventService;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/drive/events/DriveEventService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lha0;->a:Lcom/google/android/gms/drive/events/DriveEventService;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/drive/zzet;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final zzc(Lcom/google/android/gms/internal/drive/zzfp;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lha0;->a:Lcom/google/android/gms/drive/events/DriveEventService;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lha0;->a:Lcom/google/android/gms/drive/events/DriveEventService;

    .line 5
    .line 6
    sget-object v2, Lcom/google/android/gms/drive/events/DriveEventService;->e:Lmr0;

    .line 7
    .line 8
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    iget v3, v1, Lcom/google/android/gms/drive/events/DriveEventService;->d:I

    .line 13
    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {v1, v2}, Lyy1;->x(Landroid/content/Context;I)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_2

    .line 22
    .line 23
    iput v2, v1, Lcom/google/android/gms/drive/events/DriveEventService;->d:I

    .line 24
    .line 25
    :goto_0
    iget-object v1, p0, Lha0;->a:Lcom/google/android/gms/drive/events/DriveEventService;

    .line 26
    .line 27
    iget-object v1, v1, Lcom/google/android/gms/drive/events/DriveEventService;->b:Lga0;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    sget v2, Lga0;->b:I

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object p0, p0, Lha0;->a:Lcom/google/android/gms/drive/events/DriveEventService;

    .line 39
    .line 40
    iget-object p0, p0, Lcom/google/android/gms/drive/events/DriveEventService;->b:Lga0;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    sget-object p0, Lcom/google/android/gms/drive/events/DriveEventService;->e:Lmr0;

    .line 49
    .line 50
    const-string p1, "DriveEventService"

    .line 51
    .line 52
    const-string v1, "Receiving event before initialize is completed."

    .line 53
    .line 54
    invoke-virtual {p0, p1, v1}, Lmr0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :goto_1
    monitor-exit v0

    .line 58
    return-void

    .line 59
    :cond_2
    new-instance p0, Ljava/lang/SecurityException;

    .line 60
    .line 61
    const-string p1, "Caller is not GooglePlayServices"

    .line 62
    .line 63
    invoke-direct {p0, p1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p0

    .line 67
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    throw p0
.end method
