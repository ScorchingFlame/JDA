/*
 * Copyright 2015 Austin Keener, Michael Ritter, Florian Spieß, and the JDA contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.dv8tion.jda.api.managers.channel.concrete;

import net.dv8tion.jda.api.entities.StageChannel;
import net.dv8tion.jda.api.managers.channel.attribute.ICategorizableChannelManager;
import net.dv8tion.jda.api.managers.channel.attribute.IPositionableChannelManager;
import net.dv8tion.jda.api.managers.channel.middleman.AudioChannelManager;

//TODO-v5: Docs
public interface StageChannelManager extends
        AudioChannelManager<StageChannel, StageChannelManager>,
        ICategorizableChannelManager<StageChannel, StageChannelManager>,
        IPositionableChannelManager<StageChannel, StageChannelManager>
{
}
