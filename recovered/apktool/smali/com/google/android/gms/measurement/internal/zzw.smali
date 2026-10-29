.class public final Lcom/google/android/gms/measurement/internal/zzw;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lij3;


# direct methods
.method public constructor <init>(Lij3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzw;->a:Lij3;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/zzw;->a:Lij3;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    iget-object p0, p1, Lij3;->f:Luh3;

    .line 6
    .line 7
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Luh3;->w:Lsh3;

    .line 11
    .line 12
    const-string p1, "App receiver called with null intent"

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lsh3;->a(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    if-nez p2, :cond_1

    .line 23
    .line 24
    iget-object p0, p1, Lij3;->f:Luh3;

    .line 25
    .line 26
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Luh3;->w:Lsh3;

    .line 30
    .line 31
    const-string p1, "App receiver called with null action"

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lsh3;->a(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const v1, -0x72ee9a21

    .line 42
    .line 43
    .line 44
    if-eq v0, v1, :cond_3

    .line 45
    .line 46
    const v1, 0x4c497878    # 5.2814304E7f

    .line 47
    .line 48
    .line 49
    if-eq v0, v1, :cond_2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const-string v0, "com.google.android.gms.measurement.BATCHES_AVAILABLE"

    .line 53
    .line 54
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-eqz p2, :cond_5

    .line 59
    .line 60
    iget-object p2, p1, Lij3;->f:Luh3;

    .line 61
    .line 62
    invoke-static {p2}, Lij3;->l(Lhk3;)V

    .line 63
    .line 64
    .line 65
    iget-object p2, p2, Luh3;->Y:Lsh3;

    .line 66
    .line 67
    const-string v0, "[sgtm] App Receiver notified batches are available"

    .line 68
    .line 69
    invoke-virtual {p2, v0}, Lsh3;->a(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p1, Lij3;->i:Lbj3;

    .line 73
    .line 74
    invoke-static {p1}, Lij3;->l(Lhk3;)V

    .line 75
    .line 76
    .line 77
    new-instance p2, Lbb3;

    .line 78
    .line 79
    const/16 v0, 0xc

    .line 80
    .line 81
    invoke-direct {p2, p0, v0}, Lbb3;-><init>(Ljava/lang/Object;I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p2}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_3
    const-string p0, "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"

    .line 89
    .line 90
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    if-eqz p0, :cond_5

    .line 95
    .line 96
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzql;->zza()Z

    .line 97
    .line 98
    .line 99
    iget-object p0, p1, Lij3;->d:Lpd3;

    .line 100
    .line 101
    const/4 p2, 0x0

    .line 102
    sget-object v0, Lvg3;->Q0:Lug3;

    .line 103
    .line 104
    invoke-virtual {p0, p2, v0}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-nez p0, :cond_4

    .line 109
    .line 110
    return-void

    .line 111
    :cond_4
    iget-object p0, p1, Lij3;->f:Luh3;

    .line 112
    .line 113
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 114
    .line 115
    .line 116
    iget-object p0, p0, Luh3;->Y:Lsh3;

    .line 117
    .line 118
    const-string p2, "App receiver notified triggers are available"

    .line 119
    .line 120
    invoke-virtual {p0, p2}, Lsh3;->a(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iget-object p0, p1, Lij3;->i:Lbj3;

    .line 124
    .line 125
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 126
    .line 127
    .line 128
    new-instance p2, Lbb3;

    .line 129
    .line 130
    const/16 v0, 0xd

    .line 131
    .line 132
    invoke-direct {p2, p1, v0}, Lbb3;-><init>(Ljava/lang/Object;I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, p2}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_5
    :goto_0
    iget-object p0, p1, Lij3;->f:Luh3;

    .line 140
    .line 141
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 142
    .line 143
    .line 144
    iget-object p0, p0, Luh3;->w:Lsh3;

    .line 145
    .line 146
    const-string p1, "App receiver called with unknown action"

    .line 147
    .line 148
    invoke-virtual {p0, p1}, Lsh3;->a(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    return-void
.end method
