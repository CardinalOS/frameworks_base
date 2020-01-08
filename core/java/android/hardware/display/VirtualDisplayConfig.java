/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.hardware.display;

import static android.view.Display.DEFAULT_DISPLAY;

import android.annotation.IntRange;
import android.annotation.NonNull;
import android.annotation.Nullable;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Surface;

import com.android.internal.util.DataClass;

/**
 * Holds configuration used to create {@link VirtualDisplay} instances. See
 * {@link MediaProjection#createVirtualDisplay(VirtualDisplayConfig, VirtualDisplay.Callback, Handler)}.
 *
 * @hide
 */
@DataClass(genParcelable = true, genAidl = true, genBuilder = true)
public final class VirtualDisplayConfig implements Parcelable {
    /**
     * The name of the virtual display, must be non-empty.
     */
    @NonNull
    private String mName;

    /**
     * The width of the virtual display in pixels. Must be greater than 0.
     */
    @IntRange(from = 1)
    private int mWidth;

    /**
     * The height of the virtual display in pixels. Must be greater than 0.
     */
    @IntRange(from = 1)
    private int mHeight;

    /**
     * The density of the virtual display in dpi. Must be greater than 0.
     */
    @IntRange(from = 1)
    private int mDensityDpi;

    /**
     * A combination of virtual display flags.
     * {@link DisplayManager#VIRTUAL_DISPLAY_FLAG_PUBLIC},
     * {@link DisplayManager#VIRTUAL_DISPLAY_FLAG_PRESENTATION},
     * {@link DisplayManager#VIRTUAL_DISPLAY_FLAG_SECURE},
     * {@link DisplayManager#VIRTUAL_DISPLAY_FLAG_OWN_CONTENT_ONLY},
     * or {@link DisplayManager#VIRTUAL_DISPLAY_FLAG_AUTO_MIRROR}.
     */
    private int mFlags = 0;

    /**
     * The surface to which the content of the virtual display should be rendered, or null if
     * there is none initially.
     */
    @Nullable
    private Surface mSurface = null;

    /**
     * The unique identifier for the display. Shouldn't be displayed to the user.
     * @hide
     */
    @Nullable
    private String mUniqueId = null;

    /**
     * The id of the display that the virtual display should mirror, or
     * {@link android.view.Display#DEFAULT_DISPLAY} if there is none initially.
     */
    private int mDisplayIdToMirror = DEFAULT_DISPLAY;



    // Code below generated by codegen v1.0.15.
    //
    // DO NOT MODIFY!
    // CHECKSTYLE:OFF Generated code
    //
    // To regenerate run:
    // $ codegen $ANDROID_BUILD_TOP/frameworks/base/core/java/android/hardware/display/VirtualDisplayConfig.java
    //
    // To exclude the generated code from IntelliJ auto-formatting enable (one-time):
    //   Settings > Editor > Code Style > Formatter Control
    //@formatter:off


    @DataClass.Generated.Member
    /* package-private */ VirtualDisplayConfig(
            @NonNull String name,
            @IntRange(from = 1) int width,
            @IntRange(from = 1) int height,
            @IntRange(from = 1) int densityDpi,
            int flags,
            @Nullable Surface surface,
            @Nullable String uniqueId,
            int displayIdToMirror) {
        this.mName = name;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mName);
        this.mWidth = width;
        com.android.internal.util.AnnotationValidations.validate(
                IntRange.class, null, mWidth,
                "from", 1);
        this.mHeight = height;
        com.android.internal.util.AnnotationValidations.validate(
                IntRange.class, null, mHeight,
                "from", 1);
        this.mDensityDpi = densityDpi;
        com.android.internal.util.AnnotationValidations.validate(
                IntRange.class, null, mDensityDpi,
                "from", 1);
        this.mFlags = flags;
        this.mSurface = surface;
        this.mUniqueId = uniqueId;
        this.mDisplayIdToMirror = displayIdToMirror;

