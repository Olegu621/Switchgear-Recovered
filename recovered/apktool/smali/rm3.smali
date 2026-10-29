.class public final Lrm3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzr;

.field public final synthetic c:Z

.field public final synthetic d:Lpn3;

.field public final synthetic e:Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# direct methods
.method public synthetic constructor <init>(Lpn3;Lcom/google/android/gms/measurement/internal/zzr;ZLcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;I)V
    .locals 0

    .line 19
    iput p5, p0, Lrm3;->a:I

    iput-object p2, p0, Lrm3;->b:Lcom/google/android/gms/measurement/internal/zzr;

    iput-boolean p3, p0, Lrm3;->c:Z

    iput-object p4, p0, Lrm3;->e:Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

    iput-object p1, p0, Lrm3;->d:Lpn3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lpn3;Lcom/google/android/gms/measurement/internal/zzr;ZLcom/google/android/gms/measurement/internal/zzah;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lrm3;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lrm3;->b:Lcom/google/android/gms/measurement/internal/zzr;

    .line 8
    .line 9
    iput-boolean p3, p0, Lrm3;->c:Z

    .line 10
    .line 11
    iput-object p4, p0, Lrm3;->e:Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

    .line 12
    .line 13
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lrm3;->d:Lpn3;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lrm3;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lrm3;->e:Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-boolean v3, p0, Lrm3;->c:Z

    .line 7
    .line 8
    iget-object v4, p0, Lrm3;->b:Lcom/google/android/gms/measurement/internal/zzr;

    .line 9
    .line 10
    iget-object p0, p0, Lrm3;->d:Lpn3;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lpn3;->d:Lcom/google/android/gms/measurement/internal/zzga;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Lij3;

    .line 22
    .line 23
    iget-object p0, p0, Lij3;->f:Luh3;

    .line 24
    .line 25
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Luh3;->f:Lsh3;

    .line 29
    .line 30
    const-string v0, "Discarding data. Failed to send conditional user property to service"

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lsh3;->a(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    if-eqz v3, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-object v2, v1

    .line 40
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzah;

    .line 41
    .line 42
    :goto_0
    invoke-virtual {p0, v0, v2, v4}, Lpn3;->R(Lcom/google/android/gms/measurement/internal/zzga;Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lpn3;->M()V

    .line 46
    .line 47
    .line 48
    :goto_1
    return-void

    .line 49
    :pswitch_0
    iget-object v0, p0, Lpn3;->d:Lcom/google/android/gms/measurement/internal/zzga;

    .line 50
    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Lij3;

    .line 56
    .line 57
    iget-object p0, p0, Lij3;->f:Luh3;

    .line 58
    .line 59
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, Luh3;->f:Lsh3;

    .line 63
    .line 64
    const-string v0, "Discarding data. Failed to send event to service"

    .line 65
    .line 66
    invoke-virtual {p0, v0}, Lsh3;->a(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_2
    if-eqz v3, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    move-object v2, v1

    .line 74
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 75
    .line 76
    :goto_2
    invoke-virtual {p0, v0, v2, v4}, Lpn3;->R(Lcom/google/android/gms/measurement/internal/zzga;Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lpn3;->M()V

    .line 80
    .line 81
    .line 82
    :goto_3
    return-void

    .line 83
    :pswitch_1
    iget-object v0, p0, Lpn3;->d:Lcom/google/android/gms/measurement/internal/zzga;

    .line 84
    .line 85
    if-nez v0, :cond_4

    .line 86
    .line 87
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p0, Lij3;

    .line 90
    .line 91
    iget-object p0, p0, Lij3;->f:Luh3;

    .line 92
    .line 93
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 94
    .line 95
    .line 96
    iget-object p0, p0, Luh3;->f:Lsh3;

    .line 97
    .line 98
    const-string v0, "Discarding data. Failed to set user property"

    .line 99
    .line 100
    invoke-virtual {p0, v0}, Lsh3;->a(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_4
    if-eqz v3, :cond_5

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_5
    move-object v2, v1

    .line 108
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzpk;

    .line 109
    .line 110
    :goto_4
    invoke-virtual {p0, v0, v2, v4}, Lpn3;->R(Lcom/google/android/gms/measurement/internal/zzga;Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Lpn3;->M()V

    .line 114
    .line 115
    .line 116
    :goto_5
    return-void

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
