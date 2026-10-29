.class public final Lcom/usercentrics/sdk/UsercentricsServiceConsent;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/UsercentricsServiceConsent$$serializer;,
        Lcom/usercentrics/sdk/UsercentricsServiceConsent$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/UsercentricsServiceConsent$Companion;

.field public static final i:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Ljava/util/List;

.field public final d:Lmz2;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Z

.field public final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/UsercentricsServiceConsent$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->Companion:Lcom/usercentrics/sdk/UsercentricsServiceConsent$Companion;

    .line 7
    .line 8
    new-instance v0, Lgd;

    .line 9
    .line 10
    sget-object v1, Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry$$serializer;->INSTANCE:Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry$$serializer;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lb10;

    .line 17
    .line 18
    const-class v3, Lmz2;

    .line 19
    .line 20
    invoke-static {v3}, Lj22;->a(Ljava/lang/Class;)Ldv;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    new-instance v4, Loe0;

    .line 25
    .line 26
    const-string v5, "com.usercentrics.sdk.models.settings.UsercentricsConsentType"

    .line 27
    .line 28
    invoke-static {}, Lmz2;->values()[Lmz2;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    invoke-direct {v4, v5, v6}, Loe0;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v4}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    new-array v5, v2, [Lkotlinx/serialization/KSerializer;

    .line 40
    .line 41
    invoke-direct {v1, v3, v4, v5}, Lb10;-><init>(Ldv;Lkotlinx/serialization/KSerializer;[Lkotlinx/serialization/KSerializer;)V

    .line 42
    .line 43
    .line 44
    const/16 v3, 0x8

    .line 45
    .line 46
    new-array v3, v3, [Lkotlinx/serialization/KSerializer;

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    aput-object v4, v3, v2

    .line 50
    .line 51
    const/4 v2, 0x1

    .line 52
    aput-object v4, v3, v2

    .line 53
    .line 54
    const/4 v2, 0x2

    .line 55
    aput-object v0, v3, v2

    .line 56
    .line 57
    const/4 v0, 0x3

    .line 58
    aput-object v1, v3, v0

    .line 59
    .line 60
    const/4 v0, 0x4

    .line 61
    aput-object v4, v3, v0

    .line 62
    .line 63
    const/4 v0, 0x5

    .line 64
    aput-object v4, v3, v0

    .line 65
    .line 66
    const/4 v0, 0x6

    .line 67
    aput-object v4, v3, v0

    .line 68
    .line 69
    const/4 v0, 0x7

    .line 70
    aput-object v4, v3, v0

    .line 71
    .line 72
    sput-object v3, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->i:[Lkotlinx/serialization/KSerializer;

    .line 73
    .line 74
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ZLjava/util/List;Lmz2;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
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
    iput-object p2, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-boolean p3, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->b:Z

    .line 13
    .line 14
    iput-object p4, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->c:Ljava/util/List;

    .line 15
    .line 16
    iput-object p5, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->d:Lmz2;

    .line 17
    .line 18
    iput-object p6, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->e:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p7, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->f:Ljava/lang/String;

    .line 21
    .line 22
    iput-boolean p8, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->g:Z

    .line 23
    .line 24
    iput-object p9, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->h:Ljava/lang/String;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    sget-object p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent$$serializer;->INSTANCE:Lcom/usercentrics/sdk/UsercentricsServiceConsent$$serializer;

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/usercentrics/sdk/UsercentricsServiceConsent$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

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

.method public constructor <init>(Ljava/lang/String;ZLjava/util/ArrayList;Lmz2;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->a:Ljava/lang/String;

    .line 40
    iput-boolean p2, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->b:Z

    .line 41
    iput-object p3, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->c:Ljava/util/List;

    .line 42
    iput-object p4, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->d:Lmz2;

    .line 43
    iput-object p5, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->e:Ljava/lang/String;

    .line 44
    iput-object p6, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->f:Ljava/lang/String;

    .line 45
    iput-boolean p7, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->g:Z

    .line 46
    iput-object p8, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->h:Ljava/lang/String;

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
    instance-of v1, p1, Lcom/usercentrics/sdk/UsercentricsServiceConsent;

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
    check-cast p1, Lcom/usercentrics/sdk/UsercentricsServiceConsent;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->a:Ljava/lang/String;

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
    iget-boolean v1, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->b:Z

    .line 25
    .line 26
    iget-boolean v3, p1, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->b:Z

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object v1, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->c:Ljava/util/List;

    .line 32
    .line 33
    iget-object v3, p1, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->c:Ljava/util/List;

    .line 34
    .line 35
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-object v1, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->d:Lmz2;

    .line 43
    .line 44
    iget-object v3, p1, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->d:Lmz2;

    .line 45
    .line 46
    if-eq v1, v3, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    iget-object v1, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->e:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v3, p1, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->e:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_6

    .line 58
    .line 59
    return v2

    .line 60
    :cond_6
    iget-object v1, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->f:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v3, p1, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->f:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_7

    .line 69
    .line 70
    return v2

    .line 71
    :cond_7
    iget-boolean v1, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->g:Z

    .line 72
    .line 73
    iget-boolean v3, p1, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->g:Z

    .line 74
    .line 75
    if-eq v1, v3, :cond_8

    .line 76
    .line 77
    return v2

    .line 78
    :cond_8
    iget-object p0, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->h:Ljava/lang/String;

    .line 79
    .line 80
    iget-object p1, p1, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->h:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-nez p0, :cond_9

    .line 87
    .line 88
    return v2

    .line 89
    :cond_9
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->a:Ljava/lang/String;

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
    iget-boolean v2, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Len;->h(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->c:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->d:Lmz2;

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    :goto_0
    add-int/2addr v0, v2

    .line 33
    mul-int/2addr v0, v1

    .line 34
    iget-object v2, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->e:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->f:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->g:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, Len;->h(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object p0, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->h:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    add-int/2addr p0, v0

    .line 59
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "UsercentricsServiceConsent(templateId="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", status="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->b:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", history="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->c:Ljava/util/List;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", type="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->d:Lmz2;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", dataProcessor="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", version="

    .line 49
    .line 50
    const-string v2, ", isEssential="

    .line 51
    .line 52
    iget-object v3, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->e:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v4, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->f:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-boolean v1, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->g:Z

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", category="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object p0, p0, Lcom/usercentrics/sdk/UsercentricsServiceConsent;->h:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string p0, ")"

    .line 75
    .line 76
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method