        // onConstructed(); // You can define this method to get a callback
    }

    /**
     * The name of the virtual display, must be non-empty.
     */
    @DataClass.Generated.Member
    public @NonNull String getName() {
        return mName;
    }

    /**
     * The width of the virtual display in pixels. Must be greater than 0.
     */
    @DataClass.Generated.Member
    public @IntRange(from = 1) int getWidth() {
        return mWidth;
    }

    /**
     * The height of the virtual display in pixels. Must be greater than 0.
     */
    @DataClass.Generated.Member
    public @IntRange(from = 1) int getHeight() {
        return mHeight;
    }

    /**
     * The density of the virtual display in dpi. Must be greater than 0.
     */
    @DataClass.Generated.Member
    public @IntRange(from = 1) int getDensityDpi() {
        return mDensityDpi;
    }

    /**
     * A combination of virtual display flags.
     * {@link DisplayManager#VIRTUAL_DISPLAY_FLAG_PUBLIC},
     * {@link DisplayManager#VIRTUAL_DISPLAY_FLAG_PRESENTATION},
     * {@link DisplayManager#VIRTUAL_DISPLAY_FLAG_SECURE},
     * {@link DisplayManager#VIRTUAL_DISPLAY_FLAG_OWN_CONTENT_ONLY},
     * or {@link DisplayManager#VIRTUAL_DISPLAY_FLAG_AUTO_MIRROR}.
     */
    @DataClass.Generated.Member
    public int getFlags() {
        return mFlags;
    }

    /**
     * The surface to which the content of the virtual display should be rendered, or null if
     * there is none initially.
     */
    @DataClass.Generated.Member
    public @Nullable Surface getSurface() {
        return mSurface;
    }

    /**
     * The unique identifier for the display. Shouldn't be displayed to the user.
     *
     * @hide
     */
    @DataClass.Generated.Member
    public @Nullable String getUniqueId() {
        return mUniqueId;
    }

    /**
     * The id of the display that the virtual display should mirror, or
     * {@link android.view.Display#DEFAULT_DISPLAY} if there is none initially.
     */
    @DataClass.Generated.Member
    public int getDisplayIdToMirror() {
        return mDisplayIdToMirror;
    }

    @Override
    @DataClass.Generated.Member
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        // You can override field parcelling by defining methods like:
        // void parcelFieldName(Parcel dest, int flags) { ... }

        int flg = 0;
        if (mSurface != null) flg |= 0x20;
        if (mUniqueId != null) flg |= 0x40;
        dest.writeInt(flg);
        dest.writeString(mName);
        dest.writeInt(mWidth);
        dest.writeInt(mHeight);
        dest.writeInt(mDensityDpi);
        dest.writeInt(mFlags);
        if (mSurface != null) dest.writeTypedObject(mSurface, flags);
        if (mUniqueId != null) dest.writeString(mUniqueId);
        dest.writeInt(mDisplayIdToMirror);
    }

    @Override
    @DataClass.Generated.Member
    public int describeContents() { return 0; }

    /** @hide */
    @SuppressWarnings({"unchecked", "RedundantCast"})
    @DataClass.Generated.Member
    /* package-private */ VirtualDisplayConfig(@NonNull Parcel in) {
        // You can override field unparcelling by defining methods like:
        // static FieldType unparcelFieldName(Parcel in) { ... }

        int flg = in.readInt();
        String name = in.readString();
        int width = in.readInt();
        int height = in.readInt();
        int densityDpi = in.readInt();
        int flags = in.readInt();
        Surface surface = (flg & 0x20) == 0 ? null : (Surface) in.readTypedObject(Surface.CREATOR);
        String uniqueId = (flg & 0x40) == 0 ? null : in.readString();
        int displayIdToMirror = in.readInt();

        this.mName = name;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mName);
        this.mWidth = width;
        com.android.internal.util.AnnotationValidations.validate(
                IntRange.class, null, mWidth,
                "from", 1);
        this.mHeight = height;
        com.android.internal.util.AnnotationValidations.validate(
                IntRange.class, null, mHeight,
                "from", 1);
        this.mDensityDpi = densityDpi;
        com.android.internal.util.AnnotationValidations.validate(
                IntRange.class, null, mDensityDpi,
                "from", 1);
        this.mFlags = flags;
        this.mSurface = surface;
        this.mUniqueId = uniqueId;
        this.mDisplayIdToMirror = displayIdToMirror;

        // onConstructed(); // You can define this method to get a callback
    }

    @DataClass.Generated.Member
    public static final @NonNull Parcelable.Creator<VirtualDisplayConfig> CREATOR
            = new Parcelable.Creator<VirtualDisplayConfig>() {
        @Override
        public VirtualDisplayConfig[] newArray(int size) {
            return new VirtualDisplayConfig[size];
        }

        @Override
        public VirtualDisplayConfig createFromParcel(@NonNull Parcel in) {
            return new VirtualDisplayConfig(in);
        }
    };

    /**
     * A builder for {@link VirtualDisplayConfig}
     */
    @SuppressWarnings("WeakerAccess")
    @DataClass.Generated.Member
    public static final class Builder {

        private @NonNull String mName;
        private @IntRange(from = 1) int mWidth;
        private @IntRange(from = 1) int mHeight;
        private @IntRange(from = 1) int mDensityDpi;
        private int mFlags;
        private @Nullable Surface mSurface;
        private @Nullable String mUniqueId;
        private int mDisplayIdToMirror;

        private long mBuilderFieldsSet = 0L;

        /**
         * Creates a new Builder.
         *
         * @param name
         *   The name of the virtual display, must be non-empty.
         * @param width
         *   The width of the virtual display in pixels. Must be greater than 0.
         * @param height
         *   The height of the virtual display in pixels. Must be greater than 0.
         * @param densityDpi
         *   The density of the virtual display in dpi. Must be greater than 0.
         */
        public Builder(
                @NonNull String name,
                @IntRange(from = 1) int width,
                @IntRange(from = 1) int height,
                @IntRange(from = 1) int densityDpi) {
            mName = name;
            com.android.internal.util.AnnotationValidations.validate(
                    NonNull.class, null, mName);
            mWidth = width;
            com.android.internal.util.AnnotationValidations.validate(
                    IntRange.class, null, mWidth,
                    "from", 1);
            mHeight = height;
            com.android.internal.util.AnnotationValidations.validate(
                    IntRange.class, null, mHeight,
                    "from", 1);
            mDensityDpi = densityDpi;
            com.android.internal.util.AnnotationValidations.validate(
                    IntRange.class, null, mDensityDpi,
                    "from", 1);
        }

        /**
         * The name of the virtual display, must be non-empty.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setName(@NonNull String value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x1;
            mName = value;
            return this;
        }

        /**
         * The width of the virtual display in pixels. Must be greater than 0.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setWidth(@IntRange(from = 1) int value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x2;
            mWidth = value;
            return this;
        }

        /**
         * The height of the virtual display in pixels. Must be greater than 0.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setHeight(@IntRange(from = 1) int value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x4;
            mHeight = value;
            return this;
        }

        /**
         * The density of the virtual display in dpi. Must be greater than 0.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setDensityDpi(@IntRange(from = 1) int value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x8;
            mDensityDpi = value;
            return this;
        }

        /**
         * A combination of virtual display flags.
         * {@link DisplayManager#VIRTUAL_DISPLAY_FLAG_PUBLIC},
         * {@link DisplayManager#VIRTUAL_DISPLAY_FLAG_PRESENTATION},
         * {@link DisplayManager#VIRTUAL_DISPLAY_FLAG_SECURE},
         * {@link DisplayManager#VIRTUAL_DISPLAY_FLAG_OWN_CONTENT_ONLY},
         * or {@link DisplayManager#VIRTUAL_DISPLAY_FLAG_AUTO_MIRROR}.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setFlags(int value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x10;
            mFlags = value;
            return this;
        }

        /**
         * The surface to which the content of the virtual display should be rendered, or null if
         * there is none initially.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setSurface(@NonNull Surface value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x20;
            mSurface = value;
            return this;
        }

        /**
         * The unique identifier for the display. Shouldn't be displayed to the user.
         *
         * @hide
         */
        @DataClass.Generated.Member
        public @NonNull Builder setUniqueId(@NonNull String value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x40;
            mUniqueId = value;
            return this;
        }

        /**
         * The id of the display that the virtual display should mirror, or
         * {@link android.view.Display#DEFAULT_DISPLAY} if there is none initially.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setDisplayIdToMirror(int value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x80;
            mDisplayIdToMirror = value;
            return this;
        }

        /** Builds the instance. This builder should not be touched after calling this! */
        public @NonNull VirtualDisplayConfig build() {
            checkNotUsed();
            mBuilderFieldsSet |= 0x100; // Mark builder used

            if ((mBuilderFieldsSet & 0x10) == 0) {
                mFlags = 0;
            }
            if ((mBuilderFieldsSet & 0x20) == 0) {
                mSurface = null;
            }
            if ((mBuilderFieldsSet & 0x40) == 0) {
                mUniqueId = null;
            }
            if ((mBuilderFieldsSet & 0x80) == 0) {
                mDisplayIdToMirror = DEFAULT_DISPLAY;
            }
            VirtualDisplayConfig o = new VirtualDisplayConfig(
                    mName,
                    mWidth,
                    mHeight,
                    mDensityDpi,
                    mFlags,
                    mSurface,
                    mUniqueId,
                    mDisplayIdToMirror);
            return o;
        }

        private void checkNotUsed() {
            if ((mBuilderFieldsSet & 0x100) != 0) {
                throw new IllegalStateException(
                        "This Builder should not be reused. Use a new Builder instance instead");
            }
        }
    }

    @DataClass.Generated(
            time = 1585179350902L,
            codegenVersion = "1.0.15",
            sourceFile = "frameworks/base/core/java/android/hardware/display/VirtualDisplayConfig.java",
            inputSignatures = "private @android.annotation.NonNull java.lang.String mName\nprivate @android.annotation.IntRange(from=1L) int mWidth\nprivate @android.annotation.IntRange(from=1L) int mHeight\nprivate @android.annotation.IntRange(from=1L) int mDensityDpi\nprivate  int mFlags\nprivate @android.annotation.Nullable android.view.Surface mSurface\nprivate @android.annotation.Nullable java.lang.String mUniqueId\nprivate  int mDisplayIdToMirror\nclass VirtualDisplayConfig extends java.lang.Object implements [android.os.Parcelable]\n@com.android.internal.util.DataClass(genParcelable=true, genAidl=true, genBuilder=true)")
    @Deprecated
    private void __metadata() {}


    //@formatter:on
    // End of generated code

}
