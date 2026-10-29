.class public final Lnv0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Ltv0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Landroid/util/Size;

    .line 2
    .line 3
    const/16 v1, 0x280

    .line 4
    .line 5
    const/16 v2, 0x1e0

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    .line 8
    .line 9
    .line 10
    sget-object v1, Lxt0;->b:Lxt0;

    .line 11
    .line 12
    new-instance v2, Lr32;

    .line 13
    .line 14
    sget-object v3, Lue2;->b:Landroid/util/Size;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v3, v2, Lr32;->a:Landroid/util/Size;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    iput v3, v2, Lr32;->b:I

    .line 23
    .line 24
    new-instance v4, Lq32;

    .line 25
    .line 26
    invoke-direct {v4, v1, v2}, Lq32;-><init>(Lxt0;Lr32;)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Lnr;

    .line 30
    .line 31
    invoke-direct {v1, v3}, Lnr;-><init>(I)V

    .line 32
    .line 33
    .line 34
    sget-object v2, Ljw0;->x:Llf;

    .line 35
    .line 36
    iget-object v1, v1, Lnr;->b:Luk1;

    .line 37
    .line 38
    invoke-virtual {v1, v2, v0}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sget-object v0, Lzy2;->K:Llf;

    .line 42
    .line 43
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v1, v0, v2}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Ljw0;->q:Llf;

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v1, v0, v2}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    sget-object v0, Ljw0;->A:Llf;

    .line 61
    .line 62
    invoke-virtual {v1, v0, v4}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    sget-object v0, Lmb0;->d:Lmb0;

    .line 66
    .line 67
    invoke-virtual {v0, v0}, Lmb0;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_0

    .line 72
    .line 73
    sget-object v2, Lhw0;->p:Llf;

    .line 74
    .line 75
    invoke-virtual {v1, v2, v0}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    new-instance v0, Ltv0;

    .line 79
    .line 80
    invoke-static {v1}, Lnq1;->d(Lty;)Lnq1;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-direct {v0, v1}, Ltv0;-><init>(Lnq1;)V

    .line 85
    .line 86
    .line 87
    sput-object v0, Lnv0;->a:Ltv0;

    .line 88
    .line 89
    return-void

    .line 90
    :cond_0
    const-string v0, "ImageAnalysis currently only supports SDR"

    .line 91
    .line 92
    invoke-static {v0}, Ln4;->q(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method
