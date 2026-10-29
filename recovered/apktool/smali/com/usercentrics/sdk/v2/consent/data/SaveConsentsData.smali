.class public final Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData$$serializer;,
        Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData$Companion;


# instance fields
.field public final a:Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;

.field public final b:Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObject;

.field public final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->Companion:Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData$Companion;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(ILcom/usercentrics/sdk/v2/consent/data/DataTransferObject;Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObject;Ljava/lang/String;)V
    .locals 3

    .line 1
    and-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v2, v0, :cond_2

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->a:Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;

    .line 11
    .line 12
    and-int/lit8 p2, p1, 0x2

    .line 13
    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->b:Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObject;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->b:Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObject;

    .line 20
    .line 21
    :goto_0
    and-int/lit8 p1, p1, 0x4

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->c:Ljava/lang/String;

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    iput-object p4, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->c:Ljava/lang/String;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    sget-object p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData$$serializer;->INSTANCE:Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData$$serializer;

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p1, v2, p0}, Lb40;->E(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 38
    .line 39
    .line 40
    throw v1
.end method

.method public constructor <init>(Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObject;Ljava/lang/String;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->a:Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;

    .line 43
    iput-object p2, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->b:Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObject;

    .line 44
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->c:Ljava/lang/String;

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
    instance-of v1, p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;

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
    check-cast p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->a:Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->a:Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->b:Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObject;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->b:Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObject;

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
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object p1, p1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->a:Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->b:Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObject;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    move v2, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v2}, Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObject;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    :goto_0
    add-int/2addr v0, v2

    .line 21
    mul-int/lit8 v0, v0, 0x1f

    .line 22
    .line 23
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->c:Ljava/lang/String;

    .line 24
    .line 25
    if-nez p0, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    :goto_1
    add-int/2addr v0, v1

    .line 33
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "SaveConsentsData(dataTransferObject="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->a:Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", consentStringObject="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->b:Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObject;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", acString="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ")"

    .line 29
    .line 30
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->c:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0, p0, v1}, Lfm0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
