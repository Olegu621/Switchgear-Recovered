.class public final Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$$serializer;,
        Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$Companion;

.field public static final l:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/List;

.field public final c:I

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/Boolean;

.field public final f:Z

.field public final g:Ljava/lang/Boolean;

.field public final h:Z

.field public final i:Z

.field public final j:Ljava/lang/Integer;

.field public final k:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->Companion:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$Companion;

    .line 7
    .line 8
    new-instance v0, Lgd;

    .line 9
    .line 10
    sget-object v1, Lvh2;->a:Lvh2;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0xb

    .line 17
    .line 18
    new-array v1, v1, [Lkotlinx/serialization/KSerializer;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    aput-object v3, v1, v2

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    aput-object v0, v1, v2

    .line 25
    .line 26
    const/4 v0, 0x2

    .line 27
    aput-object v3, v1, v0

    .line 28
    .line 29
    const/4 v0, 0x3

    .line 30
    aput-object v3, v1, v0

    .line 31
    .line 32
    const/4 v0, 0x4

    .line 33
    aput-object v3, v1, v0

    .line 34
    .line 35
    const/4 v0, 0x5

    .line 36
    aput-object v3, v1, v0

    .line 37
    .line 38
    const/4 v0, 0x6

    .line 39
    aput-object v3, v1, v0

    .line 40
    .line 41
    const/4 v0, 0x7

    .line 42
    aput-object v3, v1, v0

    .line 43
    .line 44
    const/16 v0, 0x8

    .line 45
    .line 46
    aput-object v3, v1, v0

    .line 47
    .line 48
    const/16 v0, 0x9

    .line 49
    .line 50
    aput-object v3, v1, v0

    .line 51
    .line 52
    const/16 v0, 0xa

    .line 53
    .line 54
    aput-object v3, v1, v0

    .line 55
    .line 56
    sput-object v1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->l:[Lkotlinx/serialization/KSerializer;

    .line 57
    .line 58
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Boolean;ZZLjava/lang/Integer;Ljava/lang/Integer;)V
    .locals 2

    .line 1
    and-int/lit16 v0, p1, 0x7ff

    .line 2
    .line 3
    const/16 v1, 0x7ff

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->b:Ljava/util/List;

    .line 13
    .line 14
    iput p4, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->c:I

    .line 15
    .line 16
    iput-object p5, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->d:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p6, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->e:Ljava/lang/Boolean;

    .line 19
    .line 20
    iput-boolean p7, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->f:Z

    .line 21
    .line 22
    iput-object p8, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->g:Ljava/lang/Boolean;

    .line 23
    .line 24
    iput-boolean p9, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->h:Z

    .line 25
    .line 26
    iput-boolean p10, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->i:Z

    .line 27
    .line 28
    iput-object p11, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->j:Ljava/lang/Integer;

    .line 29
    .line 30
    iput-object p12, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->k:Ljava/lang/Integer;

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    sget-object p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$$serializer;->INSTANCE:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$$serializer;

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p1, v1, p0}, Lb40;->E(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    throw p0
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Boolean;ZZLjava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->a:Ljava/lang/String;

    .line 46
    iput-object p2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->b:Ljava/util/List;

    .line 47
    iput p3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->c:I

    .line 48
    iput-object p4, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->d:Ljava/lang/String;

    .line 49
    iput-object p5, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->e:Ljava/lang/Boolean;

    .line 50
    iput-boolean p6, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->f:Z

    .line 51
    iput-object p7, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->g:Ljava/lang/Boolean;

    .line 52
    iput-boolean p8, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->h:Z

    .line 53
    iput-boolean p9, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->i:Z

    .line 54
    iput-object p10, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->j:Ljava/lang/Integer;

    .line 55
    iput-object p11, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->k:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->b:Ljava/util/List;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->b:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->c:I

    .line 36
    .line 37
    iget v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->c:I

    .line 38
    .line 39
    if-eq v1, v3, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->d:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->d:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->e:Ljava/lang/Boolean;

    .line 54
    .line 55
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->e:Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    iget-boolean v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->f:Z

    .line 65
    .line 66
    iget-boolean v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->f:Z

    .line 67
    .line 68
    if-eq v1, v3, :cond_7

    .line 69
    .line 70
    return v2

    .line 71
    :cond_7
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->g:Ljava/lang/Boolean;

    .line 72
    .line 73
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->g:Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-nez v1, :cond_8

    .line 80
    .line 81
    return v2

    .line 82
    :cond_8
    iget-boolean v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->h:Z

    .line 83
    .line 84
    iget-boolean v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->h:Z

    .line 85
    .line 86
    if-eq v1, v3, :cond_9

    .line 87
    .line 88
    return v2

    .line 89
    :cond_9
    iget-boolean v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->i:Z

    .line 90
    .line 91
    iget-boolean v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->i:Z

    .line 92
    .line 93
    if-eq v1, v3, :cond_a

    .line 94
    .line 95
    return v2

    .line 96
    :cond_a
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->j:Ljava/lang/Integer;

    .line 97
    .line 98
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->j:Ljava/lang/Integer;

    .line 99
    .line 100
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_b

    .line 105
    .line 106
    return v2

    .line 107
    :cond_b
    iget-object p0, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->k:Ljava/lang/Integer;

    .line 108
    .line 109
    iget-object p1, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->k:Ljava/lang/Integer;

    .line 110
    .line 111
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    if-nez p0, :cond_c

    .line 116
    .line 117
    return v2

    .line 118
    :cond_c
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Lcom/appsflyer/internal/j;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v2, 0x0

    .line 29
    iget-object v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->e:Ljava/lang/Boolean;

    .line 30
    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    move v3, v2

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    :goto_0
    add-int/2addr v0, v3

    .line 40
    mul-int/2addr v0, v1

    .line 41
    iget-boolean v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->f:Z

    .line 42
    .line 43
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-object v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->g:Ljava/lang/Boolean;

    .line 48
    .line 49
    if-nez v3, :cond_1

    .line 50
    .line 51
    move v3, v2

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    :goto_1
    add-int/2addr v0, v3

    .line 58
    mul-int/2addr v0, v1

    .line 59
    iget-boolean v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->h:Z

    .line 60
    .line 61
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iget-boolean v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->i:Z

    .line 66
    .line 67
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iget-object v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->j:Ljava/lang/Integer;

    .line 72
    .line 73
    if-nez v3, :cond_2

    .line 74
    .line 75
    move v3, v2

    .line 76
    goto :goto_2

    .line 77
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    :goto_2
    add-int/2addr v0, v3

    .line 82
    mul-int/2addr v0, v1

    .line 83
    iget-object p0, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->k:Ljava/lang/Integer;

    .line 84
    .line 85
    if-nez p0, :cond_3

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    :goto_3
    add-int/2addr v0, v2

    .line 93
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TCFPurpose(purposeDescription="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", illustrations="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->b:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", id="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->c:I

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", name="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->d:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", consent="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->e:Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", isPartOfASelectedStack="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-boolean v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->f:Z

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", legitimateInterestConsent="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->g:Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", showConsentToggle="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-boolean v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->h:Z

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", showLegitimateInterestToggle="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-boolean v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->i:Z

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", stackId="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->j:Ljava/lang/Integer;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, ", numberOfVendors="

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object p0, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->k:Ljava/lang/Integer;

    .line 109
    .line 110
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string p0, ")"

    .line 114
    .line 115
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0
.end method
