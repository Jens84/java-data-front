/*
 * Copyright (C) momchil-atanasov.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.momchil_atanasov.data.front.parser;

/**
 * This class represents an RGB color.
 *
 * @author Momchil Atanasov
 */
public class MTLColor {

    /**
     * Specifies the amount of Red in this color.
     */
    public float r = 0.0f;

    /**
     * Specifies the amount of Green in this color.
     */
    public float g = 0.0f;

    /**
     * Specifies the amount of Blue in this color.
     */
    public float b = 0.0f;


    /**
     * Creates a new default {@link MTLColor}.
     * <p>
     * On construction this color will be Black.
     */
    public MTLColor() {
        super();
    }

    /**
     * Creates a new {@link MTLColor} with the
     * specified color component.
     * <p>
     * Each component should generally be in the range
     * [0.0; 1.0] though this is not required.
     *
     * @param r the amount of Red in the color
     * @param g the amount of Green in the color
     * @param b the amount of Blue in the color
     */
    public MTLColor(float r, float g, float b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    /**
     * A copy-constructor that creates a new {@link MTLColor}
     * as a copy to an existing {@link MTLColor} instance.
     *
     * @param other color to be copied.
     */
    public MTLColor(MTLColor other) {
        this.r = other.r;
        this.g = other.g;
        this.b = other.b;
    }

    /**
     * Sets this color to the specified color
     * components.
     *
     * @param r the Red component
     * @param g the Green component
     * @param b the Blue component
     */
    public void setTo(float r, float g, float b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    /**
     * Sets this color's values to be the same
     * as the ones in the specified color.
     *
     * @param color the color to copy
     */
    public void setTo(MTLColor color) {
        this.r = color.r;
        this.g = color.g;
        this.b = color.b;
    }

    @Override
    public int hashCode() {
        int result = (int) (r * 1000000);
        result = result * 31 + (int) (g * 1000000);
        result = result * 31 + (int) (b * 1000000);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MTLColor)) {
            return false;
        }
        final MTLColor other = (MTLColor) obj;
        return (Math.abs(r - other.r) < 0.000001)
                && (Math.abs(g - other.g) < 0.000001)
                && (Math.abs(b - other.b) < 0.000001);
    }

}
