.class public final Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData$$serializer;,
        Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData$Companion;

.field public static final i:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/List;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/List;

.field public final f:Ljava/util/List;

.field public final g:Ljava/lang/String;

.field public final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->Companion:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData$Companion;

    .line 7
    .line 8
    new-instance v0, Lgd;

    .line 9
    .line 10
    sget-object v1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFFeature$$serializer;->INSTANCE:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFFeature$$serializer;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lgd;

    .line 17
    .line 18
    sget-object v3, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$$serializer;->INSTANCE:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$$serializer;

    .line 19
    .line 20
    invoke-direct {v1, v3, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 21
    .line 22
    .line 23
    new-instance v3, Lgd;

    .line 24
    .line 25
    sget-object v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature$$serializer;->INSTANCE:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature$$serializer;

    .line 26
    .line 27
    invoke-direct {v3, v4, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 28
    .line 29
    .line 30
    new-instance v4, Lgd;

    .line 31
    .line 32
    sget-object v5, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose$$serializer;->INSTANCE:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose$$serializer;

    .line 33
    .line 34
    invoke-direct {v4, v5, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 35
    .line 36
    .line 37
    new-instance v5, Lgd;

    .line 38
    .line 39
    sget-object v6, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack$$serializer;->INSTANCE:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack$$serializer;

    .line 40
    .line 41
    invoke-direct {v5, v6, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 42
    .line 43
    .line 44
    new-instance v6, Lgd;

    .line 45
    .line 46
    sget-object v7, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$$serializer;->INSTANCE:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$$serializer;

    .line 47
    .line 48
    invoke-direct {v6, v7, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 49
    .line 50
    .line 51
    const/16 v7, 0x8

    .line 52
    .line 53
    new-array v7, v7, [Lkotlinx/serialization/KSerializer;

    .line 54
    .line 55
    aput-object v0, v7, v2

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    aput-object v1, v7, v0

    .line 59
    .line 60
    const/4 v0, 0x2

    .line 61
    aput-object v3, v7, v0

    .line 62
    .line 63
    const/4 v0, 0x3

    .line 64
    aput-object v4, v7, v0

    .line 65
    .line 66
    const/4 v0, 0x4

    .line 67
    aput-object v5, v7, v0

    .line 68
    .line 69
    const/4 v0, 0x5

    .line 70
    aput-object v6, v7, v0

    .line 71
    .line 72
    const/4 v0, 0x6

    .line 73
    const/4 v1, 0x0

    .line 74
    aput-object v1, v7, v0

    .line 75
    .line 76
    const/4 v0, 0x7

    .line 77
    aput-object v1, v7, v0

    .line 78
    .line 79
    sput-object v7, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->i:[Lkotlinx/serialization/KSerializer;

    .line 80
    .line 81
    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;I)V
    .locals 2

    and-int/lit16 v0, p1, 0xff

    const/16 v1, 0xff

    if-ne v1, v0, :cond_0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->a:Ljava/util/List;

    iput-object p3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->b:Ljava/util/List;

    iput-object p4, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->c:Ljava/util/List;

    iput-object p5, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->d:Ljava/util/List;

    iput-object p6, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->e:Ljava/util/List;

    iput-object p7, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->f:Ljava/util/List;

    iput-object p8, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->g:Ljava/lang/String;

    iput p9, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->h:I

    return-void

    :cond_0
    sget-object p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData$$serializer;->INSTANCE:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData$$serializer;

    invoke-virtual {p0}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p0

    invoke-static {p1, v1, p0}, Lb40;->E(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->a:Ljava/util/List;

    .line 23
    .line 24
    iput-object p2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->b:Ljava/util/List;

    .line 25
    .line 26
    iput-object p3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->c:Ljava/util/List;

    .line 27
    .line 28
    iput-object p4, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->d:Ljava/util/List;

    .line 29
    .line 30
    iput-object p5, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->e:Ljava/util/List;

    .line 31
    .line 32
    iput-object p6, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->f:Ljava/util/List;

    .line 33
    .line 34
    iput-object p7, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->g:Ljava/lang/String;

    .line 35
    .line 36
    iput p8, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->h:I

    .line 37
    .line 38
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
    instance-of v1, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

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
    check-cast p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->a:Ljava/util/List;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->a:Ljava/util/List;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->b:Ljava/util/List;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->b:Ljava/util/List;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->c:Ljava/util/List;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->c:Ljava/util/List;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->d:Ljava/util/List;

    .line 47
    .line 48
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->d:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->e:Ljava/util/List;

    .line 58
    .line 59
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->e:Ljava/util/List;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->f:Ljava/util/List;

    .line 69
    .line 70
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->f:Ljava/util/List;

    .line 71
    .line 72
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->g:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->g:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_8

    .line 88
    .line 89
    return v2

    .line 90
    :cond_8
    iget p0, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->h:I

    .line 91
    .line 92
    iget p1, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->h:I

    .line 93
    .line 94
    if-eq p0, p1, :cond_9

    .line 95
    .line 96
    return v2

    .line 97
    :cond_9
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-object v2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->c:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->d:Ljava/util/List;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->e:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->f:Ljava/util/List;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget p0, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->h:I

    .line 47
    .line 48
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    add-int/2addr p0, v0

    .line 53
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TCFData(features="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->a:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", purposes="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->b:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", specialFeatures="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->c:Ljava/util/List;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", specialPurposes="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->d:Ljava/util/List;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", stacks="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->e:Ljava/util/List;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", vendors="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->f:Ljava/util/List;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", tcString="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->g:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", thirdPartyCount="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget p0, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->h:I

    .line 79
    .line 80
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string p0, ")"

    .line 84
    .line 85
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0
.end method
