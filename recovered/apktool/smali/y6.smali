.class public final synthetic Ly6;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;
.implements Lbk2;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/supercell/titan/agesignals/AgeSignals;ILer0;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly6;->b:Ljava/lang/Object;

    iput p2, p0, Ly6;->a:I

    iput-object p3, p0, Ly6;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lf31;Lyg;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly6;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Ly6;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, Ly6;->a:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public execute()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ly6;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lf31;

    .line 4
    .line 5
    iget-object v1, p0, Ly6;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lyg;

    .line 8
    .line 9
    iget-object v0, v0, Lf31;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lec;

    .line 12
    .line 13
    iget p0, p0, Ly6;->a:I

    .line 14
    .line 15
    add-int/lit8 p0, p0, 0x1

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v1, p0, v2}, Lec;->K(Lyg;IZ)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 13

    .line 1
    iget-object v0, p0, Ly6;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/supercell/titan/agesignals/AgeSignals;

    .line 4
    .line 5
    iget v1, p0, Ly6;->a:I

    .line 6
    .line 7
    iget-object p0, p0, Ly6;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ler0;

    .line 10
    .line 11
    sget v2, Lcom/supercell/titan/agesignals/AgeSignals;->MAX_RETRIES:I

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    instance-of v2, p1, Ljava/lang/UnsupportedOperationException;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    new-instance v3, Lcom/supercell/titan/agesignals/AgeSignals$AgeRangeResult;

    .line 21
    .line 22
    const/16 v10, 0x3c

    .line 23
    .line 24
    const/4 v11, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    const/16 v5, -0x64

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v7, 0x0

    .line 30
    const/4 v8, 0x0

    .line 31
    const/4 v9, 0x0

    .line 32
    invoke-direct/range {v3 .. v11}, Lcom/supercell/titan/agesignals/AgeSignals$AgeRangeResult;-><init>(ZIIIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 33
    .line 34
    .line 35
    iput-object v3, v0, Lcom/supercell/titan/agesignals/AgeSignals;->a:Lcom/supercell/titan/agesignals/AgeSignals$AgeRangeResult;

    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    instance-of v2, p1, La7;

    .line 39
    .line 40
    const/16 v3, -0x64

    .line 41
    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    check-cast p1, La7;

    .line 45
    .line 46
    invoke-virtual {p1}, La7;->getErrorCode()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    move v6, p1

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move v6, v3

    .line 53
    :goto_0
    if-eq v6, v3, :cond_2

    .line 54
    .line 55
    const/4 p1, -0x8

    .line 56
    if-eq v6, p1, :cond_2

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    const/4 p1, 0x1

    .line 60
    add-int/2addr v1, p1

    .line 61
    const/4 v2, 0x5

    .line 62
    if-ge v1, v2, :cond_5

    .line 63
    .line 64
    sget-wide v2, Lcom/supercell/titan/agesignals/AgeSignals;->c:J

    .line 65
    .line 66
    shl-int v4, p1, v1

    .line 67
    .line 68
    invoke-static {v4, v2, v3}, Lfb0;->h(IJ)J

    .line 69
    .line 70
    .line 71
    move-result-wide v2

    .line 72
    new-instance v4, Lfb0;

    .line 73
    .line 74
    invoke-direct {v4, v2, v3}, Lfb0;-><init>(J)V

    .line 75
    .line 76
    .line 77
    sget-wide v2, Lcom/supercell/titan/agesignals/AgeSignals;->d:J

    .line 78
    .line 79
    new-instance v5, Lfb0;

    .line 80
    .line 81
    invoke-direct {v5, v2, v3}, Lfb0;-><init>(J)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v5}, Lfb0;->compareTo(Ljava/lang/Object;)I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-lez v2, :cond_3

    .line 89
    .line 90
    move-object v4, v5

    .line 91
    :cond_3
    iget-wide v2, v4, Lfb0;->a:J

    .line 92
    .line 93
    iget-object v4, v0, Lcom/supercell/titan/agesignals/AgeSignals;->b:Landroid/os/Handler;

    .line 94
    .line 95
    new-instance v5, Lz6;

    .line 96
    .line 97
    const/4 v6, 0x0

    .line 98
    invoke-direct {v5, v0, p0, v1, v6}, Lz6;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 99
    .line 100
    .line 101
    long-to-int p0, v2

    .line 102
    and-int/2addr p0, p1

    .line 103
    if-ne p0, p1, :cond_4

    .line 104
    .line 105
    invoke-static {v2, v3}, Lfb0;->f(J)Z

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    if-nez p0, :cond_4

    .line 110
    .line 111
    shr-long p0, v2, p1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    sget-object p0, Lib0;->c:Lib0;

    .line 115
    .line 116
    invoke-static {v2, v3, p0}, Lfb0;->j(JLib0;)J

    .line 117
    .line 118
    .line 119
    move-result-wide p0

    .line 120
    :goto_1
    invoke-virtual {v4, v5, p0, p1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_5
    :goto_2
    new-instance v4, Lcom/supercell/titan/agesignals/AgeSignals$AgeRangeResult;

    .line 125
    .line 126
    const/16 v11, 0x3d

    .line 127
    .line 128
    const/4 v12, 0x0

    .line 129
    const/4 v5, 0x0

    .line 130
    const/4 v7, 0x0

    .line 131
    const/4 v8, 0x0

    .line 132
    const/4 v9, 0x0

    .line 133
    const/4 v10, 0x0

    .line 134
    invoke-direct/range {v4 .. v12}, Lcom/supercell/titan/agesignals/AgeSignals$AgeRangeResult;-><init>(ZIIIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 135
    .line 136
    .line 137
    iput-object v4, v0, Lcom/supercell/titan/agesignals/AgeSignals;->a:Lcom/supercell/titan/agesignals/AgeSignals$AgeRangeResult;

    .line 138
    .line 139
    return-void
.end method
