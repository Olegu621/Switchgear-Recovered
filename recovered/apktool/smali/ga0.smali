.class public final Lga0;
.super Lcom/google/android/gms/internal/drive/zzir;


# static fields
.field public static final synthetic b:I


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/drive/events/DriveEventService;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/drive/zzir;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lga0;->a:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eq v0, v2, :cond_1

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/google/android/gms/drive/events/DriveEventService;->e:Lmr0;

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v0, "Unexpected message type: %s"

    .line 20
    .line 21
    invoke-virtual {p0, v0, p1}, Lmr0;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Landroid/os/Looper;->quit()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-object v0, p0, Lga0;->a:Ljava/lang/ref/WeakReference;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lcom/google/android/gms/drive/events/DriveEventService;

    .line 40
    .line 41
    if-eqz v0, :cond_7

    .line 42
    .line 43
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Lcom/google/android/gms/internal/drive/zzfp;

    .line 46
    .line 47
    sget-object p1, Lcom/google/android/gms/drive/events/DriveEventService;->e:Lmr0;

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzfp;->zzat()Lcom/google/android/gms/drive/events/DriveEvent;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :try_start_0
    invoke-interface {p0}, Lcom/google/android/gms/drive/events/DriveEvent;->getType()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eq v3, v2, :cond_5

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    if-eq v3, v1, :cond_4

    .line 61
    .line 62
    const/4 v1, 0x4

    .line 63
    if-eq v3, v1, :cond_3

    .line 64
    .line 65
    const/4 v1, 0x7

    .line 66
    if-eq v3, v1, :cond_2

    .line 67
    .line 68
    const-string v0, "Unhandled event: %s"

    .line 69
    .line 70
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p1, v0, p0}, Lmr0;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :catch_0
    move-exception p0

    .line 79
    goto :goto_0

    .line 80
    :cond_2
    check-cast p0, Lcom/google/android/gms/drive/events/zzv;

    .line 81
    .line 82
    const-string v1, "Unhandled transfer state event in %s: %s"

    .line 83
    .line 84
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {p1, v1, p0}, Lmr0;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_3
    check-cast p0, Lcom/google/android/gms/drive/events/zzb;

    .line 93
    .line 94
    const-string v1, "Unhandled changes available event in %s: %s"

    .line 95
    .line 96
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p1, v1, p0}, Lmr0;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_4
    check-cast p0, Lcom/google/android/gms/drive/events/CompletionEvent;

    .line 105
    .line 106
    const-string v1, "Unhandled completion event in %s: %s"

    .line 107
    .line 108
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-virtual {p1, v1, p0}, Lmr0;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_5
    check-cast p0, Lcom/google/android/gms/drive/events/ChangeEvent;

    .line 117
    .line 118
    invoke-virtual {v0, p0}, Lcom/google/android/gms/drive/events/DriveEventService;->onChange(Lcom/google/android/gms/drive/events/ChangeEvent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :goto_0
    const/4 v0, 0x6

    .line 123
    iget-object v1, p1, Lmr0;->a:Ljava/lang/String;

    .line 124
    .line 125
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_6

    .line 130
    .line 131
    const-string v0, "Error handling event in null"

    .line 132
    .line 133
    invoke-virtual {p1, v0}, Lmr0;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    const-string v0, "DriveEventService"

    .line 138
    .line 139
    invoke-static {v0, p1, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 140
    .line 141
    .line 142
    :cond_6
    return-void

    .line 143
    :cond_7
    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-virtual {p0}, Landroid/os/Looper;->quit()V

    .line 148
    .line 149
    .line 150
    return-void
.end method
