.class public final Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature$$serializer;,
        Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature$Companion;

.field public static final i:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/List;

.field public final c:I

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/Boolean;

.field public final f:Z

.field public final g:Ljava/lang/Integer;

.field public final h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->Companion:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature$Companion;

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
    const/16 v1, 0x8

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
    sput-object v1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->i:[Lkotlinx/serialization/KSerializer;

    .line 45
    .line 46
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Integer;Z)V
    .locals 2

    .line 1
    and-int/lit16 v0, p1, 0xff

    .line 2
    .line 3
    const/16 v1, 0xff

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->b:Ljava/util/List;

    .line 13
    .line 14
    iput p4, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->c:I

    .line 15
    .line 16
    iput-object p5, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->d:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p6, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->e:Ljava/lang/Boolean;

    .line 19
    .line 20
    iput-boolean p7, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->f:Z

    .line 21
    .line 22
    iput-object p8, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->g:Ljava/lang/Integer;

    .line 23
    .line 24
    iput-boolean p9, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->h:Z

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    sget-object p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature$$serializer;->INSTANCE:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature$$serializer;

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p1, v1, p0}, Lb40;->E(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    throw p0
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Integer;Z)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->a:Ljava/lang/String;

    .line 40
    iput-object p2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->b:Ljava/util/List;

    .line 41
    iput p3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->c:I

    .line 42
    iput-object p4, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->d:Ljava/lang/String;

    .line 43
    iput-object p5, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->e:Ljava/lang/Boolean;

    .line 44
    iput-boolean p6, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->f:Z

    .line 45
    iput-object p7, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->g:Ljava/lang/Integer;

    .line 46
    iput-boolean p8, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->h:Z

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
    instance-of v1, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;

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
    check-cast p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->a:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->b:Ljava/util/List;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->b:Ljava/util/List;

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
    iget v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->c:I

    .line 36
    .line 37
    iget v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->c:I

    .line 38
    .line 39
    if-eq v1, v3, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->d:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->d:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->e:Ljava/lang/Boolean;

    .line 54
    .line 55
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->e:Ljava/lang/Boolean;

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
    iget-boolean v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->f:Z

    .line 65
    .line 66
    iget-boolean v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->f:Z

    .line 67
    .line 68
    if-eq v1, v3, :cond_7

    .line 69
    .line 70
    return v2

    .line 71
    :cond_7
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->g:Ljava/lang/Integer;

    .line 72
    .line 73
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->g:Ljava/lang/Integer;

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
    iget-boolean p0, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->h:Z

    .line 83
    .line 84
    iget-boolean p1, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->h:Z

    .line 85
    .line 86
    if-eq p0, p1, :cond_9

    .line 87
    .line 88
    return v2

    .line 89
    :cond_9
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Lcom/appsflyer/internal/j;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->d:Ljava/lang/String;

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
    iget-object v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->e:Ljava/lang/Boolean;

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
    iget-boolean v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->f:Z

    .line 42
    .line 43
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-object v3, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->g:Ljava/lang/Integer;

    .line 48
    .line 49
    if-nez v3, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    :goto_1
    add-int/2addr v0, v2

    .line 57
    mul-int/2addr v0, v1

    .line 58
    iget-boolean p0, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->h:Z

    .line 59
    .line 60
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    add-int/2addr p0, v0

    .line 65
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TCFSpecialFeature(purposeDescription="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->a:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->b:Ljava/util/List;

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
    iget v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->c:I

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
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->d:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->e:Ljava/lang/Boolean;

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
    iget-boolean v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->f:Z

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", stackId="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->g:Ljava/lang/Integer;

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
    iget-boolean p0, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->h:Z

    .line 79
    .line 80
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

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
